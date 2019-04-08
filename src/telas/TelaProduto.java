/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dao.ClienteDao;
import dao.EstoqueDao;
import dao.ProdutoDao;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Estoque;
import modelo.Produto;
import modelo.TipoJoia;

/**
 *
 * @author skynetx
 */
public class TelaProduto extends javax.swing.JInternalFrame {
   
   private DefaultTableModel dtm;
   private List<Produto> listaProduto = new ArrayList<Produto>();  
   private javax.swing.JDesktopPane painelDP;
   
    /**
     * Creates new form TelaProduto
     */
    public TelaProduto() {
        initComponents();
        attTabelaEstoque();
        
        //verificaTabela();             metodo que iria atualizar a tabela automaticamente, mas n ta funcinando certo
        
        /*
        dtm = (DefaultTableModel) tabela.getModel();
        ProdutoDao dao = new ProdutoDao();
        listaProduto = dao.getProduto();
        Estoque estoque = new Estoque();
        estoque.setQuantidade(10);
        // fazer dao estoque para pegar o estoque desse produto pela Fk
        for (Produto produto : listaProduto){
            dtm.insertRow(dtm.getRowCount(), new Object[]{produto.getCodigo(),produto.getNome(),produto.getCusto(),produto.getVenda(),estoque.getQuantidade(),produto.getTipoJoia().getDescricao()});    
            
            
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setTitle("Produtos");

        painelCor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("PRODUTOS CADASTRADOS");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Custo", "Venda", "Tipo Joia", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(4).setResizable(false);
            tabela.getColumnModel().getColumn(5).setResizable(false);
        }

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCorLayout = new javax.swing.GroupLayout(painelCor);
        painelCor.setLayout(painelCorLayout);
        painelCorLayout.setHorizontalGroup(
            painelCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
                    .addGroup(painelCorLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelCorLayout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar)))
                .addContainerGap())
        );
        painelCorLayout.setVerticalGroup(
            painelCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 950, 621);
    }// </editor-fold>//GEN-END:initComponents
    
    
    /*
    public void atualizaTabela(){
        dtm = (DefaultTableModel) tabela.getModel();
        ProdutoDao dao = new ProdutoDao();
        listaProduto = dao.getProduto();
        Estoque estoque = new Estoque();
        estoque.setQuantidade(10);
        // fazer dao estoque para pegar o estoque desse produto pela Fk
        for (Produto produto : listaProduto){
            dtm.insertRow(dtm.getRowCount(), new Object[]{produto.getCodigo(),produto.getNome(),produto.getCusto(),produto.getVenda(),produto.getTipoJoia().getDescricao(),"12"});    
            
            
        }
                      
    } 
    */
    
    
    public void verificaTabela(){
            Thread th = new Thread(new Runnable() { //cria uma thread
        public void run() {
            while(true) { //roda indefinidamente
                
                    dtm = (DefaultTableModel) tabela.getModel();
                    
                    attTabelaEstoque();
                try {
                    Thread.sleep(1000); //espera 1 segundo para fazer a nova evolução
                } catch(InterruptedException ex){
                }
            }
        }
    }); th.start();  
        
        
    }
    public void attTabelaEstoque(){
        dtm = (DefaultTableModel) tabela.getModel();
        EstoqueDao estoqueDao = new EstoqueDao();
        List<Estoque> listaEstoque = new ArrayList<Estoque>();
        listaEstoque = estoqueDao.getEstoque();
        for (Estoque estoque : listaEstoque){
            dtm.insertRow(dtm.getRowCount(),new Object[]{estoque.getProduto().getCodigo(),estoque.getProduto().getNome(),estoque.getProduto().getCusto(),estoque.getProduto().getVenda(),estoque.getProduto().getTipoJoia().getDescricao(),estoque.getQuantidade()});
        }
        
    }
    
   public void setPainelDP(javax.swing.JDesktopPane panel){
       
       this.painelDP = panel;
       
   }
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        TelaNovoProduto telaNovoProd = new TelaNovoProduto();
        painelDP.add(telaNovoProd);
        telaNovoProd.setVisible(true);
        telaNovoProd.setPosicao();
        telaNovoProd.setDt(dtm);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(!tabela.getSelectionModel().isSelectionEmpty()){
            
            ProdutoDao dao = new ProdutoDao();
            dao.excluiProduto(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
            //this.setVisible(false);
            // dtm.setRowCount(0);
            // attTabelaEstoque();
          }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
        if(!tabela.getSelectionModel().isSelectionEmpty()){
            Produto produto = new Produto();
            int linha = 0;
            ProdutoDao produtoDao = new ProdutoDao();
            List<Produto> listaProduto = new ArrayList<Produto>();
            listaProduto = produtoDao.getProduto();

            for (Produto p : listaProduto){
                if(p.getCodigo().equals(tabela.getValueAt(tabela.getSelectedRow(), 0))){                    
                    produto = p;
                }

            }
            
            linha = tabela.getSelectedRow();
            TipoJoia tipoJoia = new TipoJoia();
            
            produto.setCodigo(tabela.getValueAt(linha, 0).toString());
            produto.setNome(tabela.getValueAt(linha, 1).toString());
            produto.setCusto(Float.parseFloat(tabela.getValueAt(linha, 2).toString()));
            produto.setVenda(Float.parseFloat(tabela.getValueAt(linha, 3).toString()));
            //tipoJoia.setIdTipoJoia(Integer.parseInt(tabela.getValueAt(linha, 5).toString()));
            produto.setTipoJoia(tipoJoia);
            produtoDao.alteraProduto(produto);
            
            // dtm.setRowCount(0);
            // attTabelaEstoque();
        }        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        btnEditar.setEnabled(true);
       // btnExcluir.setEnabled(true);
    }//GEN-LAST:event_tabelaMouseClicked
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelCor;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
