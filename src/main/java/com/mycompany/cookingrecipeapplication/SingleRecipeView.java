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
import javax.swing.border.LineBorder;

public class SingleRecipeView extends javax.swing.JPanel {

    Color hoverColor, defaultColor;
    private String IsFavourite = "";

    FavouritesView FavView;
    MainView mainView;

    private DataBaseConnection dbClass;
    private Connection conn;

    private int FavRecipeID = 0;

    public SingleRecipeView(FavouritesView favview, MainView mainview) {

        this.FavView = favview;
        this.mainView = mainview;

        initComponents();

        hoverColor = new Color(255, 186, 8);
        defaultColor = new Color(210, 68, 0);

        dbClass = new DataBaseConnection();
        try {
            conn = dbClass.GetConnection();
        } catch (Exception e) {
            System.err.println("Failed to connect to the database: " + e.getMessage());
        }
    }

    public void setRecipeDetails(int recipeID) {
        if (conn != null) {
            FavRecipeID = recipeID;

            try {
                String query = "SELECT * FROM recipe WHERE RecipeID = ?";
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setInt(1, recipeID);
                ResultSet rs = pstmt.executeQuery();

                String picturePath = "", RecipeName = "";
                int ServeSize = 0, PrepTime = 0, CookTime = 0, Total_Cal = 0, fat_qty = 0, carb_qty = 0, protein_qty = 0;

                while (rs.next()) {

                    picturePath = rs.getString("Picture");
                    RecipeName = rs.getString("RecipeName");
                    IsFavourite = rs.getString("is_Favourite");
                    ServeSize = rs.getInt("Serve_Size");
                    PrepTime = rs.getInt("Prep_Time");
                    CookTime = rs.getInt("Cook_Time");
                    Total_Cal = rs.getInt("Tot_Calorie");
                    fat_qty = rs.getInt("Fat_Amount");
                    carb_qty = rs.getInt("Carbs_Amount");
                    protein_qty = rs.getInt("Protein_Amount");
                }

                if ("true".equals(IsFavourite)) {
                    URL imageUrl = getClass().getClassLoader().getResource("images/Fav_heart-fill (1).png");
                    ImageIcon icon = new ImageIcon(imageUrl);
                    jLabel1.setIcon(icon);
                    BtnFav.setText("Remove from favourites");
                } else {
                    URL imageUrl = getClass().getClassLoader().getResource("images/heart-line.png");
                    ImageIcon icon = new ImageIcon(imageUrl);
                    jLabel1.setIcon(icon);
                    BtnFav.setText("Add to favourites");
                }

                URL imageUrl = getClass().getClassLoader().getResource(picturePath);
                ImageIcon icon = new ImageIcon(imageUrl);
                LblPicture.setIcon(icon);
                LblFoodName.setText(RecipeName);
                LblInputServeSize.setText(String.valueOf(ServeSize));
                LblInputPrepTime.setText(String.valueOf(PrepTime));
                LblInputCookTime.setText(String.valueOf(CookTime));

                StringBuilder textBuilder = new StringBuilder();
                textBuilder.append("Total Calories         :   " + Total_Cal)
                        .append("\n")
                        .append("\n")
                        .append("Fat (in grams)         :   " + fat_qty)
                        .append("\n")
                        .append("Carbs (in grams)     :   " + carb_qty)
                        .append("\n")
                        .append("Protein (in grams)   :   " + protein_qty);

                TextAreaNutrition.setText(textBuilder.toString());
                TextAreaNutrition.setEditable(false);
                TextAreaNutrition.setLineWrap(true);
                TextAreaNutrition.setWrapStyleWord(true);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void setIngredientDetails(int recipeID) {
        if (conn != null) {
            try {
                String query = "SELECT * FROM ingredients WHERE recipe_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setInt(1, recipeID);
                ResultSet rs = pstmt.executeQuery();

                List<String> ingredientList = new ArrayList<>();
                List<Double> QtyList = new ArrayList<>();
                List<String> UnitList = new ArrayList<>();

                while (rs.next()) {
                    ingredientList.add(rs.getString("ingredient_name"));
                    QtyList.add(rs.getDouble("Quantity"));
                    UnitList.add(rs.getString("Unit"));
                }

                StringBuilder textBuilder = new StringBuilder();

                for (int i = 0; i < ingredientList.size(); i++) {
                    textBuilder.append(QtyList.get(i))
                            .append(" ")
                            .append(UnitList.get(i))
                            .append("  ---  ")
                            .append(ingredientList.get(i))
                            .append("\n");
                }

                TextAreaIngredient.setText(textBuilder.toString());
                TextAreaIngredient.setEditable(false);
                TextAreaIngredient.setLineWrap(true);
                TextAreaIngredient.setWrapStyleWord(true);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void setDirectionDetails(int recipeID) {
        if (conn != null) {
            try {
                String query = "SELECT * FROM directions WHERE recipe2_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setInt(1, recipeID);
                ResultSet rs = pstmt.executeQuery();

                List<String> stepList = new ArrayList<>();
                List<String> directionList = new ArrayList<>();

                while (rs.next()) {
                    stepList.add(rs.getString("step_num"));
                    directionList.add(rs.getString("description"));
                }

                StringBuilder textBuilder = new StringBuilder();

                for (int i = 0; i < stepList.size(); i++) {
                    textBuilder.append(stepList.get(i))
                            .append(". ")
                            .append(directionList.get(i))
                            .append("\n")
                            .append("\n");
                }

                TextAreaDirection.setText(textBuilder.toString());
                TextAreaDirection.setEditable(false);
                TextAreaDirection.setLineWrap(true);
                TextAreaDirection.setWrapStyleWord(true);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlTop = new javax.swing.JPanel();
        LblPicture = new javax.swing.JLabel();
        PnlFoodContent = new javax.swing.JPanel();
        LblServingSize = new javax.swing.JLabel();
        LblFoodName = new javax.swing.JLabel();
        LblCookingTime = new javax.swing.JLabel();
        LblPrepTime = new javax.swing.JLabel();
        LblInputCookTime = new javax.swing.JLabel();
        LblInputServeSize = new javax.swing.JLabel();
        LblInputPrepTime = new javax.swing.JLabel();
        PnlFavBtn = new javax.swing.JPanel();
        BtnFav = new javax.swing.JButton();
        PnlGroceryBtn = new javax.swing.JPanel();
        BtnGroceryList = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PnlCenter = new javax.swing.JPanel();
        PnlIngredient = new javax.swing.JPanel();
        LblIngredient = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextAreaIngredient = new javax.swing.JTextArea();
        PnlNutrition = new javax.swing.JPanel();
        LblNutrition = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaNutrition = new javax.swing.JTextArea();
        PnlDirection = new javax.swing.JPanel();
        LblDirection = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaDirection = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        PnlTop.setBackground(new java.awt.Color(255, 255, 255));
        PnlTop.setPreferredSize(new java.awt.Dimension(1350, 250));

        LblPicture.setBackground(new java.awt.Color(255, 255, 255));
        LblPicture.setOpaque(true);
        LblPicture.setPreferredSize(new java.awt.Dimension(181, 177));

        PnlFoodContent.setBackground(new java.awt.Color(255, 255, 255));

        LblServingSize.setBackground(new java.awt.Color(255, 255, 255));
        LblServingSize.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        LblServingSize.setForeground(new java.awt.Color(102, 102, 102));
        LblServingSize.setText("  Serving Size                                    :");

        LblFoodName.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        LblFoodName.setForeground(new java.awt.Color(210, 68, 0));
        LblFoodName.setText("Food_Name");

        LblCookingTime.setBackground(new java.awt.Color(255, 255, 255));
        LblCookingTime.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        LblCookingTime.setForeground(new java.awt.Color(102, 102, 102));
        LblCookingTime.setText("  Cooking Time  (in minutes)            :");

        LblPrepTime.setBackground(new java.awt.Color(255, 255, 255));
        LblPrepTime.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        LblPrepTime.setForeground(new java.awt.Color(102, 102, 102));
        LblPrepTime.setText("  PreparationTime (in minutes)        :");

        LblInputCookTime.setBackground(new java.awt.Color(255, 255, 255));
        LblInputCookTime.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        LblInputCookTime.setText("Cooking Text");

        LblInputServeSize.setBackground(new java.awt.Color(255, 255, 255));
        LblInputServeSize.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        LblInputServeSize.setText("Serving Size Text");

        LblInputPrepTime.setBackground(new java.awt.Color(255, 255, 255));
        LblInputPrepTime.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        LblInputPrepTime.setText("Preparation Text");

        PnlFavBtn.setBackground(new java.awt.Color(210, 68, 0));

        BtnFav.setBackground(new java.awt.Color(210, 68, 0));
        BtnFav.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BtnFav.setForeground(new java.awt.Color(255, 255, 255));
        BtnFav.setText("Add To Favourites");
        BtnFav.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnFav.setContentAreaFilled(false);
        BtnFav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFav.setFocusPainted(false);
        BtnFav.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnFav.setOpaque(true);
        BtnFav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFavMouseExited(evt);
            }
        });
        BtnFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFavActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlFavBtnLayout = new javax.swing.GroupLayout(PnlFavBtn);
        PnlFavBtn.setLayout(PnlFavBtnLayout);
        PnlFavBtnLayout.setHorizontalGroup(
            PnlFavBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnFav, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        PnlFavBtnLayout.setVerticalGroup(
            PnlFavBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnFav, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        PnlGroceryBtn.setBackground(new java.awt.Color(210, 68, 0));

        BtnGroceryList.setBackground(new java.awt.Color(210, 68, 0));
        BtnGroceryList.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BtnGroceryList.setForeground(new java.awt.Color(255, 255, 255));
        BtnGroceryList.setText("Add Groceries ");
        BtnGroceryList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnGroceryList.setContentAreaFilled(false);
        BtnGroceryList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGroceryList.setFocusPainted(false);
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

        javax.swing.GroupLayout PnlGroceryBtnLayout = new javax.swing.GroupLayout(PnlGroceryBtn);
        PnlGroceryBtn.setLayout(PnlGroceryBtnLayout);
        PnlGroceryBtnLayout.setHorizontalGroup(
            PnlGroceryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlGroceryBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnGroceryList, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        PnlGroceryBtnLayout.setVerticalGroup(
            PnlGroceryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnGroceryList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heart-line.png"))); // NOI18N

        javax.swing.GroupLayout PnlFoodContentLayout = new javax.swing.GroupLayout(PnlFoodContent);
        PnlFoodContent.setLayout(PnlFoodContentLayout);
        PnlFoodContentLayout.setHorizontalGroup(
            PnlFoodContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFoodContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFoodContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlFoodContentLayout.createSequentialGroup()
                        .addGroup(PnlFoodContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LblCookingTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblServingSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblPrepTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(PnlFoodContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblInputPrepTime, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblInputServeSize, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblInputCookTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(PnlFavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(PnlGroceryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlFoodContentLayout.createSequentialGroup()
                        .addComponent(LblFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PnlFoodContentLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PnlFoodContentLayout.setVerticalGroup(
            PnlFoodContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFoodContentLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LblFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlFoodContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblServingSize, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblInputServeSize, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlFoodContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlFoodContentLayout.createSequentialGroup()
                        .addGroup(PnlFoodContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblPrepTime, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblInputPrepTime, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PnlFoodContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblCookingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblInputCookTime, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PnlFavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlGroceryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PnlTopLayout = new javax.swing.GroupLayout(PnlTop);
        PnlTop.setLayout(PnlTopLayout);
        PnlTopLayout.setHorizontalGroup(
            PnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTopLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(PnlFoodContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        PnlTopLayout.setVerticalGroup(
            PnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTopLayout.createSequentialGroup()
                .addGroup(PnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlTopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PnlFoodContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlTopLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(LblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(PnlTop, java.awt.BorderLayout.PAGE_START);

        PnlCenter.setBackground(new java.awt.Color(255, 255, 255));
        PnlCenter.setPreferredSize(new java.awt.Dimension(1353, 550));

        LblIngredient.setBackground(new java.awt.Color(255, 255, 255));
        LblIngredient.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        LblIngredient.setForeground(new java.awt.Color(210, 68, 0));
        LblIngredient.setText(" Ingredients");

        TextAreaIngredient.setColumns(20);
        TextAreaIngredient.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        TextAreaIngredient.setForeground(new java.awt.Color(51, 51, 51));
        TextAreaIngredient.setRows(5);
        jScrollPane3.setViewportView(TextAreaIngredient);

        javax.swing.GroupLayout PnlIngredientLayout = new javax.swing.GroupLayout(PnlIngredient);
        PnlIngredient.setLayout(PnlIngredientLayout);
        PnlIngredientLayout.setHorizontalGroup(
            PnlIngredientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlIngredientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PnlIngredientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PnlIngredientLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PnlIngredientLayout.setVerticalGroup(
            PnlIngredientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlIngredientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblIngredient)
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(PnlIngredientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PnlIngredientLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        LblNutrition.setBackground(new java.awt.Color(255, 255, 255));
        LblNutrition.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        LblNutrition.setForeground(new java.awt.Color(210, 68, 0));
        LblNutrition.setText("<html><font color='#d24400'><b>Nutrition</font><font color='gray'>  (per serving)</font></html>");

        TextAreaNutrition.setColumns(20);
        TextAreaNutrition.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        TextAreaNutrition.setForeground(new java.awt.Color(51, 51, 51));
        TextAreaNutrition.setRows(5);
        jScrollPane2.setViewportView(TextAreaNutrition);

        javax.swing.GroupLayout PnlNutritionLayout = new javax.swing.GroupLayout(PnlNutrition);
        PnlNutrition.setLayout(PnlNutritionLayout);
        PnlNutritionLayout.setHorizontalGroup(
            PnlNutritionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlNutritionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlNutritionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlNutritionLayout.createSequentialGroup()
                        .addComponent(LblNutrition, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnlNutritionLayout.setVerticalGroup(
            PnlNutritionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlNutritionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblNutrition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        LblDirection.setBackground(new java.awt.Color(255, 255, 255));
        LblDirection.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        LblDirection.setForeground(new java.awt.Color(210, 68, 0));
        LblDirection.setText(" Directions");

        TextAreaDirection.setColumns(20);
        TextAreaDirection.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        TextAreaDirection.setForeground(new java.awt.Color(51, 51, 51));
        TextAreaDirection.setRows(5);
        jScrollPane1.setViewportView(TextAreaDirection);

        javax.swing.GroupLayout PnlDirectionLayout = new javax.swing.GroupLayout(PnlDirection);
        PnlDirection.setLayout(PnlDirectionLayout);
        PnlDirectionLayout.setHorizontalGroup(
            PnlDirectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDirectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlDirectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDirectionLayout.createSequentialGroup()
                        .addComponent(LblDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnlDirectionLayout.setVerticalGroup(
            PnlDirectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDirectionLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(LblDirection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout PnlCenterLayout = new javax.swing.GroupLayout(PnlCenter);
        PnlCenter.setLayout(PnlCenterLayout);
        PnlCenterLayout.setHorizontalGroup(
            PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCenterLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlIngredient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlNutrition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(225, 225, 225)
                .addComponent(PnlDirection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlCenterLayout.setVerticalGroup(
            PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCenterLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PnlDirection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PnlCenterLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(PnlIngredient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PnlNutrition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );

        add(PnlCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    //hover effects on buttons
    private void BtnFavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFavMouseEntered
        BtnFav.setBorder(new LineBorder(hoverColor, 3));
    }//GEN-LAST:event_BtnFavMouseEntered

    private void BtnFavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFavMouseExited
        BtnFav.setBorder(new LineBorder(defaultColor, 3));
    }//GEN-LAST:event_BtnFavMouseExited

    private void BtnGroceryListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGroceryListMouseEntered
        BtnGroceryList.setBorder(new LineBorder(hoverColor, 3));
    }//GEN-LAST:event_BtnGroceryListMouseEntered

    private void BtnGroceryListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGroceryListMouseExited
        BtnGroceryList.setBorder(new LineBorder(defaultColor, 3));
    }//GEN-LAST:event_BtnGroceryListMouseExited

    //Action of Buttons

    private void BtnFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFavActionPerformed
        if ("false".equals(IsFavourite)) {
            if (conn != null) {
                try {
                    String query = "UPDATE recipe SET is_Favourite = ? WHERE RecipeID = ?";
                    PreparedStatement pstmt = conn.prepareStatement(query);
                    pstmt.setString(1, "true");
                    pstmt.setInt(2, FavRecipeID);
                    int rowsAffected = pstmt.executeUpdate();

                    if (rowsAffected > 0) {
                        IsFavourite = "true";
                        System.out.println("Recipe marked as favorite successfully.");
                    } else {
                        System.out.println("No recipe found with the given ID.");
                    }

                    URL imageUrl = getClass().getClassLoader().getResource("images/Fav_heart-fill (1).png");
                    ImageIcon icon = new ImageIcon(imageUrl);
                    jLabel1.setIcon(icon);
                    BtnFav.setText("Remove from favourites");
                    FavView.SetFavouriteComponents();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } else {
            if (conn != null) {
                try {
                    String query = "UPDATE recipe SET is_Favourite = ? WHERE RecipeID = ?";
                    PreparedStatement pstmt = conn.prepareStatement(query);
                    pstmt.setString(1, "false");
                    pstmt.setInt(2, FavRecipeID);
                    int rowsAffected = pstmt.executeUpdate();

                    if (rowsAffected > 0) {
                        IsFavourite = "false";
                        System.out.println("Recipe removed from favorite successfully.");
                    } else {
                        System.out.println("No recipe found with the given ID.");
                    }

                    URL imageUrl = getClass().getClassLoader().getResource("images/heart-line.png");
                    ImageIcon icon = new ImageIcon(imageUrl);
                    jLabel1.setIcon(icon);
                    BtnFav.setText("Add to favourites");
                    FavView.SetFavouriteComponents();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_BtnFavActionPerformed

    private void BtnGroceryListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGroceryListActionPerformed
        mainView.showGroceryList(FavRecipeID);
    }//GEN-LAST:event_BtnGroceryListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFav;
    private javax.swing.JButton BtnGroceryList;
    private javax.swing.JLabel LblCookingTime;
    private javax.swing.JLabel LblDirection;
    private javax.swing.JLabel LblFoodName;
    private javax.swing.JLabel LblIngredient;
    private javax.swing.JLabel LblInputCookTime;
    private javax.swing.JLabel LblInputPrepTime;
    private javax.swing.JLabel LblInputServeSize;
    private javax.swing.JLabel LblNutrition;
    private javax.swing.JLabel LblPicture;
    private javax.swing.JLabel LblPrepTime;
    private javax.swing.JLabel LblServingSize;
    private javax.swing.JPanel PnlCenter;
    private javax.swing.JPanel PnlDirection;
    private javax.swing.JPanel PnlFavBtn;
    private javax.swing.JPanel PnlFoodContent;
    private javax.swing.JPanel PnlGroceryBtn;
    private javax.swing.JPanel PnlIngredient;
    private javax.swing.JPanel PnlNutrition;
    private javax.swing.JPanel PnlTop;
    private javax.swing.JTextArea TextAreaDirection;
    private javax.swing.JTextArea TextAreaIngredient;
    private javax.swing.JTextArea TextAreaNutrition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
