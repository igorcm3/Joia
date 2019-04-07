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
import modelo.Cliente;
import modelo.Estoque;
import modelo.Produto;

/**
 *
 * @author skynetx
 */
public class EstoqueDao {
     Conecta conecta;
    // substituir cliente por estoque
    public void salvaEstoque(Estoque estoque){
        conecta = new Conecta();
        conecta.iniciaConexao();
        
        String sql = "INSERT INTO `JoalheriaJoia`.`Estoque` (`quantidade`, `idProduto`) VALUES (?,?);";
       
        try {
            PreparedStatement pstm;
            pstm = conecta.getConexao().prepareStatement(sql); 
            
            pstm.setInt(1, estoque.getQuantidade());
            System.out.println("Chega aqui");
            pstm.setInt(2,estoque.getProduto().getIdProduto());            
            
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.fechaConexao();
    }
    /*
    
    public void alteraEstoque(Cliente cliente){
        conecta = new Conecta();
        conecta.iniciaConexao();
        
        String sql = "UPDATE `JoalheriaJoia`.`Cliente` SET `codigo`=?, `nome`=?, `endereco`=?, `bairro`=?, `cidade`=?, `cep`=?, `cpf`=?, `uf`=?, `rg`=?, `celular`=? WHERE `idCliente`=?;";
       
        try {
            PreparedStatement pstm;
            pstm = conecta.getConexao().prepareStatement(sql);             
            pstm.setString(1, cliente.getCodigo());
            pstm.setString(2, cliente.getNome());
            pstm.setString(3, cliente.getEndereco());
            pstm.setString(4, cliente.getBairro());
            pstm.setString(5, cliente.getCidade());
            pstm.setString(6, cliente.getCep());
            pstm.setString(7, cliente.getCpf());
            pstm.setString(8, cliente.getUf());
            pstm.setString(9, cliente.getRg());
            pstm.setString(10, cliente.getCelular());
            pstm.setInt(11,cliente.getIdCliente());
            
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.fechaConexao();
    }
    
    
    public void excluiE(String codi){
        conecta = new Conecta();
        conecta.iniciaConexao();
        
        String sql = "DELETE FROM `JoalheriaJoia`.`Estoque` WHERE idEstoque = ? ; ";
        
        int id = 0;

        
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
    
    */
    
    public List<Estoque> getEstoque(){
        List<Estoque> listaEstoque = new ArrayList<Estoque>();
        conecta = new Conecta();
        conecta.iniciaConexao();
        String sql = "SELECT * FROM JoalheriaJoia.Estoque;";
        ResultSet rs;
        
        PreparedStatement pstm;
        try {
             
            pstm = conecta.getConexao().prepareStatement(sql);
            rs = pstm.executeQuery();
           
            while(rs.next()){
                int id = rs.getInt("idEstoque");
                int qnt = rs.getInt("quantidade");
                int idP = rs.getInt("idProduto");
                System.out.println("1");
                Produto produto = new Produto();
                ProdutoDao daoP = new ProdutoDao();
                for (Produto p : daoP.getProduto()){
                    if(idP == p.getIdProduto())
                        produto = p;
                }
                conecta.iniciaConexao();
                Estoque estoque = new Estoque(qnt, produto);
                estoque.setIdEstoque(id);
                listaEstoque.add(estoque);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        conecta.fechaConexao();
        return listaEstoque;
    }
  
}
