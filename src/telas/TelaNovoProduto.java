/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dao.ProdutoDao;
import dao.TipoJoiaDao;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;
import modelo.TipoJoia;

/**
 *
 * @author coron
 */
public class TelaNovoProduto extends javax.swing.JInternalFrame{
    private DefaultTableModel dt;
      
    
    /**
     * Creates new form TelaNovoProduto
     */
    public TelaNovoProduto() {
        initComponents();
        TipoJoiaDao daoTipo = new TipoJoiaDao();
        for (TipoJoia tipo : daoTipo.getTipo()){
            comboTipoJoia.addItem(tipo.getDescricao());
        }
        atualizaCodigoLabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvarNovoProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCusto = new javax.swing.JTextField();
        txtVenda = new javax.swing.JTextField();
        btnVoltar1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        comboTipoJoia = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(470, 500));

        btnSalvarNovoProduto.setText("Salvar");
        btnSalvarNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarNovoProdutoActionPerformed(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Venda:");

        jLabel4.setText("Custo:");

        btnVoltar1.setText("Voltar");
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });

        jLabel5.setText("TipoJoia:");

        jLabel6.setText("Cadastro de produtos");

        jLabel7.setText("Quantidade estoque:");

        txtEstoque.setText("0");

        lbCodigo.setBackground(new java.awt.Color(254, 254, 254));
        lbCodigo.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbCodigo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(txtCusto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVenda)
                            .addComponent(lbCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTipoJoia, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarNovoProduto)
                .addGap(55, 55, 55)
                .addComponent(btnVoltar1)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipoJoia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarNovoProduto)
                    .addComponent(btnVoltar1))
                .addGap(26, 26, 26))
        );

        setBounds(0, 0, 500, 550);
    }// </editor-fold>//GEN-END:initComponents

        public void atualizaCodigoLabel(){
       String i = "0001";
       Produto tp = new Produto();
       ProdutoDao tpdao = new ProdutoDao();

        for (Produto j : tpdao.getProduto()) {
            i = j.getCodigo();
            
        }
        
        if (tpdao.getProduto() != null)
            i = validaIncrementaCodigo(i);

        lbCodigo.setText(String.valueOf(i));
    }
    
    public String validaIncrementaCodigo(String i){

        int codInt = Integer.parseInt(i);
        codInt++;
        System.out.println(" "+i);
        if(i.length() == 4){
            i = "000"+ Integer.toString(codInt);
        }
        if(i.length() == 5){
            i = "00"+ Integer.toString(codInt);
            
        }
        if(i.length() > 5){
            i = "0"+ Integer.toString(codInt);   
        } // vazio será o primeiro a aser inserido
        if (i.isEmpty()) {
         i = "0000";   
        }
        return i;
    }
    private void btnSalvarNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarNovoProdutoActionPerformed
        
        if(!txtNome.getText().equals("") && !txtCusto.getText().equals("") && !txtVenda.getText().equals("") && !txtEstoque.getText().equals("")){
            ProdutoDao produtoDao = new ProdutoDao();
            int idTipo = 0;
            TipoJoia tipoJoia = new TipoJoia();
            TipoJoiaDao daoTipo = new TipoJoiaDao();

            for (TipoJoia tipo : daoTipo.getTipo()){
                if (comboTipoJoia.getSelectedItem().toString().equals(tipo.getDescricao()))
                    idTipo = tipo.getIdTipoJoia();
            }

            tipoJoia.setIdTipoJoia(idTipo);
            Produto produto = new Produto(lbCodigo.getText(),txtNome.getText(), Float.parseFloat(txtCusto.getText()),Float.parseFloat(txtVenda.getText()), Integer.parseInt(txtEstoque.getText()), tipoJoia);
            produtoDao.salvaProduto(produto);

            txtNome.setText("");
            txtCusto.setText("");
            txtVenda.setText("");
            txtEstoque.setText("");
            
            // atualiza tabela
            dt.setRowCount(0);
            List<Produto> listaProduto = new ArrayList<Produto>();
            listaProduto = produtoDao.getProduto();
            for (Produto p : listaProduto){ // ordem :codigo, nome, custo, venda, tipo joia, estoque
                dt.insertRow(dt.getRowCount(),new Object[]{p.getCodigo(), p.getNome(), p.getValorCusto(), p.getValorVenda(), p.getTipoJoia().getDescricao(),p.getQuantidadeEstoque()});
            }
            JOptionPane.showMessageDialog(rootPane, "Novo produto inserido!");
            atualizaCodigoLabel();
        } else{
            JOptionPane.showMessageDialog(null, "Preencha todas as informações!");
        }
          
    }//GEN-LAST:event_btnSalvarNovoProdutoActionPerformed

    public void setDt(DefaultTableModel dt) {
        this.dt = dt;
    }

    
    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltar1ActionPerformed
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarNovoProduto;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JComboBox<String> comboTipoJoia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JTextField txtCusto;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtVenda;
    // End of variables declaration//GEN-END:variables
}
