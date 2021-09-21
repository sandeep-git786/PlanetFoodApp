
package planetfoodapp.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import planetfoodapp.dao.CategoryDao;
import planetfoodapp.dao.ProductDao;
import planetfoodapp.pojo.Product;
import planetfoodapp.pojo.UserProfile;

public class ViewMenuList extends javax.swing.JFrame {
    private HashMap<String,String> categories;
    private HashMap<String,Product> productList;
    private DefaultTableModel model;
    private Product p;
    public ViewMenuList() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabelCashier.setText("Hello "+UserProfile.getUsername());
        loadProductDetails();
        model=(DefaultTableModel)jtItem.getModel();
    }
     public void loadProductDetails()
    {
        try
        {
          categories=CategoryDao.getAllCategory();
          for(String catName:categories.keySet())
          jcCategory.addItem(catName);
         
        }
        catch(SQLException ex)
        {
          JOptionPane.showMessageDialog(null, "DB error in Adding Product!", "ERROR",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();
        }
    }
    public void clearAll()
    {
        for(int i=model.getRowCount()-1;i>=0;i--)
        {
         model.removeRow(i);
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

        jPanel1 = new javax.swing.JPanel();
        jlabelLogout = new javax.swing.JLabel();
        jLabelCashier = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jcCategory = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtItem = new javax.swing.JTable();
        btBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THEPLANETFOODAPP");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jlabelLogout.setBackground(new java.awt.Color(0, 102, 102));
        jlabelLogout.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jlabelLogout.setForeground(new java.awt.Color(255, 255, 255));
        jlabelLogout.setText("Logout");
        jlabelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabelLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlabelLogoutMouseExited(evt);
            }
        });

        jLabelCashier.setBackground(new java.awt.Color(0, 102, 102));
        jLabelCashier.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelCashier.setForeground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VIEW MENU LIST");

        jcCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoryActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose Categories ");

        jtItem.setBackground(new java.awt.Color(204, 255, 204));
        jtItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Items", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtItem);

        btBack.setBackground(new java.awt.Color(0, 102, 102));
        btBack.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btBack.setForeground(new java.awt.Color(255, 255, 255));
        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetfoodapp/gui/menu-5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(103, 103, 103)
                                        .addComponent(jcCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addComponent(jlabelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabelLogout)
                    .addComponent(jLabelCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(btBack)
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void jlabelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelLogoutMouseClicked
        LoginFrame loginFrame =new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlabelLogoutMouseClicked

    private void jlabelLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelLogoutMouseEntered
        jlabelLogout.setForeground(Color.RED);
    }//GEN-LAST:event_jlabelLogoutMouseEntered

    private void jlabelLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelLogoutMouseExited
        jlabelLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_jlabelLogoutMouseExited

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        CashierOptionsFrame cashierframe =new CashierOptionsFrame();
        cashierframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btBackActionPerformed

    private void jcCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoryActionPerformed
      if(model!=null)
          clearAll();
      if(jcCategory.getSelectedItem()==null)
          return;
      else
      {
      try
      {
      String catName=jcCategory.getSelectedItem().toString();
      String catId=categories.get(catName);
      productList=ProductDao.getProductsByCategory(catId);
    
      Object[] rows=new Object[2];
      DefaultTableModel model=(DefaultTableModel)jtItem.getModel();
          for(Product p:productList.values())
          {
              rows[0]=p.getProdName();
              rows[1]=p.getProdPrice();
              model.addRow(rows);
          }
          //if(model.getRowCount()==0)
            //  JOptionPane.showMessageDialog(null,"No item of this category!","info",JOptionPane.INFORMATION_MESSAGE);
                  
      }
      
      catch(SQLException ex)
      {
        JOptionPane.showMessageDialog(null,"Error while connecting to DB!","Exception",JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
      }
      }
    }//GEN-LAST:event_jcCategoryActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMenuList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMenuList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMenuList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenuList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenuList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCashier;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcCategory;
    private javax.swing.JLabel jlabelLogout;
    private javax.swing.JTable jtItem;
    // End of variables declaration//GEN-END:variables
}
