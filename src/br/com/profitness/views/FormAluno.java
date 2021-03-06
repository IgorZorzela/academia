/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.profitness.views;

import br.com.profitness.modelsCONEX.Conexao;
import com.br.profitness.modelsDAO.*;
import br.com.profitness.modelsBEANS.Instrutor;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author igorz
 */
public class FormAluno extends javax.swing.JFrame {
    
    Instrutor mod = new Instrutor();
    DaoInstrutor con = new DaoInstrutor();
    Conexao conex = new Conexao();
    int flag = 0;
    
    
    

    /**
     * Creates new form FormProf
     */
    public FormAluno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonNovo = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jScrollPaneNomes = new javax.swing.JScrollPane();
        jListNomes = new javax.swing.JList<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelDados = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelFone1 = new javax.swing.JLabel();
        jLabelFone2 = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelRG = new javax.swing.JLabel();
        jLabelMat = new javax.swing.JLabel();
        jLabelN = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jLabelEmail = new javax.swing.JLabel();
        jLabelDtNasc = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jTextFieldRG = new javax.swing.JTextField();
        jTextFieldMat = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldN = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldFone1 = new javax.swing.JTextField();
        jTextFieldFone2 = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelId_inst = new javax.swing.JLabel();
        jTextFieldId_aluno = new javax.swing.JTextField();
        jDateChooserDt_nasc = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonNovo.setText("Incluir");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo);
        jButtonNovo.setBounds(20, 10, 61, 23);

        jButtonGravar.setText("Gravar");
        jButtonGravar.setEnabled(false);
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGravar);
        jButtonGravar.setBounds(140, 10, 65, 23);

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlterar);
        jButtonAlterar.setBounds(240, 10, 65, 23);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir);
        jButtonExcluir.setBounds(340, 10, 63, 23);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(450, 10, 90, 23);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(570, 10, 51, 23);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 40, 960, 20);

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPesquisa);
        jTextFieldPesquisa.setBounds(10, 50, 280, 30);

        jListNomes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneNomes.setViewportView(jListNomes);

        getContentPane().add(jScrollPaneNomes);
        jScrollPaneNomes.setBounds(10, 100, 280, 390);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(300, 50, 10, 460);

        jLabelDados.setText("Dados do Aluno");
        getContentPane().add(jLabelDados);
        jLabelDados.setBounds(310, 50, 110, 14);

        jLabelNome.setText("Nome");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(380, 90, 60, 14);

        jLabelEndereco.setText("Endereço");
        getContentPane().add(jLabelEndereco);
        jLabelEndereco.setBounds(360, 280, 80, 14);

        jLabelBairro.setText("Brairro");
        getContentPane().add(jLabelBairro);
        jLabelBairro.setBounds(370, 330, 70, 14);

        jLabelCEP.setText("CEP");
        getContentPane().add(jLabelCEP);
        jLabelCEP.setBounds(380, 370, 50, 14);

        jLabelCidade.setText("Cidade");
        getContentPane().add(jLabelCidade);
        jLabelCidade.setBounds(370, 410, 80, 14);

        jLabelEstado.setText("UF");
        getContentPane().add(jLabelEstado);
        jLabelEstado.setBounds(680, 400, 20, 14);

        jLabelFone1.setText("Fone Res.");
        getContentPane().add(jLabelFone1);
        jLabelFone1.setBounds(360, 450, 100, 14);

        jLabelFone2.setText("Celular");
        getContentPane().add(jLabelFone2);
        jLabelFone2.setBounds(600, 450, 70, 14);

        jLabelCPF.setText("CPF");
        getContentPane().add(jLabelCPF);
        jLabelCPF.setBounds(390, 130, 50, 14);

        jLabelRG.setText("RG");
        getContentPane().add(jLabelRG);
        jLabelRG.setBounds(590, 130, 40, 14);

        jLabelMat.setText("Matricula");
        getContentPane().add(jLabelMat);
        jLabelMat.setBounds(370, 210, 70, 14);

        jLabelN.setText("Nº");
        getContentPane().add(jLabelN);
        jLabelN.setBounds(690, 280, 20, 14);

        jLabelSexo.setText("Sexo");
        getContentPane().add(jLabelSexo);
        jLabelSexo.setBounds(380, 240, 70, 14);

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----SELECIONE---\t", "Masculino", "Feminino" }));
        jComboBoxSexo.setEnabled(false);
        getContentPane().add(jComboBoxSexo);
        jComboBoxSexo.setBounds(430, 240, 130, 30);

        jLabelEmail.setText("Email");
        getContentPane().add(jLabelEmail);
        jLabelEmail.setBounds(380, 490, 70, 14);

        jLabelDtNasc.setText("Data de Nasc");
        getContentPane().add(jLabelDtNasc);
        jLabelDtNasc.setBounds(340, 160, 110, 14);

        jTextFieldNome.setEnabled(false);
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(430, 80, 440, 30);

        jFormattedTextFieldCPF.setEnabled(false);
        getContentPane().add(jFormattedTextFieldCPF);
        jFormattedTextFieldCPF.setBounds(430, 120, 120, 30);

        jTextFieldRG.setEnabled(false);
        getContentPane().add(jTextFieldRG);
        jTextFieldRG.setBounds(620, 120, 210, 30);

        jTextFieldMat.setEnabled(false);
        getContentPane().add(jTextFieldMat);
        jTextFieldMat.setBounds(430, 200, 60, 30);

        jTextFieldEndereco.setEnabled(false);
        getContentPane().add(jTextFieldEndereco);
        jTextFieldEndereco.setBounds(430, 280, 250, 30);

        jTextFieldN.setEnabled(false);
        getContentPane().add(jTextFieldN);
        jTextFieldN.setBounds(710, 280, 50, 30);

        jTextFieldBairro.setEnabled(false);
        getContentPane().add(jTextFieldBairro);
        jTextFieldBairro.setBounds(430, 320, 130, 30);

        jFormattedTextFieldCEP.setEnabled(false);
        getContentPane().add(jFormattedTextFieldCEP);
        jFormattedTextFieldCEP.setBounds(430, 360, 70, 30);

        jTextFieldCidade.setEnabled(false);
        getContentPane().add(jTextFieldCidade);
        jTextFieldCidade.setBounds(430, 400, 230, 30);

        jTextFieldEstado.setEnabled(false);
        jTextFieldEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstado);
        jTextFieldEstado.setBounds(700, 400, 40, 30);

        jTextFieldFone1.setEnabled(false);
        getContentPane().add(jTextFieldFone1);
        jTextFieldFone1.setBounds(430, 440, 120, 30);

        jTextFieldFone2.setEnabled(false);
        getContentPane().add(jTextFieldFone2);
        jTextFieldFone2.setBounds(670, 440, 120, 30);

        jTextFieldEmail.setEnabled(false);
        getContentPane().add(jTextFieldEmail);
        jTextFieldEmail.setBounds(430, 480, 300, 30);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 80, 40, 10);

        jLabelId_inst.setText("ID");
        getContentPane().add(jLabelId_inst);
        jLabelId_inst.setBounds(430, 50, 20, 14);

        jTextFieldId_aluno.setEnabled(false);
        getContentPane().add(jTextFieldId_aluno);
        jTextFieldId_aluno.setBounds(450, 50, 60, 25);

        jDateChooserDt_nasc.setEnabled(false);
        getContentPane().add(jDateChooserDt_nasc);
        jDateChooserDt_nasc.setBounds(430, 160, 130, 30);

        setSize(new java.awt.Dimension(999, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed

        if(flag==1){
        mod.setNome(jTextFieldNome.getText());
        mod.setCpf(Integer.parseInt(jFormattedTextFieldCPF.getText()));
        mod.setRg(Integer.parseInt(jTextFieldRG.getText()));
        mod.setEmail(jTextFieldEmail.getText());
        mod.setCidade(jTextFieldCidade.getText());
        mod.setNumero(Integer.parseInt(jTextFieldN.getText()));
        mod.setBairro(jTextFieldBairro.getText());
        mod.setCep(Integer.parseInt(jFormattedTextFieldCEP.getText()));
        mod.setEstado(jTextFieldEstado.getText());
        mod.setCref(jTextFieldMat.getText());        
        //mod.setDt_nasc(Date.parse(jFormattedTextFieldDtNasc.getText()));
        mod.setTelefone(Integer.parseInt(jTextFieldFone1.getText()));
        mod.setCelular(Integer.parseInt(jTextFieldFone2.getText()));
        //mod.setSexo(jComboBoxSexo.getSelectedItem().toString());
        JOptionPane.showMessageDialog(rootPane,"cadastrou");        
        try {        
            con.salvar(mod);
            
                jTextFieldNome.setText("");
                jFormattedTextFieldCPF.setText("");
                jTextFieldRG.setText("");
                jTextFieldEmail.setText("");
                jTextFieldCidade.setText("");
                jTextFieldEndereco.setText("");
                jTextFieldN.setText("");
                jTextFieldBairro.setText("");
                jFormattedTextFieldCEP.setText("");
                jTextFieldEstado.setText("");
                jTextFieldMat.setText("");
                //jDateChooserDt_nasc.setDate();
                jTextFieldFone1.setText("");
                jTextFieldFone2.setText("");
                jComboBoxSexo.setEnabled(false);
                jTextFieldNome.setEnabled(false);
                jFormattedTextFieldCPF.setEnabled(false);
                jTextFieldRG.setEnabled(false);
                jTextFieldEmail.setEnabled(false);
                jTextFieldEndereco.setEnabled(false);
                jTextFieldCidade.setEnabled(false);
                jTextFieldN.setEnabled(false);
                jTextFieldBairro.setEnabled(false);
                jFormattedTextFieldCEP.setEnabled(false);
                jTextFieldEstado.setEnabled(false);
                jTextFieldMat.setEnabled(false);
                jDateChooserDt_nasc.setEnabled(false);
                jTextFieldFone1.setEnabled(false);
                jTextFieldFone2.setEnabled(false);
                jButtonGravar.setEnabled(false);
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"nao cadastrou"+ex);
        }
       } else{
            mod.setId_int((Integer.parseInt(jTextFieldId_aluno.getText())));
            mod.setNome(jTextFieldNome.getText());
            mod.setCref(jTextFieldMat.getText());
            con.alterar(mod);
            //limpar campos
            jTextFieldId_aluno.setText("");
            jTextFieldNome.setText("");
            jTextFieldMat.setText("");
            jTextFieldPesquisa.setText("");
            
            jComboBoxSexo.setEnabled(false);
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldCPF.setEnabled(false);
            jTextFieldRG.setEnabled(false);
            jTextFieldEmail.setEnabled(false);
            jTextFieldEndereco.setEnabled(false);
            jTextFieldCidade.setEnabled(false);
            jTextFieldN.setEnabled(false);
            jTextFieldBairro.setEnabled(false);
            jFormattedTextFieldCEP.setEnabled(false);
            jTextFieldEstado.setEnabled(false);
            jTextFieldMat.setEnabled(false);
            jDateChooserDt_nasc.setEnabled(false);
            jTextFieldFone1.setEnabled(false);
            jTextFieldFone2.setEnabled(false);
            jButtonGravar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            
        }
       
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jButtonGravar.setEnabled(true);
        jButtonAlterar.setEnabled(!true);
        jButtonExcluir.setEnabled(!true);
        jButtonCancelar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCPF.setEnabled(true);
        jTextFieldRG.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldN.setEnabled(true);
        jTextFieldBairro.setEnabled(true);
        jFormattedTextFieldCEP.setEnabled(true);
        jTextFieldEstado.setEnabled(true);
        jTextFieldMat.setEnabled(true);
        jDateChooserDt_nasc.setEnabled(true);
        jTextFieldFone1.setEnabled(true);
        jTextFieldFone2.setEnabled(true);
        jComboBoxSexo.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        mod.setPesquisa(jTextFieldPesquisa.getText());
        Instrutor busca = con.buscaInstrutor(mod);
        jTextFieldId_aluno.setText(String.valueOf(busca.getId_int()));
        jTextFieldNome.setText(busca.getNome());
        jTextFieldMat.setText(String.valueOf(busca.getCref()));
        jFormattedTextFieldCPF.setText(String.valueOf(busca.getCpf()));
        jTextFieldRG.setText(String.valueOf(busca.getRg()));
        jTextFieldEmail.setText(busca.getEmail());
        jTextFieldCidade.setText(busca.getCidade());
        jTextFieldEndereco.setText(busca.getRua());
        jTextFieldN.setText(String.valueOf(busca.getNumero()));
        jTextFieldBairro.setText(busca.getBairro());
        jFormattedTextFieldCEP.setText(String.valueOf(busca.getCep()));
        jTextFieldEstado.setText(busca.getEstado());
        jTextFieldMat.setText(String.valueOf(busca.getCref()));
        jDateChooserDt_nasc.setDate(busca.getDt_nasc());
        jTextFieldFone1.setText(String.valueOf(busca.getTelefone()));
        jTextFieldFone2.setText(String.valueOf(busca.getCelular()));
        //jComboBoxSexo.setText(busca.getTelefone());
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
          
        jButtonGravar.setEnabled(!true);
        jButtonAlterar.setEnabled(!false);
        jButtonExcluir.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        jFormattedTextFieldCPF.setEnabled(!true);
        jTextFieldRG.setEnabled(!true);
        jTextFieldEmail.setEnabled(!true);
        jTextFieldCidade.setEnabled(!true);
        jTextFieldEndereco.setEnabled(!true);
        jTextFieldN.setEnabled(!true);
        jTextFieldBairro.setEnabled(!true);
        jFormattedTextFieldCEP.setEnabled(!true);
        jTextFieldEstado.setEnabled(!true);
        jTextFieldMat.setEnabled(!true);
        jDateChooserDt_nasc.setEnabled(!true);
        jTextFieldFone1.setEnabled(!true);
        jTextFieldFone2.setEnabled(!true);
        jComboBoxSexo.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonGravar.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        flag = 2;
        jButtonGravar.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCPF.setEnabled(true);
        jTextFieldRG.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldN.setEnabled(true);
        jTextFieldBairro.setEnabled(true);
        jFormattedTextFieldCEP.setEnabled(true);
        jTextFieldEstado.setEnabled(true);
        jTextFieldMat.setEnabled(true);
        jDateChooserDt_nasc.setEnabled(true);
        jTextFieldFone1.setEnabled(true);
        jTextFieldFone2.setEnabled(true);
        jComboBoxSexo.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int respostausu = 0;
        respostausu = JOptionPane.showConfirmDialog(rootPane,"Realemte deseja apagar instrutor?");
            if(respostausu == JOptionPane.YES_OPTION){
                mod.setId_int(Integer.parseInt(jTextFieldId_aluno.getText()));
                con.excluir(mod);
                
                    jTextFieldId_aluno.setText("");
                    jTextFieldNome.setText("");
                    jTextFieldMat.setText("");
                    jTextFieldPesquisa.setText("");            
                    jComboBoxSexo.setEnabled(false);
                    jTextFieldNome.setEnabled(false);
                    jFormattedTextFieldCPF.setEnabled(false);
                    jTextFieldRG.setEnabled(false);
                    jTextFieldEmail.setEnabled(false);
                    jTextFieldEndereco.setEnabled(false);
                    jTextFieldCidade.setEnabled(false);
                    jTextFieldN.setEnabled(false);
                    jTextFieldBairro.setEnabled(false);
                    jFormattedTextFieldCEP.setEnabled(false);
                    jTextFieldEstado.setEnabled(false);
                    jTextFieldMat.setEnabled(false);
                    jDateChooserDt_nasc.setEnabled(false);
                    jTextFieldFone1.setEnabled(false);
                    jTextFieldFone2.setEnabled(false);
                    jButtonGravar.setEnabled(false);
                    jButtonNovo.setEnabled(true);
                    jButtonCancelar.setEnabled(false);
                    jButtonAlterar.setEnabled(false);
            }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private com.toedter.calendar.JDateChooser jDateChooserDt_nasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelDados;
    private javax.swing.JLabel jLabelDtNasc;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFone1;
    private javax.swing.JLabel jLabelFone2;
    private javax.swing.JLabel jLabelId_inst;
    private javax.swing.JLabel jLabelMat;
    private javax.swing.JLabel jLabelN;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JList<String> jListNomes;
    private javax.swing.JScrollPane jScrollPaneNomes;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldFone1;
    private javax.swing.JTextField jTextFieldFone2;
    private javax.swing.JTextField jTextFieldId_aluno;
    private javax.swing.JTextField jTextFieldMat;
    private javax.swing.JTextField jTextFieldN;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldRG;
    // End of variables declaration//GEN-END:variables
}
