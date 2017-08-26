package br.com.profitness.modelsCONEX;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author igorz
 */
public class Conexao {
    public Statement st;
    public ResultSet rs;
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost:3306/academia";
    private String usuario = "root";
    private String senha = "";
    public Connection conex;
    
    public void conecta(){
        try {
            System.setProperty("jdbc.Drivers", driver);
            conex = (Connection) DriverManager.getConnection(caminho, usuario, senha);
           //JOptionPane.showMessageDialog(null, "Conectou");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados,tente novamente!"+e);
        }
    } 
    
    public void desconecta(){
        try {
            conex.close();
            //JOptionPane.showMessageDialog(null, "deconectou carai");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Deu ruim"+e);
        }
    }

    public void executaSQL (String sql) {
        try {
            st = conex.createStatement(rs.TYPE_FORWARD_ONLY , rs.CONCUR_UPDATABLE);
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erroe!"+ex);
        }
        
        
        
    }
    
    
}
