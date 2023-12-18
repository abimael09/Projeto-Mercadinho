package views;

import connection.Connection_BD;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model_Beans.BeansModel_Tabela;
import model_Beans.BeansProduto;
import model_Dao.DaoProduto;

public class FormTabelaCad_Produtos extends javax.swing.JFrame {

    Connection_BD conexao = new Connection_BD();
    BeansProduto beansProduto = new BeansProduto();
    DaoProduto daoProduto = new DaoProduto();
    int flag = 0;
    
    public FormTabelaCad_Produtos() {
        initComponents();
        preencherTabela("select * from produto order by descricao");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Descricao = new javax.swing.JLabel();
        jLabel_Quantidade = new javax.swing.JLabel();
        jLabel_Preco = new javax.swing.JLabel();
        jTextField_Descricao = new javax.swing.JTextField();
        jTextField_Quantidade = new javax.swing.JTextField();
        jTextField_Preco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jTextField_Id = new javax.swing.JTextField();
        jLabel_ListaProdEstoque = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_ListaDeProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cad. Produtos");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel_Descricao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel_Descricao.setText("Descrição do Produto");

        jLabel_Quantidade.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel_Quantidade.setText("Quant.");

        jLabel_Preco.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel_Preco.setText("Preço");

        jTextField_Descricao.setEnabled(false);

        jTextField_Quantidade.setEnabled(false);

        jTextField_Preco.setEnabled(false);
        jTextField_Preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PrecoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("R$");

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setEnabled(false);
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setEnabled(false);
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_Descricao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField_Descricao))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Quantidade)
                    .addComponent(jTextField_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Preco)
                    .addComponent(jTextField_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastrar)
                .addGap(18, 18, 18)
                .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Descricao)
                    .addComponent(jLabel_Quantidade)
                    .addComponent(jLabel_Preco))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField_Id.setEnabled(false);

        jLabel_ListaProdEstoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_ListaProdEstoque.setText("Lista de Produtos em Estoque");

        jTable_ListaDeProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_ListaDeProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ListaDeProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_ListaDeProdutos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_ListaProdEstoque)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ListaProdEstoque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(566, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_PrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PrecoActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextField_Descricao.setEnabled(true);
        jTextField_Quantidade.setEnabled(true);
        jTextField_Preco.setEnabled(true);
        jButtonCadastrar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextField_Id.setText("");
        jTextField_Descricao.setText("");
        jTextField_Quantidade.setText("");
        jTextField_Preco.setText("");
        jButtonNovo.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextField_Descricao.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        if (jTextField_Descricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha a DESCRIÇÃO para continuar!");
            jTextField_Descricao.requestFocus();
        } else if (jTextField_Quantidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha a QUANTIDADE para continuar!");
            jTextField_Quantidade.requestFocus();
        } else if (jTextField_Preco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o PREÇO para continuar!");
            jTextField_Preco.requestFocus();
        } else if (flag == 1) {
            beansProduto.setDescricao(jTextField_Descricao.getText());
            beansProduto.setQnt(Integer.parseInt(jTextField_Quantidade.getText()));
            beansProduto.setPreco(Double.parseDouble(jTextField_Preco.getText()));
            daoProduto.Salvar(beansProduto);
            jTextField_Descricao.setText("");
            jTextField_Quantidade.setText("");
            jTextField_Preco.setText("");
            jTextField_Descricao.setEnabled(false);
            jTextField_Quantidade.setEnabled(false);
            jTextField_Preco.setEnabled(false);
            jButtonCadastrar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            preencherTabela("select * from produto order by descricao");
        } else {
            beansProduto.setId((Integer.parseInt(jTextField_Id.getText())));
            beansProduto.setDescricao(jTextField_Descricao.getText());
            beansProduto.setQnt(Integer.parseInt(jTextField_Quantidade.getText()));
            beansProduto.setPreco(Double.parseDouble(jTextField_Preco.getText()));
            daoProduto.Atualizar(beansProduto);
            jTextField_Descricao.setText("");
            jTextField_Quantidade.setText("");
            jTextField_Preco.setText("");
            jTextField_Descricao.setEnabled(false);
            jTextField_Quantidade.setEnabled(false);
            jTextField_Preco.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonCadastrar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            preencherTabela("select * from produto order by descricao");
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        flag = 2;
        jTextField_Descricao.requestFocus();
        jTextField_Descricao.setEnabled(true);
        jTextField_Quantidade.setEnabled(true);
        jTextField_Preco.setEnabled(true);
        jButtonCadastrar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonAtualizar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextField_Descricao.setEnabled(false);
        jTextField_Quantidade.setEnabled(false);
        jTextField_Preco.setEnabled(false);
        jButtonCadastrar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonAtualizar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextField_Id.setText("");
        jTextField_Descricao.setText("");
        jTextField_Quantidade.setText("");
        jTextField_Preco.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?");
        if (resposta == JOptionPane.YES_OPTION) {
            beansProduto.setId((Integer.parseInt(jTextField_Id.getText())));
            daoProduto.Excluir(beansProduto);
            jTextField_Id.setText("");
            jTextField_Descricao.setText("");
            jTextField_Quantidade.setText("");
            jTextField_Preco.setText("");
            jTextField_Descricao.setEnabled(false);
            jTextField_Quantidade.setEnabled(false);
            jTextField_Preco.setEnabled(false);
            jButtonCadastrar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonAtualizar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            preencherTabela("select * from produto order by descricao");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTable_ListaDeProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ListaDeProdutosMouseClicked
        String descricaoP = "" + jTable_ListaDeProdutos.getValueAt(jTable_ListaDeProdutos.getSelectedRow(), 1);
        conexao.Conexao();
        conexao.executaSql("select * from produto where descricao='" + descricaoP + "'");
        try {
            conexao.rs.first();
            jTextField_Id.setText(String.valueOf(conexao.rs.getInt("id")));
            jTextField_Descricao.setText(conexao.rs.getString("descricao"));
            jTextField_Quantidade.setText(String.valueOf(conexao.rs.getInt("qnt")));
            jTextField_Preco.setText(String.valueOf(conexao.rs.getInt("preco")));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados:\n" + ex);
        }
        conexao.Desconecta();
        jButtonAtualizar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonCadastrar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jTextField_Descricao.setEnabled(false);
        jTextField_Quantidade.setEnabled(false);
        jTextField_Preco.setEnabled(false); 
    }//GEN-LAST:event_jTable_ListaDeProdutosMouseClicked

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Descrição", "Quantidade", "Valor Total"};
        conexao.Conexao();
        conexao.executaSql(Sql);
        try {
            conexao.rs.first();
            do {
                dados.add(new Object[]{conexao.rs.getInt("id"), conexao.rs.getString("descricao"), conexao.rs.getInt("qnt"), conexao.rs.getDouble("preco")});
            } while (conexao.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher Produtos na Tabela!\n"+ex);
        }
        BeansModel_Tabela modtab = new BeansModel_Tabela(dados, colunas);
        jTable_ListaDeProdutos.setModel(modtab);
        jTable_ListaDeProdutos.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable_ListaDeProdutos.getColumnModel().getColumn(0).setResizable(false);
        jTable_ListaDeProdutos.getColumnModel().getColumn(1).setPreferredWidth(231);
        jTable_ListaDeProdutos.getColumnModel().getColumn(1).setResizable(false);
        jTable_ListaDeProdutos.getColumnModel().getColumn(2).setPreferredWidth(128);
        jTable_ListaDeProdutos.getColumnModel().getColumn(2).setResizable(false);
        jTable_ListaDeProdutos.getColumnModel().getColumn(3).setPreferredWidth(128);
        jTable_ListaDeProdutos.getColumnModel().getColumn(3).setResizable(false);
        jTable_ListaDeProdutos.getTableHeader().setReorderingAllowed(false);
        jTable_ListaDeProdutos.setAutoResizeMode(jTable_ListaDeProdutos.AUTO_RESIZE_OFF);
        jTable_ListaDeProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conexao.Desconecta();
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTabelaCad_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTabelaCad_Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Descricao;
    private javax.swing.JLabel jLabel_ListaProdEstoque;
    private javax.swing.JLabel jLabel_Preco;
    private javax.swing.JLabel jLabel_Quantidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_ListaDeProdutos;
    private javax.swing.JTextField jTextField_Descricao;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_Preco;
    private javax.swing.JTextField jTextField_Quantidade;
    // End of variables declaration//GEN-END:variables
}
