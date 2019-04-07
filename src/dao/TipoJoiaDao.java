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
import modelo.TipoJoia;

/**
 *
 * @author mateus
 */
public class TipoJoiaDao {
    Conecta conecta;
    
    public void salvaTipo(TipoJoia tipo){
        conecta = new Conecta();
        conecta.iniciaConexao();
        
        String sql = "INSERT INTO `JoalheriaJoia`.`TipoJoia` (`codigo`, `descricao`) VALUES (?, ?);";
       
        try {
            PreparedStatement pstm;
            pstm = conecta.getConexao().prepareStatement(sql);             
            pstm.setString(1, tipo.getCodigo());
            pstm.setString(2, tipo.getDescricao());
            
            
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.fechaConexao();
    }
    /*
    
    public void alteraTipo(Cliente cliente){
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
    
    
    public void exccluiCliente(String codi){
        conecta = new Conecta();
        conecta.iniciaConexao();
        
        String sql = "DELETE FROM `JoalheriaJoia`.`Cliente` WHERE idCliente = ? ; ";
        List<Cliente>  lista = new ArrayList<Cliente>();
        int id = 0;
       
        for (Cliente c : this.getCliente()){
            System.out.println("Detalhes do cliente::  "+c.getCodigo()+"  Nome "+c.getNome());
            if(c.getCodigo().equals(codi)){
                id = c.getIdCliente();
                System.out.println("certo  aqui22 id  "+id);
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
    
    */
    public List<TipoJoia> getTipo(){
        List<TipoJoia> listaTipo = new ArrayList<TipoJoia>();
        conecta = new Conecta();
        conecta.iniciaConexao();
        String sql = "SELECT * FROM JoalheriaJoia.TipoJoia;";
        ResultSet rs;
        
        PreparedStatement pstm;
        try {
             
            pstm = conecta.getConexao().prepareStatement(sql);
            rs = pstm.executeQuery();
           
            while(rs.next()){
                int id = rs.getInt("idTipoJoia");
                String cod = rs.getString("codigo");
                String descricao = rs.getString("descricao");
                
                TipoJoia tipo = new TipoJoia(cod, descricao);
                tipo.setIdTipoJoia(id);
                
                listaTipo.add(tipo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        conecta.fechaConexao();
        return listaTipo;
    }
}