package com.br.profitness.modelsDAO;

import br.com.profitness.modelsCONEX.Conexao;
import br.com.profitness.modelsBEANS.Instrutor;
import br.com.profitness.modelsBEANS.Usuarios;
import br.com.profitness.views.FormInst;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author igorz
 */
public class DaoUsuario {
    Conexao conect = new Conexao();
    Usuarios mod = new Usuarios();
    
    //metodo salvar dados
    public void salvar (Usuarios mod) throws SQLException{
        conect.conecta();
        try {
        PreparedStatement st = conect.conex.prepareStatement("insert into usuarios(login,senha) values (?,?)"); 
        
        st.setString(1, mod.getNome());
        st.setString(2, mod.getSenha());        
        st.execute();
        JOptionPane.showMessageDialog(null,"Salvo com sucesso");
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro/nError:"+e);
            
        }
        
        conect.desconecta();
    }
      
    
    //metodo excluir dados
    public void excluir(Usuarios mod){
                
        conect.conecta();
        try {
            PreparedStatement st = conect.conex.prepareStatement("delete from usuarios where id_usu=?");
                st.setInt(1, mod.getId_usu());
                st.execute();                    
                JOptionPane.showMessageDialog(null,"Usuario excluido com sucesso");   
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ao exluir usuario:/nError"+ex);
        }
        
        
        
        conect.desconecta();
        
    }
    
    public  Usuarios buscaUsuarios(Usuarios mod){
        conect.conecta();
        
            conect.executaSQL("select * from  usuarios where login like '%"+mod.getPesquisa()+"%'");
        try {
            conect.rs.first();
            mod.setId_usu(conect.rs.getInt("id_usu"));
            mod.setNome(conect.rs.getString("login"));
            mod.setSenha(conect.rs.getString("senha"));            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuarios/nError:"+ex);
        }
            
        
        conect.desconecta();
        return mod;
    
    }
    
    public void alterar(Usuarios mod){
        conect.conecta();
        
        try {
            PreparedStatement st = conect.conex.prepareStatement("update usuarios set login=?,senha=?,where id_usu=?");
            st.setString(1, mod.getNome());
            st.setString(2, mod.getSenha());            
            st.setInt(16, mod.getId_usu());
            st.execute();
        JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar/nError:"+ex);
        }
        
        
        conect.desconecta();
        
    }
}