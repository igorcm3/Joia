package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Classe responsável por estabelecer conexão com o banco de dados
 * e disponibilizar meios de recuperar e editar registros da base de dados.
 * @author Eduardo Comin
 * @since 16/05/2016
 */
public class Conecta {
   
    //Pode ser alterado para Mysql...
    private String DRIVER = "com.mysql.jdbc.Driver";
    private String BD = "JoalheriaJoia";
    private String URL = "jdbc:mysql://localhost:3306/"+BD;
    private String USERNAME = "root";
    private String PASSWORD = "admin";
    private Connection conexao;
    private PreparedStatement pstm; //trocar por PreparedStatement
    
    private String msg;

    public Conecta() {
        this.msg = this.iniciaConexao();
                
    }

    public Conecta(String bd, String user, String senha) {
        this.BD = bd;
        this.USERNAME = user;
        this.PASSWORD = senha;
        this.msg = this.iniciaConexao();

    }

    public String iniciaConexao() {
        try {
            Class.forName(this.DRIVER);
            this.conexao = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            // Definimos o objeto responsável por executar os comandos
            return "sucesso";
             
        } catch (ClassNotFoundException e) {
            this.conexao = null;
            return "Não foi possivel encontrar o driver de banco: " + e.getMessage();
        } catch (SQLException e) {
            this.conexao = null;
            return "Erro!" + e.getMessage();
        }
    }
    
    public PreparedStatement setPstm(String sql) {
        try {
            this.pstm = this.getConexao().prepareStatement(sql);
            return this.pstm;
        } catch (SQLException ex) {
            System.err.println("Erro:"+ex);
            return null;
        }
    }
    
    public PreparedStatement getPstm() {
            return this.pstm;
    }

    public String fechaConexao() {
        try {
            if (this.getConexao() != null) {
                this.getConexao().close();
                this.conexao = null;
            }
            if (this.getStm() != null) {
                this.pstm = null;
            }
            return "Conexão Encerrada";
        } catch (SQLException ex) {
            return "Houve erro no fechamento da conexão! "+ex.getMessage();
        }
    }

    public Connection getConexao() {
        return conexao;
    }

    public Statement getStm() {
        return pstm;
    }
    
    public String getMsg() {
        return msg;
    }
    
}