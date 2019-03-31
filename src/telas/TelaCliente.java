/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;


import dao.ClienteDao;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

/**
 *
 * @author skynetx
 */
public class TelaCliente extends javax.swing.JInternalFrame {

   private DefaultTableModel dtm;
   private List<Cliente> listaCliente = new ArrayList<Cliente>();  
   private javax.swing.JDesktopPane paineu;
   
   public void setPaineu(javax.swing.JDesktopPane panel){
       
       this.paineu = panel;
       
   }
   
    public TelaCliente() {
        initComponents();
        dtm = (DefaultTableModel) tabela.getModel();
        ClienteDao dao = new ClienteDao();
        listaCliente = dao.getCliente();
    
        for (Cliente cliente : listaCliente){
            dtm.insertRow(dtm.getRowCount(), new Object[]{cliente.getCodigo(),cliente.getNome(),cliente.getEndereco(),cliente.getBairro(),cliente.getCidade(),cliente.getCep(),cliente.getCpf(),cliente.getUf(),cliente.getRg(),cliente.getCelular()});
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnNovoCliente = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nome", "Endereco", "Bairro", "Cidade", "CEP", "CPF", "UF", "RG"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
            tabela.getColumnModel().getColumn(6).setResizable(false);
            tabela.getColumnModel().getColumn(7).setResizable(false);
            tabela.getColumnModel().getColumn(8).setResizable(false);
        }

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnNovoCliente.setText("Novo Cliente");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        TelaNovoCliente telaNovoCliente = new TelaNovoCliente();
        paineu.add(telaNovoCliente);
        telaNovoCliente.setVisible(true);
        
       
        
        
        this.setVisible(false);
         
      
        
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        
        System.out.println("o cliente selecionado foi  "+tabela.getValueAt(tabela.getSelectedRow(), 1)+" Codigo  "+tabela.getValueAt(tabela.getSelectedRow(), 0));
        
        ClienteDao dao = new ClienteDao();
        dao.exccluiCliente(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        this.setVisible(false);
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // verificar se aluma coisa esta selecionada na tabela
        if(!tabela.getSelectionModel().isSelectionEmpty()){
        
        Cliente cliente = new Cliente();
        int linha = 0;
        ClienteDao clienteDao = new ClienteDao();
        List<Cliente> listaCli = new ArrayList<Cliente>();
        listaCli = clienteDao.getCliente();

        for (Cliente c : listaCli){
            if(c.getCodigo().equals(tabela.getValueAt(tabela.getSelectedRow(), 0))){
                linha = tabela.getSelectedRow();
                cliente = c;
            }
                
        }
        
        cliente.setNome(tabela.getValueAt(linha, 1).toString());
        cliente.setEndereco(tabela.getValueAt(linha, 2).toString());
        cliente.setBairro(tabela.getValueAt(linha, 3).toString());
        cliente.setCidade(tabela.getValueAt(linha, 4).toString());
        cliente.setCep(tabela.getValueAt(linha, 5).toString());
        cliente.setCpf(tabela.getValueAt(linha, 6).toString());
        cliente.setUf(tabela.getValueAt(linha, 7).toString());
        cliente.setRg(tabela.getValueAt(linha, 8).toString());
        clienteDao.alteraCliente(cliente);
        this.setVisible(false);
        
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
