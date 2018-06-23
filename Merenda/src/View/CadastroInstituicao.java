package View;

import Controller.Instituicao;
import Controller.Pessoa;
import Model.Auxiliar;
import Model.Conexao;
import Model.ComboItem;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author victor
 */
public class CadastroInstituicao extends javax.swing.JFrame {

    private int idDiretor = -1;    
    private String oldTxtDiretor;
    List<Map<String, Object>> inst;
    boolean editmode = false;
    Instituicao i1;
    /**
     * Creates new form CadastroAlimento
     */
    
    public void reset(){
        txtDiretor.setText("");
        txtEndereco.setText("");
        txtINEP.setText("");
        txtQtdAlunos.setText("");
        txtTelefone.setText("");
        txtNome.setText("");
        cmbTipo.setSelectedIndex(-1);
        btnDeletar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnCadastrar.setEnabled(true);
        btnPesquisar.setEnabled(true);
        editmode = false;
        i1 = null;
    }
    
    public CadastroInstituicao() {
        initComponents();
        Conexao con = new Conexao();
        inst = con.tiposDeInstituicao();
        cmbTipo.removeAllItems();
        for (int i = 0; i < inst.size(); i++){
            cmbTipo.addItem(inst.get(i).get("descricao").toString());
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

        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtQtdAlunos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDiretor = new javax.swing.JTextField();
        btnPesquisaDiretor = new javax.swing.JButton();
        chkDiretor = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtINEP = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        lblPesquisaDiretor = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mItemPrincipal = new javax.swing.JMenuItem();
        mItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Cadastro de Instituição");

        jLabel3.setText("Nome da Instituição");

        txtNome.setToolTipText("Ex..: Escola Estadual Caxiense");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Endereço:");

        txtEndereco.setToolTipText("Ex..: Rua Santa Cruz, 157, Centro");

        jLabel5.setText("Telefone");

        txtTelefone.setToolTipText("Ex..: 21 1122-1122");

        lblTipo.setText("Tipo da Instituição");

        jLabel1.setText("Número de alunos:");

        txtQtdAlunos.setToolTipText("Ex.: 152");

        jLabel11.setText("Diretor");

        txtDiretor.setToolTipText("Ex.: 25");
        txtDiretor.setEnabled(false);

        btnPesquisaDiretor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisa_diretor.png"))); // NOI18N
        btnPesquisaDiretor.setEnabled(false);
        btnPesquisaDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaDiretorActionPerformed(evt);
            }
        });

        chkDiretor.setSelected(true);
        chkDiretor.setText("Cadastrar sem diretor");
        chkDiretor.setEnabled(false);
        chkDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDiretorActionPerformed(evt);
            }
        });

        jLabel6.setText("INEP");

        txtINEP.setToolTipText("Ex: 123456789");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.setEnabled(false);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lblPesquisaDiretor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPesquisaDiretor.setEnabled(false);

        jMenu1.setText("Arquivo");

        mItemPrincipal.setText("Menu Principal");
        mItemPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemPrincipalActionPerformed(evt);
            }
        });
        jMenu1.add(mItemPrincipal);

        mItemSair.setText("Sair");
        mItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(mItemSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)))
                .addGap(164, 164, 164))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(txtINEP, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(txtNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkDiretor)
                    .addComponent(txtQtdAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblTipo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDiretor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisaDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPesquisaDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtINEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPesquisaDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPesquisaDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(chkDiretor)
                        .addGap(48, 48, 48)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSairActionPerformed
        if (Model.Auxiliar.confirmarSaida()) System.exit(0);
    }//GEN-LAST:event_mItemSairActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Instituicao i = new Instituicao();
        String erros = "";
        i.setNome(txtNome.getText());
        i.setInep(txtINEP.getText());
        i.setTelefone(txtTelefone.getText());
        i.setQtd_alunos(
                (Auxiliar.isNumeric(txtQtdAlunos.getText())) ? 
                Integer.valueOf(txtQtdAlunos.getText()) : -1);
        i.setEndereco(txtEndereco.getText());
        
        if (!chkDiretor.isSelected()){
            if (idDiretor == -1)
                erros += "É necessário pesquisar o ID ou Nome do diretor antes de cadastrá-lo.\n";
            // SE O CARA DER ALGUM JEITO DE TROCAR O TXT DO DIRETOR MESMO DEPOIS DE TER SETADO ENABLED FALSE
            else if (!txtDiretor.getText().equals(oldTxtDiretor)) 
                erros += "Valor inserido em diretor em pesquisa e atual não coincidem.\n"; 
            else
                i.setId_diretor(idDiretor);            
        }
        
        if (!Auxiliar.isNumeric(txtQtdAlunos.getText()))
            erros += "Quantidade de alunos invalida\n";
        
        if (cmbTipo.getSelectedIndex() == -1)
            erros += "Selecione um tipo de instituição\n";    
        else 
            i.setId_tipo((int)inst.get(cmbTipo.getSelectedIndex()).get("id")); 
        
        
        if (!(erros += i.validar()).equals("")){
            // mensagem de erro
            JOptionPane.showMessageDialog(this, erros, "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            // realiza o cadastro no BD
            if (i.cadastrar()){
                JOptionPane.showMessageDialog(this, "Cadastro efetuado com sucesso");
            } else {
                JOptionPane.showMessageDialog(this, "Erro no BD", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void chkDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDiretorActionPerformed
        txtDiretor.setEnabled(!chkDiretor.isSelected());
        btnPesquisaDiretor.setEnabled(!chkDiretor.isSelected());
    }//GEN-LAST:event_chkDiretorActionPerformed

    private void btnPesquisaDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaDiretorActionPerformed
        String txt = txtDiretor.getText();
        
        if (txt.equals("")){
            JOptionPane.showMessageDialog(this, "Campo \'Diretor\' vazio.", "Erro", JOptionPane.ERROR_MESSAGE);   
            return;
        }
        
        // SE FOR NÚMERO, PROCURA POR ID
        if (Auxiliar.isNumeric(txt)){
            Pessoa p = new Pessoa();
            if (!p.pessoaPorId(Integer.parseInt(txt))){
                JOptionPane.showMessageDialog(this, "ID: Nenhum diretor encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                java.net.URL imgURL = getClass().getResource("/images/failure.png");
                ImageIcon icon = Auxiliar.createImageIcon(imgURL, "Diretor Não Encontrado");
                lblPesquisaDiretor.setIcon(icon);            
            } else {
                idDiretor = p.getId();
                oldTxtDiretor = txt;
                java.net.URL imgURL = getClass().getResource("/images/success.png");
                ImageIcon icon = Auxiliar.createImageIcon(imgURL, "Diretor Encontrado");
                lblPesquisaDiretor.setIcon(icon);
                txtDiretor.setEnabled(false);       
            } 
        // SE NÃO FOR, PROCURA POR NOME
        } else {
            Pessoa p = new Pessoa();
            if (!p.pessoaPorNome(txt)){                
                JOptionPane.showMessageDialog(this, "Nome: Nenhum ou mais de um diretor encontrado", "Erro", JOptionPane.ERROR_MESSAGE);                
                java.net.URL imgURL = getClass().getResource("/images/failure.png");
                ImageIcon icon = Auxiliar.createImageIcon(imgURL, "Diretor Não Encontrado");
                lblPesquisaDiretor.setIcon(icon);             
            } else { 
                idDiretor = p.getId();
                oldTxtDiretor = txt;
                java.net.URL imgURL = getClass().getResource("/images/success.png");
                ImageIcon icon = Auxiliar.createImageIcon(imgURL, "Diretor Encontrado");
                lblPesquisaDiretor.setIcon(icon);
                txtDiretor.setEnabled(false);                   
            }
        }
    }//GEN-LAST:event_btnPesquisaDiretorActionPerformed

    private void mItemPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemPrincipalActionPerformed
        this.setVisible(false);
        Auxiliar.trocarTela(new PrincipalAdm());
    }//GEN-LAST:event_mItemPrincipalActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        reset();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String nome = txtNome.getText();
        if (nome.length() == 0 || nome.length() >= 30){
            JOptionPane.showMessageDialog(this, "Nome de instutuição inválido", "Erro", JOptionPane.ERROR_MESSAGE);      
            return;
        }
        
        Instituicao i = new Instituicao();
        if (i.instituicaoPorNome(nome)){
            editmode = true;
            txtEndereco.setText(i.getEndereco());
            txtINEP.setText(i.getInep());
            txtNome.setText(i.getNome());
            txtQtdAlunos.setText(String.valueOf(i.getQtd_alunos()));
            txtTelefone.setText(i.getTelefone());
            int j;
            for (j = 0; j < cmbTipo.getItemCount(); j++){
                if ((int)inst.get(j).get("id") == i.getId_tipo()){
                    cmbTipo.setSelectedIndex(j);
                    break;
                }
            }
            if (j == cmbTipo.getItemCount()){
                JOptionPane.showMessageDialog(this, "Tipo de instituição não se encontra nas opções", "Erro", JOptionPane.ERROR_MESSAGE);   
            }
            
            
            btnCadastrar.setEnabled(false);
            btnDeletar.setEnabled(true);
            btnEditar.setEnabled(true);
            btnPesquisar.setEnabled(false);
            i1 = i;            
        } else {
            JOptionPane.showMessageDialog(this, "Nenhuma ou mais de uma instituição encontrada", "Erro", JOptionPane.ERROR_MESSAGE);               
        }
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (!editmode){
            JOptionPane.showMessageDialog(this, "Modo de edição desabilitado", "Erro", JOptionPane.ERROR_MESSAGE);              
        } else if (i1 == null){
            JOptionPane.showMessageDialog(this, "Não há instituição carregada para deleção", "Erro", JOptionPane.ERROR_MESSAGE);             
        } else if (i1.deletar()){            
            JOptionPane.showMessageDialog(this, "Deleção efetuada com sucesso");
            reset();
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (!editmode){
            JOptionPane.showMessageDialog(this, "Não está no modo de edição", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Instituicao i = new Instituicao();
        String erros = "";
        i.setNome(txtNome.getText());
        i.setInep(txtINEP.getText());
        i.setTelefone(txtTelefone.getText());
        i.setQtd_alunos(
                (Auxiliar.isNumeric(txtQtdAlunos.getText())) ? 
                Integer.valueOf(txtQtdAlunos.getText()) : -1);
        i.setEndereco(txtEndereco.getText());
        
        
        if (!Auxiliar.isNumeric(txtQtdAlunos.getText()))
            erros += "Quantidade de alunos invalida\n";
        
        if (cmbTipo.getSelectedIndex() == -1)
            erros += "Selecione um tipo de instituição\n";    
        else 
            i.setId_tipo((int)inst.get(cmbTipo.getSelectedIndex()).get("id")); 
        
        
        if (!(erros += i.validar()).equals("")){
            // mensagem de erro
            JOptionPane.showMessageDialog(this, erros, "Erro", JOptionPane.ERROR_MESSAGE);
        } else{
            int id = i1.getId_instituicao();
            i1 = i;
            i1.setId_instituicao(id);
            if (i.update())
                JOptionPane.showMessageDialog(this, "Dados atualizados com sucesso");
            else
                JOptionPane.showMessageDialog(this, "Erro no BD", "Erro", JOptionPane.ERROR_MESSAGE);
            reset();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroInstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroInstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroInstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroInstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroInstituicao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisaDiretor;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JCheckBox chkDiretor;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblPesquisaDiretor;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JMenuItem mItemPrincipal;
    private javax.swing.JMenuItem mItemSair;
    private javax.swing.JTextField txtDiretor;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtINEP;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdAlunos;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}