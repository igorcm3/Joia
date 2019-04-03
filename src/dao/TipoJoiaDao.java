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

/**
 *
 * @author mateus
 */
public class TipoJoiaDao {
    Conecta conecta;
    
    public void salvaCliente(Cliente cliente){
        conecta = new Conecta();
        conecta.iniciaConexao();
        
        String sql = "INSERT INTO `JoalheriaJoia`.`Cliente` (`codigo`, `nome`, `endereco`, `bairro`, `cidade`, `cep`, `cpf`, `uf`, `rg`, `celular`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
       
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
            
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.fechaConexao();
    }
    
    
    public void alteraCliente(Cliente cliente){
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
    
    
    public List<Cliente> getCliente(){
        List<Cliente> listaCliente = new ArrayList<Cliente>();
        conecta = new Conecta();
        conecta.iniciaConexao();
        String sql = "SELECT * FROM JoalheriaJoia.Cliente;";
        ResultSet rs;
        
        PreparedStatement pstm;
        try {
             
            pstm = conecta.getConexao().prepareStatement(sql);
            rs = pstm.executeQuery();
           
            while(rs.next()){
                int id = rs.getInt("idCliente");
                String cod = rs.getString("codigo");
                String nome = rs.getString("nome");
                String endereco = rs.getString("endereco");
                String bairro = rs.getString("bairro");
                String cidade = rs.getString("cidade");
                String cep = rs.getString("cep");
                String cpf = rs.getString("cpf");
                String uf = rs.getString("uf");
                String rg = rs.getString("rg");
                String cel = rs.getString("celular");
                
                Cliente cliente = new Cliente(cod, nome, endereco, bairro, cidade, cep, cpf, uf, rg, cel);
                cliente.setIdCliente(id);
                listaCliente.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        conecta.fechaConexao();
        return listaCliente;
    }
}