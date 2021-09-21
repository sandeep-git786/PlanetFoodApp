
package planetfoodapp.gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import planetfoodapp.pojo.UserProfile;

public class AdminOptionsFrame extends javax.swing.JFrame {

   
    public AdminOptionsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlabelAdmin.setText("Hello "+UserProfile.getUsername( ));
    }
    private String getOption()
     {
         if(jrAddEmp.isSelected())
             return jrAddEmp.getText();
         else if(jrViewEmp.isSelected())
             return jrViewEmp.getText();
         else if(jrEditEmp.isSelected())
             return jrEditEmp.getText();
         else if(jrRemoveEmp.isSelected())
             return jrRemoveEmp.getText();
         else if(jrRegisterCashier.isSelected())
             return jrRegisterCashier.getText();
         else if(jrRemoveCashier.isSelected())
             return jrRemoveCashier.getText();
         else if(jrViewOrder.isSelected())
             return jrViewOrder.getText();
         else if(jrViewDateWise.isSelected())
             return jrViewDateWise.getText();
         else if(jrAddCategory.isSelected())
             return jrAddCategory.getText();
         else if(jrEditCategory.isSelected())
             return jrEditCategory.getText();
         else if(jrViewCategory.isSelected())
             return jrViewCategory.getText();
         else if(jrAddProduct.isSelected())
             return jrAddProduct.getText();
         else if(jrEditProduct.isSelected())
             return jrEditProduct.getText();
         else if(jrViewProduct.isSelected())
             return jrViewProduct.getText();
         else if(jrRemoveProduct.isSelected())
             return jrRemoveProduct.getText();
         return null;
          }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnDoTask = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jrAddEmp = new javax.swing.JRadioButton();
        jrViewEmp = new javax.swing.JRadioButton();
        jrEditEmp = new javax.swing.JRadioButton();
        jrRemoveEmp = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jrRegisterCashier = new javax.swing.JRadioButton();
        jrRemoveCashier = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jrViewOrder = new javax.swing.JRadioButton();
        jrViewDateWise = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jrAddCategory = new javax.swing.JRadioButton();
        jrEditCategory = new javax.swing.JRadioButton();
        jrViewCategory = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jrAddProduct = new javax.swing.JRadioButton();
        jrViewProduct = new javax.swing.JRadioButton();
        jrEditProduct = new javax.swing.JRadioButton();
        jrRemoveProduct = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jlabelAdmin = new javax.swing.JLabel();
        jlabelLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THE PLANET FOOD APP");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PLANET FOOD ADMIN PANEL");

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Make A Choice");

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Emp Options");

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cashier Options");

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Report Options");

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Category Options ");

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Product Options");

        btnDoTask.setBackground(new java.awt.Color(0, 102, 102));
        btnDoTask.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jrAddEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrAddEmp);
        jrAddEmp.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jrAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrAddEmp.setText("Add Emp");
        jrAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAddEmpActionPerformed(evt);
            }
        });

        jrViewEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrViewEmp);
        jrViewEmp.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jrViewEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrViewEmp.setText("View Emp");

        jrEditEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrEditEmp);
        jrEditEmp.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jrEditEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrEditEmp.setText("Edit Emp");

        jrRemoveEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrRemoveEmp);
        jrRemoveEmp.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jrRemoveEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrRemoveEmp.setText("Remove Emp");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrRemoveEmp)
                    .addComponent(jrEditEmp)
                    .addComponent(jrViewEmp)
                    .addComponent(jrAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jrAddEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrRemoveEmp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jrRegisterCashier.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrRegisterCashier);
        jrRegisterCashier.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jrRegisterCashier.setForeground(new java.awt.Color(255, 255, 255));
        jrRegisterCashier.setText("Register Cashier");

        jrRemoveCashier.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrRemoveCashier);
        jrRemoveCashier.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jrRemoveCashier.setForeground(new java.awt.Color(255, 255, 255));
        jrRemoveCashier.setText("Remove Cashier");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrRemoveCashier)
                    .addComponent(jrRegisterCashier))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jrRegisterCashier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrRemoveCashier)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jrViewOrder.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrViewOrder);
        jrViewOrder.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jrViewOrder.setForeground(new java.awt.Color(255, 255, 255));
        jrViewOrder.setText("View Order");

        jrViewDateWise.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrViewDateWise);
        jrViewDateWise.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jrViewDateWise.setForeground(new java.awt.Color(255, 255, 255));
        jrViewDateWise.setText("View Datewise");
        jrViewDateWise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrViewDateWiseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrViewDateWise)
                    .addComponent(jrViewOrder))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jrViewOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewDateWise)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jrAddCategory.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrAddCategory);
        jrAddCategory.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jrAddCategory.setForeground(new java.awt.Color(255, 255, 255));
        jrAddCategory.setText("Add Category");
        jrAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAddCategoryActionPerformed(evt);
            }
        });

        jrEditCategory.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrEditCategory);
        jrEditCategory.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jrEditCategory.setForeground(new java.awt.Color(255, 255, 255));
        jrEditCategory.setText("Edit Category");

        jrViewCategory.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrViewCategory);
        jrViewCategory.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jrViewCategory.setForeground(new java.awt.Color(255, 255, 255));
        jrViewCategory.setText("View Category");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrViewCategory)
                    .addComponent(jrEditCategory)
                    .addComponent(jrAddCategory))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jrAddCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewCategory)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jrAddProduct.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrAddProduct);
        jrAddProduct.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jrAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        jrAddProduct.setText("Add Product");
        jrAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAddProductActionPerformed(evt);
            }
        });

        jrViewProduct.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrViewProduct);
        jrViewProduct.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jrViewProduct.setForeground(new java.awt.Color(255, 255, 255));
        jrViewProduct.setText("View Product");

        jrEditProduct.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrEditProduct);
        jrEditProduct.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jrEditProduct.setForeground(new java.awt.Color(255, 255, 255));
        jrEditProduct.setText("Edit Product");

        jrRemoveProduct.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrRemoveProduct);
        jrRemoveProduct.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jrRemoveProduct.setForeground(new java.awt.Color(255, 255, 255));
        jrRemoveProduct.setText("Remove Product");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrAddProduct)
                    .addComponent(jrViewProduct)
                    .addComponent(jrEditProduct)
                    .addComponent(jrRemoveProduct))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jrAddProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrRemoveProduct)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel8.setBackground(new java.awt.Color(0, 102, 102));
        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\JAVA\\Core Java january 2019\\images\\manager.png")); // NOI18N

        jlabelAdmin.setBackground(new java.awt.Color(0, 102, 102));
        jlabelAdmin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jlabelAdmin.setForeground(new java.awt.Color(255, 102, 0));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(183, 183, 183)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDoTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel4)))
                                .addGap(0, 135, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlabelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlabelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabelLogout))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoTask)
                    .addComponent(btnBack))
                .addContainerGap(23, Short.MAX_VALUE))
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

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
      String task=getOption();
      if(task==null)
      {
          JOptionPane.showMessageDialog(null,"please select an option!","Error",JOptionPane.ERROR_MESSAGE);
          return; 
      }
      JFrame jf=null;
        if(task.equals("Add Emp"))
      {
        jf=new AddEmpFrame();
      }
      else if(task.equals("View Emp"))
      {
        jf=new ViewEmpFrame();
      }
      else if(task.equals("Edit Emp"))
      {
        jf=new EditEmpFrame();
      }
      else if(task.equals("Remove Emp"))
      {
        jf=new RemoveEmpFrame();
      }
      else if(task.equals("Register Cashier"))
      {
        jf=new RegisterCashierFrame();
      }
      else if(task.equals("Remove Cashier"))
      {
        jf=new RemoveCashierFrame();
      }
      else if(task.equals("View Order"))
      {
        jf=new ViewAllOrdersFrame();
      }
      else if(task.equals("View Datewise"))
      {
        jf=new ViewAllDateOrdersFrame();
      }
      else if(task.equals("Add Category"))
      {
        jf=new AddCategoryFrame();
      }
      else if(task.equals("Edit Category"))
      {
        jf=new EditCategoryFrame();
      }
      else if(task.equals("View Category"))
      {
       jf=new ViewAllCategoriesFrame();
      }
      else if(task.equals("Add Product"))
      {
       jf=new AddProductFrame();
      }
      else if(task.equals("Edit Product"))
      {
       jf=new EditProductFrame();
      }
      else if(task.equals("View Product"))
      {
       jf=new ViewProductsFrame();
      }
      else if(task.equals("Remove Product"))
      {
       jf=new RemoveProductFrame();
      }
      jf.setVisible(true);
      this.dispose();
          
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void jrAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAddEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrAddEmpActionPerformed

    private void jrAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAddProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrAddProductActionPerformed

    private void jrViewDateWiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrViewDateWiseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrViewDateWiseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        LoginFrame loginframe=new LoginFrame();
        loginframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jlabelLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelLogoutMouseEntered
        jlabelLogout.setForeground(Color.RED);
    }//GEN-LAST:event_jlabelLogoutMouseEntered

    private void jlabelLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelLogoutMouseExited
        jlabelLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_jlabelLogoutMouseExited

    private void jlabelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelLogoutMouseClicked
        LoginFrame loginFrame =new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlabelLogoutMouseClicked

    private void jrAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAddCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrAddCategoryActionPerformed

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
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlabelAdmin;
    private javax.swing.JLabel jlabelLogout;
    private javax.swing.JRadioButton jrAddCategory;
    private javax.swing.JRadioButton jrAddEmp;
    private javax.swing.JRadioButton jrAddProduct;
    private javax.swing.JRadioButton jrEditCategory;
    private javax.swing.JRadioButton jrEditEmp;
    private javax.swing.JRadioButton jrEditProduct;
    private javax.swing.JRadioButton jrRegisterCashier;
    private javax.swing.JRadioButton jrRemoveCashier;
    private javax.swing.JRadioButton jrRemoveEmp;
    private javax.swing.JRadioButton jrRemoveProduct;
    private javax.swing.JRadioButton jrViewCategory;
    private javax.swing.JRadioButton jrViewDateWise;
    private javax.swing.JRadioButton jrViewEmp;
    private javax.swing.JRadioButton jrViewOrder;
    private javax.swing.JRadioButton jrViewProduct;
    // End of variables declaration//GEN-END:variables
}