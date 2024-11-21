/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.cookingrecipeapplication;

import java.awt.Color;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class FavouritesView extends javax.swing.JPanel {

    Color defaultColor, hoverColor;
    Border hoverBorder, defaultBorder;
    List<Integer> recipeIDs;
    
    private MainView mainView;

    private DataBaseConnection dbClass;
    private Connection conn;

    public FavouritesView(MainView mainview) {
        initComponents();
        this.mainView = mainview;
        recipeIDs = new ArrayList<>();
        
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlHistoryLbl = new javax.swing.JPanel();
        LblFavHistory = new javax.swing.JLabel();
        ScrollPanel = new javax.swing.JScrollPane();
        PnlCenter = new javax.swing.JPanel();
        PnlFav1 = new javax.swing.JPanel();
        BtnFav1 = new javax.swing.JButton();
        LblFav1 = new javax.swing.JLabel();
        PnlFav2 = new javax.swing.JPanel();
        BtnFav2 = new javax.swing.JButton();
        LblFav2 = new javax.swing.JLabel();
        PnlFav3 = new javax.swing.JPanel();
        BtnFav3 = new javax.swing.JButton();
        LblFav3 = new javax.swing.JLabel();
        PnlFav4 = new javax.swing.JPanel();
        BtnFav4 = new javax.swing.JButton();
        LblFav4 = new javax.swing.JLabel();
        PnlFav5 = new javax.swing.JPanel();
        BtnFav5 = new javax.swing.JButton();
        LblFav5 = new javax.swing.JLabel();
        PnlFav6 = new javax.swing.JPanel();
        BtnFav6 = new javax.swing.JButton();
        LblFav6 = new javax.swing.JLabel();
        PnlFav7 = new javax.swing.JPanel();
        BtnFav7 = new javax.swing.JButton();
        LblFav7 = new javax.swing.JLabel();
        PnlFav8 = new javax.swing.JPanel();
        BtnFav8 = new javax.swing.JButton();
        LblFav8 = new javax.swing.JLabel();
        PnlFav9 = new javax.swing.JPanel();
        BtnFav9 = new javax.swing.JButton();
        LblFav9 = new javax.swing.JLabel();
        PnlFav10 = new javax.swing.JPanel();
        BtnFav10 = new javax.swing.JButton();
        LblFav10 = new javax.swing.JLabel();
        PnlFav11 = new javax.swing.JPanel();
        BtnFav11 = new javax.swing.JButton();
        LblFav11 = new javax.swing.JLabel();
        PnlFav12 = new javax.swing.JPanel();
        BtnFav12 = new javax.swing.JButton();
        LblFav12 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1350, 1300));
        setLayout(new java.awt.BorderLayout());

        PnlHistoryLbl.setBackground(new java.awt.Color(214, 217, 223));

        LblFavHistory.setBackground(new java.awt.Color(214, 217, 223));
        LblFavHistory.setFont(new java.awt.Font("Calibri", 2, 36)); // NOI18N
        LblFavHistory.setText("My Favourites");
        LblFavHistory.setOpaque(true);

        javax.swing.GroupLayout PnlHistoryLblLayout = new javax.swing.GroupLayout(PnlHistoryLbl);
        PnlHistoryLbl.setLayout(PnlHistoryLblLayout);
        PnlHistoryLblLayout.setHorizontalGroup(
            PnlHistoryLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlHistoryLblLayout.createSequentialGroup()
                .addContainerGap(575, Short.MAX_VALUE)
                .addComponent(LblFavHistory)
                .addGap(568, 568, 568))
        );
        PnlHistoryLblLayout.setVerticalGroup(
            PnlHistoryLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlHistoryLblLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LblFavHistory)
                .addGap(29, 29, 29))
        );

        add(PnlHistoryLbl, java.awt.BorderLayout.PAGE_START);

        PnlCenter.setBackground(new java.awt.Color(255, 255, 255));
        PnlCenter.setPreferredSize(new java.awt.Dimension(1400, 1300));

        PnlFav1.setBackground(new java.awt.Color(210, 68, 0));
        PnlFav1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlFav1.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnFav1.setBackground(new java.awt.Color(210, 68, 0));
        BtnFav1.setContentAreaFilled(false);
        BtnFav1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFav1.setFocusPainted(false);
        BtnFav1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnFav1.setOpaque(true);
        BtnFav1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFav1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFav1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFav1MouseExited(evt);
            }
        });
        BtnFav1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFav1ActionPerformed(evt);
            }
        });

        LblFav1.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblFav1.setForeground(new java.awt.Color(255, 255, 255));
        LblFav1.setPreferredSize(new java.awt.Dimension(209, 47));

        javax.swing.GroupLayout PnlFav1Layout = new javax.swing.GroupLayout(PnlFav1);
        PnlFav1.setLayout(PnlFav1Layout);
        PnlFav1Layout.setHorizontalGroup(
            PnlFav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav1Layout.createSequentialGroup()
                .addComponent(LblFav1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PnlFav1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFav1)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        PnlFav1Layout.setVerticalGroup(
            PnlFav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BtnFav1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblFav1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlFav2.setBackground(new java.awt.Color(210, 68, 0));
        PnlFav2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlFav2.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnFav2.setBackground(new java.awt.Color(210, 68, 0));
        BtnFav2.setContentAreaFilled(false);
        BtnFav2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFav2.setFocusPainted(false);
        BtnFav2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnFav2.setOpaque(true);
        BtnFav2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFav2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFav2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFav2MouseExited(evt);
            }
        });
        BtnFav2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFav2ActionPerformed(evt);
            }
        });

        LblFav2.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblFav2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PnlFav2Layout = new javax.swing.GroupLayout(PnlFav2);
        PnlFav2.setLayout(PnlFav2Layout);
        PnlFav2Layout.setHorizontalGroup(
            PnlFav2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFav2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFav2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addGroup(PnlFav2Layout.createSequentialGroup()
                        .addComponent(BtnFav2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlFav2Layout.setVerticalGroup(
            PnlFav2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BtnFav2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblFav2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlFav3.setBackground(new java.awt.Color(210, 68, 0));
        PnlFav3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlFav3.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnFav3.setBackground(new java.awt.Color(210, 68, 0));
        BtnFav3.setContentAreaFilled(false);
        BtnFav3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFav3.setFocusPainted(false);
        BtnFav3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnFav3.setOpaque(true);
        BtnFav3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFav3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFav3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFav3MouseExited(evt);
            }
        });
        BtnFav3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFav3ActionPerformed(evt);
            }
        });

        LblFav3.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblFav3.setForeground(new java.awt.Color(255, 255, 255));
        LblFav3.setPreferredSize(new java.awt.Dimension(209, 47));

        javax.swing.GroupLayout PnlFav3Layout = new javax.swing.GroupLayout(PnlFav3);
        PnlFav3.setLayout(PnlFav3Layout);
        PnlFav3Layout.setHorizontalGroup(
            PnlFav3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFav3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFav3, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PnlFav3Layout.createSequentialGroup()
                        .addComponent(BtnFav3)
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlFav3Layout.setVerticalGroup(
            PnlFav3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BtnFav3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblFav3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlFav4.setBackground(new java.awt.Color(210, 68, 0));
        PnlFav4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlFav4.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnFav4.setBackground(new java.awt.Color(210, 68, 0));
        BtnFav4.setContentAreaFilled(false);
        BtnFav4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFav4.setFocusPainted(false);
        BtnFav4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnFav4.setOpaque(true);
        BtnFav4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFav4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFav4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFav4MouseExited(evt);
            }
        });
        BtnFav4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFav4ActionPerformed(evt);
            }
        });

        LblFav4.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblFav4.setForeground(new java.awt.Color(255, 255, 255));
        LblFav4.setPreferredSize(new java.awt.Dimension(209, 47));

        javax.swing.GroupLayout PnlFav4Layout = new javax.swing.GroupLayout(PnlFav4);
        PnlFav4.setLayout(PnlFav4Layout);
        PnlFav4Layout.setHorizontalGroup(
            PnlFav4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFav4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFav4, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PnlFav4Layout.createSequentialGroup()
                        .addComponent(BtnFav4)
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlFav4Layout.setVerticalGroup(
            PnlFav4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BtnFav4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(LblFav4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlFav5.setBackground(new java.awt.Color(210, 68, 0));
        PnlFav5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlFav5.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnFav5.setBackground(new java.awt.Color(210, 68, 0));
        BtnFav5.setContentAreaFilled(false);
        BtnFav5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFav5.setFocusPainted(false);
        BtnFav5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnFav5.setOpaque(true);
        BtnFav5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFav5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFav5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFav5MouseExited(evt);
            }
        });
        BtnFav5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFav5ActionPerformed(evt);
            }
        });

        LblFav5.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblFav5.setForeground(new java.awt.Color(255, 255, 255));
        LblFav5.setPreferredSize(new java.awt.Dimension(209, 47));

        javax.swing.GroupLayout PnlFav5Layout = new javax.swing.GroupLayout(PnlFav5);
        PnlFav5.setLayout(PnlFav5Layout);
        PnlFav5Layout.setHorizontalGroup(
            PnlFav5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFav5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFav5, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BtnFav5, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnlFav5Layout.setVerticalGroup(
            PnlFav5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BtnFav5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(LblFav5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlFav6.setBackground(new java.awt.Color(210, 68, 0));
        PnlFav6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlFav6.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnFav6.setBackground(new java.awt.Color(210, 68, 0));
        BtnFav6.setContentAreaFilled(false);
        BtnFav6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFav6.setFocusPainted(false);
        BtnFav6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnFav6.setOpaque(true);
        BtnFav6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFav6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFav6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFav6MouseExited(evt);
            }
        });
        BtnFav6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFav6ActionPerformed(evt);
            }
        });

        LblFav6.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblFav6.setForeground(new java.awt.Color(255, 255, 255));
        LblFav6.setPreferredSize(new java.awt.Dimension(209, 47));

        javax.swing.GroupLayout PnlFav6Layout = new javax.swing.GroupLayout(PnlFav6);
        PnlFav6.setLayout(PnlFav6Layout);
        PnlFav6Layout.setHorizontalGroup(
            PnlFav6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFav6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFav6, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PnlFav6Layout.createSequentialGroup()
                        .addComponent(BtnFav6)
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlFav6Layout.setVerticalGroup(
            PnlFav6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BtnFav6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(LblFav6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlFav7.setBackground(new java.awt.Color(210, 68, 0));
        PnlFav7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlFav7.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnFav7.setBackground(new java.awt.Color(210, 68, 0));
        BtnFav7.setContentAreaFilled(false);
        BtnFav7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFav7.setFocusPainted(false);
        BtnFav7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnFav7.setOpaque(true);
        BtnFav7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFav7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFav7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFav7MouseExited(evt);
            }
        });
        BtnFav7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFav7ActionPerformed(evt);
            }
        });

        LblFav7.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblFav7.setForeground(new java.awt.Color(255, 255, 255));
        LblFav7.setPreferredSize(new java.awt.Dimension(209, 47));

        javax.swing.GroupLayout PnlFav7Layout = new javax.swing.GroupLayout(PnlFav7);
        PnlFav7.setLayout(PnlFav7Layout);
        PnlFav7Layout.setHorizontalGroup(
            PnlFav7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFav7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFav7, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PnlFav7Layout.createSequentialGroup()
                        .addComponent(BtnFav7)
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlFav7Layout.setVerticalGroup(
            PnlFav7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BtnFav7, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(LblFav7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlFav8.setBackground(new java.awt.Color(210, 68, 0));
        PnlFav8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlFav8.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnFav8.setBackground(new java.awt.Color(210, 68, 0));
        BtnFav8.setContentAreaFilled(false);
        BtnFav8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFav8.setFocusPainted(false);
        BtnFav8.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnFav8.setOpaque(true);
        BtnFav8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFav8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFav8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFav8MouseExited(evt);
            }
        });
        BtnFav8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFav8ActionPerformed(evt);
            }
        });

        LblFav8.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblFav8.setForeground(new java.awt.Color(255, 255, 255));
        LblFav8.setPreferredSize(new java.awt.Dimension(209, 47));

        javax.swing.GroupLayout PnlFav8Layout = new javax.swing.GroupLayout(PnlFav8);
        PnlFav8.setLayout(PnlFav8Layout);
        PnlFav8Layout.setHorizontalGroup(
            PnlFav8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFav8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFav8, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PnlFav8Layout.createSequentialGroup()
                        .addComponent(BtnFav8)
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlFav8Layout.setVerticalGroup(
            PnlFav8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BtnFav8, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(LblFav8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlFav9.setBackground(new java.awt.Color(210, 68, 0));
        PnlFav9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlFav9.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnFav9.setBackground(new java.awt.Color(210, 68, 0));
        BtnFav9.setContentAreaFilled(false);
        BtnFav9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFav9.setFocusPainted(false);
        BtnFav9.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnFav9.setOpaque(true);
        BtnFav9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFav9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFav9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFav9MouseExited(evt);
            }
        });
        BtnFav9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFav9ActionPerformed(evt);
            }
        });

        LblFav9.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblFav9.setForeground(new java.awt.Color(255, 255, 255));
        LblFav9.setPreferredSize(new java.awt.Dimension(209, 47));

        javax.swing.GroupLayout PnlFav9Layout = new javax.swing.GroupLayout(PnlFav9);
        PnlFav9.setLayout(PnlFav9Layout);
        PnlFav9Layout.setHorizontalGroup(
            PnlFav9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFav9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFav9, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PnlFav9Layout.createSequentialGroup()
                        .addComponent(BtnFav9)
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlFav9Layout.setVerticalGroup(
            PnlFav9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BtnFav9, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(LblFav9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlFav10.setBackground(new java.awt.Color(210, 68, 0));
        PnlFav10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlFav10.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnFav10.setBackground(new java.awt.Color(210, 68, 0));
        BtnFav10.setContentAreaFilled(false);
        BtnFav10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFav10.setFocusPainted(false);
        BtnFav10.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnFav10.setOpaque(true);
        BtnFav10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFav10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFav10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFav10MouseExited(evt);
            }
        });
        BtnFav10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFav10ActionPerformed(evt);
            }
        });

        LblFav10.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblFav10.setForeground(new java.awt.Color(255, 255, 255));
        LblFav10.setPreferredSize(new java.awt.Dimension(209, 47));

        javax.swing.GroupLayout PnlFav10Layout = new javax.swing.GroupLayout(PnlFav10);
        PnlFav10.setLayout(PnlFav10Layout);
        PnlFav10Layout.setHorizontalGroup(
            PnlFav10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFav10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFav10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PnlFav10Layout.createSequentialGroup()
                        .addComponent(BtnFav10)
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlFav10Layout.setVerticalGroup(
            PnlFav10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BtnFav10, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(LblFav10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlFav11.setBackground(new java.awt.Color(210, 68, 0));
        PnlFav11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlFav11.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnFav11.setBackground(new java.awt.Color(210, 68, 0));
        BtnFav11.setContentAreaFilled(false);
        BtnFav11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFav11.setFocusPainted(false);
        BtnFav11.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnFav11.setOpaque(true);
        BtnFav11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFav11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFav11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFav11MouseExited(evt);
            }
        });
        BtnFav11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFav11ActionPerformed(evt);
            }
        });

        LblFav11.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblFav11.setForeground(new java.awt.Color(255, 255, 255));
        LblFav11.setPreferredSize(new java.awt.Dimension(209, 47));

        javax.swing.GroupLayout PnlFav11Layout = new javax.swing.GroupLayout(PnlFav11);
        PnlFav11.setLayout(PnlFav11Layout);
        PnlFav11Layout.setHorizontalGroup(
            PnlFav11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFav11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFav11, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BtnFav11, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnlFav11Layout.setVerticalGroup(
            PnlFav11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BtnFav11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(LblFav11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlFav12.setBackground(new java.awt.Color(210, 68, 0));
        PnlFav12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlFav12.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnFav12.setBackground(new java.awt.Color(210, 68, 0));
        BtnFav12.setContentAreaFilled(false);
        BtnFav12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFav12.setFocusPainted(false);
        BtnFav12.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnFav12.setOpaque(true);
        BtnFav12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFav12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFav12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFav12MouseExited(evt);
            }
        });
        BtnFav12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFav12ActionPerformed(evt);
            }
        });

        LblFav12.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblFav12.setForeground(new java.awt.Color(255, 255, 255));
        LblFav12.setPreferredSize(new java.awt.Dimension(209, 47));

        javax.swing.GroupLayout PnlFav12Layout = new javax.swing.GroupLayout(PnlFav12);
        PnlFav12.setLayout(PnlFav12Layout);
        PnlFav12Layout.setHorizontalGroup(
            PnlFav12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFav12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFav12, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BtnFav12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnlFav12Layout.setVerticalGroup(
            PnlFav12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFav12Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BtnFav12, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(LblFav12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PnlCenterLayout = new javax.swing.GroupLayout(PnlCenter);
        PnlCenter.setLayout(PnlCenterLayout);
        PnlCenterLayout.setHorizontalGroup(
            PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCenterLayout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlFav1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlFav5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlFav9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlFav2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlFav6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlFav10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlCenterLayout.createSequentialGroup()
                        .addComponent(PnlFav3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(PnlFav4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlCenterLayout.createSequentialGroup()
                        .addComponent(PnlFav7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(PnlFav8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlCenterLayout.createSequentialGroup()
                        .addComponent(PnlFav11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(PnlFav12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        PnlCenterLayout.setVerticalGroup(
            PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCenterLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlFav1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlFav2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlFav3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlFav4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlFav5, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlFav6, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlFav7, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlFav8, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlFav10, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlFav11, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlFav12, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlFav9, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        ScrollPanel.setViewportView(PnlCenter);

        add(ScrollPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public void SetFavouriteComponents() {

        PnlFav1.setVisible(false);
        PnlFav2.setVisible(false);
        PnlFav3.setVisible(false);
        PnlFav5.setVisible(false);
        PnlFav4.setVisible(false);
        PnlFav6.setVisible(false);
        PnlFav7.setVisible(false);
        PnlFav8.setVisible(false);
        PnlFav10.setVisible(false);
        PnlFav9.setVisible(false);
        PnlFav11.setVisible(false);
        PnlFav12.setVisible(false);

        recipeIDs.clear();
        
        if (conn != null) {
            try {
                String query = "SELECT * FROM recipe WHERE is_Favourite = ?";
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setString(1, "true");
                ResultSet rs = pstmt.executeQuery();

                List<String> picturePaths = new ArrayList<>();
                List<String> calories = new ArrayList<>();
                List<String> recipeNames = new ArrayList<>();

                while (rs.next()) {
                    picturePaths.add(rs.getString("Picture"));
                    calories.add(rs.getString("Tot_Calorie"));
                    recipeNames.add(rs.getString("RecipeName"));
                    recipeIDs.add(rs.getInt("RecipeID"));
                }

                for (int i = 0; i < picturePaths.size(); i++) {

                    String picturePath = picturePaths.get(i);
                    String calorie = calories.get(i);
                    String recipeName = recipeNames.get(i);

                    URL imageUrl = getClass().getClassLoader().getResource(picturePath);
                    ImageIcon icon = new ImageIcon(imageUrl);

                    if (i == 0) {
                        BtnFav1.setBorder(defaultBorder);
                        PnlFav1.setVisible(true);
                        BtnFav1.setIcon(icon);
                        LblFav1.setText("<html><font size='6'><b>" + recipeName + "</b></font><br>"
                                + "<span style='color: #e0e0e0; font-size: 10px;'>Calories:" + calorie + "</span></html>");
                    } else if (i == 1) {
                        BtnFav2.setBorder(defaultBorder);
                        PnlFav2.setVisible(true);
                        BtnFav2.setIcon(icon);
                        LblFav2.setText("<html><font size='6'><b>" + recipeName + "</b></font><br>"
                                + "<span style='color: #e0e0e0; font-size: 10px;'>Calories:" + calorie + "</span></html>");
                    } else if (i == 2) {
                        BtnFav3.setBorder(defaultBorder);
                        PnlFav3.setVisible(true);
                        BtnFav3.setIcon(icon);
                        LblFav3.setText("<html><font size='6'><b>" + recipeName + "</b></font><br>"
                                + "<span style='color: #e0e0e0; font-size: 10px;'>Calories:" + calorie + "</span></html>");
                    } else if (i == 3) {
                        BtnFav4.setBorder(defaultBorder);
                        PnlFav4.setVisible(true);
                        BtnFav4.setIcon(icon);
                        LblFav4.setText("<html><font size='6'><b>" + recipeName + "</b></font><br>"
                                + "<span style='color: #e0e0e0; font-size: 10px;'>Calories:" + calorie + "</span></html>");
                    } else if (i == 4) {
                        BtnFav5.setBorder(defaultBorder);
                        PnlFav5.setVisible(true);
                        BtnFav5.setIcon(icon);
                        LblFav5.setText("<html><font size='6'><b>" + recipeName + "</b></font><br>"
                                + "<span style='color: #e0e0e0; font-size: 10px;'>Calories:" + calorie + "</span></html>");
                    } else if (i == 5) {
                        BtnFav6.setBorder(defaultBorder);
                        PnlFav6.setVisible(true);
                        BtnFav6.setIcon(icon);
                        LblFav6.setText("<html><font size='6'><b>" + recipeName + "</b></font><br>"
                                + "<span style='color: #e0e0e0; font-size: 10px;'>Calories:" + calorie + "</span></html>");
                    } else if (i == 6) {
                        BtnFav7.setBorder(defaultBorder);
                        PnlFav7.setVisible(true);
                        BtnFav7.setIcon(icon);
                        LblFav7.setText("<html><font size='6'><b>" + recipeName + "</b></font><br>"
                                + "<span style='color: #e0e0e0; font-size: 10px;'>Calories:" + calorie + "</span></html>");
                    } else if (i == 7) {
                        BtnFav8.setBorder(defaultBorder);
                        PnlFav8.setVisible(true);
                        BtnFav8.setIcon(icon);
                        LblFav8.setText("<html><font size='6'><b>" + recipeName + "</b></font><br>"
                                + "<span style='color: #e0e0e0; font-size: 10px;'>Calories:" + calorie + "</span></html>");
                    } else if (i == 8) {
                        BtnFav9.setBorder(defaultBorder);
                        PnlFav9.setVisible(true);
                        BtnFav9.setIcon(icon);
                        LblFav9.setText("<html><font size='6'><b>" + recipeName + "</b></font><br>"
                                + "<span style='color: #e0e0e0; font-size: 10px;'>Calories:" + calorie + "</span></html>");
                    } else if (i == 9) {
                        BtnFav10.setBorder(defaultBorder);
                        PnlFav10.setVisible(true);
                        BtnFav10.setIcon(icon);
                        LblFav10.setText("<html><font size='6'><b>" + recipeName + "</b></font><br>"
                                + "<span style='color: #e0e0e0; font-size: 10px;'>Calories:" + calorie + "</span></html>");
                    } else if (i == 10) {
                        BtnFav11.setBorder(defaultBorder);
                        PnlFav11.setVisible(true);
                        BtnFav11.setIcon(icon);
                        LblFav11.setText("<html><font size='6'><b>" + recipeName + "</b></font><br>"
                                + "<span style='color: #e0e0e0; font-size: 10px;'>Calories:" + calorie + "</span></html>");
                    } else {
                        BtnFav12.setBorder(defaultBorder);
                        PnlFav12.setVisible(true);
                        BtnFav12.setIcon(icon);
                        LblFav12.setText("<html><font size='6'><b>" + recipeName + "</b></font><br>"
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

    
    private void BtnFav1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav1MouseEntered
        BtnFav1.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnFav1MouseEntered

    private void BtnFav1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav1MouseExited
        BtnFav1.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnFav1MouseExited

    private void BtnFav1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFav1ActionPerformed
        mainView.showSingleRecipe(recipeIDs.get(0));
    }//GEN-LAST:event_BtnFav1ActionPerformed

    private void BtnFav2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav2MouseEntered
        BtnFav2.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnFav2MouseEntered

    private void BtnFav2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav2MouseExited
        BtnFav2.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnFav2MouseExited

    private void BtnFav2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFav2ActionPerformed
        mainView.showSingleRecipe(recipeIDs.get(1));
    }//GEN-LAST:event_BtnFav2ActionPerformed

    private void BtnFav3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav3MouseEntered
        BtnFav3.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnFav3MouseEntered

    private void BtnFav3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav3MouseExited
        BtnFav3.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnFav3MouseExited

    private void BtnFav3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFav3ActionPerformed
        mainView.showSingleRecipe(recipeIDs.get(2));
    }//GEN-LAST:event_BtnFav3ActionPerformed

    private void BtnFav5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav5MouseEntered
        BtnFav5.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnFav5MouseEntered

    private void BtnFav5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav5MouseExited
        BtnFav5.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnFav5MouseExited

    private void BtnFav5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFav5ActionPerformed
        mainView.showSingleRecipe(recipeIDs.get(4));
    }//GEN-LAST:event_BtnFav5ActionPerformed

    private void BtnFav4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav4MouseEntered
        BtnFav4.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnFav4MouseEntered

    private void BtnFav4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav4MouseExited
        BtnFav4.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnFav4MouseExited

    private void BtnFav4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFav4ActionPerformed
        mainView.showSingleRecipe(recipeIDs.get(3));
    }//GEN-LAST:event_BtnFav4ActionPerformed

    private void BtnFav6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav6MouseEntered
        BtnFav6.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnFav6MouseEntered

    private void BtnFav6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav6MouseExited
        BtnFav6.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnFav6MouseExited

    private void BtnFav6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFav6ActionPerformed
        mainView.showSingleRecipe(recipeIDs.get(5));
    }//GEN-LAST:event_BtnFav6ActionPerformed

    private void BtnFav7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav7MouseEntered
        BtnFav7.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnFav7MouseEntered

    private void BtnFav7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav7MouseExited
        BtnFav7.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnFav7MouseExited

    private void BtnFav7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFav7ActionPerformed
        mainView.showSingleRecipe(recipeIDs.get(6));
    }//GEN-LAST:event_BtnFav7ActionPerformed

    private void BtnFav8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav8MouseEntered
        BtnFav8.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnFav8MouseEntered

    private void BtnFav8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav8MouseExited
        BtnFav8.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnFav8MouseExited

    private void BtnFav8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFav8ActionPerformed
        mainView.showSingleRecipe(recipeIDs.get(7));
    }//GEN-LAST:event_BtnFav8ActionPerformed

    private void BtnFav10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav10MouseEntered
        BtnFav10.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnFav10MouseEntered

    private void BtnFav10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav10MouseExited
        BtnFav10.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnFav10MouseExited

    private void BtnFav10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFav10ActionPerformed
        mainView.showSingleRecipe(recipeIDs.get(9));
    }//GEN-LAST:event_BtnFav10ActionPerformed

    private void BtnFav9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav9MouseEntered
        BtnFav9.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnFav9MouseEntered

    private void BtnFav9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav9MouseExited
        BtnFav9.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnFav9MouseExited

    private void BtnFav9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFav9ActionPerformed
        mainView.showSingleRecipe(recipeIDs.get(8));
    }//GEN-LAST:event_BtnFav9ActionPerformed

    private void BtnFav11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav11MouseEntered
        BtnFav11.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnFav11MouseEntered

    private void BtnFav11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav11MouseExited
        BtnFav11.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnFav11MouseExited

    private void BtnFav11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFav11ActionPerformed
        mainView.showSingleRecipe(recipeIDs.get(10));
    }//GEN-LAST:event_BtnFav11ActionPerformed

    private void BtnFav12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav12MouseEntered
        BtnFav12.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnFav12MouseEntered

    private void BtnFav12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFav12MouseExited
        BtnFav12.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnFav12MouseExited

    private void BtnFav12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFav12ActionPerformed
        mainView.showSingleRecipe(recipeIDs.get(11));
    }//GEN-LAST:event_BtnFav12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFav1;
    private javax.swing.JButton BtnFav10;
    private javax.swing.JButton BtnFav11;
    private javax.swing.JButton BtnFav12;
    private javax.swing.JButton BtnFav2;
    private javax.swing.JButton BtnFav3;
    private javax.swing.JButton BtnFav4;
    private javax.swing.JButton BtnFav5;
    private javax.swing.JButton BtnFav6;
    private javax.swing.JButton BtnFav7;
    private javax.swing.JButton BtnFav8;
    private javax.swing.JButton BtnFav9;
    private javax.swing.JLabel LblFav1;
    private javax.swing.JLabel LblFav10;
    private javax.swing.JLabel LblFav11;
    private javax.swing.JLabel LblFav12;
    private javax.swing.JLabel LblFav2;
    private javax.swing.JLabel LblFav3;
    private javax.swing.JLabel LblFav4;
    private javax.swing.JLabel LblFav5;
    private javax.swing.JLabel LblFav6;
    private javax.swing.JLabel LblFav7;
    private javax.swing.JLabel LblFav8;
    private javax.swing.JLabel LblFav9;
    private javax.swing.JLabel LblFavHistory;
    private javax.swing.JPanel PnlCenter;
    private javax.swing.JPanel PnlFav1;
    private javax.swing.JPanel PnlFav10;
    private javax.swing.JPanel PnlFav11;
    private javax.swing.JPanel PnlFav12;
    private javax.swing.JPanel PnlFav2;
    private javax.swing.JPanel PnlFav3;
    private javax.swing.JPanel PnlFav4;
    private javax.swing.JPanel PnlFav5;
    private javax.swing.JPanel PnlFav6;
    private javax.swing.JPanel PnlFav7;
    private javax.swing.JPanel PnlFav8;
    private javax.swing.JPanel PnlFav9;
    private javax.swing.JPanel PnlHistoryLbl;
    private javax.swing.JScrollPane ScrollPanel;
    // End of variables declaration//GEN-END:variables
}
