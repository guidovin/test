/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merendaprojectdb;

import javax.swing.JOptionPane;

/**
 *
 * @author gdsm
 */
public class TelaNovaEscola extends javax.swing.JFrame {
    
    TelaEscola principal;
    String usuario;

    /**
     * Creates new form TelaEscola
     */
    public TelaNovaEscola(String nome) {
        initComponents();
        usuario=nome;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        campoPrefeitura = new javax.swing.JTextField();
        campoSec = new javax.swing.JTextField();
        campoINEP = new javax.swing.JTextField();
        campoDiretoria = new javax.swing.JTextField();
        campoUnidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoTel = new javax.swing.JTextField();
        campoDDD = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        campoEstado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        campoDept = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoSubSec = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoDistrito = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("voltar");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escola");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(176, 176, 176))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
        );

        campoPrefeitura.setText("Duque de Caxias");
        campoPrefeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrefeituraActionPerformed(evt);
            }
        });

        campoSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSecActionPerformed(evt);
            }
        });

        campoINEP.setToolTipText("");
        campoINEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoINEPActionPerformed(evt);
            }
        });

        campoDiretoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDiretoriaActionPerformed(evt);
            }
        });

        jLabel3.setText("Município:");

        jLabel5.setText("Secretaria:");

        jLabel6.setText("Diretoria:");

        jLabel7.setText("INEP:");

        jLabel8.setText("Telefone:");

        campoDDD.setText("DDD");
        campoDDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDDDActionPerformed(evt);
            }
        });

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Estado:");

        campoEstado.setMaximumRowCount(27);
        campoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RJ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RN", "RS", "RO", "RR", "SC", "SPE ", "TO" }));

        jLabel10.setText("Departamento:");

        campoDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeptActionPerformed(evt);
            }
        });

        jLabel11.setText("Sub secretaria:");

        campoSubSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSubSecActionPerformed(evt);
            }
        });

        jLabel12.setText("Unidade:");

        jLabel4.setText("Distrito:");

        campoDistrito.setText("Centro");
        campoDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDistritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel12)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(30, 30, 30)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoPrefeitura)
                    .addComponent(campoSec)
                    .addComponent(campoDiretoria)
                    .addComponent(campoINEP)
                    .addComponent(campoUnidade)
                    .addComponent(campoDept)
                    .addComponent(campoSubSec)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(campoDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDistrito))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(campoPrefeitura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(campoDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(campoSubSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoDiretoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoINEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(campoUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                        
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        principal=new TelaEscola(usuario);
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
        principal.setResizable(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void campoPrefeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrefeituraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrefeituraActionPerformed

    private void campoSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSecActionPerformed

    private void campoDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeptActionPerformed

    private void campoSubSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSubSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSubSecActionPerformed

    private void campoINEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoINEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoINEPActionPerformed

    private void campoDiretoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDiretoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDiretoriaActionPerformed

    private void campoDDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDDDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(campoSec.getText().equals("") || 
                campoPrefeitura.getText().equals("") || 
                campoDistrito.getText().equals("") ||
                campoSubSec.getText().equals("") ||
                campoDept.getText().equals("") || 
                campoINEP.getText().equals("") || 
                campoDiretoria.getText().equals("") || 
                campoUnidade.getText().equals("") || 
                campoDDD.getText().equals("") || 
                campoTel.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Esta Faltando algum dado");
        }
        else
        {
            
            if(BdManager.verificaEscola(campoINEP.getText()))
            {
                JOptionPane.showMessageDialog(null,"Esta escola já existe no banco");
            }
            else
            {
                Object estado = campoEstado.getSelectedItem();
                String pref = campoPrefeitura.getText();
                String dist = campoDistrito.getText();
                String sec = campoSec.getText();
                String subsec = campoSubSec.getText();
                String dept = campoDept.getText();
                String inep  = campoINEP.getText();
                String diretoria = campoDiretoria.getText();
                String unidade = campoUnidade.getText();
                String ddd  = campoDDD.getText();
                String tel  = campoTel.getText();
                String telefone = ddd+tel;

                int inepFinal = Integer.parseInt(inep);

                // atualiza o banco de dados
                Escola escolaNova = new Escola(""+estado,pref, dist, sec, subsec, dept, inepFinal, diretoria, unidade, telefone);
                BdManager.cadastraEscola(escolaNova);

                campoPrefeitura.setText("");
                campoDistrito.setText("");
                campoSec.setText("");
                campoSubSec.setText("");
                campoDept.setText("");
                campoINEP.setText("");
                campoDiretoria.setText("");
                campoUnidade.setText("");
                campoDDD.setText("");
                campoTel.setText("");
                JOptionPane.showMessageDialog(null,"Escola criada com sucesso");
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campoDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDistritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDistritoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoDDD;
    private javax.swing.JTextField campoDept;
    private javax.swing.JTextField campoDiretoria;
    private javax.swing.JTextField campoDistrito;
    private javax.swing.JComboBox<String> campoEstado;
    private javax.swing.JTextField campoINEP;
    private javax.swing.JTextField campoPrefeitura;
    private javax.swing.JTextField campoSec;
    private javax.swing.JTextField campoSubSec;
    private javax.swing.JTextField campoTel;
    private javax.swing.JTextField campoUnidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
