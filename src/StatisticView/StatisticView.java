/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StatisticView;

import StatisticController.StatisticController;
import NavigationController.NavigationController;

/**
 *
 * @author Gisward
 */
public class StatisticView extends javax.swing.JFrame 
{
    StatisticController theStatisticController;
    NavigationController theNavigationController;
    
    /** 
     * Creates new form StatisticView 
     * @param  parentStatisticController the original StatisticController object
     */
    public StatisticView(StatisticController parentStatisticController, NavigationController parentNavigationController) 
    {
        this.theStatisticController = parentStatisticController;
        this.theNavigationController = parentNavigationController;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        foodRecFooter = new javax.swing.JButton();
        crudMoodFooter = new javax.swing.JButton();
        crudIntakeFooter = new javax.swing.JButton();
        foodScrollPane = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        drinkScrollPane = new javax.swing.JScrollPane();
        drinkTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        backButton.setText("Menu");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        foodRecFooter.setBackground(new java.awt.Color(0, 204, 0));
        foodRecFooter.setText("Food Recommendations");
        foodRecFooter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodRecFooterActionPerformed(evt);
            }
        });

        crudMoodFooter.setBackground(new java.awt.Color(255, 153, 153));
        crudMoodFooter.setText("Input Mood");
        crudMoodFooter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudMoodFooterActionPerformed(evt);
            }
        });

        crudIntakeFooter.setBackground(new java.awt.Color(153, 153, 255));
        crudIntakeFooter.setText("Input Intake");
        crudIntakeFooter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudIntakeFooterActionPerformed(evt);
            }
        });

        foodScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        foodTable.setBackground(new java.awt.Color(204, 204, 255));
        foodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Hamburger",  new Double(5.0), "14 hr"},
                {"Spaghetti",  new Double(16.0), "5 hr"},
                {"Sandwich",  new Double(3.0), "30 min"},
                {"Strawberries",  new Double(8.0), "2 min"}
            },
            new String [] {
                "Food", "Weight (oz)", "Time Since Consumed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        foodTable.setGridColor(new java.awt.Color(102, 102, 255));
        foodScrollPane.setViewportView(foodTable);

        drinkScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        drinkTable.setBackground(new java.awt.Color(255, 204, 204));
        drinkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Bubble Tea",  new Double(16.0), "2 hr"},
                {"Beer",  new Double(8.0), "12 hr"},
                {"Tea",  new Double(6.0), "20 min"},
                {"Water",  new Double(16.0), "5 min"}
            },
            new String [] {
                "Drink", "Weight (oz)", "Time Since Consumed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        drinkTable.setGridColor(new java.awt.Color(255, 153, 153));
        drinkScrollPane.setViewportView(drinkTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foodScrollPane)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addGap(0, 569, Short.MAX_VALUE))
                            .addComponent(drinkScrollPane))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(crudIntakeFooter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crudMoodFooter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foodRecFooter)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drinkScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crudMoodFooter)
                    .addComponent(crudIntakeFooter)
                    .addComponent(foodRecFooter))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Navigates user to the original NavigationView
     * @param evt 
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.theStatisticController.requestNavigationView();
    }//GEN-LAST:event_backButtonActionPerformed

    private void foodRecFooterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodRecFooterActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.theNavigationController.getFoodRecController();
    }//GEN-LAST:event_foodRecFooterActionPerformed

    private void crudMoodFooterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudMoodFooterActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.theNavigationController.getCrudMoodController();
    }//GEN-LAST:event_crudMoodFooterActionPerformed

    private void crudIntakeFooterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudIntakeFooterActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.theNavigationController.getCrudIntakeController();
    }//GEN-LAST:event_crudIntakeFooterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(StatisticView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatisticView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatisticView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatisticView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                //new StatisticView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton crudIntakeFooter;
    private javax.swing.JButton crudMoodFooter;
    private javax.swing.JScrollPane drinkScrollPane;
    private javax.swing.JTable drinkTable;
    private javax.swing.JButton foodRecFooter;
    private javax.swing.JScrollPane foodScrollPane;
    private javax.swing.JTable foodTable;
    // End of variables declaration//GEN-END:variables

}
