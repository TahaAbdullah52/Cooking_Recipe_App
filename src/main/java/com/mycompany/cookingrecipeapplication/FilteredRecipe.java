/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.cookingrecipeapplication;

import java.awt.Color;
import java.awt.Font;
import java.net.URL;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class FilteredRecipe extends javax.swing.JPanel {

    Color defaultColor, hoverColor;
    Border hoverBorder, defaultBorder;

    private int recipeID1 = 0;
    private int recipeID2 = 0;
    private int recipeID3 = 0;

    private DataBaseConnection dbClass;
    private Connection conn;
    private MainView mainView;

    public FilteredRecipe(MainView mainview) {

        this.mainView = mainview;
        initComponents();
        
        dbClass = new DataBaseConnection();
        try {
            conn = dbClass.GetConnection();
        } catch (Exception e) {
            System.err.println("Failed to connect to the database: " + e.getMessage());
        }

        hoverColor = new Color(255, 186, 8);
        defaultColor = new Color(210, 68, 0);

        hoverBorder = new LineBorder(hoverColor, 3);
        defaultBorder = new LineBorder(defaultColor, 3);

    }

    void FilterByCategory(String category) {

        BtnFilterRecipe1.setBorder(defaultBorder);
        BtnFilterRecipe2.setBorder(defaultBorder);
        BtnFilterRecipe3.setBorder(defaultBorder);

        PnlFilterRecipe1.setVisible(false);
        PnlFilterRecipe2.setVisible(false);
        PnlFilterRecipe3.setVisible(false);

        if (conn != null) {
            try {
                String query = "SELECT * FROM recipe WHERE Category = ?";
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setString(1, category);
                ResultSet rs = pstmt.executeQuery();

                List<String> picturePaths = new ArrayList<>();
                List<Integer> recipeIDs = new ArrayList<>();
                List<String> calories = new ArrayList<>();
                List<String> recipeNames = new ArrayList<>();

                while (rs.next()) {
                    picturePaths.add(rs.getString("Picture"));
                    recipeIDs.add(rs.getInt("RecipeID"));
                    calories.add(rs.getString("Tot_Calorie"));
                    recipeNames.add(rs.getString("RecipeName"));
                }

                String headerText = "Available " + category + " items";
                LblHeader.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 36));
                LblHeader.setForeground(new Color(51, 51, 51));
                LblHeader.setText(headerText);

                for (int i = 0; i < picturePaths.size(); i++) {

                    int recipeID = recipeIDs.get(i);
                    String picturePath = picturePaths.get(i);
                    String calorie = calories.get(i);
                    String recipeName = recipeNames.get(i);

                    URL imageUrl = getClass().getClassLoader().getResource(picturePath);
                    ImageIcon icon = new ImageIcon(imageUrl);

                    if (i == 0) {
                       
                        recipeID1 = recipeID;
                        PnlFilterRecipe1.setVisible(true);
                        BtnFilterRecipe1.setIcon(icon);
                        LblFilterRecipe1.setText("<html><font size='6'><b>" + recipeName + "</b></font><br>"
                                + "<span style='color: #e0e0e0; font-size: 10px;'>Calories:" + calorie + "</span></html>");
                    } else if (i == 1) {
                       
                        recipeID2 = recipeID;
                        PnlFilterRecipe2.setVisible(true);
                        BtnFilterRecipe2.setIcon(icon);
                        LblFilterRecipe2.setText("<html><font size='6'><b>" + recipeName + "</b></font><br>"
                                + "<span style='color: #e0e0e0; font-size: 10px;'>Calories:" + calorie + "</span></html>");
                    } else {
                        
                        recipeID3 = recipeID;
                        PnlFilterRecipe3.setVisible(true);
                        BtnFilterRecipe3.setIcon(icon);
                        LblFilterRecipe3.setText("<html><font size='6'><b>" + recipeName + "</b></font><br>"
                                + "<span style='color: #e0e0e0; font-size: 10px;'>Calories:" + calorie + "</span></html>");
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            PnlCenter.revalidate();
            PnlCenter.repaint();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlTop = new javax.swing.JPanel();
        LblHeader = new javax.swing.JLabel();
        PnlCenter = new javax.swing.JPanel();
        PnlFilterRecipe1 = new javax.swing.JPanel();
        BtnFilterRecipe1 = new javax.swing.JButton();
        LblFilterRecipe1 = new javax.swing.JLabel();
        PnlFilterRecipe2 = new javax.swing.JPanel();
        LblFilterRecipe2 = new javax.swing.JLabel();
        BtnFilterRecipe2 = new javax.swing.JButton();
        PnlFilterRecipe3 = new javax.swing.JPanel();
        BtnFilterRecipe3 = new javax.swing.JButton();
        LblFilterRecipe3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1350, 800));
        setLayout(new java.awt.BorderLayout());

        PnlTop.setBackground(new java.awt.Color(214, 217, 223));
        PnlTop.setPreferredSize(new java.awt.Dimension(1350, 100));

        LblHeader.setBackground(new java.awt.Color(255, 255, 255));
        LblHeader.setFont(new java.awt.Font("Calibri", 2, 36)); // NOI18N
        LblHeader.setForeground(new java.awt.Color(51, 51, 51));
        LblHeader.setText("Available Food Items");

        javax.swing.GroupLayout PnlTopLayout = new javax.swing.GroupLayout(PnlTop);
        PnlTop.setLayout(PnlTopLayout);
        PnlTopLayout.setHorizontalGroup(
            PnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTopLayout.createSequentialGroup()
                .addContainerGap(489, Short.MAX_VALUE)
                .addComponent(LblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        PnlTopLayout.setVerticalGroup(
            PnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTopLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(LblHeader)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        add(PnlTop, java.awt.BorderLayout.NORTH);

        PnlCenter.setBackground(new java.awt.Color(255, 255, 255));

        PnlFilterRecipe1.setBackground(new java.awt.Color(210, 68, 0));
        PnlFilterRecipe1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlFilterRecipe1.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnFilterRecipe1.setBackground(new java.awt.Color(210, 68, 0));
        BtnFilterRecipe1.setContentAreaFilled(false);
        BtnFilterRecipe1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFilterRecipe1.setFocusPainted(false);
        BtnFilterRecipe1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnFilterRecipe1.setOpaque(true);
        BtnFilterRecipe1.setPreferredSize(new java.awt.Dimension(181, 177));
        BtnFilterRecipe1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFilterRecipe1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFilterRecipe1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFilterRecipe1MouseExited(evt);
            }
        });
        BtnFilterRecipe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFilterRecipe1ActionPerformed(evt);
            }
        });

        LblFilterRecipe1.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblFilterRecipe1.setForeground(new java.awt.Color(255, 255, 255));
        LblFilterRecipe1.setPreferredSize(new java.awt.Dimension(209, 47));

        javax.swing.GroupLayout PnlFilterRecipe1Layout = new javax.swing.GroupLayout(PnlFilterRecipe1);
        PnlFilterRecipe1.setLayout(PnlFilterRecipe1Layout);
        PnlFilterRecipe1Layout.setHorizontalGroup(
            PnlFilterRecipe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFilterRecipe1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFilterRecipe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFilterRecipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnFilterRecipe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PnlFilterRecipe1Layout.setVerticalGroup(
            PnlFilterRecipe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFilterRecipe1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BtnFilterRecipe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblFilterRecipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        PnlFilterRecipe2.setBackground(new java.awt.Color(210, 68, 0));
        PnlFilterRecipe2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlFilterRecipe2.setPreferredSize(new java.awt.Dimension(200, 271));

        LblFilterRecipe2.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblFilterRecipe2.setForeground(new java.awt.Color(255, 255, 255));
        LblFilterRecipe2.setPreferredSize(new java.awt.Dimension(209, 47));

        BtnFilterRecipe2.setBackground(new java.awt.Color(210, 68, 0));
        BtnFilterRecipe2.setContentAreaFilled(false);
        BtnFilterRecipe2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFilterRecipe2.setFocusPainted(false);
        BtnFilterRecipe2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnFilterRecipe2.setOpaque(true);
        BtnFilterRecipe2.setPreferredSize(new java.awt.Dimension(181, 177));
        BtnFilterRecipe2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFilterRecipe2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFilterRecipe2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFilterRecipe2MouseExited(evt);
            }
        });
        BtnFilterRecipe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFilterRecipe2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlFilterRecipe2Layout = new javax.swing.GroupLayout(PnlFilterRecipe2);
        PnlFilterRecipe2.setLayout(PnlFilterRecipe2Layout);
        PnlFilterRecipe2Layout.setHorizontalGroup(
            PnlFilterRecipe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFilterRecipe2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFilterRecipe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFilterRecipe2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addGroup(PnlFilterRecipe2Layout.createSequentialGroup()
                        .addComponent(BtnFilterRecipe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlFilterRecipe2Layout.setVerticalGroup(
            PnlFilterRecipe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFilterRecipe2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFilterRecipe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblFilterRecipe2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlFilterRecipe3.setBackground(new java.awt.Color(210, 68, 0));
        PnlFilterRecipe3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlFilterRecipe3.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnFilterRecipe3.setBackground(new java.awt.Color(210, 68, 0));
        BtnFilterRecipe3.setContentAreaFilled(false);
        BtnFilterRecipe3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFilterRecipe3.setFocusPainted(false);
        BtnFilterRecipe3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnFilterRecipe3.setOpaque(true);
        BtnFilterRecipe3.setPreferredSize(new java.awt.Dimension(181, 177));
        BtnFilterRecipe3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFilterRecipe3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFilterRecipe3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFilterRecipe3MouseExited(evt);
            }
        });
        BtnFilterRecipe3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFilterRecipe3ActionPerformed(evt);
            }
        });

        LblFilterRecipe3.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblFilterRecipe3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PnlFilterRecipe3Layout = new javax.swing.GroupLayout(PnlFilterRecipe3);
        PnlFilterRecipe3.setLayout(PnlFilterRecipe3Layout);
        PnlFilterRecipe3Layout.setHorizontalGroup(
            PnlFilterRecipe3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFilterRecipe3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFilterRecipe3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFilterRecipe3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PnlFilterRecipe3Layout.createSequentialGroup()
                        .addComponent(BtnFilterRecipe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlFilterRecipe3Layout.setVerticalGroup(
            PnlFilterRecipe3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFilterRecipe3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFilterRecipe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblFilterRecipe3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PnlCenterLayout = new javax.swing.GroupLayout(PnlCenter);
        PnlCenter.setLayout(PnlCenterLayout);
        PnlCenterLayout.setHorizontalGroup(
            PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCenterLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(PnlFilterRecipe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(PnlFilterRecipe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(PnlFilterRecipe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PnlCenterLayout.setVerticalGroup(
            PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCenterLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PnlFilterRecipe3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlFilterRecipe2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlFilterRecipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(297, Short.MAX_VALUE))
        );

        add(PnlCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    //hover effects of buttons

    private void BtnFilterRecipe1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFilterRecipe1MouseEntered
        BtnFilterRecipe1.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnFilterRecipe1MouseEntered

    private void BtnFilterRecipe1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFilterRecipe1MouseExited
        BtnFilterRecipe1.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnFilterRecipe1MouseExited

    private void BtnFilterRecipe2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFilterRecipe2MouseEntered
        BtnFilterRecipe2.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnFilterRecipe2MouseEntered

    private void BtnFilterRecipe2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFilterRecipe2MouseExited
        BtnFilterRecipe2.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnFilterRecipe2MouseExited

    private void BtnFilterRecipe3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFilterRecipe3MouseEntered
        BtnFilterRecipe3.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnFilterRecipe3MouseEntered

    private void BtnFilterRecipe3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFilterRecipe3MouseExited
        BtnFilterRecipe3.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnFilterRecipe3MouseExited

    private void BtnFilterRecipe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFilterRecipe1ActionPerformed
        mainView.showSingleRecipe(recipeID1);
    }//GEN-LAST:event_BtnFilterRecipe1ActionPerformed

    private void BtnFilterRecipe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFilterRecipe2ActionPerformed
        mainView.showSingleRecipe(recipeID2);
    }//GEN-LAST:event_BtnFilterRecipe2ActionPerformed

    private void BtnFilterRecipe3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFilterRecipe3ActionPerformed
        mainView.showSingleRecipe(recipeID3);
    }//GEN-LAST:event_BtnFilterRecipe3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFilterRecipe1;
    private javax.swing.JButton BtnFilterRecipe2;
    private javax.swing.JButton BtnFilterRecipe3;
    private javax.swing.JLabel LblFilterRecipe1;
    private javax.swing.JLabel LblFilterRecipe2;
    private javax.swing.JLabel LblFilterRecipe3;
    private javax.swing.JLabel LblHeader;
    private javax.swing.JPanel PnlCenter;
    private javax.swing.JPanel PnlFilterRecipe1;
    private javax.swing.JPanel PnlFilterRecipe2;
    private javax.swing.JPanel PnlFilterRecipe3;
    private javax.swing.JPanel PnlTop;
    // End of variables declaration//GEN-END:variables
}
