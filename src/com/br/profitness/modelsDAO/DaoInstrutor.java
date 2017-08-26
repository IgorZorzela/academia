package com.br.profitness.modelsDAO;

import br.com.profitness.modelsCONEX.Conexao;
import br.com.profitness.modelsBEANS.Instrutor;
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
public class DaoInstrutor {
    Conexao conect = new Conexao();
    Instrutor mod = new Instrutor();
    
    //metodo salvar dados
    public void salvar (Instrutor mod) throws SQLException{
        conect.conecta();
        try {
        PreparedStatement st = conect.conex.prepareStatement("insert into instrutor(nome,cpf,rg,endereco,numero,bairro,cep,cidade,estado,sexo,telefone,celular,email,dt_nasc,cref) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
        
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
        st.setString(13, mod.getEmail());
        st.setDate(14, (Date) mod.getDt_nasc());
        st.setString(15, mod.getCref());
        st.execute();
        JOptionPane.showMessageDialog(null,"Salvo com sucesso");
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro/nError:"+e);
            
        }
        
        conect.desconecta();
    }
      
    
    //metodo excluir dados
    public void excluir(Instrutor mod){
                
        conect.conecta();
        try {
            PreparedStatement st = conect.conex.prepareStatement("delete from instrutor where id_inst=?");
                st.setInt(1, mod.getId_int());
                st.execute();                    
                JOptionPane.showMessageDialog(null,"Instrutor excluido com sucesso");   
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ao exluir instrutor:/nError"+ex);
        }
        
        
        
        conect.desconecta();
        
    }
    
    public  Instrutor buscaInstrutor(Instrutor mod){
        conect.conecta();
        
            conect.executaSQL("select * from  instrutor where nome like '%"+mod.getPesquisa()+"%'");
        try {
            conect.rs.first();
            mod.setId_int(conect.rs.getInt("id_inst"));
            mod.setNome(conect.rs.getString("nome"));
            mod.setCpf(conect.rs.getInt("cpf"));
            mod.setRg(conect.rs.getInt("rg"));
            mod.setRua(conect.rs.getString("endereco"));
            mod.setNumero(conect.rs.getInt("numero"));
            mod.setBairro(conect.rs.getString("bairro"));
            mod.setCep(conect.rs.getInt("cep"));
            mod.setCidade(conect.rs.getString("cidade"));
            mod.setEstado(conect.rs.getString("estado"));
            mod.setSexo(conect.rs.getString("sexo"));
            mod.setTelefone(conect.rs.getInt("telefone"));
            mod.setCelular(conect.rs.getInt("celular"));
            mod.setEmail(conect.rs.getString("email"));
            mod.setDt_nasc(conect.rs.getDate("dt_nasc"));
            mod.setCref(conect.rs.getString("cref"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Instrutor não cadastrado!");
        }
            
        
        conect.desconecta();
        return mod;
    
    }
    
    public void alterar(Instrutor mod){
        conect.conecta();
        
        try {
            PreparedStatement st = conect.conex.prepareStatement("update instrutor set nome=?,cpf=?,rg=?,endereco=?,numero=?,bairro=?,cep=?,cidade=?,estado=?,sexo=?,telefone=?,celular=?,email=?,dt_nasc=?,cref=? where id_inst=?");
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
            st.setString(13, mod.getEmail());
            st.setDate(14, (Date) mod.getDt_nasc());
            st.setString(15, mod.getCref());
            st.setInt(16, mod.getId_int());
            st.execute();
        JOptionPane.showMessageDialog(null,"Dados alterados com sucesso porra");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar/nError:"+ex);
        }
        
        
        conect.desconecta();
        
    }
}