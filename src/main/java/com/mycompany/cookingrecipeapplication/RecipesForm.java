/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.cookingrecipeapplication;

import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class RecipesForm extends javax.swing.JPanel {

   Color defaultColor,hoverColor;
   Border hoverBorder,defaultBorder;
   
   private MainView mainView;
   String SelectedRecipe;
   
    public RecipesForm(MainView mainview) {
        initComponents();
         this.mainView = mainview;
        
        hoverColor = new Color(255, 186, 8);
        defaultColor = new Color(210,68,0);
        
         hoverBorder = new LineBorder(hoverColor, 3);
        defaultBorder = new LineBorder(defaultColor, 3);
        
        BtnPastaFazool.setBorder(defaultBorder);
        BtnBowlCake.setBorder(defaultBorder);
        BtnBreadPudding.setBorder(defaultBorder);
        BtnCauliSoup.setBorder(defaultBorder);
        BtnBangBurger.setBorder(defaultBorder);
        BtnBrickPizza.setBorder(defaultBorder);
        BtnMurgMakhni.setBorder(defaultBorder);
        BtnAvocadoSalad.setBorder(defaultBorder);
        BtnSirloinSteak.setBorder(defaultBorder);
        BtnTuscanFish.setBorder(defaultBorder);
        BtnButtermilkPancake.setBorder(defaultBorder);
        BtnMarrySoup.setBorder(defaultBorder);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlTop = new javax.swing.JPanel();
        LblHeader = new javax.swing.JLabel();
        ScrollPanel = new javax.swing.JScrollPane();
        PnlCenter = new javax.swing.JPanel();
        PnlPastaFazool = new javax.swing.JPanel();
        BtnPastaFazool = new javax.swing.JButton();
        LblPastaFazool = new javax.swing.JLabel();
        PnlBowlCake = new javax.swing.JPanel();
        BtnBowlCake = new javax.swing.JButton();
        LblBowlCake = new javax.swing.JLabel();
        PnlBreadPudding = new javax.swing.JPanel();
        BtnBreadPudding = new javax.swing.JButton();
        LblButtonPudiing = new javax.swing.JLabel();
        PnlBangBurger = new javax.swing.JPanel();
        BtnBangBurger = new javax.swing.JButton();
        LblBangBurger = new javax.swing.JLabel();
        PnlCauliSoup = new javax.swing.JPanel();
        BtnCauliSoup = new javax.swing.JButton();
        LblCauliSoup = new javax.swing.JLabel();
        PnlBrickPizza = new javax.swing.JPanel();
        BtnBrickPizza = new javax.swing.JButton();
        LblBrickPizza = new javax.swing.JLabel();
        PnlMurgMakhni = new javax.swing.JPanel();
        BtnMurgMakhni = new javax.swing.JButton();
        LblMurgMakhni = new javax.swing.JLabel();
        PnlAvocadoSalad = new javax.swing.JPanel();
        BtnAvocadoSalad = new javax.swing.JButton();
        LblAvocadoSalad = new javax.swing.JLabel();
        PnlTuscanFishStew = new javax.swing.JPanel();
        BtnTuscanFish = new javax.swing.JButton();
        LblTuscanFish = new javax.swing.JLabel();
        PnlSirloinSteak = new javax.swing.JPanel();
        BtnSirloinSteak = new javax.swing.JButton();
        LblSirloinSteak = new javax.swing.JLabel();
        PnlButtermilkPancake = new javax.swing.JPanel();
        BtnButtermilkPancake = new javax.swing.JButton();
        LblButtermilkPancake = new javax.swing.JLabel();
        PnlMarrySoup = new javax.swing.JPanel();
        BtnMarrySoup = new javax.swing.JButton();
        LblMarrySoup = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1350, 1300));
        setLayout(new java.awt.BorderLayout());

        PnlTop.setBackground(new java.awt.Color(214, 217, 223));
        PnlTop.setPreferredSize(new java.awt.Dimension(1350, 100));

        LblHeader.setBackground(new java.awt.Color(255, 255, 255));
        LblHeader.setFont(new java.awt.Font("Calibri", 2, 36)); // NOI18N
        LblHeader.setForeground(new java.awt.Color(51, 51, 51));
        LblHeader.setText("All Recipes");

        javax.swing.GroupLayout PnlTopLayout = new javax.swing.GroupLayout(PnlTop);
        PnlTop.setLayout(PnlTopLayout);
        PnlTopLayout.setHorizontalGroup(
            PnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTopLayout.createSequentialGroup()
                .addContainerGap(597, Short.MAX_VALUE)
                .addComponent(LblHeader)
                .addContainerGap(598, Short.MAX_VALUE))
        );
        PnlTopLayout.setVerticalGroup(
            PnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTopLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LblHeader)
                .addGap(29, 29, 29))
        );

        add(PnlTop, java.awt.BorderLayout.NORTH);

        PnlCenter.setBackground(new java.awt.Color(255, 255, 255));
        PnlCenter.setPreferredSize(new java.awt.Dimension(1400, 1300));

        PnlPastaFazool.setBackground(new java.awt.Color(210, 68, 0));
        PnlPastaFazool.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlPastaFazool.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnPastaFazool.setBackground(new java.awt.Color(210, 68, 0));
        BtnPastaFazool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pasta_Fazool_2-ezgif.com-webp-to-jpg-converter.jpg"))); // NOI18N
        BtnPastaFazool.setContentAreaFilled(false);
        BtnPastaFazool.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPastaFazool.setFocusPainted(false);
        BtnPastaFazool.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnPastaFazool.setOpaque(true);
        BtnPastaFazool.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnPastaFazool.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnPastaFazoolMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnPastaFazoolMouseExited(evt);
            }
        });
        BtnPastaFazool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPastaFazoolActionPerformed(evt);
            }
        });

        LblPastaFazool.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblPastaFazool.setForeground(new java.awt.Color(255, 255, 255));
        LblPastaFazool.setText("<html><font size='6'><b>Pasta Fazool</b></font><br><span style='color: #e0e0e0; font-size: 10px;'>Calories: 888</span></html>");

        javax.swing.GroupLayout PnlPastaFazoolLayout = new javax.swing.GroupLayout(PnlPastaFazool);
        PnlPastaFazool.setLayout(PnlPastaFazoolLayout);
        PnlPastaFazoolLayout.setHorizontalGroup(
            PnlPastaFazoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPastaFazoolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlPastaFazoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblPastaFazool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPastaFazool))
                .addGap(13, 13, 13))
        );
        PnlPastaFazoolLayout.setVerticalGroup(
            PnlPastaFazoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPastaFazoolLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BtnPastaFazool)
                .addGap(18, 18, 18)
                .addComponent(LblPastaFazool, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        PnlBowlCake.setBackground(new java.awt.Color(210, 68, 0));
        PnlBowlCake.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlBowlCake.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnBowlCake.setBackground(new java.awt.Color(210, 68, 0));
        BtnBowlCake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bowl_ChocoCake-ezgif.com-resize.jpg"))); // NOI18N
        BtnBowlCake.setContentAreaFilled(false);
        BtnBowlCake.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBowlCake.setFocusPainted(false);
        BtnBowlCake.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnBowlCake.setOpaque(true);
        BtnBowlCake.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnBowlCake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnBowlCakeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnBowlCakeMouseExited(evt);
            }
        });
        BtnBowlCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBowlCakeActionPerformed(evt);
            }
        });

        LblBowlCake.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblBowlCake.setForeground(new java.awt.Color(255, 255, 255));
        LblBowlCake.setText("<html><font size='6'><b>Bowl Chocolate Cake</b></font><br><span style='color: #e0e0e0; font-size: 10px;'>Calories: 160</span></html>");

        javax.swing.GroupLayout PnlBowlCakeLayout = new javax.swing.GroupLayout(PnlBowlCake);
        PnlBowlCake.setLayout(PnlBowlCakeLayout);
        PnlBowlCakeLayout.setHorizontalGroup(
            PnlBowlCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBowlCakeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlBowlCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlBowlCakeLayout.createSequentialGroup()
                        .addComponent(BtnBowlCake, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(LblBowlCake, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnlBowlCakeLayout.setVerticalGroup(
            PnlBowlCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBowlCakeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BtnBowlCake)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(LblBowlCake, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlBreadPudding.setBackground(new java.awt.Color(210, 68, 0));
        PnlBreadPudding.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlBreadPudding.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnBreadPudding.setBackground(new java.awt.Color(210, 68, 0));
        BtnBreadPudding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bread_pudding-ezgif.com-resize.jpg"))); // NOI18N
        BtnBreadPudding.setContentAreaFilled(false);
        BtnBreadPudding.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBreadPudding.setFocusPainted(false);
        BtnBreadPudding.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnBreadPudding.setOpaque(true);
        BtnBreadPudding.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnBreadPudding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnBreadPuddingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnBreadPuddingMouseExited(evt);
            }
        });
        BtnBreadPudding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBreadPuddingActionPerformed(evt);
            }
        });

        LblButtonPudiing.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblButtonPudiing.setForeground(new java.awt.Color(255, 255, 255));
        LblButtonPudiing.setText("<html><font size='6'><b>Bread Pudding</b></font><br><span style='color: #e0e0e0; font-size: 10px;'>Calories: 546</span></html>");

        javax.swing.GroupLayout PnlBreadPuddingLayout = new javax.swing.GroupLayout(PnlBreadPudding);
        PnlBreadPudding.setLayout(PnlBreadPuddingLayout);
        PnlBreadPuddingLayout.setHorizontalGroup(
            PnlBreadPuddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBreadPuddingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlBreadPuddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblButtonPudiing, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBreadPudding))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PnlBreadPuddingLayout.setVerticalGroup(
            PnlBreadPuddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBreadPuddingLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BtnBreadPudding, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblButtonPudiing, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        PnlBangBurger.setBackground(new java.awt.Color(210, 68, 0));
        PnlBangBurger.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlBangBurger.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnBangBurger.setBackground(new java.awt.Color(210, 68, 0));
        BtnBangBurger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Burger-ezgif.com-resize.jpg"))); // NOI18N
        BtnBangBurger.setContentAreaFilled(false);
        BtnBangBurger.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBangBurger.setFocusPainted(false);
        BtnBangBurger.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnBangBurger.setOpaque(true);
        BtnBangBurger.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnBangBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnBangBurgerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnBangBurgerMouseExited(evt);
            }
        });
        BtnBangBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBangBurgerActionPerformed(evt);
            }
        });

        LblBangBurger.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblBangBurger.setForeground(new java.awt.Color(255, 255, 255));
        LblBangBurger.setText("<html><font size='6'><b>Bang Bang Burger</b></font><br><span style='color: #e0e0e0; font-size: 10px;'>Calories: 1066</span></html>");

        javax.swing.GroupLayout PnlBangBurgerLayout = new javax.swing.GroupLayout(PnlBangBurger);
        PnlBangBurger.setLayout(PnlBangBurgerLayout);
        PnlBangBurgerLayout.setHorizontalGroup(
            PnlBangBurgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBangBurgerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlBangBurgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblBangBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBangBurger))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PnlBangBurgerLayout.setVerticalGroup(
            PnlBangBurgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBangBurgerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BtnBangBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblBangBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        PnlCauliSoup.setBackground(new java.awt.Color(210, 68, 0));
        PnlCauliSoup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlCauliSoup.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnCauliSoup.setBackground(new java.awt.Color(210, 68, 0));
        BtnCauliSoup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cauliflower_soup-ezgif.com-resize.jpg"))); // NOI18N
        BtnCauliSoup.setContentAreaFilled(false);
        BtnCauliSoup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCauliSoup.setFocusPainted(false);
        BtnCauliSoup.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnCauliSoup.setOpaque(true);
        BtnCauliSoup.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnCauliSoup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCauliSoupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCauliSoupMouseExited(evt);
            }
        });
        BtnCauliSoup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCauliSoupActionPerformed(evt);
            }
        });

        LblCauliSoup.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblCauliSoup.setForeground(new java.awt.Color(255, 255, 255));
        LblCauliSoup.setText("<html><font size='6'><b>Cauliflower Soup</b></font><br><span style='color: #e0e0e0; font-size: 10px;'>Calories: 348</span></html>");

        javax.swing.GroupLayout PnlCauliSoupLayout = new javax.swing.GroupLayout(PnlCauliSoup);
        PnlCauliSoup.setLayout(PnlCauliSoupLayout);
        PnlCauliSoupLayout.setHorizontalGroup(
            PnlCauliSoupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCauliSoupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlCauliSoupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblCauliSoup, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCauliSoup))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PnlCauliSoupLayout.setVerticalGroup(
            PnlCauliSoupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCauliSoupLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BtnCauliSoup, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblCauliSoup, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        PnlBrickPizza.setBackground(new java.awt.Color(210, 68, 0));
        PnlBrickPizza.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlBrickPizza.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnBrickPizza.setBackground(new java.awt.Color(210, 68, 0));
        BtnBrickPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BrickPizza-ezgif.com-resize.jpg"))); // NOI18N
        BtnBrickPizza.setContentAreaFilled(false);
        BtnBrickPizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBrickPizza.setFocusPainted(false);
        BtnBrickPizza.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnBrickPizza.setOpaque(true);
        BtnBrickPizza.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnBrickPizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnBrickPizzaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnBrickPizzaMouseExited(evt);
            }
        });
        BtnBrickPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBrickPizzaActionPerformed(evt);
            }
        });

        LblBrickPizza.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblBrickPizza.setForeground(new java.awt.Color(255, 255, 255));
        LblBrickPizza.setText("<html><font size='6'><b>Brick Oven Pizza</b></font><br><span style='color: #e0e0e0; font-size: 10px;'>Calories: 145</span></html>");

        javax.swing.GroupLayout PnlBrickPizzaLayout = new javax.swing.GroupLayout(PnlBrickPizza);
        PnlBrickPizza.setLayout(PnlBrickPizzaLayout);
        PnlBrickPizzaLayout.setHorizontalGroup(
            PnlBrickPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBrickPizzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlBrickPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnBrickPizza)
                    .addComponent(LblBrickPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PnlBrickPizzaLayout.setVerticalGroup(
            PnlBrickPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBrickPizzaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BtnBrickPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblBrickPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        PnlMurgMakhni.setBackground(new java.awt.Color(210, 68, 0));
        PnlMurgMakhni.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlMurgMakhni.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnMurgMakhni.setBackground(new java.awt.Color(210, 68, 0));
        BtnMurgMakhni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MurgMakhni-ezgif.com-resize.jpg"))); // NOI18N
        BtnMurgMakhni.setContentAreaFilled(false);
        BtnMurgMakhni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMurgMakhni.setFocusPainted(false);
        BtnMurgMakhni.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnMurgMakhni.setOpaque(true);
        BtnMurgMakhni.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnMurgMakhni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnMurgMakhniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnMurgMakhniMouseExited(evt);
            }
        });
        BtnMurgMakhni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMurgMakhniActionPerformed(evt);
            }
        });

        LblMurgMakhni.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblMurgMakhni.setForeground(new java.awt.Color(255, 255, 255));
        LblMurgMakhni.setText("<html><font size='6'><b>Murg Makhni</b></font><br><span style='color: #e0e0e0; font-size: 10px;'>Calories: 492</span></html>");

        javax.swing.GroupLayout PnlMurgMakhniLayout = new javax.swing.GroupLayout(PnlMurgMakhni);
        PnlMurgMakhni.setLayout(PnlMurgMakhniLayout);
        PnlMurgMakhniLayout.setHorizontalGroup(
            PnlMurgMakhniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMurgMakhniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlMurgMakhniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblMurgMakhni, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMurgMakhni))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PnlMurgMakhniLayout.setVerticalGroup(
            PnlMurgMakhniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMurgMakhniLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BtnMurgMakhni, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblMurgMakhni, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        PnlAvocadoSalad.setBackground(new java.awt.Color(210, 68, 0));
        PnlAvocadoSalad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlAvocadoSalad.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnAvocadoSalad.setBackground(new java.awt.Color(210, 68, 0));
        BtnAvocadoSalad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Avocado_salad-ezgif.com-resize.jpg"))); // NOI18N
        BtnAvocadoSalad.setContentAreaFilled(false);
        BtnAvocadoSalad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAvocadoSalad.setFocusPainted(false);
        BtnAvocadoSalad.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnAvocadoSalad.setOpaque(true);
        BtnAvocadoSalad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnAvocadoSalad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAvocadoSaladMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAvocadoSaladMouseExited(evt);
            }
        });
        BtnAvocadoSalad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAvocadoSaladActionPerformed(evt);
            }
        });

        LblAvocadoSalad.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblAvocadoSalad.setForeground(new java.awt.Color(255, 255, 255));
        LblAvocadoSalad.setText("<html><font size='6'><b>Avocado Salad</b></font><br><span style='color: #e0e0e0; font-size: 10px;'>Calories: 126</span></html>");

        javax.swing.GroupLayout PnlAvocadoSaladLayout = new javax.swing.GroupLayout(PnlAvocadoSalad);
        PnlAvocadoSalad.setLayout(PnlAvocadoSaladLayout);
        PnlAvocadoSaladLayout.setHorizontalGroup(
            PnlAvocadoSaladLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAvocadoSaladLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlAvocadoSaladLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblAvocadoSalad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAvocadoSalad))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PnlAvocadoSaladLayout.setVerticalGroup(
            PnlAvocadoSaladLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAvocadoSaladLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BtnAvocadoSalad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblAvocadoSalad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        PnlTuscanFishStew.setBackground(new java.awt.Color(210, 68, 0));
        PnlTuscanFishStew.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlTuscanFishStew.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnTuscanFish.setBackground(new java.awt.Color(210, 68, 0));
        BtnTuscanFish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Tuscan_Fish-ezgif.com-resize.jpg"))); // NOI18N
        BtnTuscanFish.setContentAreaFilled(false);
        BtnTuscanFish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnTuscanFish.setFocusPainted(false);
        BtnTuscanFish.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnTuscanFish.setOpaque(true);
        BtnTuscanFish.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnTuscanFish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnTuscanFishMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnTuscanFishMouseExited(evt);
            }
        });
        BtnTuscanFish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTuscanFishActionPerformed(evt);
            }
        });

        LblTuscanFish.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblTuscanFish.setForeground(new java.awt.Color(255, 255, 255));
        LblTuscanFish.setText("<html><font size='6'><b>Tuscan Fish Stew</b></font><br><span style='color: #e0e0e0; font-size: 10px;'>Calories: 672</span></html>");

        javax.swing.GroupLayout PnlTuscanFishStewLayout = new javax.swing.GroupLayout(PnlTuscanFishStew);
        PnlTuscanFishStew.setLayout(PnlTuscanFishStewLayout);
        PnlTuscanFishStewLayout.setHorizontalGroup(
            PnlTuscanFishStewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTuscanFishStewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlTuscanFishStewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTuscanFish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTuscanFish))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PnlTuscanFishStewLayout.setVerticalGroup(
            PnlTuscanFishStewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTuscanFishStewLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BtnTuscanFish, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(LblTuscanFish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        PnlSirloinSteak.setBackground(new java.awt.Color(210, 68, 0));
        PnlSirloinSteak.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlSirloinSteak.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnSirloinSteak.setBackground(new java.awt.Color(210, 68, 0));
        BtnSirloinSteak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sirloin_steak-ezgif.com-resize.jpg"))); // NOI18N
        BtnSirloinSteak.setContentAreaFilled(false);
        BtnSirloinSteak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSirloinSteak.setFocusPainted(false);
        BtnSirloinSteak.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnSirloinSteak.setOpaque(true);
        BtnSirloinSteak.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnSirloinSteak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnSirloinSteakMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnSirloinSteakMouseExited(evt);
            }
        });
        BtnSirloinSteak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSirloinSteakActionPerformed(evt);
            }
        });

        LblSirloinSteak.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblSirloinSteak.setForeground(new java.awt.Color(255, 255, 255));
        LblSirloinSteak.setText("<html><font size='6'><b>Sirloin Steak</b></font><br><span style='color: #e0e0e0; font-size: 10px;'>Calories: 453</span></html>");

        javax.swing.GroupLayout PnlSirloinSteakLayout = new javax.swing.GroupLayout(PnlSirloinSteak);
        PnlSirloinSteak.setLayout(PnlSirloinSteakLayout);
        PnlSirloinSteakLayout.setHorizontalGroup(
            PnlSirloinSteakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSirloinSteakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlSirloinSteakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblSirloinSteak, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSirloinSteak))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PnlSirloinSteakLayout.setVerticalGroup(
            PnlSirloinSteakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSirloinSteakLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BtnSirloinSteak, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(LblSirloinSteak, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        PnlButtermilkPancake.setBackground(new java.awt.Color(210, 68, 0));
        PnlButtermilkPancake.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlButtermilkPancake.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnButtermilkPancake.setBackground(new java.awt.Color(210, 68, 0));
        BtnButtermilkPancake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pancake-ezgif.com-resize.jpg"))); // NOI18N
        BtnButtermilkPancake.setContentAreaFilled(false);
        BtnButtermilkPancake.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnButtermilkPancake.setFocusPainted(false);
        BtnButtermilkPancake.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnButtermilkPancake.setOpaque(true);
        BtnButtermilkPancake.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnButtermilkPancake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnButtermilkPancakeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnButtermilkPancakeMouseExited(evt);
            }
        });
        BtnButtermilkPancake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnButtermilkPancakeActionPerformed(evt);
            }
        });

        LblButtermilkPancake.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblButtermilkPancake.setForeground(new java.awt.Color(255, 255, 255));
        LblButtermilkPancake.setText("<html><font size='6'><b>Buttermilk Pancake</b></font><br><span style='color: #e0e0e0; font-size: 10px;'>Calories: 210</span></html>");

        javax.swing.GroupLayout PnlButtermilkPancakeLayout = new javax.swing.GroupLayout(PnlButtermilkPancake);
        PnlButtermilkPancake.setLayout(PnlButtermilkPancakeLayout);
        PnlButtermilkPancakeLayout.setHorizontalGroup(
            PnlButtermilkPancakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlButtermilkPancakeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlButtermilkPancakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblButtermilkPancake, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnButtermilkPancake))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PnlButtermilkPancakeLayout.setVerticalGroup(
            PnlButtermilkPancakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlButtermilkPancakeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BtnButtermilkPancake, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblButtermilkPancake, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlMarrySoup.setBackground(new java.awt.Color(210, 68, 0));
        PnlMarrySoup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnlMarrySoup.setPreferredSize(new java.awt.Dimension(200, 271));

        BtnMarrySoup.setBackground(new java.awt.Color(210, 68, 0));
        BtnMarrySoup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MarryMeSoup-ezgif.com-resize.jpg"))); // NOI18N
        BtnMarrySoup.setContentAreaFilled(false);
        BtnMarrySoup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMarrySoup.setFocusPainted(false);
        BtnMarrySoup.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnMarrySoup.setOpaque(true);
        BtnMarrySoup.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnMarrySoup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnMarrySoupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnMarrySoupMouseExited(evt);
            }
        });
        BtnMarrySoup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMarrySoupActionPerformed(evt);
            }
        });

        LblMarrySoup.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        LblMarrySoup.setForeground(new java.awt.Color(255, 255, 255));
        LblMarrySoup.setText("<html><font size='6'><b>Marry Me Chicken Soup</b></font><br><span style='color: #e0e0e0; font-size: 10px;'>Calories: 655</span></html>");

        javax.swing.GroupLayout PnlMarrySoupLayout = new javax.swing.GroupLayout(PnlMarrySoup);
        PnlMarrySoup.setLayout(PnlMarrySoupLayout);
        PnlMarrySoupLayout.setHorizontalGroup(
            PnlMarrySoupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMarrySoupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlMarrySoupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblMarrySoup, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMarrySoup))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PnlMarrySoupLayout.setVerticalGroup(
            PnlMarrySoupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMarrySoupLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BtnMarrySoup, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblMarrySoup, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PnlCenterLayout = new javax.swing.GroupLayout(PnlCenter);
        PnlCenter.setLayout(PnlCenterLayout);
        PnlCenterLayout.setHorizontalGroup(
            PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCenterLayout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlPastaFazool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlBangBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlSirloinSteak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlBowlCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlBrickPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlTuscanFishStew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlCenterLayout.createSequentialGroup()
                        .addComponent(PnlBreadPudding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(PnlCauliSoup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlCenterLayout.createSequentialGroup()
                        .addComponent(PnlMurgMakhni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(PnlAvocadoSalad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlCenterLayout.createSequentialGroup()
                        .addComponent(PnlButtermilkPancake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(PnlMarrySoup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        PnlCenterLayout.setVerticalGroup(
            PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCenterLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlPastaFazool, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlBowlCake, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlBreadPudding, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlCauliSoup, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlBangBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlBrickPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlMurgMakhni, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlAvocadoSalad, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlTuscanFishStew, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlButtermilkPancake, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlMarrySoup, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlSirloinSteak, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        ScrollPanel.setViewportView(PnlCenter);

        add(ScrollPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    
    //hover effects of buttons
    private void BtnPastaFazoolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPastaFazoolMouseEntered
         BtnPastaFazool.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnPastaFazoolMouseEntered

    private void BtnPastaFazoolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPastaFazoolMouseExited
        BtnPastaFazool.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnPastaFazoolMouseExited

    private void BtnBowlCakeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBowlCakeMouseEntered
        BtnBowlCake.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnBowlCakeMouseEntered

    private void BtnBowlCakeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBowlCakeMouseExited
        BtnBowlCake.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnBowlCakeMouseExited

    private void BtnBreadPuddingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBreadPuddingMouseEntered
        BtnBreadPudding.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnBreadPuddingMouseEntered

    private void BtnBreadPuddingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBreadPuddingMouseExited
        BtnBreadPudding.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnBreadPuddingMouseExited

    private void BtnCauliSoupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCauliSoupMouseEntered
        BtnCauliSoup.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnCauliSoupMouseEntered

    private void BtnCauliSoupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCauliSoupMouseExited
        BtnCauliSoup.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnCauliSoupMouseExited

    private void BtnBangBurgerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBangBurgerMouseEntered
        BtnBangBurger.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnBangBurgerMouseEntered

    private void BtnBangBurgerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBangBurgerMouseExited
        BtnBangBurger.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnBangBurgerMouseExited

    private void BtnBrickPizzaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBrickPizzaMouseEntered
        BtnBrickPizza.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnBrickPizzaMouseEntered

    private void BtnBrickPizzaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBrickPizzaMouseExited
        BtnBrickPizza.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnBrickPizzaMouseExited

    private void BtnMurgMakhniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMurgMakhniMouseEntered
        BtnMurgMakhni.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnMurgMakhniMouseEntered

    private void BtnMurgMakhniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMurgMakhniMouseExited
        BtnMurgMakhni.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnMurgMakhniMouseExited

    private void BtnAvocadoSaladMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAvocadoSaladMouseEntered
        BtnAvocadoSalad.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnAvocadoSaladMouseEntered

    private void BtnAvocadoSaladMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAvocadoSaladMouseExited
        BtnAvocadoSalad.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnAvocadoSaladMouseExited

    private void BtnSirloinSteakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSirloinSteakMouseEntered
        BtnSirloinSteak.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnSirloinSteakMouseEntered

    private void BtnSirloinSteakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSirloinSteakMouseExited
        BtnSirloinSteak.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnSirloinSteakMouseExited

    private void BtnTuscanFishMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTuscanFishMouseEntered
        BtnTuscanFish.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnTuscanFishMouseEntered

    private void BtnTuscanFishMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTuscanFishMouseExited
        BtnTuscanFish.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnTuscanFishMouseExited

    private void BtnButtermilkPancakeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnButtermilkPancakeMouseEntered
        BtnButtermilkPancake.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnButtermilkPancakeMouseEntered

    private void BtnButtermilkPancakeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnButtermilkPancakeMouseExited
        BtnButtermilkPancake.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnButtermilkPancakeMouseExited

    private void BtnMarrySoupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMarrySoupMouseEntered
        BtnMarrySoup.setBorder(hoverBorder);
    }//GEN-LAST:event_BtnMarrySoupMouseEntered

    private void BtnMarrySoupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMarrySoupMouseExited
        BtnMarrySoup.setBorder(defaultBorder);
    }//GEN-LAST:event_BtnMarrySoupMouseExited

    
    //Action of buttons
    
    private void BtnPastaFazoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPastaFazoolActionPerformed
        mainView.showSingleRecipe(1001);
    }//GEN-LAST:event_BtnPastaFazoolActionPerformed

    private void BtnBowlCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBowlCakeActionPerformed
        mainView.showSingleRecipe(1002);
    }//GEN-LAST:event_BtnBowlCakeActionPerformed

    private void BtnBreadPuddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBreadPuddingActionPerformed
       mainView.showSingleRecipe(1003);
    }//GEN-LAST:event_BtnBreadPuddingActionPerformed

    private void BtnCauliSoupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCauliSoupActionPerformed
        mainView.showSingleRecipe(1004);
    }//GEN-LAST:event_BtnCauliSoupActionPerformed

    private void BtnBangBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBangBurgerActionPerformed
       mainView.showSingleRecipe(1005);
    }//GEN-LAST:event_BtnBangBurgerActionPerformed

    private void BtnBrickPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBrickPizzaActionPerformed
        mainView.showSingleRecipe(1006);
    }//GEN-LAST:event_BtnBrickPizzaActionPerformed

    private void BtnMurgMakhniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMurgMakhniActionPerformed
        mainView.showSingleRecipe(1007);
    }//GEN-LAST:event_BtnMurgMakhniActionPerformed

    private void BtnAvocadoSaladActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAvocadoSaladActionPerformed
       mainView.showSingleRecipe(1008);
    }//GEN-LAST:event_BtnAvocadoSaladActionPerformed

    private void BtnSirloinSteakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSirloinSteakActionPerformed
        mainView.showSingleRecipe(1009);
    }//GEN-LAST:event_BtnSirloinSteakActionPerformed

    private void BtnTuscanFishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTuscanFishActionPerformed
       mainView.showSingleRecipe(1010);
    }//GEN-LAST:event_BtnTuscanFishActionPerformed

    private void BtnButtermilkPancakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnButtermilkPancakeActionPerformed
        mainView.showSingleRecipe(1011);
    }//GEN-LAST:event_BtnButtermilkPancakeActionPerformed

    private void BtnMarrySoupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMarrySoupActionPerformed
       mainView.showSingleRecipe(1012);
    }//GEN-LAST:event_BtnMarrySoupActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAvocadoSalad;
    private javax.swing.JButton BtnBangBurger;
    private javax.swing.JButton BtnBowlCake;
    private javax.swing.JButton BtnBreadPudding;
    private javax.swing.JButton BtnBrickPizza;
    private javax.swing.JButton BtnButtermilkPancake;
    private javax.swing.JButton BtnCauliSoup;
    private javax.swing.JButton BtnMarrySoup;
    private javax.swing.JButton BtnMurgMakhni;
    private javax.swing.JButton BtnPastaFazool;
    private javax.swing.JButton BtnSirloinSteak;
    private javax.swing.JButton BtnTuscanFish;
    private javax.swing.JLabel LblAvocadoSalad;
    private javax.swing.JLabel LblBangBurger;
    private javax.swing.JLabel LblBowlCake;
    private javax.swing.JLabel LblBrickPizza;
    private javax.swing.JLabel LblButtermilkPancake;
    private javax.swing.JLabel LblButtonPudiing;
    private javax.swing.JLabel LblCauliSoup;
    private javax.swing.JLabel LblHeader;
    private javax.swing.JLabel LblMarrySoup;
    private javax.swing.JLabel LblMurgMakhni;
    private javax.swing.JLabel LblPastaFazool;
    private javax.swing.JLabel LblSirloinSteak;
    private javax.swing.JLabel LblTuscanFish;
    private javax.swing.JPanel PnlAvocadoSalad;
    private javax.swing.JPanel PnlBangBurger;
    private javax.swing.JPanel PnlBowlCake;
    private javax.swing.JPanel PnlBreadPudding;
    private javax.swing.JPanel PnlBrickPizza;
    private javax.swing.JPanel PnlButtermilkPancake;
    private javax.swing.JPanel PnlCauliSoup;
    private javax.swing.JPanel PnlCenter;
    private javax.swing.JPanel PnlMarrySoup;
    private javax.swing.JPanel PnlMurgMakhni;
    private javax.swing.JPanel PnlPastaFazool;
    private javax.swing.JPanel PnlSirloinSteak;
    private javax.swing.JPanel PnlTop;
    private javax.swing.JPanel PnlTuscanFishStew;
    private javax.swing.JScrollPane ScrollPanel;
    // End of variables declaration//GEN-END:variables
}
