/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.cookingrecipeapplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class GroceryListView extends javax.swing.JPanel {

    DataBaseConnection dbClass;
    Connection conn;

    public GroceryListView() {

        dbClass = new DataBaseConnection();
        try {
            conn = dbClass.GetConnection();
        } catch (Exception e) {
            System.err.println("Failed to connect to the database: " + e.getMessage());
        }

        initComponents();
        BtnAdd.setBackground(Color.WHITE);

        setupTableStyles();
    }

    private void setupTableStyles() {

        JTableHeader header = TableGrocery.getTableHeader();
        header.setFont(new Font("Calibri", Font.BOLD, 22));
        header.setForeground(new Color(210, 68, 0));
        header.setBackground(Color.white);

    }

    public void SetTableData(int recipeID) {
        if (conn != null) {

            jTextFieldSL.setText("Serial No");
            jTextFieldIngredient.setText("Ingredient");
            jTextFieldRecipe.setText("Recipe");
            jTextFieldQty.setText("Quantity");
            jTextFieldUnit.setText("Unit");

            try {
                String query = "SELECT * FROM ingredients WHERE recipe_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setInt(1, recipeID);
                ResultSet rs = pstmt.executeQuery();

                List<String> ingredientList = new ArrayList<>();
                List<Double> QtyList = new ArrayList<>();
                List<String> UnitList = new ArrayList<>();

                while (rs.next()) {
                    ingredientList.add(rs.getString("grocery"));
                    QtyList.add(rs.getDouble("Quantity"));
                    UnitList.add(rs.getString("Unit"));
                }

                rs.close();
                pstmt.close();

                String query2 = "SELECT * FROM recipe WHERE RecipeID = ?";
                PreparedStatement pstmt2 = conn.prepareStatement(query2);
                pstmt2.setInt(1, recipeID);
                ResultSet rs2 = pstmt2.executeQuery();

                String recipeName = "";
                while (rs2.next()) {
                    recipeName = rs2.getString("RecipeName");
                }

                rs2.close();
                pstmt2.close();

                DefaultTableModel model = (DefaultTableModel) TableGrocery.getModel();
                model.setRowCount(0);
                for (int i = 0; i < ingredientList.size(); i++) {
                    model.addRow(new Object[]{
                        i + 1,
                        ingredientList.get(i),
                        recipeName,
                        QtyList.get(i),
                        UnitList.get(i)
                    });
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlTop = new javax.swing.JPanel();
        PnlGroceryCount = new javax.swing.JPanel();
        jLabelGroceries = new javax.swing.JLabel();
        TextFieldAddItem = new javax.swing.JTextField();
        PnlAddBtn = new javax.swing.JPanel();
        BtnAdd = new javax.swing.JButton();
        PnlPrintBtn = new javax.swing.JPanel();
        BtnPrint = new javax.swing.JButton();
        PnlCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableGrocery = new javax.swing.JTable();
        PnlBottom = new javax.swing.JPanel();
        PnlBBottom = new javax.swing.JPanel();
        PnlUpdateBtn = new javax.swing.JPanel();
        BtnUpdate = new javax.swing.JButton();
        PnlDeleteBtn = new javax.swing.JPanel();
        BtnDelete = new javax.swing.JButton();
        PnlClearBtn = new javax.swing.JPanel();
        BtnClear = new javax.swing.JButton();
        PnlTTop = new javax.swing.JPanel();
        jTextFieldSL = new javax.swing.JTextField();
        jTextFieldIngredient = new javax.swing.JTextField();
        jTextFieldQty = new javax.swing.JTextField();
        jTextFieldUnit = new javax.swing.JTextField();
        jTextFieldRecipe = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1350, 800));
        setLayout(new java.awt.BorderLayout());

        PnlTop.setPreferredSize(new java.awt.Dimension(1350, 100));

        PnlGroceryCount.setBackground(new java.awt.Color(210, 68, 0));

        jLabelGroceries.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelGroceries.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGroceries.setIcon(new javax.swing.ImageIcon("C:\\Users\\tahaa\\Downloads\\project_icons\\list-ordered.png")); // NOI18N
        jLabelGroceries.setText("  Groceries");

        javax.swing.GroupLayout PnlGroceryCountLayout = new javax.swing.GroupLayout(PnlGroceryCount);
        PnlGroceryCount.setLayout(PnlGroceryCountLayout);
        PnlGroceryCountLayout.setHorizontalGroup(
            PnlGroceryCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlGroceryCountLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabelGroceries)
                .addGap(77, 77, 77))
        );
        PnlGroceryCountLayout.setVerticalGroup(
            PnlGroceryCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlGroceryCountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGroceries, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        TextFieldAddItem.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TextFieldAddItem.setForeground(new java.awt.Color(153, 153, 153));
        TextFieldAddItem.setText("Add Item");
        TextFieldAddItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldAddItemMouseClicked(evt);
            }
        });

        PnlAddBtn.setBackground(new java.awt.Color(255, 255, 255));

        BtnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-fill.png"))); // NOI18N
        BtnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAdd.setBorderPainted(false);
        BtnAdd.setContentAreaFilled(false);
        BtnAdd.setFocusPainted(false);
        BtnAdd.setOpaque(true);
        BtnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAddMouseExited(evt);
            }
        });
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlAddBtnLayout = new javax.swing.GroupLayout(PnlAddBtn);
        PnlAddBtn.setLayout(PnlAddBtnLayout);
        PnlAddBtnLayout.setHorizontalGroup(
            PnlAddBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAddBtnLayout.createSequentialGroup()
                .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PnlAddBtnLayout.setVerticalGroup(
            PnlAddBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlAddBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        PnlPrintBtn.setBackground(new java.awt.Color(210, 68, 0));

        BtnPrint.setBackground(new java.awt.Color(210, 68, 0));
        BtnPrint.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BtnPrint.setForeground(new java.awt.Color(255, 255, 255));
        BtnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printer-fill.png"))); // NOI18N
        BtnPrint.setText("  Print");
        BtnPrint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnPrint.setContentAreaFilled(false);
        BtnPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPrint.setFocusPainted(false);
        BtnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnPrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnPrintMouseExited(evt);
            }
        });
        BtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlPrintBtnLayout = new javax.swing.GroupLayout(PnlPrintBtn);
        PnlPrintBtn.setLayout(PnlPrintBtnLayout);
        PnlPrintBtnLayout.setHorizontalGroup(
            PnlPrintBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPrintBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        PnlPrintBtnLayout.setVerticalGroup(
            PnlPrintBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPrintBtnLayout.createSequentialGroup()
                .addComponent(BtnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PnlTopLayout = new javax.swing.GroupLayout(PnlTop);
        PnlTop.setLayout(PnlTopLayout);
        PnlTopLayout.setHorizontalGroup(
            PnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTopLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(PnlGroceryCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(TextFieldAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(PnlAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 485, Short.MAX_VALUE)
                .addComponent(PnlPrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        PnlTopLayout.setVerticalGroup(
            PnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTopLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlTopLayout.createSequentialGroup()
                        .addComponent(PnlGroceryCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTopLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TextFieldAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlPrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        add(PnlTop, java.awt.BorderLayout.PAGE_START);

        PnlCenter.setBackground(new java.awt.Color(255, 255, 255));
        PnlCenter.setPreferredSize(new java.awt.Dimension(1350, 485));

        TableGrocery.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TableGrocery.setForeground(new java.awt.Color(210, 68, 0));
        TableGrocery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL No", "Ingridient", "Recipe Name", "Quantity", "Units"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableGrocery.setGridColor(new java.awt.Color(210, 68, 0));
        TableGrocery.setRowHeight(30);
        TableGrocery.setSelectionBackground(new java.awt.Color(210, 68, 0));
        TableGrocery.setSelectionForeground(new java.awt.Color(255, 255, 0));
        TableGrocery.setShowGrid(false);
        TableGrocery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableGroceryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableGrocery);
        if (TableGrocery.getColumnModel().getColumnCount() > 0) {
            TableGrocery.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableGrocery.getColumnModel().getColumn(2).setPreferredWidth(70);
            TableGrocery.getColumnModel().getColumn(3).setPreferredWidth(20);
            TableGrocery.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        javax.swing.GroupLayout PnlCenterLayout = new javax.swing.GroupLayout(PnlCenter);
        PnlCenter.setLayout(PnlCenterLayout);
        PnlCenterLayout.setHorizontalGroup(
            PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1338, Short.MAX_VALUE)
                .addContainerGap())
        );
        PnlCenterLayout.setVerticalGroup(
            PnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(PnlCenter, java.awt.BorderLayout.CENTER);

        PnlBottom.setPreferredSize(new java.awt.Dimension(1350, 215));
        PnlBottom.setLayout(new java.awt.BorderLayout());

        PnlBBottom.setBackground(new java.awt.Color(255, 255, 255));
        PnlBBottom.setPreferredSize(new java.awt.Dimension(1350, 110));

        PnlUpdateBtn.setBackground(new java.awt.Color(210, 68, 0));

        BtnUpdate.setBackground(new java.awt.Color(210, 68, 0));
        BtnUpdate.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BtnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        BtnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh-line.png"))); // NOI18N
        BtnUpdate.setText("  Update");
        BtnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnUpdate.setContentAreaFilled(false);
        BtnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnUpdate.setFocusPainted(false);
        BtnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnUpdateMouseExited(evt);
            }
        });
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlUpdateBtnLayout = new javax.swing.GroupLayout(PnlUpdateBtn);
        PnlUpdateBtn.setLayout(PnlUpdateBtnLayout);
        PnlUpdateBtnLayout.setHorizontalGroup(
            PnlUpdateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlUpdateBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        PnlUpdateBtnLayout.setVerticalGroup(
            PnlUpdateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PnlDeleteBtn.setBackground(new java.awt.Color(210, 68, 0));

        BtnDelete.setBackground(new java.awt.Color(210, 68, 0));
        BtnDelete.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BtnDelete.setForeground(new java.awt.Color(255, 255, 255));
        BtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-bin-5-fill.png"))); // NOI18N
        BtnDelete.setText("  Delete");
        BtnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnDelete.setContentAreaFilled(false);
        BtnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDelete.setFocusPainted(false);
        BtnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnDeleteMouseExited(evt);
            }
        });
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlDeleteBtnLayout = new javax.swing.GroupLayout(PnlDeleteBtn);
        PnlDeleteBtn.setLayout(PnlDeleteBtnLayout);
        PnlDeleteBtnLayout.setHorizontalGroup(
            PnlDeleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDeleteBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        PnlDeleteBtnLayout.setVerticalGroup(
            PnlDeleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PnlClearBtn.setBackground(new java.awt.Color(210, 68, 0));

        BtnClear.setBackground(new java.awt.Color(210, 68, 0));
        BtnClear.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BtnClear.setForeground(new java.awt.Color(255, 255, 255));
        BtnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close-large-line.png"))); // NOI18N
        BtnClear.setText("  Clear");
        BtnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnClear.setContentAreaFilled(false);
        BtnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnClear.setFocusPainted(false);
        BtnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnClearMouseExited(evt);
            }
        });
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlClearBtnLayout = new javax.swing.GroupLayout(PnlClearBtn);
        PnlClearBtn.setLayout(PnlClearBtnLayout);
        PnlClearBtnLayout.setHorizontalGroup(
            PnlClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlClearBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        PnlClearBtnLayout.setVerticalGroup(
            PnlClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout PnlBBottomLayout = new javax.swing.GroupLayout(PnlBBottom);
        PnlBBottom.setLayout(PnlBBottomLayout);
        PnlBBottomLayout.setHorizontalGroup(
            PnlBBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBBottomLayout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .addComponent(PnlUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addComponent(PnlDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addComponent(PnlClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        PnlBBottomLayout.setVerticalGroup(
            PnlBBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBBottomLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PnlBBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlUpdateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlDeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlClearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        PnlBottom.add(PnlBBottom, java.awt.BorderLayout.SOUTH);

        PnlTTop.setBackground(new java.awt.Color(255, 255, 255));
        PnlTTop.setPreferredSize(new java.awt.Dimension(1350, 40));

        jTextFieldSL.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTextFieldSL.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldSL.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldSL.setText("Serial No");
        jTextFieldSL.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldIngredient.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTextFieldIngredient.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldIngredient.setText("Ingredient");
        jTextFieldIngredient.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldQty.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTextFieldQty.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldQty.setText("Quantity");
        jTextFieldQty.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldUnit.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTextFieldUnit.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldUnit.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldUnit.setText("Unit");
        jTextFieldUnit.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldRecipe.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTextFieldRecipe.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldRecipe.setText("Recipe");
        jTextFieldRecipe.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout PnlTTopLayout = new javax.swing.GroupLayout(PnlTTop);
        PnlTTop.setLayout(PnlTTopLayout);
        PnlTTopLayout.setHorizontalGroup(
            PnlTTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTTopLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jTextFieldSL, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jTextFieldIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jTextFieldRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jTextFieldQty, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jTextFieldUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        PnlTTopLayout.setVerticalGroup(
            PnlTTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTTopLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PnlTTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQty, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        PnlBottom.add(PnlTTop, java.awt.BorderLayout.CENTER);

        add(PnlBottom, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents
    //Hover effects on button

    private void BtnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddMouseEntered
        BtnAdd.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_BtnAddMouseEntered

    private void BtnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddMouseExited
        BtnAdd.setBackground(Color.WHITE);
    }//GEN-LAST:event_BtnAddMouseExited

    private void BtnPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrintMouseEntered
        BtnPrint.setForeground(Color.yellow);
    }//GEN-LAST:event_BtnPrintMouseEntered

    private void BtnPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrintMouseExited
        BtnPrint.setForeground(Color.white);
    }//GEN-LAST:event_BtnPrintMouseExited

    private void BtnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUpdateMouseEntered
        BtnUpdate.setForeground(Color.yellow);
    }//GEN-LAST:event_BtnUpdateMouseEntered

    private void BtnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUpdateMouseExited
        BtnUpdate.setForeground(Color.white);
    }//GEN-LAST:event_BtnUpdateMouseExited

    private void BtnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDeleteMouseEntered
        BtnDelete.setForeground(Color.yellow);
    }//GEN-LAST:event_BtnDeleteMouseEntered

    private void BtnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDeleteMouseExited
        BtnDelete.setForeground(Color.white);
    }//GEN-LAST:event_BtnDeleteMouseExited

    private void BtnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClearMouseEntered
        BtnClear.setForeground(Color.yellow);
    }//GEN-LAST:event_BtnClearMouseEntered

    private void BtnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClearMouseExited
        BtnClear.setForeground(Color.white);
    }//GEN-LAST:event_BtnClearMouseExited

    //Action of Buttons

    private void TableGroceryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableGroceryMouseClicked
        int selectedRow = TableGrocery.getSelectedRow();

        if (selectedRow != -1) {

            String serialNo = TableGrocery.getValueAt(selectedRow, 0).toString();
            String ingredientName = TableGrocery.getValueAt(selectedRow, 1).toString();
            String recipeName = TableGrocery.getValueAt(selectedRow, 2).toString();
            String quantity = TableGrocery.getValueAt(selectedRow, 3).toString();
            String unit = TableGrocery.getValueAt(selectedRow, 4).toString();

            jTextFieldSL.setText(serialNo);
            jTextFieldSL.setForeground(Color.BLACK);

            jTextFieldRecipe.setText(recipeName);
            jTextFieldRecipe.setForeground(Color.BLACK);

            jTextFieldIngredient.setText(ingredientName);
            jTextFieldIngredient.setForeground(Color.BLACK);

            jTextFieldQty.setText(quantity);
            jTextFieldQty.setForeground(Color.BLACK);

            jTextFieldUnit.setText(unit);
            jTextFieldUnit.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_TableGroceryMouseClicked

    //Action of buttons

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed

        int selectedRow = TableGrocery.getSelectedRow();
        if (selectedRow != -1) {
            // Update table
            TableGrocery.setValueAt(jTextFieldSL.getText(), selectedRow, 0);
            TableGrocery.setValueAt((jTextFieldIngredient.getText()), selectedRow, 1);
            TableGrocery.setValueAt(jTextFieldRecipe.getText(), selectedRow, 2);
            TableGrocery.setValueAt(jTextFieldQty.getText(), selectedRow, 3);
            TableGrocery.setValueAt(jTextFieldUnit.getText(), selectedRow, 4);

        } else {
            JOptionPane.showMessageDialog(null, "Please add groceries first and then select a row to update.");
        }
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        int selectedRow = TableGrocery.getSelectedRow();
        if (selectedRow != -1) {

            DefaultTableModel model = (DefaultTableModel) TableGrocery.getModel();
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(null, "Please add groceries first and then select a row to delete.");
        }
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) TableGrocery.getModel();
        model.setRowCount(0);
        
        jTextFieldSL.setText("Serial No");
        jTextFieldSL.setForeground(new Color(102, 102, 102));
        jTextFieldRecipe.setText("Recipe");
        jTextFieldRecipe.setForeground(new Color(102, 102, 102));
        jTextFieldIngredient.setText("Ingredient");
        jTextFieldIngredient.setForeground(new Color(102, 102, 102));
        jTextFieldQty.setText("Quantity");
        jTextFieldQty.setForeground(new Color(102, 102, 102));
        jTextFieldUnit.setText("Unit");
        jTextFieldUnit.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_BtnClearActionPerformed

    private void BtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrintActionPerformed
        if (TableGrocery.getRowCount() > 0) {
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Grocery Table");

            job.setPrintable(new Printable() {
                public int print(Graphics pg, PageFormat pf, int pageNum) {
                    if (pageNum > 0) {
                        return Printable.NO_SUCH_PAGE;
                    }

                    // Setting orientation and scale
                    pf.setOrientation(PageFormat.PORTRAIT);
                    Graphics2D g2 = (Graphics2D) pg;
                    g2.translate(pf.getImageableX(), pf.getImageableY());
                    g2.scale(0.47, 0.47);

                    // Setting font and color for the header
                    Font headerFont = new Font("Calibri", Font.BOLD, 28);
                    g2.setFont(headerFont);
                    g2.setColor(Color.BLACK);

                    // Printing header - "Grocery List"
                    int x = 550;
                    int y = 80;
                    g2.drawString("Grocery List", x, y);

                    // Setting font for the table content (smaller font for table)
                    int x2 = 50;
                    int y2 = 50;
                    g2.setFont(new Font("Calibri", Font.PLAIN, 20));
                    int rowHeight = 20;
                    int columnWidth = 250;

                    // Printing table headers
                    y2 += 100;
                    DefaultTableModel model = (DefaultTableModel) TableGrocery.getModel();
                    int columnCount = model.getColumnCount();

                    for (int i = 0; i < columnCount; i++) {
                        g2.drawString(model.getColumnName(i), x2 + (i * columnWidth), y2);
                    }
                    y2 += rowHeight;

                    // Printing table rows
                    int rowCount = model.getRowCount();
                    for (int i = 0; i < rowCount; i++) {
                        for (int j = 0; j < columnCount; j++) {
                            g2.drawString(model.getValueAt(i, j).toString(), x2 + (j * columnWidth), y2 + 20);
                        }
                        y2 += rowHeight;
                    }

                    return Printable.PAGE_EXISTS;
                }
            });

            boolean ok = job.printDialog();
            if (ok) {
                try {
                    job.print();
                } catch (PrinterException ex) {
                    ex.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add groceries first and then try to print");
        }
    }//GEN-LAST:event_BtnPrintActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        if (!"Add Item".equals(TextFieldAddItem.getText())  &&   !"".equals(TextFieldAddItem.getText())) {
            DefaultTableModel model = (DefaultTableModel) TableGrocery.getModel();
            model.addRow(new Object[]{
                model.getRowCount() + 1,
                TextFieldAddItem.getText(),
                "Others",
                "1",
                "Unit"
            });
            TextFieldAddItem.setText("Add Item");
            TextFieldAddItem.setForeground(new Color(153, 153, 153));
            JOptionPane.showMessageDialog(null, "Item added successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Please add an item first");
            
        }
    }//GEN-LAST:event_BtnAddActionPerformed

    private void TextFieldAddItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldAddItemMouseClicked
        TextFieldAddItem.setText("");
        TextFieldAddItem.setForeground(Color.black);
    }//GEN-LAST:event_TextFieldAddItemMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnPrint;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JPanel PnlAddBtn;
    private javax.swing.JPanel PnlBBottom;
    private javax.swing.JPanel PnlBottom;
    private javax.swing.JPanel PnlCenter;
    private javax.swing.JPanel PnlClearBtn;
    private javax.swing.JPanel PnlDeleteBtn;
    private javax.swing.JPanel PnlGroceryCount;
    private javax.swing.JPanel PnlPrintBtn;
    private javax.swing.JPanel PnlTTop;
    private javax.swing.JPanel PnlTop;
    private javax.swing.JPanel PnlUpdateBtn;
    private javax.swing.JTable TableGrocery;
    private javax.swing.JTextField TextFieldAddItem;
    private javax.swing.JLabel jLabelGroceries;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldIngredient;
    private javax.swing.JTextField jTextFieldQty;
    private javax.swing.JTextField jTextFieldRecipe;
    private javax.swing.JTextField jTextFieldSL;
    private javax.swing.JTextField jTextFieldUnit;
    // End of variables declaration//GEN-END:variables
}
