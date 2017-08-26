package com.br.profitness.modelsDAO;

import br.com.profitness.modelsCONEX.Conexao;
import br.com.profitness.modelsBEANS.Aluno;
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
public class DaoAluno {
    Conexao conect = new Conexao();
    Aluno mod = new Aluno();
    
    //metodo salvar dados
    public void salvar (Aluno mod) throws SQLException{
        conect.conecta();
        try {
        PreparedStatement st = conect.conex.prepareStatement("insert into aluno(nome,cpf,rg,endereco,numero,bairro,cep,cidade,estado,sexo,telefone,celular,dt_nasc,email) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
        
        st.setString(1, mod.getNome());
        st.setInt(2, mod.getCpf());
        st.setInt(3, mod.getRg());
        st.setString(4, mod.getRua());
        st.setInt(5, mod.getNumero());
        st.setString(6, mod.getBairro());
        st.setInt(7, mod.getCep());
        st.setString(8, mod.getCidade());
        st.setString(9, mod.getEstado());
        st.setString(10, mod.getSexo());
        st.setInt(11, mod.getTelefone());
        st.setInt(12, mod.getCelular());
        st.setDate(13, (Date) mod.getDt_nasc());
        st.setString(14, mod.getEmail());     
        st.execute();
        JOptionPane.showMessageDialog(null,"Salvo com sucesso");
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro/nError:"+e);
            
        }
        
        conect.desconecta();
    }
      
    
    //metodo excluir dados
    public void excluir(Aluno mod){
                
        conect.conecta();
        try {
            PreparedStatement st = conect.conex.prepareStatement("delete from aluno where id_aluno=?");
                st.setInt(1, mod.getId_aluno());
                st.execute();                    
                JOptionPane.showMessageDialog(null,"Aluno excluido com sucesso");   
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ao exluir instrutor:/nError"+ex);
        }
        
        
        
        conect.desconecta();
        
    }
    
    public  Aluno buscaInstrutor(Aluno mod){
        conect.conecta();
        
            conect.executaSQL("select * from  aluno where nome like '%"+mod.getPesquisa()+"%'");
        try {
            conect.rs.first();
            mod.setId_aluno(conect.rs.getInt("id_aluno"));
            mod.setNome(conect.rs.getString("nome"));
            mod.setMatricula(conect.rs.getInt("matricula"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar instrutores/nError:"+ex);
        }
            
        
        conect.desconecta();
        return mod;
    
    }
    
    public void alterar(Aluno mod){
        conect.conecta();
        
        try {
            PreparedStatement st = conect.conex.prepareStatement("update Aluno set nome=?,cpf=?,rg=?,endereco=?,numero=?,bairro=?,cep=?,cidade=?,estado=?,sexo=?,telefone=?,celular=?,dt_nasc=?,email=? where id_aluno=?");
            st.setString(1, mod.getNome());
            st.setInt(2, mod.getCpf());
            st.setInt(3, mod.getRg());
            st.setString(4, mod.getRua());
            st.setInt(5, mod.getNumero());
            st.setString(6, mod.getBairro());
            st.setInt(7, mod.getCep());
            st.setString(8, mod.getCidade());
            st.setString(9, mod.getEstado());
            st.setString(10, mod.getSexo());
            st.setInt(11, mod.getTelefone());
            st.setInt(12, mod.getCelular());
            st.setDate(13, (Date) mod.getDt_nasc());
            st.setString(14, mod.getEmail());                        
            st.setInt(16, mod.getId_aluno());
            st.execute();
        JOptionPane.showMessageDialog(null,"Dados alterados com sucesso porra");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar/nError:"+ex);
        }
        
        
        conect.desconecta();
        
    }
}