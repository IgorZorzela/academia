package br.com.profitness.views;
import br.com.profitness.modelsCONEX.Conexao;
import javax.swing.JOptionPane;

/**
 *
 * @author igorz
 */
public class Home extends javax.swing.JFrame {  
    
    Conexao conec = new Conexao();
    
   
    public Home() {
        initComponents(); 
        conec.conecta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCad = new javax.swing.JMenu();
        jMenuItemCadAluno = new javax.swing.JMenuItem();
        jMenuItemCadProf = new javax.swing.JMenuItem();
        jMenuItemCadUsu = new javax.swing.JMenuItem();
        jMenuAvaliacao = new javax.swing.JMenu();
        jMenuRecMensa = new javax.swing.JMenu();
        jMenuPresenca = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSairSis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuCad.setText("Cadastros");

        jMenuItemCadAluno.setText("Alunos");
        jMenuItemCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadAlunoActionPerformed(evt);
            }
        });
        jMenuCad.add(jMenuItemCadAluno);

        jMenuItemCadProf.setText("Instrutores");
        jMenuItemCadProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadProfActionPerformed(evt);
            }
        });
        jMenuCad.add(jMenuItemCadProf);

        jMenuItemCadUsu.setText("Usuários");
        jMenuItemCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuActionPerformed(evt);
            }
        });
        jMenuCad.add(jMenuItemCadUsu);

        jMenuBar1.add(jMenuCad);

        jMenuAvaliacao.setText("Agend. de Avaliações");
        jMenuBar1.add(jMenuAvaliacao);

        jMenuRecMensa.setText("Receber Mensalidade");
        jMenuBar1.add(jMenuRecMensa);

        jMenuPresenca.setText("Presença");
        jMenuBar1.add(jMenuPresenca);

        jMenuSair.setText("Sair");

        jMenuItemSairSis.setText("Sair do Sistema");
        jMenuItemSairSis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemSairSisMouseClicked(evt);
            }
        });
        jMenuItemSairSis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairSisActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSairSis);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1936, 1119));
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairSisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairSisActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Deseja sair do sistema?");
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairSisActionPerformed

    private void jMenuItemCadProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadProfActionPerformed
        FormInst instcad = new FormInst();
        instcad.setVisible(true);        
    }//GEN-LAST:event_jMenuItemCadProfActionPerformed

    private void jMenuItemCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadAlunoActionPerformed
        FormAluno alucad = new FormAluno();
        alucad.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadAlunoActionPerformed

    private void jMenuItemCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuActionPerformed
         FormUsu usucad = new FormUsu();
        usucad.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadUsuActionPerformed

    private void jMenuItemSairSisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemSairSisMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSairSisMouseClicked

    
    public static void main(String args[]) {       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAvaliacao;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCad;
    private javax.swing.JMenuItem jMenuItemCadAluno;
    private javax.swing.JMenuItem jMenuItemCadProf;
    private javax.swing.JMenuItem jMenuItemCadUsu;
    private javax.swing.JMenuItem jMenuItemSairSis;
    private javax.swing.JMenu jMenuPresenca;
    private javax.swing.JMenu jMenuRecMensa;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
