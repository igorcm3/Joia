/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conecta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Produto;
import modelo.TipoJoia;

/**
 *
 * @author coron
 */
public class ProdutoDao {
    Conecta conecta;
    // Metodos de acesso ao banco
    
    
    
    
    public void salvaProduto(Produto produto){
        conecta = new Conecta();
        conecta.iniciaConexao();

        String sql = "INSERT INTO `JoalheriaJoia`.`Produto` (`codigo`, `nome`, `valorCusto`, `valorVenda`, `idTipoJoia` , `quantidadeEstoque`) VALUES (?, ?, ?, ?, ?, ?);";

        try {
            PreparedStatement pstm;
            pstm = conecta.getConexao().prepareStatement(sql); 
            
            pstm.setString(1, produto.getCodigo());
            pstm.setString(2, produto.getNome());
            pstm.setFloat(3, produto.getValorCusto());
            pstm.setFloat(4, produto.getValorVenda());
            pstm.setInt(5, produto.getTipoJoia().getIdTipoJoia());
            pstm.setInt(6, produto.getQuantidadeEstoque());
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.fechaConexao();  
        
    }
    
    
        public void alteraProduto(Produto produto){
        conecta = new Conecta();
        conecta.iniciaConexao();
        
        String sql = "UPDATE `JoalheriaJoia`.`Produto` SET `codigo`=?, `nome`=?, `valorCusto`=?, `valorVenda`=?, `quantidadeEstoque`=? WHERE `idProduto`=?; ";
       
        try {
            PreparedStatement pstm;
            pstm = conecta.getConexao().prepareStatement(sql);             
            pstm.setString(1, produto.getCodigo());
            pstm.setString(2, produto.getNome());
            pstm.setFloat(3, produto.getValorCusto());
            pstm.setFloat(4, produto.getValorVenda());
            pstm.setInt(5, produto.getQuantidadeEstoque());
            pstm.setInt(6,produto.getIdProduto());
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.fechaConexao();
    }
        
        // EXCLUIR PROD
        public void excluiProduto(String codi){
        conecta = new Conecta();
        conecta.iniciaConexao();
        
        String sql = "DELETE FROM `JoalheriaJoia`.`Produto` WHERE idProduto = ? ; ";
        List<Produto>  lista = new ArrayList<Produto>();
        int id = 0;
       
        for (Produto p : this.getProduto()){
            System.out.println("Detalhes do Produto cod: "+p.getCodigo()+"  Nome "+p.getNome());
            if(p.getCodigo().equals(codi)){
                id = p.getIdProduto();
                System.out.println("certo Prod aqui id  "+id);
            }else
                System.out.println("caiu no else");
                   
        }
        
        conecta.iniciaConexao();
        
        try {
            PreparedStatement pstm;
            pstm = conecta.getConexao().prepareStatement(sql);  
            pstm.setInt(1,id);
            System.out.println("Removido com sucesso");
            
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.fechaConexao();
    }
        
        // LISTAR PROD
        public List<Produto> getProduto(){
        List<Produto> listaProduto = new ArrayList<Produto>();
        conecta = new Conecta();
        conecta.iniciaConexao();
        String sql = "SELECT * FROM JoalheriaJoia.Produto;";
        ResultSet rs;
        
        PreparedStatement pstm;
        try {
             
            pstm = conecta.getConexao().prepareStatement(sql);
            rs = pstm.executeQuery();

            while(rs.next()){
                int id = rs.getInt("idProduto");
                String cod = rs.getString("codigo");
                String nome = rs.getString("nome");
                Float custo = rs.getFloat("valorCusto");
                Float venda = rs.getFloat("valorVenda");
                
                int estoque = rs.getInt("quantidadeEstoque");
                
                //localiza objeto pelo id
                TipoJoia tipoJoia = new TipoJoia();
                TipoJoiaDao daoT = new TipoJoiaDao();
                int idTipoJoia = rs.getInt("idTipoJoia");
                
                for (TipoJoia t : daoT.getTipo()){
                    if(t.getIdTipoJoia() == idTipoJoia)
                        tipoJoia = t;
                }  
                Produto produto = new Produto(cod, nome, custo, venda,estoque, tipoJoia );
                produto.setIdProduto(id);
                listaProduto.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        conecta.fechaConexao();
        return listaProduto;
    }
    
}
