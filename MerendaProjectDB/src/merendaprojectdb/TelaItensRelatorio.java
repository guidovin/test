/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merendaprojectdb;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author joycinha
 */
public class TelaItensRelatorio extends javax.swing.JFrame {
    
    String usuario;
    Principal principal;
    BdManager banco;
    DefaultListModel modelList = new DefaultListModel();
    private Relatorio relatorio;
    private CapaDados capa;
    private Cardapio cardapio;
    private ArrayList<ItemComida> itens;
    private boolean editando;
    private String nomeRel;
    private ArrayList<String> itensCardapio;
    /**
     * Creates new form ItensRelatorio
     */
    public TelaItensRelatorio(String nome, String nomeRel, CapaDados capa, Cardapio cardapio) {
        usuario = nome;
        
        
        initComponents();
        carregarItens();
        this.capa = capa;
        this.cardapio = cardapio;
        this.editando = false;
        this.nomeRel = nomeRel;
        
        // com essa parte podemos adicionar o dropBox com as coisas vindas do banco
    }
    public TelaItensRelatorio(Relatorio relatorio) {
        this.relatorio = relatorio;
        this.itens = relatorio.getItensRelatorio();
        initComponents();
        carregarItens();
        carregarTabela();
        this.editando = true;
    }
    private void carregarTabela() {
        DefaultTableModel tabelinha = (DefaultTableModel) tabela.getModel();
        if(itens == null) {
            return;
        }
        for(ItemComida item : itens) {
            if(item == null) {
                continue;
            }
            tabelinha.addRow(new Object[] {item.tipoItem, item.quant, item.unidade});
        }
    }
    private void carregarItens(){
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) tipoItem.getModel();
        //modelo.addElement("thiago");
        
        itensCardapio = banco.pegarItensDoCardapio();
        for(int i=0;i<itensCardapio.size();i++)
        {
            modelo.addElement(itensCardapio.get(i));
        }
    }
    
    private void criaLista() {
       this.tipoItem.removeAll();
        this.tipoItem.addItem(usuario);
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
        tipoItem = new javax.swing.JComboBox<>();
        quantItem = new javax.swing.JTextField();
        unidadeItem = new javax.swing.JComboBox<>();
        AdicionarParaALista = new javax.swing.JButton();
        voltarAoMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        novoItem = new javax.swing.JTextField();
        AdicionarItens = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        criaLista();
        tipoItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Item" }));
        tipoItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tipoItemMouseClicked(evt);
            }
        });
        tipoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoItemActionPerformed(evt);
            }
        });
        tipoItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tipoItemKeyTyped(evt);
            }
        });

        unidadeItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "g", "Kg", "Uni.", "Duz.", " " }));

        AdicionarParaALista.setText("+");
        AdicionarParaALista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarParaAListaActionPerformed(evt);
            }
        });

        voltarAoMenu.setText("Fim");
        voltarAoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarAoMenuActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantidade", "Unidade", "Excluir"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        AdicionarItens.setText("Adicionar");
        AdicionarItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarItensActionPerformed(evt);
            }
        });

        jLabel1.setText("Adicionar novo tipo de Item");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarAoMenu))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(novoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(AdicionarItens))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tipoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(quantItem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(unidadeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(AdicionarParaALista))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unidadeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdicionarParaALista))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdicionarItens))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(voltarAoMenu))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoItemActionPerformed
    private void criaItensLista() {
        DefaultTableModel tabelinha = (DefaultTableModel) tabela.getModel();
        for(int i = 0; i < tabelinha.getRowCount(); i++) {
            String item = tabelinha.getValueAt(i, 0).toString();
            int quant = Integer.parseInt(tabelinha.getValueAt(i,1).toString());
            String unidade = tabelinha.getValueAt(i, 2).toString();
        }
    }
    private void voltarAoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarAoMenuActionPerformed
        // TODO add your handling code here:
        
        // aqui tem que colocar pra pegar o que ta na tabela e jogar pro banco
        if(!this.editando) {
            criaItensLista();
            this.relatorio = new Relatorio (this.cardapio, this.capa, this.nomeRel, itens);
            Principal.relatorioCorrente = this.relatorio;
            BdManager.adicionarRelatorio(this.relatorio);
        }
        principal=new Principal(usuario);
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
        principal.setResizable(true);
        this.setVisible(false);
    }//GEN-LAST:event_voltarAoMenuActionPerformed

    private void AdicionarParaAListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarParaAListaActionPerformed
        if(tipoItem.getSelectedItem()!="Selecione o Item" && !quantItem.getText().equals(""))
        {
            DefaultTableModel tabelinha = (DefaultTableModel) tabela.getModel();
            tabelinha.addRow(new Object[] {tipoItem.getSelectedItem(), quantItem.getText(), unidadeItem.getSelectedItem()});
        }
    }//GEN-LAST:event_AdicionarParaAListaActionPerformed

    private void AdicionarItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarItensActionPerformed
        
        String newItem = novoItem.getText();
        banco.AdicionarItemListaCardapio(newItem);
        carregarItens();
        
    }//GEN-LAST:event_AdicionarItensActionPerformed

    private void tipoItemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipoItemKeyTyped
        //System.out.println(evt);
    }//GEN-LAST:event_tipoItemKeyTyped

    private void tipoItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipoItemMouseClicked
        ArrayList<String> itensCardapio = this.itensCardapio;
        tipoItem.addKeyListener(new java.awt.event.KeyAdapter() {
              public void keyPressed(java.awt.event.KeyEvent evt) {
                int i;
                ArrayList<String> temp = new ArrayList<>();
                System.out.println(evt);
                for(i=0;i<itensCardapio.size();i++)
                {
                    String item = itensCardapio.get(i);
                    char letra = item.charAt(0);
                    int ascii=(int)letra;
                    System.out.println(letra);
                    System.out.println(ascii);
                    if(ascii==evt.getKeyCode() || ascii-32==evt.getKeyCode())
                    {
                        temp.add(itensCardapio.get(i));
                    }
                }
                if(!temp.isEmpty())
                {
                    DefaultComboBoxModel modelo = (DefaultComboBoxModel) tipoItem.getModel();
                    modelo.removeAllElements();
                    modelo.addElement("Selecione o Item");
                    for(i=0;i<temp.size();i++)
                    {
                        modelo.addElement(temp.get(i));
                    }
                }
              }
          });
    }//GEN-LAST:event_tipoItemMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarItens;
    private javax.swing.JButton AdicionarParaALista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField novoItem;
    private javax.swing.JTextField quantItem;
    private javax.swing.JTable tabela;
    private javax.swing.JComboBox<String> tipoItem;
    private javax.swing.JComboBox<String> unidadeItem;
    private javax.swing.JButton voltarAoMenu;
    // End of variables declaration//GEN-END:variables
}
