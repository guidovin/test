/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Conta;
import Controller.Instituicao;
import Controller.Pessoa;
import Model.Auxiliar;
import javax.swing.*;

/**
 *
 * @author Andre
 */
public class CadastroConta extends javax.swing.JFrame {

    boolean showTela = true;
    private boolean editmode = false;
    private int id_pessoa = -1, id_instituicao = -1;
    private Conta c1;
    
    /* Aqui estão as funções que auxiliaram os testes
    Essas funções apenas retornam o botão da tela, para que possa dar doClick nos testes.
*/    
    
public JButton BotaoCadastrar(){ 
    return btnCadastrar;
} 

public JButton BotaoPesquisar(){ 
    return btnPesquisar;
}
public JButton BotaoDeletar(){ 
    return btnDeletar;
}

public JButton BotaoPessoa(){ 
    return btnPesquisaPessoa;
}

public JButton BotaoInstituicao(){ 
    return btnPesquisaInstituicao;
}
 
/*
    Essa função preenche apenas o campo de pessoa
*/
public void preencherPessoatest(String pessoa){
    txtPessoa.setText(pessoa);
}

// preenche apenas o campo de instituicao
public void preencherInstituicaotest(String instituicao){
    txtInstituicao.setText(instituicao);
}

/*
    Essa função preenche todos os campos da tela
*/

public void preenchertest(String Usuario,String Matricula,String Senha,String Senha2,int inteiro){
    txtUsuario.setText(Usuario);
    txtMatricula.setText(Matricula);
    passSenha.setText(Senha);
    passConfSenha.setText(Senha2);
    cmbTipoConta.setSelectedIndex(inteiro);
    
}

/*
    Essa função retorna os dados da tela, de acordo com o inteiro mandado.
*/

public String retornaValores(int qualvalor){
    if(qualvalor== 0){
    return txtUsuario.getText();
    }
    if(qualvalor== 1){
    return txtMatricula.getText();
    }
    return "nada";
}

/*
*
*
* Aqui estão as funções que auxiliaram os testes
*/
    public void telasInvisiveis(){
        showTela = false;
    }    

    public void reset(){
        txtPessoa.setText("");
        txtInstituicao.setText("");
        txtMatricula.setText("");
        txtUsuario.setText("");
        passSenha.setText("");
        passConfSenha.setText("");
        cmbTipoConta.setSelectedIndex(-1);
        
        txtPessoa.setEnabled(true);
        txtInstituicao.setEnabled(true);
        
        btnPesquisaPessoa.setEnabled(true);
        btnPesquisaInstituicao.setEnabled(true);
        lblPesquisaInstituicao.setIcon(null);
        lblPesquisaPessoa.setIcon(null);
        
        btnDeletar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnCadastrar.setEnabled(true);
        btnPesquisar.setEnabled(true);
        editmode = false;
        c1 = null;
    }
    
    /**
     * Creates new form CadastroConta
     */
    public CadastroConta() {
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

        passConfSenha = new javax.swing.JPasswordField();
        txtMatricula = new javax.swing.JTextField();
        lblMatricula = new javax.swing.JLabel();
        passSenha = new javax.swing.JPasswordField();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        cmbTipoConta = new javax.swing.JComboBox<>();
        lblTipoConta = new javax.swing.JLabel();
        lblConfSenha = new javax.swing.JLabel();
        txtPessoa = new javax.swing.JTextField();
        txtInstituicao = new javax.swing.JTextField();
        lblPessoa = new javax.swing.JLabel();
        lblInstituicao = new javax.swing.JLabel();
        btnPesquisaInstituicao = new javax.swing.JButton();
        btnPesquisaPessoa = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblPesquisaPessoa = new javax.swing.JLabel();
        lblPesquisaInstituicao = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        mItemPrincipal = new javax.swing.JMenuItem();
        mItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        lblMatricula.setText("Matrícula");

        lblSenha.setText("Senha");

        lblUsuario.setText("Usuário");

        cmbTipoConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Diretor", "Leitor" }));
        cmbTipoConta.setSelectedIndex(-1);
        cmbTipoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoContaActionPerformed(evt);
            }
        });

        lblTipoConta.setText("Permissão");

        lblConfSenha.setText("Confirmação da Senha");

        lblPessoa.setText("Pessoa");

        lblInstituicao.setText("Instituição");

        btnPesquisaInstituicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisa.png"))); // NOI18N
        btnPesquisaInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaInstituicaoActionPerformed(evt);
            }
        });

        btnPesquisaPessoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisa.png"))); // NOI18N
        btnPesquisaPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaPessoaActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Cadastro de Conta");

        lblPesquisaPessoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPesquisaPessoa.setEnabled(false);

        lblPesquisaInstituicao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPesquisaInstituicao.setEnabled(false);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.setEnabled(false);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        menuArquivo.setText("Arquivo");

        mItemPrincipal.setText("Menu Principal");
        mItemPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemPrincipalActionPerformed(evt);
            }
        });
        menuArquivo.add(mItemPrincipal);

        mItemSair.setText("Sair");
        mItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(mItemSair);

        jMenuBar1.add(menuArquivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTipoConta)
                                    .addComponent(lblMatricula)
                                    .addComponent(cmbTipoConta, 0, 202, Short.MAX_VALUE)
                                    .addComponent(txtMatricula))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSenha)
                                    .addComponent(lblUsuario)
                                    .addComponent(lblConfSenha)
                                    .addComponent(txtUsuario)
                                    .addComponent(passSenha)
                                    .addComponent(passConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblInstituicao)
                                    .addComponent(lblPessoa)
                                    .addComponent(txtInstituicao, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                    .addComponent(txtPessoa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPesquisaPessoa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblPesquisaPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPesquisaInstituicao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblPesquisaInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)))))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPessoa)
                        .addGap(10, 10, 10)
                        .addComponent(txtPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(lblInstituicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPesquisaPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisaPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(btnPesquisaInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPesquisaInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipoConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConfSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void cmbTipoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoContaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        reset();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        if (id_pessoa == -1){
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Pessoa ainda não foi carregada", "Erro", JOptionPane.ERROR_MESSAGE); 
            return;
        }
        
        if (id_instituicao == -1){
            if(showTela==true)    
                JOptionPane.showMessageDialog(this, "Instituicao ainda não foi carregada", "Erro", JOptionPane.ERROR_MESSAGE); 
            return;
        }
        
        Conta c = new Conta();
        if (c.contaPorId(id_pessoa, id_instituicao)){
            editmode = true;
            
            txtPessoa.setText(String.valueOf(c.getId_pessoa()));
            txtPessoa.setEnabled(false);
            btnPesquisaPessoa.setEnabled(false);
            
            txtInstituicao.setText(String.valueOf(c.getId_instituicao()));
            txtInstituicao.setEnabled(false);
            btnPesquisaInstituicao.setEnabled(false);
            
            txtMatricula.setText(c.getMatricula());            
            // INCONSISTENCIA NO BD: foi selecionado um tipo de conta que não existe
            if (c.getId_tipo_conta()>= cmbTipoConta.getItemCount() || c.getId_tipo_conta() <= 0){
                Auxiliar.errMsg((JFrame)this, "Tipo de conta não se encontra nas opções", showTela);              
            } else {
                cmbTipoConta.setSelectedIndex(c.getId_tipo_conta()-1);
            }
            txtUsuario.setText(c.getUsuario());
            passSenha.setText("");
            passConfSenha.setText("");            
            
            // passa pro modo de edição
            btnCadastrar.setEnabled(false);
            btnDeletar.setEnabled(true);
            btnEditar.setEnabled(true);
            btnPesquisar.setEnabled(false);
            c1 = c; 
        } else {            
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Nenhuma conta encontrada", "Erro", JOptionPane.ERROR_MESSAGE);                  
        } 
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Conta c = new Conta();
        c.setId_pessoa(id_pessoa);
        c.setId_instituicao(id_instituicao);
        c.setId_tipo_conta(cmbTipoConta.getSelectedIndex() + 1);
        c.setMatricula(txtMatricula.getText());
        c.setUsuario(txtUsuario.getText());
        c.setSenha(Auxiliar.criptografar(String.valueOf(passSenha.getPassword())));
        
        String senha = String.valueOf(passSenha.getPassword());
        String confSenha = String.valueOf(passConfSenha.getPassword());
        
        String erros = "";
                        
        // verifica se senha e confirmação são iguais
        // a validação da confSenha é feita aqui pois não existe no BD
        if (confSenha.length() >= 255 || confSenha.length() == 0)
            erros += "Confirmação de Senha inválida\n";    
        
        if (!senha.equals(confSenha))
            erros += "Senha e confirmação de senha diferentes\n";
            
        // se há erros computados na validação da classe ou erros da confirmação de senha feitos na view
        if (!(erros += c.validar()).equals("")) {
            Auxiliar.errMsg((JFrame)this, erros, showTela);
        }else {
            if (c.cadastrar()) Auxiliar.msg(this, "Cadastro efetuado com sucesso", showTela);
            else Auxiliar.errMsg(this, erros, showTela);
            reset();
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (!editmode){
            Auxiliar.errMsg(this, "Não está no modo de edição", showTela);
            reset();
            return;
        }
        
        Conta c = new Conta();
        c.setId_pessoa(id_pessoa);
        c.setId_instituicao(id_instituicao);
        c.setId_tipo_conta(cmbTipoConta.getSelectedIndex() + 1);
        c.setMatricula(txtMatricula.getText());
        c.setUsuario(txtUsuario.getText());
        c.setSenha(Auxiliar.criptografar(String.valueOf(passSenha.getPassword())));
        
        String senha = String.valueOf(passSenha.getPassword());
        String confSenha = String.valueOf(passConfSenha.getPassword());
        
        String erros = "";    
        
        if (confSenha.length() >= 255 || confSenha.length() == 0)
            erros += "Confirmação de Senha inválida\n";    
        
        if (!senha.equals(confSenha))
            erros += "Senha e confirmação de senha diferentes\n";

        System.out.println("showTela: " + showTela);
        if (!(erros += c.validar()).equals("")){
            Auxiliar.errMsg(this, erros, showTela);
        } else if (c.update()){
            Auxiliar.msg(this, "Dados atualizados com sucesso", showTela);
            reset();
        } else {
            Auxiliar.errMsg(this, "Erro no BD", showTela);
            reset();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (!editmode){
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Modo de edição desabilitado", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (c1 == null){
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Não há conta carregada para deleção", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (c1.deletar()){
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Deleção efetuada com sucesso");
            reset();
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnPesquisaPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaPessoaActionPerformed
        String txt = txtPessoa.getText();        
        if (txt.equals("")){
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Campo \'Pessoa\' vazio.", "Erro", JOptionPane.ERROR_MESSAGE);   
            return;
        }
        
        // SE FOR NÚMERO, PROCURA POR ID, SENÃO PESQUISA POR NOME
        Pessoa p = new Pessoa();
        boolean sucesso = Auxiliar.isNumeric(txt) ? p.pessoaPorId(Integer.parseInt(txt)) : p.pessoaPorNome(txt);
        if (sucesso){
            id_pessoa = p.getId();
            java.net.URL imgURL = getClass().getResource("/images/success.png");
            ImageIcon icon = Auxiliar.createImageIcon(imgURL, "Pessoa encontrada");
            lblPesquisaPessoa.setIcon(icon);
            txtPessoa.setEnabled(false);
            txtPessoa.setText(p.getNome());
            btnPesquisaPessoa.setEnabled(false);
        } else {
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Nenhuma pessoa encontrada", "Erro", JOptionPane.ERROR_MESSAGE);
            java.net.URL imgURL = getClass().getResource("/images/failure.png");
            ImageIcon icon = Auxiliar.createImageIcon(imgURL, "Pessoa Não Encontrada");
            lblPesquisaPessoa.setIcon(icon);             
        }
    }//GEN-LAST:event_btnPesquisaPessoaActionPerformed

    private void btnPesquisaInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaInstituicaoActionPerformed
        String txt = txtInstituicao.getText();        
        if (txt.equals("")){
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Campo \'Instituicao\' vazio.", "Erro", JOptionPane.ERROR_MESSAGE);   
            return;
        }
        
        // SE FOR NÚMERO, PROCURA POR ID, SENÃO PESQUISA POR NOME
        Instituicao i = new Instituicao();
        boolean sucesso = Auxiliar.isNumeric(txt) ? i.instituicaoPorId(Integer.parseInt(txt)) : i.instituicaoPorNome(txt);
        if (sucesso){
            id_instituicao = i.getId();
            java.net.URL imgURL = getClass().getResource("/images/success.png");
            ImageIcon icon = Auxiliar.createImageIcon(imgURL, "Instituicão encontrada");
            lblPesquisaInstituicao.setIcon(icon);
            txtInstituicao.setEnabled(false);
            txtInstituicao.setText(i.getNome());
            btnPesquisaInstituicao.setEnabled(false);
        } else {
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Nenhuma instituição encontrada", "Erro", JOptionPane.ERROR_MESSAGE);
            java.net.URL imgURL = getClass().getResource("/images/failure.png");
            ImageIcon icon = Auxiliar.createImageIcon(imgURL, "Instituição não Encontrada");
            lblPesquisaInstituicao.setIcon(icon);             
        }
    }//GEN-LAST:event_btnPesquisaInstituicaoActionPerformed

    private void mItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSairActionPerformed
        if (Model.Auxiliar.confirmarSaida()) System.exit(0);
    }//GEN-LAST:event_mItemSairActionPerformed

    private void mItemPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemPrincipalActionPerformed
        this.setVisible(false);
        Auxiliar.trocarTela(new PrincipalAdm());
    }//GEN-LAST:event_mItemPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisaInstituicao;
    private javax.swing.JButton btnPesquisaPessoa;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbTipoConta;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblConfSenha;
    private javax.swing.JLabel lblInstituicao;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblPesquisaInstituicao;
    private javax.swing.JLabel lblPesquisaPessoa;
    private javax.swing.JLabel lblPessoa;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTipoConta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem mItemPrincipal;
    private javax.swing.JMenuItem mItemSair;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JPasswordField passConfSenha;
    private javax.swing.JPasswordField passSenha;
    private javax.swing.JTextField txtInstituicao;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtPessoa;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
