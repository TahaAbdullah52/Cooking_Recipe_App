/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.cookingrecipeapplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;

public class DashboardPanel extends javax.swing.JPanel {

    private MainView mainView;
    DataBaseConnection dbClass;
    Connection conn;

    Color hoverColor, defaultColor;

    public DashboardPanel(MainView mainview) {
        this.mainView = mainview;

        dbClass = new DataBaseConnection();
        try {
            conn = dbClass.GetConnection();
        } catch (Exception e) {
            System.err.println("Failed to connect to the database: " + e.getMessage());
        }

        initComponents();
        FavourtitesCount();

        hoverColor = new Color(255, 186, 8);
        defaultColor = new Color(210, 68, 0);

        searchTxtbox.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                showSuggestions(searchTxtbox, dropdown);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                showSuggestions(searchTxtbox, dropdown);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                showSuggestions(searchTxtbox, dropdown);
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dropdown = new javax.swing.JPopupMenu();
        pnlCenter = new javax.swing.JPanel();
        pnlCTop = new javax.swing.JPanel();
        searchTxtbox = new javax.swing.JTextField();
        PnlSearch = new javax.swing.JPanel();
        BtnSearch = new javax.swing.JButton();
        pnlCCenter = new javax.swing.JPanel();
        PnlHeader = new javax.swing.JPanel();
        LblHeader = new javax.swing.JLabel();
        PnlCategories = new javax.swing.JPanel();
        PnlPasta = new javax.swing.JPanel();
        LblPasta = new javax.swing.JLabel();
        BtnPasta = new javax.swing.JButton();
        PnlAppetizer = new javax.swing.JPanel();
        LblAppetizer = new javax.swing.JLabel();
        BtnAppetizer = new javax.swing.JButton();
        PnlDessert = new javax.swing.JPanel();
        LblDessert = new javax.swing.JLabel();
        BtnDessert = new javax.swing.JButton();
        PnlMainCourse = new javax.swing.JPanel();
        LblMainCourse = new javax.swing.JLabel();
        BtnMainCourse = new javax.swing.JButton();
        PnlSoup = new javax.swing.JPanel();
        LblSoup = new javax.swing.JLabel();
        BtnSoup = new javax.swing.JButton();
        PnlSalad = new javax.swing.JPanel();
        LblSalad = new javax.swing.JLabel();
        BtnSalad = new javax.swing.JButton();
        pnlCBottom = new javax.swing.JPanel();
        PnlRecipeCount = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PnlIngridientCount = new javax.swing.JPanel();
        LblIngridientCount = new javax.swing.JLabel();
        PnlMealCount = new javax.swing.JPanel();
        jLabelFavCount = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        pnlCenter.setBackground(new java.awt.Color(255, 102, 0));
        pnlCenter.setPreferredSize(new java.awt.Dimension(1350, 800));
        pnlCenter.setLayout(new java.awt.BorderLayout());

        pnlCTop.setBackground(new java.awt.Color(214, 217, 223));
        pnlCTop.setMinimumSize(new java.awt.Dimension(100, 200));
        pnlCTop.setName(""); // NOI18N
        pnlCTop.setPreferredSize(new java.awt.Dimension(1350, 100));

        searchTxtbox.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        searchTxtbox.setForeground(new java.awt.Color(51, 51, 51));
        searchTxtbox.setText("  Search Recipes");
        searchTxtbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTxtboxMouseClicked(evt);
            }
        });

        PnlSearch.setBackground(new java.awt.Color(210, 68, 0));

        BtnSearch.setBackground(new java.awt.Color(210, 68, 0));
        BtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/White_search-line (2).png"))); // NOI18N
        BtnSearch.setToolTipText("");
        BtnSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BtnSearch.setBorderPainted(false);
        BtnSearch.setContentAreaFilled(false);
        BtnSearch.setFocusPainted(false);
        BtnSearch.setOpaque(true);
        BtnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnSearchMouseExited(evt);
            }
        });
        BtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlSearchLayout = new javax.swing.GroupLayout(PnlSearch);
        PnlSearch.setLayout(PnlSearchLayout);
        PnlSearchLayout.setHorizontalGroup(
            PnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSearchLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        PnlSearchLayout.setVerticalGroup(
            PnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSearchLayout.createSequentialGroup()
                .addComponent(BtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCTopLayout = new javax.swing.GroupLayout(pnlCTop);
        pnlCTop.setLayout(pnlCTopLayout);
        pnlCTopLayout.setHorizontalGroup(
            pnlCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCTopLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(searchTxtbox, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(PnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        pnlCTopLayout.setVerticalGroup(
            pnlCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCTopLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pnlCenter.add(pnlCTop, java.awt.BorderLayout.NORTH);

        pnlCCenter.setBackground(new java.awt.Color(255, 255, 255));
        pnlCCenter.setForeground(new java.awt.Color(102, 102, 102));
        pnlCCenter.setFocusCycleRoot(true);
        pnlCCenter.setMinimumSize(new java.awt.Dimension(100, 50));
        pnlCCenter.setPreferredSize(new java.awt.Dimension(0, 100));
        pnlCCenter.setLayout(new java.awt.BorderLayout());

        PnlHeader.setBackground(new java.awt.Color(255, 255, 255));
        PnlHeader.setPreferredSize(new java.awt.Dimension(498, 100));

        LblHeader.setBackground(new java.awt.Color(255, 255, 255));
        LblHeader.setFont(new java.awt.Font("Vivaldi", 1, 42)); // NOI18N
        LblHeader.setForeground(new java.awt.Color(210, 68, 0));
        LblHeader.setText("So Chef What's Cooking ???");

        javax.swing.GroupLayout PnlHeaderLayout = new javax.swing.GroupLayout(PnlHeader);
        PnlHeader.setLayout(PnlHeaderLayout);
        PnlHeaderLayout.setHorizontalGroup(
            PnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlHeaderLayout.setVerticalGroup(
            PnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCCenter.add(PnlHeader, java.awt.BorderLayout.NORTH);

        PnlCategories.setBackground(new java.awt.Color(255, 255, 255));

        PnlPasta.setBackground(new java.awt.Color(210, 68, 0));

        LblPasta.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        LblPasta.setForeground(new java.awt.Color(255, 255, 255));
        LblPasta.setText("Pasta");
        LblPasta.setToolTipText("");
        LblPasta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        BtnPasta.setBackground(new java.awt.Color(210, 68, 0));
        BtnPasta.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        BtnPasta.setForeground(new java.awt.Color(255, 255, 255));
        BtnPasta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pasta_rsz_115533.jpg"))); // NOI18N
        BtnPasta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnPasta.setContentAreaFilled(false);
        BtnPasta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPasta.setFocusPainted(false);
        BtnPasta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnPasta.setOpaque(true);
        BtnPasta.setPreferredSize(new java.awt.Dimension(80, 40));
        BtnPasta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnPasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnPastaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnPastaMouseExited(evt);
            }
        });
        BtnPasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPastaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlPastaLayout = new javax.swing.GroupLayout(PnlPasta);
        PnlPasta.setLayout(PnlPastaLayout);
        PnlPastaLayout.setHorizontalGroup(
            PnlPastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnPasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPastaLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(LblPasta, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        PnlPastaLayout.setVerticalGroup(
            PnlPastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPastaLayout.createSequentialGroup()
                .addComponent(BtnPasta, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblPasta))
        );

        PnlAppetizer.setBackground(new java.awt.Color(210, 68, 0));

        LblAppetizer.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        LblAppetizer.setForeground(new java.awt.Color(255, 255, 255));
        LblAppetizer.setText("Appetizer");
        LblAppetizer.setToolTipText("");
        LblAppetizer.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        BtnAppetizer.setBackground(new java.awt.Color(210, 68, 0));
        BtnAppetizer.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        BtnAppetizer.setForeground(new java.awt.Color(255, 255, 255));
        BtnAppetizer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Appetizer_rsz_116498.jpg"))); // NOI18N
        BtnAppetizer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAppetizer.setContentAreaFilled(false);
        BtnAppetizer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAppetizer.setFocusPainted(false);
        BtnAppetizer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAppetizer.setOpaque(true);
        BtnAppetizer.setPreferredSize(new java.awt.Dimension(80, 40));
        BtnAppetizer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAppetizer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAppetizerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAppetizerMouseExited(evt);
            }
        });
        BtnAppetizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAppetizerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlAppetizerLayout = new javax.swing.GroupLayout(PnlAppetizer);
        PnlAppetizer.setLayout(PnlAppetizerLayout);
        PnlAppetizerLayout.setHorizontalGroup(
            PnlAppetizerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlAppetizerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblAppetizer, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PnlAppetizerLayout.createSequentialGroup()
                .addComponent(BtnAppetizer, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PnlAppetizerLayout.setVerticalGroup(
            PnlAppetizerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlAppetizerLayout.createSequentialGroup()
                .addComponent(BtnAppetizer, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblAppetizer))
        );

        PnlDessert.setBackground(new java.awt.Color(210, 68, 0));

        LblDessert.setBackground(new java.awt.Color(210, 68, 0));
        LblDessert.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        LblDessert.setForeground(new java.awt.Color(255, 255, 255));
        LblDessert.setText("Dessert");
        LblDessert.setToolTipText("");
        LblDessert.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        BtnDessert.setBackground(new java.awt.Color(210, 68, 0));
        BtnDessert.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        BtnDessert.setForeground(new java.awt.Color(255, 255, 255));
        BtnDessert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dessert-ezgif.com-resize.jpg"))); // NOI18N
        BtnDessert.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnDessert.setContentAreaFilled(false);
        BtnDessert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDessert.setFocusPainted(false);
        BtnDessert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnDessert.setOpaque(true);
        BtnDessert.setPreferredSize(new java.awt.Dimension(80, 40));
        BtnDessert.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnDessert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnDessertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnDessertMouseExited(evt);
            }
        });
        BtnDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDessertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlDessertLayout = new javax.swing.GroupLayout(PnlDessert);
        PnlDessert.setLayout(PnlDessertLayout);
        PnlDessertLayout.setHorizontalGroup(
            PnlDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDessertLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(LblDessert, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addComponent(BtnDessert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PnlDessertLayout.setVerticalGroup(
            PnlDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDessertLayout.createSequentialGroup()
                .addComponent(BtnDessert, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblDessert))
        );

        PnlMainCourse.setBackground(new java.awt.Color(210, 68, 0));

        LblMainCourse.setBackground(new java.awt.Color(255, 165, 0));
        LblMainCourse.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        LblMainCourse.setForeground(new java.awt.Color(255, 255, 255));
        LblMainCourse.setText("Main Course");
        LblMainCourse.setToolTipText("");
        LblMainCourse.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        BtnMainCourse.setBackground(new java.awt.Color(210, 68, 0));
        BtnMainCourse.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        BtnMainCourse.setForeground(new java.awt.Color(255, 255, 255));
        BtnMainCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main_Course-ezgif.com-resize.jpg"))); // NOI18N
        BtnMainCourse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnMainCourse.setContentAreaFilled(false);
        BtnMainCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMainCourse.setFocusPainted(false);
        BtnMainCourse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnMainCourse.setOpaque(true);
        BtnMainCourse.setPreferredSize(new java.awt.Dimension(80, 40));
        BtnMainCourse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnMainCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnMainCourseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnMainCourseMouseExited(evt);
            }
        });
        BtnMainCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMainCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlMainCourseLayout = new javax.swing.GroupLayout(PnlMainCourse);
        PnlMainCourse.setLayout(PnlMainCourseLayout);
        PnlMainCourseLayout.setHorizontalGroup(
            PnlMainCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMainCourseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblMainCourse)
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(BtnMainCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PnlMainCourseLayout.setVerticalGroup(
            PnlMainCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlMainCourseLayout.createSequentialGroup()
                .addComponent(BtnMainCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(LblMainCourse))
        );

        PnlSoup.setBackground(new java.awt.Color(210, 68, 0));

        LblSoup.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        LblSoup.setForeground(new java.awt.Color(255, 255, 255));
        LblSoup.setText("Soup");
        LblSoup.setToolTipText("");
        LblSoup.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        BtnSoup.setBackground(new java.awt.Color(210, 68, 0));
        BtnSoup.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        BtnSoup.setForeground(new java.awt.Color(255, 255, 255));
        BtnSoup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Soup_rsz_131990.jpg"))); // NOI18N
        BtnSoup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSoup.setContentAreaFilled(false);
        BtnSoup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSoup.setFocusPainted(false);
        BtnSoup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSoup.setOpaque(true);
        BtnSoup.setPreferredSize(new java.awt.Dimension(80, 40));
        BtnSoup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSoup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnSoupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnSoupMouseExited(evt);
            }
        });
        BtnSoup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSoupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlSoupLayout = new javax.swing.GroupLayout(PnlSoup);
        PnlSoup.setLayout(PnlSoupLayout);
        PnlSoupLayout.setHorizontalGroup(
            PnlSoupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnSoup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSoupLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(LblSoup, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        PnlSoupLayout.setVerticalGroup(
            PnlSoupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSoupLayout.createSequentialGroup()
                .addComponent(BtnSoup, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblSoup))
        );

        PnlSalad.setBackground(new java.awt.Color(210, 68, 0));

        LblSalad.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        LblSalad.setForeground(new java.awt.Color(255, 255, 255));
        LblSalad.setText("Salad");
        LblSalad.setToolTipText("");
        LblSalad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        BtnSalad.setBackground(new java.awt.Color(210, 68, 0));
        BtnSalad.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        BtnSalad.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Salad_rsz_15127.jpg"))); // NOI18N
        BtnSalad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSalad.setContentAreaFilled(false);
        BtnSalad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalad.setFocusPainted(false);
        BtnSalad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSalad.setOpaque(true);
        BtnSalad.setPreferredSize(new java.awt.Dimension(80, 40));
        BtnSalad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSalad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnSaladMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnSaladMouseExited(evt);
            }
        });
        BtnSalad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaladActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlSaladLayout = new javax.swing.GroupLayout(PnlSalad);
        PnlSalad.setLayout(PnlSaladLayout);
        PnlSaladLayout.setHorizontalGroup(
            PnlSaladLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnSalad, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSaladLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblSalad, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        PnlSaladLayout.setVerticalGroup(
            PnlSaladLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSaladLayout.createSequentialGroup()
                .addComponent(BtnSalad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(LblSalad))
        );

        javax.swing.GroupLayout PnlCategoriesLayout = new javax.swing.GroupLayout(PnlCategories);
        PnlCategories.setLayout(PnlCategoriesLayout);
        PnlCategoriesLayout.setHorizontalGroup(
            PnlCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCategoriesLayout.createSequentialGroup()
                .addContainerGap(354, Short.MAX_VALUE)
                .addGroup(PnlCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlPasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlAppetizer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116)
                .addGroup(PnlCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PnlCategoriesLayout.createSequentialGroup()
                        .addComponent(PnlMainCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PnlSalad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlCategoriesLayout.createSequentialGroup()
                        .addComponent(PnlDessert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(PnlSoup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(354, Short.MAX_VALUE))
        );
        PnlCategoriesLayout.setVerticalGroup(
            PnlCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCategoriesLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(PnlCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlCategoriesLayout.createSequentialGroup()
                        .addGroup(PnlCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PnlDessert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PnlSoup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(PnlCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PnlMainCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PnlSalad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PnlCategoriesLayout.createSequentialGroup()
                        .addComponent(PnlPasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(PnlAppetizer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlCCenter.add(PnlCategories, java.awt.BorderLayout.CENTER);

        pnlCenter.add(pnlCCenter, java.awt.BorderLayout.CENTER);

        pnlCBottom.setBackground(new java.awt.Color(255, 255, 255));
        pnlCBottom.setPreferredSize(new java.awt.Dimension(0, 185));

        PnlRecipeCount.setBackground(new java.awt.Color(210, 68, 0));

        jLabel1.setBackground(new java.awt.Color(36, 0, 70));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html><font size='7'><b>12</font><br><font size='5'>Recipes Available</font></html>");

        javax.swing.GroupLayout PnlRecipeCountLayout = new javax.swing.GroupLayout(PnlRecipeCount);
        PnlRecipeCount.setLayout(PnlRecipeCountLayout);
        PnlRecipeCountLayout.setHorizontalGroup(
            PnlRecipeCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlRecipeCountLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PnlRecipeCountLayout.setVerticalGroup(
            PnlRecipeCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRecipeCountLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PnlIngridientCount.setBackground(new java.awt.Color(210, 68, 0));

        LblIngridientCount.setBackground(new java.awt.Color(255, 165, 0));
        LblIngridientCount.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        LblIngridientCount.setForeground(new java.awt.Color(255, 255, 255));
        LblIngridientCount.setText("<html><font size='7'><b>115 +</font><br><font size='5'>Ingredients Available</font></html>");

        javax.swing.GroupLayout PnlIngridientCountLayout = new javax.swing.GroupLayout(PnlIngridientCount);
        PnlIngridientCount.setLayout(PnlIngridientCountLayout);
        PnlIngridientCountLayout.setHorizontalGroup(
            PnlIngridientCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlIngridientCountLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LblIngridientCount, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlIngridientCountLayout.setVerticalGroup(
            PnlIngridientCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlIngridientCountLayout.createSequentialGroup()
                .addComponent(LblIngridientCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        PnlMealCount.setBackground(new java.awt.Color(210, 68, 0));

        jLabelFavCount.setBackground(new java.awt.Color(255, 165, 0));
        jLabelFavCount.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelFavCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFavCount.setText("<html><font size='7'><b>5</font><br><font size='5'>Your Favourites</font></html>");

        javax.swing.GroupLayout PnlMealCountLayout = new javax.swing.GroupLayout(PnlMealCount);
        PnlMealCount.setLayout(PnlMealCountLayout);
        PnlMealCountLayout.setHorizontalGroup(
            PnlMealCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlMealCountLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabelFavCount, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PnlMealCountLayout.setVerticalGroup(
            PnlMealCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMealCountLayout.createSequentialGroup()
                .addComponent(jLabelFavCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCBottomLayout = new javax.swing.GroupLayout(pnlCBottom);
        pnlCBottom.setLayout(pnlCBottomLayout);
        pnlCBottomLayout.setHorizontalGroup(
            pnlCBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCBottomLayout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addComponent(PnlRecipeCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(PnlIngridientCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(PnlMealCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        pnlCBottomLayout.setVerticalGroup(
            pnlCBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCBottomLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(pnlCBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlRecipeCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlIngridientCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlMealCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pnlCenter.add(pnlCBottom, java.awt.BorderLayout.SOUTH);

        add(pnlCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public void FavourtitesCount() {
        if (conn != null) {
            try {
                String query = "SELECT * FROM recipe WHERE is_Favourite = ?";
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setString(1, "true");
                ResultSet rs = pstmt.executeQuery();

                int count = 0;
                while (rs.next()) {
                    count++;
                }
                jLabelFavCount.setText("<html><font size='7'><b>" + count
                        + "</font><br><font size='5'>Your Favourites</font></html>");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void showSuggestions(JTextField searchField, JPopupMenu dropdown) {
        String searchText = searchField.getText();

        if (searchText.isEmpty()) {
            dropdown.setVisible(false);
            return;
        }

        ArrayList<String> recipes = fetchRecipes(searchText);

        dropdown.removeAll(); // Clear previous suggestions

        for (String recipe : recipes) {
            JMenuItem item = new JMenuItem(recipe);
            item.setPreferredSize(new Dimension(200, 35));
            item.setFont(new Font("Calibri", Font.PLAIN, 14));
            
            item.addActionListener(e -> {
                searchField.setText(recipe);
                dropdown.setVisible(false);
                // Perform further actions like showing recipe details
            });
            dropdown.add(item);
        }

        if (!recipes.isEmpty()) {
            int itemHeight = 35; 
            int maxVisibleItems = 5; 
            int popupHeight = Math.min(recipes.size(), maxVisibleItems) * itemHeight;
            dropdown.setPreferredSize(new Dimension(200, popupHeight));
            dropdown.show(searchField, 0, searchField.getHeight());
            SwingUtilities.invokeLater(() -> searchField.requestFocusInWindow());
        } else {
            dropdown.setVisible(false);
        }
    }

    private ArrayList<String> fetchRecipes(String searchText) {
        ArrayList<String> recipes = new ArrayList<>();
        String query = "SELECT RecipeName FROM recipe WHERE RecipeName LIKE ?";

        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
             pstmt.setString(1, searchText + "%");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                recipes.add(rs.getString("RecipeName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return recipes;
    }

    private void BtnPastaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPastaMouseEntered
        BtnPasta.setBorder(new LineBorder(hoverColor, 3));// TODO add your handling code here:
    }//GEN-LAST:event_BtnPastaMouseEntered

    private void BtnPastaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPastaMouseExited
        BtnPasta.setBorder(new LineBorder(defaultColor, 3));// TODO add your handling code here:
    }//GEN-LAST:event_BtnPastaMouseExited

    private void BtnDessertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDessertMouseEntered
        BtnDessert.setBorder(new LineBorder(hoverColor, 3));
    }//GEN-LAST:event_BtnDessertMouseEntered

    private void BtnDessertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDessertMouseExited
        BtnDessert.setBorder(new LineBorder(defaultColor, 3));
    }//GEN-LAST:event_BtnDessertMouseExited

    private void BtnSoupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSoupMouseEntered
        BtnSoup.setBorder(new LineBorder(hoverColor, 3));
    }//GEN-LAST:event_BtnSoupMouseEntered

    private void BtnSoupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSoupMouseExited
        BtnSoup.setBorder(new LineBorder(defaultColor, 3));
    }//GEN-LAST:event_BtnSoupMouseExited

    private void BtnAppetizerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAppetizerMouseEntered
        BtnAppetizer.setBorder(new LineBorder(hoverColor, 3));
    }//GEN-LAST:event_BtnAppetizerMouseEntered

    private void BtnAppetizerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAppetizerMouseExited
        BtnAppetizer.setBorder(new LineBorder(defaultColor, 3));
    }//GEN-LAST:event_BtnAppetizerMouseExited

    private void BtnMainCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMainCourseMouseEntered
        BtnMainCourse.setBorder(new LineBorder(hoverColor, 3));
    }//GEN-LAST:event_BtnMainCourseMouseEntered

    private void BtnMainCourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMainCourseMouseExited
        BtnMainCourse.setBorder(new LineBorder(defaultColor, 3));
    }//GEN-LAST:event_BtnMainCourseMouseExited

    private void BtnSaladMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSaladMouseEntered
        BtnSalad.setBorder(new LineBorder(hoverColor, 3));
    }//GEN-LAST:event_BtnSaladMouseEntered

    private void BtnSaladMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSaladMouseExited
        BtnSalad.setBorder(new LineBorder(defaultColor, 3));
    }//GEN-LAST:event_BtnSaladMouseExited

    private void BtnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSearchMouseExited
        URL imageUrl = getClass().getClassLoader().getResource("images/White_search-line (2).png");
        ImageIcon icon = new ImageIcon(imageUrl);
        BtnSearch.setIcon(icon);
    }//GEN-LAST:event_BtnSearchMouseExited

    //Action of Buttons

    private void BtnPastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPastaActionPerformed
        mainView.showFilteredRecipe("Pasta");
    }//GEN-LAST:event_BtnPastaActionPerformed

    private void BtnDessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDessertActionPerformed
        mainView.showFilteredRecipe("Dessert");
    }//GEN-LAST:event_BtnDessertActionPerformed

    private void BtnSoupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSoupActionPerformed
        mainView.showFilteredRecipe("Soup");
    }//GEN-LAST:event_BtnSoupActionPerformed

    private void BtnAppetizerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAppetizerActionPerformed
        mainView.showFilteredRecipe("Appetizer");
    }//GEN-LAST:event_BtnAppetizerActionPerformed

    private void BtnMainCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMainCourseActionPerformed
        mainView.showFilteredRecipe("Main Course");
    }//GEN-LAST:event_BtnMainCourseActionPerformed

    private void BtnSaladActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaladActionPerformed
        mainView.showFilteredRecipe("Salad");
    }//GEN-LAST:event_BtnSaladActionPerformed

    private void BtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchActionPerformed
        if(conn!=null   &&  !"".equals(searchTxtbox.getText())  &&  !"  Search Recipes".equals(searchTxtbox.getText())){
            try{
                String query = "SELECT RecipeID FROM recipe WHERE RecipeName = ?";
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setString(1,searchTxtbox.getText() );
                ResultSet rs = pstmt.executeQuery();

                int recipeID =0;
                while(rs.next()){
                    recipeID = rs.getInt("RecipeID");
                }

                searchTxtbox.setText("");
                mainView.showSingleRecipe(recipeID);
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please type the food you want to search");
        }
    }//GEN-LAST:event_BtnSearchActionPerformed

    private void searchTxtboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTxtboxMouseClicked
        searchTxtbox.setText("");
    }//GEN-LAST:event_searchTxtboxMouseClicked

    private void BtnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSearchMouseEntered
        URL imageUrl = getClass().getClassLoader().getResource("images/Yellow_search-line (2).png");
        ImageIcon icon = new ImageIcon(imageUrl);
        BtnSearch.setIcon(icon);
    }//GEN-LAST:event_BtnSearchMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAppetizer;
    private javax.swing.JButton BtnDessert;
    private javax.swing.JButton BtnMainCourse;
    private javax.swing.JButton BtnPasta;
    private javax.swing.JButton BtnSalad;
    private javax.swing.JButton BtnSearch;
    private javax.swing.JButton BtnSoup;
    private javax.swing.JLabel LblAppetizer;
    private javax.swing.JLabel LblDessert;
    private javax.swing.JLabel LblHeader;
    private javax.swing.JLabel LblIngridientCount;
    private javax.swing.JLabel LblMainCourse;
    private javax.swing.JLabel LblPasta;
    private javax.swing.JLabel LblSalad;
    private javax.swing.JLabel LblSoup;
    private javax.swing.JPanel PnlAppetizer;
    private javax.swing.JPanel PnlCategories;
    private javax.swing.JPanel PnlDessert;
    private javax.swing.JPanel PnlHeader;
    private javax.swing.JPanel PnlIngridientCount;
    private javax.swing.JPanel PnlMainCourse;
    private javax.swing.JPanel PnlMealCount;
    private javax.swing.JPanel PnlPasta;
    private javax.swing.JPanel PnlRecipeCount;
    private javax.swing.JPanel PnlSalad;
    private javax.swing.JPanel PnlSearch;
    private javax.swing.JPanel PnlSoup;
    private javax.swing.JPopupMenu dropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFavCount;
    private javax.swing.JPanel pnlCBottom;
    private javax.swing.JPanel pnlCCenter;
    private javax.swing.JPanel pnlCTop;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JTextField searchTxtbox;
    // End of variables declaration//GEN-END:variables
}
