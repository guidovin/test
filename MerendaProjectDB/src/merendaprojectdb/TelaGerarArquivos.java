/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merendaprojectdb;

/**
 *
 * @author thiago
 */
public class TelaGerarArquivos extends javax.swing.JFrame {

    /**
     * Creates new form TelaGerarArquivos
     */
    private Relatorio relatorio;
    public TelaGerarArquivos(Relatorio relatorio) {
        initComponents();
        this.relatorio = relatorio;
    }
    
    Exportador exportador = new Exportador();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gerarODS = new javax.swing.JButton();
        gerarODT = new javax.swing.JButton();
        gerarPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gerarODS.setText("Gerar ODS");
        gerarODS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarODSActionPerformed(evt);
            }
        });

        gerarODT.setText("Gerar ODT");
        gerarODT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarODTActionPerformed(evt);
            }
        });

        gerarPDF.setText("Gerar PDF");
        gerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(gerarODS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(gerarODT)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(gerarPDF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gerarODS)
                    .addComponent(gerarODT))
                .addGap(53, 53, 53)
                .addComponent(gerarPDF)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerarODSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarODSActionPerformed
        exportador.exportarODS(this.relatorio);
    }//GEN-LAST:event_gerarODSActionPerformed

    private void gerarODTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarODTActionPerformed
        exportador.exportarODT();
    }//GEN-LAST:event_gerarODTActionPerformed

    private void gerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarPDFActionPerformed
        exportador.exportarPDF();
    }//GEN-LAST:event_gerarPDFActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gerarODS;
    private javax.swing.JButton gerarODT;
    private javax.swing.JButton gerarPDF;
    // End of variables declaration//GEN-END:variables
}
