/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merendaprojectdb;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jopendocument.dom.OOUtils;
import org.odftoolkit.odfdom.type.Color;
import org.odftoolkit.simple.Document;
import org.odftoolkit.simple.TextDocument;
import org.odftoolkit.simple.SpreadsheetDocument;
import org.odftoolkit.simple.table.Cell;
import org.odftoolkit.simple.table.Column;
import org.odftoolkit.simple.table.Row;
import org.odftoolkit.simple.table.Table;
import org.odftoolkit.simple.table.TableTemplate;
import org.odftoolkit.simple.text.list.List;

/**
 *
 * @author thiago
 */
public class TelaGerarArquivos extends javax.swing.JFrame {

    /**
     * Creates new form TelaGerarArquivos
     */
    private Relatorio relatorio;
    private TelaListaRelatorios listaRelatorios;
    public TelaGerarArquivos(Relatorio relatorio) {
        initComponents();
        this.relatorio = relatorio;
    }
    private void setVetorMatriculados(Object[][] data, Relatorio relatorio, int pos, String modalidade) {
        data[pos] = new Object[] { modalidade , relatorio.getCapaRelatorio().refeicoes[pos].turnos[0],
                relatorio.getCapaRelatorio().refeicoes[pos].turnos[1], relatorio.getCapaRelatorio().refeicoes[pos].turnos[2],
                relatorio.getCapaRelatorio().refeicoes[pos].turnos[3], relatorio.getCapaRelatorio().refeicoes[pos].totalMatriculados,
                relatorio.getCapaRelatorio().refeicoes[pos].atendidos, relatorio.getCapaRelatorio().refeicoes[pos].numDias,
                relatorio.getCapaRelatorio().refeicoes[pos].totalRefeicoes};
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
        voltar = new javax.swing.JLabel();
        teste1 = new javax.swing.JButton();
        teste2 = new javax.swing.JButton();

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

        voltar.setText("voltar");
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });

        teste1.setText("teste");
        teste1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teste1ActionPerformed(evt);
            }
        });

        teste2.setText("teste2");
        teste2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teste2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(gerarPDF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(teste1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(teste2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(gerarODS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(gerarODT)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(voltar)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gerarODS)
                    .addComponent(gerarODT))
                .addGap(53, 53, 53)
                .addComponent(gerarPDF)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teste1)
                    .addComponent(teste2))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerarODSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarODSActionPerformed
        exportador.exportarODS(this.relatorio);
    }//GEN-LAST:event_gerarODSActionPerformed

    private void gerarODTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarODTActionPerformed
        exportador.exportarODT(relatorio);
    }//GEN-LAST:event_gerarODTActionPerformed

    private void gerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarPDFActionPerformed
        exportador.exportarPDF();
    }//GEN-LAST:event_gerarPDFActionPerformed

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        this.listaRelatorios = new TelaListaRelatorios();
        this.listaRelatorios.setLocationRelativeTo(null);
        this.listaRelatorios.setVisible(true);
        this.listaRelatorios.setResizable(true);
        dispose();
    }//GEN-LAST:event_voltarMouseClicked

    private void teste1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teste1ActionPerformed

        try {
            CapaDados capaDados = relatorio.getCapaRelatorio();
            SpreadsheetDocument doc = SpreadsheetDocument.newSpreadsheetDocument();
            SpreadsheetDocument modelo = SpreadsheetDocument.loadDocument("modelo.ods");
            Table capa = modelo.getTableByName("Capa");
            
            doc.removeSheet(0);
            
            System.out.println(TelaPrincipal.escolaAtual.getUnidade());
            System.out.println(relatorio.getEscola().getUnidade());
            
            
            capa.getCellByPosition(1, 3).setStringValue(relatorio.getEscola().getUnidade());
            capa.getCellByPosition(9, 3).setStringValue(""+(relatorio.getMes()+1)+"/"+(relatorio.getAno()-1900));
            capa.getCellByPosition(1, 4).setStringValue(relatorio.getEscola().getUnidade());
            capa.getCellByPosition(1, 5).setStringValue(relatorio.getEscola().getTelefone());
            capa.getCellByPosition(7, 5).setStringValue(""+relatorio.getEscola().getINEP());
            
            for(int i=11;i<16;i++)
            {
                for(int j=2;j<10;j++)
                {
                    capa.getCellByPosition(j, i).setStringValue(""+capaDados.getValueAt(i-11, j-2));
                }
            }
            System.out.println(capaDados.getValueAt(1, 5));
            capa.getCellByPosition(2, 17).setStringValue(""+capaDados.alunosAtendidosDesjejum);
            capa.getCellByPosition(6, 17).setStringValue(""+capaDados.desjejumTotalMensalServido);
            
            capa.getCellByPosition(2,21).setStringValue(""+capaDados.maisEducacao[0].matriculados);
            capa.getCellByPosition(4,21).setStringValue(""+capaDados.maisEducacao[0].atendidos);
            capa.getCellByPosition(6,21).setStringValue(""+capaDados.maisEducacao[0].numDias);
            capa.getCellByPosition(7,21).setStringValue(""+capaDados.maisEducacao[0].totalDesjejum);
            capa.getCellByPosition(8,21).setStringValue(""+capaDados.maisEducacao[0].totalLanche);
            
            capa.getCellByPosition(2,24).setStringValue(""+capaDados.maisEducacao[1].matriculados);
            capa.getCellByPosition(4,24).setStringValue(""+capaDados.maisEducacao[1].atendidos);
            capa.getCellByPosition(6,24).setStringValue(""+capaDados.maisEducacao[1].numDias);
            capa.getCellByPosition(8,24).setStringValue(""+capaDados.maisEducacao[1].totalLanche);
            capa.getCellByPosition(9,24).setStringValue(""+capaDados.getTotalMaisEducacao());
            
            capa.getCellByPosition(2,26).setStringValue(""+capaDados.getTotalServido());
            
            
            
            
            
            
            
            
            
            
            
            
            doc.appendSheet(capa, "capa");
            doc.save("ttestefinal.ods");
            System.out.println("Fim");
            File file = new File("ttestefinal.ods");
            OOUtils.open(file);
            
        } catch (Exception e) {
            System.err.println("ERROR: unable to create output file.");
            System.err.println(e);
        }
    }//GEN-LAST:event_teste1ActionPerformed

    private void teste2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teste2ActionPerformed
       
        try
        {
            TextDocument document = TextDocument.newTextDocument();
            Table table1 = Table.newTable(document);

            table1.setTableName("Table1");

            document.save("teste2.odt");
        } catch (Exception ex) {
            Logger.getLogger(TelaGerarArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_teste2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gerarODS;
    private javax.swing.JButton gerarODT;
    private javax.swing.JButton gerarPDF;
    private javax.swing.JButton teste1;
    private javax.swing.JButton teste2;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}



 /*Document doc = SpreadsheetDocument.loadDocument("teste2.odt");
            InputStream oi = new FileInputStream("teste1.odt");
            TableTemplate template = doc.LoadTableTemplateFromForeignTable(oi, "template");
            Table table = doc.getTableByName("pipoca");
            table.applyStyle(template);
            Column coluna = table.getColumnByIndex(1);
            coluna.setWidth(40);
            table.getCellByPosition(1, 0).setDoubleValue(23.0);
            doc.save("ttestefinal.odt");*/
            

            // add image
            //outputOdt.newImage(new URI("odf-logo.png"));

            // add paragraph
            //outputOdt.addParagraph("Hello World, Hello Simple ODF!");

            // add list
            //outputOdt.addParagraph("The following is a list.");
            //List list = outputOdt.addList();
            /*String[] items = {"item1", "item2", "item3"};
            list.addItems(items);

            // add table
            Table table = outputOdt.addTable(2, 2);
            Cell cell = table.getCellByPosition(0, 0);
            cell.setStringValue("Hello World!");

            outputOdt.save("HelloWorld.odt");
            System.out.println("0");
            SpreadsheetDocument doc = SpreadsheetDocument.newSpreadsheetDocument();
            System.out.println("1");
            Table sheet = doc.getSheetByIndex(0);
            System.out.println("2");
            sheet.getCellByPosition(0, 0).setStringValue("Betrag");
            System.out.println("3");
            sheet.getCellByPosition(1, 0).setDoubleValue(23.0);
            System.out.println("4");
            doc.save("HelloWorld.ods");
            System.out.println("5");
              */