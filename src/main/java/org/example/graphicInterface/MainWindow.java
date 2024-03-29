package org.example.graphicInterface;


import org.example.models.Request;
import org.example.sqlConnection.RequestMySQL;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author admin
 */


public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        initMoreComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelButtonsUpdateTable = new javax.swing.JPanel();
        btnChangeTableSeeAllProducts = new javax.swing.JButton();
        btnChangeTableSeeClientProducts = new javax.swing.JButton();
        btnChangeTableSeeLastWeekProduct = new javax.swing.JButton();
        btnChangeTableSeeTodayProductsNonDelivered = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelMainTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelButtonOptions = new javax.swing.JPanel();
        btnCreateRequest = new javax.swing.JButton();
        btnDeleteRequest = new javax.swing.JButton();
        btnShowDialogMothIncomes = new javax.swing.JButton();
        btnCheckRequestDelivered = new javax.swing.JButton();
        btnShowDialogRequestPerClient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Breakfast Order App");

        panelButtonsUpdateTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        java.awt.GridBagLayout panelButtonsUpdateTableLayout = new java.awt.GridBagLayout();
        panelButtonsUpdateTableLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0};
        panelButtonsUpdateTableLayout.rowWeights = new double[]{1.0, 1.0};
        panelButtonsUpdateTable.setLayout(panelButtonsUpdateTableLayout);

        btnChangeTableSeeAllProducts.setText("Todos");
        btnChangeTableSeeAllProducts.setToolTipText("");
        btnChangeTableSeeAllProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTableSeeAllRequestActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        panelButtonsUpdateTable.add(btnChangeTableSeeAllProducts, gridBagConstraints);

        btnChangeTableSeeClientProducts.setText("Por Cliente");
        btnChangeTableSeeClientProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTableSeeClientProductsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        panelButtonsUpdateTable.add(btnChangeTableSeeClientProducts, gridBagConstraints);

        btnChangeTableSeeLastWeekProduct.setText("Ult. Semana");
        btnChangeTableSeeLastWeekProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTableSeeLastWeekRequestActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        panelButtonsUpdateTable.add(btnChangeTableSeeLastWeekProduct, gridBagConstraints);

        btnChangeTableSeeTodayProductsNonDelivered.setText("No Entregados Hoy");
        btnChangeTableSeeTodayProductsNonDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTableSeeTodayRequestNonDeliveredActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        panelButtonsUpdateTable.add(btnChangeTableSeeTodayProductsNonDelivered, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Ver pedidos:");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 10, 0));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelButtonsUpdateTable.add(jLabel1, gridBagConstraints);

        getContentPane().add(panelButtonsUpdateTable, java.awt.BorderLayout.PAGE_START);

        panelMainTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));
        panelMainTable.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String[]{
                        "Id", "Fecha", "Cliente", "Entregado", "Producto"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setMinimumSize(new java.awt.Dimension(40, 80));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        panelMainTable.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelMainTable, java.awt.BorderLayout.CENTER);

        panelButtonOptions.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        java.awt.GridBagLayout panelButtonOptionsLayout = new java.awt.GridBagLayout();
        panelButtonOptionsLayout.columnWeights = new double[]{1.0, 1.0, 1.0};
        panelButtonOptionsLayout.rowWeights = new double[]{1.0, 1.0};
        panelButtonOptions.setLayout(panelButtonOptionsLayout);

        btnCreateRequest.setBackground(new java.awt.Color(0, 0, 255));
        btnCreateRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateRequest.setText("Crear Pedido");
        btnCreateRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRequestActionPerformed(evt);
            }
        });
        panelButtonOptions.add(btnCreateRequest, new java.awt.GridBagConstraints());

        btnDeleteRequest.setBackground(new java.awt.Color(255, 0, 0));
        btnDeleteRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteRequest.setText("Eliminar Pedido");
        btnDeleteRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRequestActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        panelButtonOptions.add(btnDeleteRequest, gridBagConstraints);

        btnShowDialogMothIncomes.setText("Ganancias del Mes");
        btnShowDialogMothIncomes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnShowDialogMothIncomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDialogMothIncomesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        panelButtonOptions.add(btnShowDialogMothIncomes, gridBagConstraints);

        btnCheckRequestDelivered.setBackground(new java.awt.Color(255, 204, 0));
        btnCheckRequestDelivered.setText("Marcar Entregado");
        btnCheckRequestDelivered.setToolTipText("");
        btnCheckRequestDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckRequestDeliveredActionPerformed(evt);
            }
        });
        panelButtonOptions.add(btnCheckRequestDelivered, new java.awt.GridBagConstraints());

        btnShowDialogRequestPerClient.setText("Ver num. Pedidos por Cliente");
        btnShowDialogRequestPerClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDialogRequestPerClientActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        panelButtonOptions.add(btnShowDialogRequestPerClient, gridBagConstraints);

        getContentPane().add(panelButtonOptions, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initMoreComponents() {
        btnShowDialogRequestPerClient.setText("Ver num. Pedidos por Cliente");
        printTable(RequestMySQL.getAll());
    }

    private void btnCreateRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRequestActionPerformed
        showCreateRequestDialog();
    }//GEN-LAST:event_btnCreateRequestActionPerformed

    private void btnChangeTableSeeClientProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeTableSeeClientProductsActionPerformed
        printTable(RequestMySQL.getAllClient());
    }//GEN-LAST:event_btnChangeTableSeeClientProductsActionPerformed

    private void btnCheckRequestDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckRequestDeliveredActionPerformed
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "No se ha seleccionado ningún pedido",
                    "Imposible actualizar este Pedido a entregado",
                    JOptionPane.NO_OPTION);
        } else {
            Integer id = Integer.valueOf(jTable1.getModel().getValueAt(row, 0).toString());
            var r = RequestMySQL.get(id);
            r.setDelivered(true);
            RequestMySQL.update(r);
            printTable(RequestMySQL.getAll());
        }
    }//GEN-LAST:event_btnCheckRequestDeliveredActionPerformed

    private void btnShowDialogRequestPerClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDialogRequestPerClientActionPerformed
        showNumOfRequestPerClientDialog();
    }//GEN-LAST:event_btnShowDialogRequestPerClientActionPerformed

    private void btnChangeTableSeeAllRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeTableSeeAllProductsActionPerformed
        printTable(RequestMySQL.getAll());
    }//GEN-LAST:event_btnChangeTableSeeAllProductsActionPerformed

    private void btnChangeTableSeeLastWeekRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeTableSeeLastWeekProductActionPerformed
        printTable(RequestMySQL.getFromLastWeek());
    }//GEN-LAST:event_btnChangeTableSeeLastWeekProductActionPerformed

    private void btnChangeTableSeeTodayRequestNonDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeTableSeeTodayProductsNonDeliveredActionPerformed
        printTable(RequestMySQL.todayPendingRequest(RequestMySQL.getAll()));
    }//GEN-LAST:event_btnChangeTableSeeTodayProductsNonDeliveredActionPerformed

    private void btnDeleteRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRequestActionPerformed
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "No se ha seleccionado ningún pedido",
                    "Imposible eliminar este Pedido",
                    JOptionPane.NO_OPTION);
        } else {
            int n = JOptionPane.showConfirmDialog(
                    this,
                    "¿Estas seguro de querer eliminar el pedido seleccionado?",
                    "Eliminar un Pedido",
                    JOptionPane.YES_NO_OPTION);

            System.out.print("Devuelve: " + n);
            if (n == 0) {

                Integer id = Integer.valueOf(jTable1.getModel().getValueAt(row, 0).toString());
                RequestMySQL.delete(id);
                printTable(RequestMySQL.getAll());
            }
        }
    }//GEN-LAST:event_btnDeleteRequestActionPerformed

    private void btnShowDialogMothIncomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDialogMothIncomesActionPerformed
        Float incomes = RequestMySQL.lastMonthBenefit();

        JOptionPane.showMessageDialog(this,
                "Este último mes las ganancias han sido de " + incomes + "€",
                "Ganancias último mes",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnShowDialogMothIncomesActionPerformed

    private void showCreateRequestDialog() {
        var createRequestDialog = new CreateRequestDialog(this, true);
        createRequestDialog.setVisible(true);
        printTable(RequestMySQL.getAll());
    }

    private void showNumOfRequestPerClientDialog() {
        var numOfRequestPerClientDialog = new NumOfRequestPerClientDialog(this, true);
        numOfRequestPerClientDialog.setVisible(true);
    }


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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }


    public void printTable(ArrayList<Request> allRequest) {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (Integer i = 0; i < allRequest.size(); i++) {
            var p = allRequest.get(i);

            Object[] row = {p.getId(), p.getDate(), p.getClient(), p.getDelivered(), p.getProduct().getName()};
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeTableSeeAllProducts;
    private javax.swing.JButton btnChangeTableSeeClientProducts;
    private javax.swing.JButton btnChangeTableSeeLastWeekProduct;
    private javax.swing.JButton btnChangeTableSeeTodayProductsNonDelivered;
    private javax.swing.JButton btnCheckRequestDelivered;
    private javax.swing.JButton btnCreateRequest;
    private javax.swing.JButton btnDeleteRequest;
    private javax.swing.JButton btnShowDialogMothIncomes;
    private javax.swing.JButton btnShowDialogRequestPerClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelButtonOptions;
    private javax.swing.JPanel panelButtonsUpdateTable;
    private javax.swing.JPanel panelMainTable;
    // End of variables declaration//GEN-END:variables
}




