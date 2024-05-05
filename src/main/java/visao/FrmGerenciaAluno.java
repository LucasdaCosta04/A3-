/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import modelo.Aluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1072416651
 */
public class FrmGerenciaAluno extends javax.swing.JFrame {

    /**
     * Creates new form FrmGerenciaAluno
     */
    private Aluno objetoaluno;

    public FrmGerenciaAluno() {
        initComponents();
        this.objetoaluno = new Aluno();// carrega objetoaluno de aluno
        this.carregaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAlunos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFIdade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFCurso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFFase = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JBCancelar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciar Alunos");

        JTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Idade", "Curso", "Fase"
            }
        ));
        JTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableAlunos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Idade:");

        JTFIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFIdadeActionPerformed(evt);
            }
        });

        JTFCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCursoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Curso:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Fase:");

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBAlterar.setText("Alterar");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(JTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTFFase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(JBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(JBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTFFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIdadeActionPerformed

    private void JTFCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCursoActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        try {
// recebendo e validando dados da interface gráfica.
            int id = 0;
            String nome = "";
            int idade = 0;
            String curso = "";
            int fase = 0;
            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFNome.getText();
            }
            if (this.JTFIdade.getText().length() <= 0) {
                throw new Mensagens("Idade deve ser número e maior que zero.");
            } else {
                idade = Integer.parseInt(this.JTFIdade.getText());
            }
            if (this.JTFCurso.getText().length() < 2) {
                throw new Mensagens("Curso deve conter ao menos 2 caracteres.");
            } else {
                curso = this.JTFCurso.getText();
            }
            if (this.JTFFase.getText().length() <= 0) {
                throw new Mensagens("Fase deve ser número e maior que zero.");
            } else {
                fase = Integer.parseInt(this.JTFFase.getText());
            }
            if (this.JTableAlunos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Aluno para Alterar");
            } else {
                id = Integer.parseInt(this.JTableAlunos.getValueAt(this.JTableAlunos.getSelectedRow(), 0).toString());
            }
// envia os dados para o Aluno processar
            if (this.objetoaluno.updateAlunoBD(id, nome, idade, curso, fase)) {
// limpa os campos
                this.JTFNome.setText("");
                this.JTFIdade.setText("");
                this.JTFCurso.setText("");
                this.JTFFase.setText("");
                JOptionPane.showMessageDialog(rootPane, "Aluno Alterado com Sucesso!");
            }
//Exibe no console o aluno cadastrado
            System.out.println(this.objetoaluno.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally {
// atualiza a tabela.
            carregaTabela();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAlunosMouseClicked
        if (this.JTableAlunos.getSelectedRow() != -1) {
            String nome = this.JTableAlunos.getValueAt(this.JTableAlunos.getSelectedRow(), 1).toString();
            String idade = this.JTableAlunos.getValueAt(this.JTableAlunos.getSelectedRow(), 2).toString();
            String curso = this.JTableAlunos.getValueAt(this.JTableAlunos.getSelectedRow(), 3).toString();
            String fase = this.JTableAlunos.getValueAt(this.JTableAlunos.getSelectedRow(), 4).toString();
            this.JTFNome.setText(nome);
            this.JTFIdade.setText(idade);
            this.JTFCurso.setText(curso);
            this.JTFFase.setText(fase);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableAlunosMouseClicked

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        try {
// validando dados da interface gráfica.
            int id = 0;
            if (this.JTableAlunos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Aluno para APAGAR");
            } else {
                id = Integer.parseInt(this.JTableAlunos.
                        getValueAt(this.JTableAlunos.getSelectedRow(), 0).
                        toString());
            }
// retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            int respostaUsuario = JOptionPane.
                    showConfirmDialog(null,
                            "Tem certeza que deseja apagar este Aluno ?");
            if (respostaUsuario == 0) {// clicou em SIM
// envia os dados para o Aluno processar
                if (this.objetoaluno.deleteAlunoBD(id)) {
// limpa os campos
                    this.JTFNome.setText("");
                    this.JTFIdade.setText("");
                    this.JTFCurso.setText("");
                    this.JTFFase.setText("");
                    JOptionPane.showMessageDialog(rootPane,
                            "Aluno Apagado com Sucesso!");
                }
            }
// atualiza a tabela.
            System.out.println(this.objetoaluno.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
// atualiza a tabela.
            carregaTabela();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JBApagarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGerenciaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGerenciaAluno().setVisible(true);
            }
        });
    }

    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableAlunos.getModel();
        modelo.setNumRows(0); //Posiciona na primeira linha da tabela
//Carrega a lista de objetos aluno
        ArrayList<Aluno> minhaLista = objetoaluno.getMinhaLista();
        for (Aluno a : minhaLista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getIdade(),
                a.getCurso(),
                a.getFase()
            });
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JTextField JTFCurso;
    private javax.swing.JTextField JTFFase;
    private javax.swing.JTextField JTFIdade;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTable JTableAlunos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
