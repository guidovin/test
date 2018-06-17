/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merendaprojectdb;

import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author joycinha
 */
public class TelaListaRelatorios extends javax.swing.JFrame {
    
    TelaCapaRelatorio editaRelatorio;
    Relatorio relatorioSelecionado;
    DefaultListModel modeloLista;
    TelaPrincipal principal;
    //BdManager banco;
    private ArrayList<Relatorio> relatorios;
    /**
     * Creates new form TelaListaRelatorios
     */
    public TelaListaRelatorios() {
        initComponents();
        carregarLista();
        Cardapio cardapio = new Cardapio(new Calendario(5,2018));
        CapaDados capa = new CapaDados();
        ArrayList<ItemComida> itens = new ArrayList<>();
        itens.add(new ItemComida("Abacaxi", 10, "kg"));
        int[] turnos;
        turnos = new int[] {10,20,30,40};
        capa.setVetorMatriculados(0, turnos, 20, 30);
        capa.setVetorMatriculados(1,new int[] {8,51,35,12},32,15);
        relatorioSelecionado = new Relatorio(5,2018, "Relatorio lindo", 
                TelaPrincipal.usuarioLogado.getEscola(), cardapio, capa, itens);
    }
    private void carregarLista()
    {
        
        //TEM QUE CONSERTAR AQUI PELO AMOR DE DEUS
        // TO CANSADO DEMAIS PRA ACHAR O ERRO
        
        this.listaRelatorios.setModel(new DefaultListModel());
        this.modeloLista = (DefaultListModel) this.listaRelatorios.getModel();
        relatorios = BdManager.getRelatoriosExistentes();
        for(int i=0;i<relatorios.size();i++)
        {
            this.modeloLista.addElement(relatorios.get(i).getTitulo());
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaRelatorios = new javax.swing.JList<>();
        voltar = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        mesSelect = new javax.swing.JComboBox<>();
        anoSelect = new javax.swing.JComboBox<>();
        pesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        listaRelatorios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "ITEM1", "ITEM2", "ITEM3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaRelatorios);

        voltar.setText("Voltar");
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });

        jButton2.setText("Gerar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        mesSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ" }));

        anoSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));
        anoSelect.setName(""); // NOI18N

        pesquisar.setText("Pesquisar");
        pesquisar.setActionCommand("pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mesSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(anoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pesquisar)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2)
                            .addGap(21, 21, 21))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(voltar)
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(this.listaRelatorios.getSelectedIndex()== -1) {
            JOptionPane.showMessageDialog(null,"Selecione um relatorio");
            return;
        }
        int index = this.listaRelatorios.getSelectedIndex();
        this.relatorioSelecionado = relatorios.get(index);
        this.editaRelatorio = new TelaCapaRelatorio(this.relatorioSelecionado);
        this.editaRelatorio.setLocationRelativeTo(null);
        this.editaRelatorio.setVisible(true);
        this.editaRelatorio.setResizable(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        principal=new TelaPrincipal();
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
        principal.setResizable(true);
        this.setVisible(false);
    }//GEN-LAST:event_voltarMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(this.listaRelatorios.getSelectedIndex()== -1) {
            JOptionPane.showMessageDialog(null,"Selecione um relatorio");
            return;
        }
        int index = this.listaRelatorios.getSelectedIndex();
        this.relatorioSelecionado = relatorios.get(index);
        TelaGerarArquivos telagerar = new TelaGerarArquivos(this.relatorioSelecionado);
        telagerar.setLocationRelativeTo(null);
        telagerar.setVisible(true);
        telagerar.setResizable(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        Object mestemp = mesSelect.getSelectedItem();
        Object anotemp = anoSelect.getSelectedItem();
        
        String mes = ""+mestemp;
        String ano = ""+anotemp;
        
        int mesNum;
        
        switch(mes){
            case "JAN":
                mesNum=1;
                break;
            case "FEV":
                mesNum=2;
                break;
            case "MAR":
                mesNum=3;
                break;
            case "ABR":
                mesNum=4;
                break;
            case "MAI":
                mesNum=5;
                break;
            case "JUN":
                mesNum=6;
                break;
            case "JUL":
                mesNum=7;
                break;
            case "AGO":
                mesNum=8;
                break;
            case "SET":
                mesNum=9;
                break;
            case "OUT":
                mesNum=10;
                break;
            case "NOV":
                mesNum=11;
                break;
            case "DEZ":
                mesNum=12;
                break;
            default:
                mesNum=0;
        }
       
        int anoNum=0; 
        if(!ano.equals("----"))
            anoNum= Integer.parseInt(ano);
        
        //busca mes e ano especifico
        this.listaRelatorios.setModel(new DefaultListModel());
        this.modeloLista = (DefaultListModel) this.listaRelatorios.getModel();
        relatorios = BdManager.getRelatoriosSelecionados(mesNum,anoNum);
        for(int i=0;i<relatorios.size();i++)
        {
            this.modeloLista.addElement(relatorios.get(i).getTitulo());
        }               

// TODO add your handling code here:
    }//GEN-LAST:event_pesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anoSelect;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaRelatorios;
    private javax.swing.JComboBox<String> mesSelect;
    private javax.swing.JButton pesquisar;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
