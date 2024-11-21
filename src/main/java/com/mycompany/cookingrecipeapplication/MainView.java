package com.mycompany.cookingrecipeapplication;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainView extends javax.swing.JFrame {

    Color defaultColor, hoverColor, selectedColor;
    JButton selectedButton = null;
    private CardLayout cardLayout;
    FavouritesView favView;
    DashboardPanel dashboardPanel;
    
    public MainView() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();

        defaultColor = new Color(214, 217, 223);
        hoverColor = new Color(242, 242, 242);
        selectedColor = new Color(248, 248, 248);

        dashboardPanel = new DashboardPanel(this);
        RecipesForm recipesPanel = new RecipesForm(this);
        favView = new FavouritesView(this);
        GroceryListView groceryListView = new GroceryListView();
        SingleRecipeView singleRecipeView = new SingleRecipeView(favView, this);
        FilteredRecipe filteredRecipe = new FilteredRecipe(this);

        pnlContent.add(dashboardPanel, "Dashboard");
        pnlContent.add(recipesPanel, "Recipes");
        pnlContent.add(singleRecipeView, "SingleRecipe");
        pnlContent.add(favView, "Favourites");
        pnlContent.add(groceryListView, "Groceries");
        pnlContent.add(filteredRecipe, "FilteredRecipe");

        //Default View
        cardLayout = (CardLayout) pnlContent.getLayout();
        cardLayout.show(pnlContent, "Dashboard");
        updateButtonSelection(BtnDashBoard);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void showSingleRecipe(int recipeID) {

        SingleRecipeView singleRecipeView = (SingleRecipeView) pnlContent.getComponent(2);
        singleRecipeView.setRecipeDetails(recipeID);
        singleRecipeView.setIngredientDetails(recipeID);
        singleRecipeView.setDirectionDetails(recipeID);

        updateButtonSelection(BtnRecipe);
        cardLayout.show(pnlContent, "SingleRecipe");
    }

    public void showFilteredRecipe(String selectedRecipe) {

        FilteredRecipe filteredRecipe = (FilteredRecipe) pnlContent.getComponent(5);
        filteredRecipe.FilterByCategory(selectedRecipe); 

        updateButtonSelection(BtnRecipe);
        cardLayout.show(pnlContent, "FilteredRecipe");
    }

    public void showGroceryList(int recipeID) {

        GroceryListView groceryView = (GroceryListView) pnlContent.getComponent(4);
        groceryView.SetTableData(recipeID);

        updateButtonSelection(BtnGroceryList);
        cardLayout.show(pnlContent, "Groceries");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        pnlContent = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        panelLogo = new javax.swing.JPanel();
        panelAppname = new javax.swing.JPanel();
        LblAppName = new javax.swing.JLabel();
        LblLogo = new javax.swing.JLabel();
        BtnDashBoard = new javax.swing.JButton();
        BtnRecipe = new javax.swing.JButton();
        BtnFavourite = new javax.swing.JButton();
        BtnGroceryList = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlRoot.setPreferredSize(new java.awt.Dimension(1600, 800));
        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlContent.setLayout(new java.awt.CardLayout());
        pnlRoot.add(pnlContent, java.awt.BorderLayout.CENTER);

        pnlSide.setBackground(new java.awt.Color(214, 217, 223));
        pnlSide.setPreferredSize(new java.awt.Dimension(250, 100));
        pnlSide.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 13));

        panelLogo.setBackground(new java.awt.Color(214, 217, 223));
        panelLogo.setPreferredSize(new java.awt.Dimension(220, 190));

        panelAppname.setBackground(new java.awt.Color(214, 217, 223));

        LblAppName.setBackground(new java.awt.Color(214, 217, 223));
        LblAppName.setFont(new java.awt.Font("Lucida Handwriting", 1, 28)); // NOI18N
        LblAppName.setForeground(new java.awt.Color(51, 51, 51));
        LblAppName.setText("Tasty Tales");

        javax.swing.GroupLayout panelAppnameLayout = new javax.swing.GroupLayout(panelAppname);
        panelAppname.setLayout(panelAppnameLayout);
        panelAppnameLayout.setHorizontalGroup(
            panelAppnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAppnameLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LblAppName)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelAppnameLayout.setVerticalGroup(
            panelAppnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAppnameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblAppName)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        LblLogo.setForeground(new java.awt.Color(255, 102, 0));
        LblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ccokingAppIcon.png"))); // NOI18N

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAppname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblLogo)
                .addGap(67, 67, 67))
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogoLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(LblLogo)
                .addGap(20, 20, 20)
                .addComponent(panelAppname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSide.add(panelLogo);

        BtnDashBoard.setBackground(new java.awt.Color(214, 217, 223));
        BtnDashBoard.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        BtnDashBoard.setForeground(new java.awt.Color(51, 51, 51));
        BtnDashBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-line.png"))); // NOI18N
        BtnDashBoard.setText("Dashboard");
        BtnDashBoard.setBorderPainted(false);
        BtnDashBoard.setContentAreaFilled(false);
        BtnDashBoard.setIconTextGap(20);
        BtnDashBoard.setOpaque(true);
        BtnDashBoard.setPreferredSize(new java.awt.Dimension(250, 50));
        BtnDashBoard.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnDashBoard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnDashBoardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnDashBoardMouseExited(evt);
            }
        });
        BtnDashBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDashBoardActionPerformed(evt);
            }
        });
        pnlSide.add(BtnDashBoard);

        BtnRecipe.setBackground(new java.awt.Color(214, 217, 223));
        BtnRecipe.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        BtnRecipe.setForeground(new java.awt.Color(51, 51, 51));
        BtnRecipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/restaurant-line (1).png"))); // NOI18N
        BtnRecipe.setText("Recipes");
        BtnRecipe.setBorderPainted(false);
        BtnRecipe.setContentAreaFilled(false);
        BtnRecipe.setFocusPainted(false);
        BtnRecipe.setHideActionText(true);
        BtnRecipe.setIconTextGap(20);
        BtnRecipe.setMargin(new java.awt.Insets(2, -14, 3, 14));
        BtnRecipe.setOpaque(true);
        BtnRecipe.setPreferredSize(new java.awt.Dimension(250, 50));
        BtnRecipe.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnRecipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnRecipeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnRecipeMouseExited(evt);
            }
        });
        BtnRecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecipeActionPerformed(evt);
            }
        });
        pnlSide.add(BtnRecipe);

        BtnFavourite.setBackground(new java.awt.Color(214, 217, 223));
        BtnFavourite.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        BtnFavourite.setForeground(new java.awt.Color(51, 51, 51));
        BtnFavourite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heart-fill (1).png"))); // NOI18N
        BtnFavourite.setText("Favourites");
        BtnFavourite.setBorderPainted(false);
        BtnFavourite.setContentAreaFilled(false);
        BtnFavourite.setFocusPainted(false);
        BtnFavourite.setIconTextGap(20);
        BtnFavourite.setOpaque(true);
        BtnFavourite.setPreferredSize(new java.awt.Dimension(250, 50));
        BtnFavourite.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnFavourite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFavouriteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFavouriteMouseExited(evt);
            }
        });
        BtnFavourite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFavouriteActionPerformed(evt);
            }
        });
        pnlSide.add(BtnFavourite);

        BtnGroceryList.setBackground(new java.awt.Color(214, 217, 223));
        BtnGroceryList.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        BtnGroceryList.setForeground(new java.awt.Color(51, 51, 51));
        BtnGroceryList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file-list-line (1).png"))); // NOI18N
        BtnGroceryList.setText("Shopping List");
        BtnGroceryList.setBorderPainted(false);
        BtnGroceryList.setContentAreaFilled(false);
        BtnGroceryList.setFocusPainted(false);
        BtnGroceryList.setIconTextGap(20);
        BtnGroceryList.setMargin(new java.awt.Insets(2, 25, 3, 14));
        BtnGroceryList.setOpaque(true);
        BtnGroceryList.setPreferredSize(new java.awt.Dimension(250, 50));
        BtnGroceryList.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnGroceryList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnGroceryListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnGroceryListMouseExited(evt);
            }
        });
        BtnGroceryList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGroceryListActionPerformed(evt);
            }
        });
        pnlSide.add(BtnGroceryList);

        BtnExit.setBackground(new java.awt.Color(214, 217, 223));
        BtnExit.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        BtnExit.setForeground(new java.awt.Color(51, 51, 51));
        BtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout-box-line (1).png"))); // NOI18N
        BtnExit.setText("Exit");
        BtnExit.setBorderPainted(false);
        BtnExit.setContentAreaFilled(false);
        BtnExit.setFocusPainted(false);
        BtnExit.setIconTextGap(20);
        BtnExit.setMargin(new java.awt.Insets(2, -44, 3, 14));
        BtnExit.setOpaque(true);
        BtnExit.setPreferredSize(new java.awt.Dimension(250, 50));
        BtnExit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnExitMouseExited(evt);
            }
        });
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });
        pnlSide.add(BtnExit);

        pnlRoot.add(pnlSide, java.awt.BorderLayout.WEST);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Hover effects of buttons

    private void BtnDashBoardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDashBoardMouseEntered
        BtnDashBoard.setBackground(hoverColor);
    }//GEN-LAST:event_BtnDashBoardMouseEntered

    private void BtnDashBoardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDashBoardMouseExited
        if (BtnDashBoard != selectedButton)
            BtnDashBoard.setBackground(defaultColor);
    }//GEN-LAST:event_BtnDashBoardMouseExited

    private void BtnRecipeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRecipeMouseEntered
        BtnRecipe.setBackground(hoverColor);
    }//GEN-LAST:event_BtnRecipeMouseEntered

    private void BtnRecipeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRecipeMouseExited
        if (BtnRecipe != selectedButton)
            BtnRecipe.setBackground(defaultColor);
    }//GEN-LAST:event_BtnRecipeMouseExited

    private void BtnFavouriteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFavouriteMouseEntered
        BtnFavourite.setBackground(hoverColor);
    }//GEN-LAST:event_BtnFavouriteMouseEntered

    private void BtnFavouriteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFavouriteMouseExited
        if (BtnFavourite != selectedButton)
            BtnFavourite.setBackground(defaultColor);
    }//GEN-LAST:event_BtnFavouriteMouseExited

    private void BtnGroceryListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGroceryListMouseEntered
        BtnGroceryList.setBackground(hoverColor);
    }//GEN-LAST:event_BtnGroceryListMouseEntered

    private void BtnGroceryListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGroceryListMouseExited
        if (BtnGroceryList != selectedButton)
            BtnGroceryList.setBackground(defaultColor);
    }//GEN-LAST:event_BtnGroceryListMouseExited

    private void BtnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitMouseEntered
        BtnExit.setBackground(hoverColor);
    }//GEN-LAST:event_BtnExitMouseEntered

    private void BtnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitMouseExited
        BtnExit.setBackground(defaultColor);
    }//GEN-LAST:event_BtnExitMouseExited

    //Action of buttons

    private void BtnDashBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDashBoardActionPerformed
        CardLayout layout = (CardLayout) pnlContent.getLayout();
        layout.show(pnlContent, "Dashboard");
        dashboardPanel.FavourtitesCount();
        updateButtonSelection(BtnDashBoard);
    }//GEN-LAST:event_BtnDashBoardActionPerformed

    private void BtnRecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecipeActionPerformed
        CardLayout layout = (CardLayout) pnlContent.getLayout();
        layout.show(pnlContent, "Recipes");
        updateButtonSelection(BtnRecipe);
    }//GEN-LAST:event_BtnRecipeActionPerformed

    private void BtnFavouriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFavouriteActionPerformed

        favView.SetFavouriteComponents();
        CardLayout layout = (CardLayout) pnlContent.getLayout();
        layout.show(pnlContent, "Favourites");
        updateButtonSelection(BtnFavourite);
    }//GEN-LAST:event_BtnFavouriteActionPerformed

    private void BtnGroceryListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGroceryListActionPerformed
        CardLayout layout = (CardLayout) pnlContent.getLayout();
        layout.show(pnlContent, "Groceries");
        updateButtonSelection(BtnGroceryList);
    }//GEN-LAST:event_BtnGroceryListActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnExitActionPerformed

    private void updateButtonSelection(JButton button) {
        if (selectedButton != null) {
            selectedButton.setBackground(defaultColor);
        }
        button.setBackground(selectedColor);
        selectedButton = button;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new MainView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDashBoard;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnFavourite;
    private javax.swing.JButton BtnGroceryList;
    private javax.swing.JButton BtnRecipe;
    private javax.swing.JLabel LblAppName;
    private javax.swing.JLabel LblLogo;
    private javax.swing.JPanel panelAppname;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    // End of variables declaration//GEN-END:variables
}
