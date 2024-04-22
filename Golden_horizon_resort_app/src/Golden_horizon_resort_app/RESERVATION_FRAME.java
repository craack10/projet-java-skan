/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Golden_horizon_resort_app;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.Scanner;
import java.awt.Component;
import javax.swing.table.TableColumnModel;
import javax.swing.BorderFactory;
import javax.swing.table.JTableHeader;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import javax.swing.* ;
/**
 *
 * @author ASUS
 */
    class TransparentTableHeader extends JTableHeader {

    public TransparentTableHeader(javax.swing.JTable table,TableColumnModel columnModel) {
        super(columnModel);
        setOpaque(false); // Make the header non-opaque
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Cast Graphics to Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Set gradient background (adjust as needed)
        Color color1 = getBackground();
        Color color2 = color1.darker().darker(); // Darken color for gradient effect
        GradientPaint gradient = new GradientPaint(0, 0, color1, getWidth(), getHeight(), color2);
        g2.setPaint(gradient);
        g2.fillRect(0, 0, getWidth(), getHeight());

        // Call super to paint the actual header components
        super.paintComponent(g);
    }
}

public class RESERVATION_FRAME extends javax.swing.JFrame {

    /**
     * Creates new form RESERVATION_FRAME
     */
    public RESERVATION_FRAME() {
        initComponents();
        jTable1.setBackground(new Color(0,0,0,0));
        ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
        jTable1.setShowGrid(false);
        jScrollPane1.setBackground(new Color(0,0,0,0));
        jTable1.setOpaque(false);
        jTable1.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        
        jScrollPane1.setOpaque(false);
                ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setOpaque(false);

        // Get the column model of the table
        TableColumnModel columnModel = jTable1.getColumnModel();

        // Loop through each column and set the cell renderer to center-align the text
        for (int columnIndex = 0; columnIndex < columnModel.getColumnCount(); columnIndex++) {
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER); // Center align text
            columnModel.getColumn(columnIndex).setCellRenderer(renderer);
        }
        TransparentTableHeader header = new TransparentTableHeader(jTable1,columnModel);
        jTable1.setTableHeader(header);
        jScrollPane1.getViewport().setOpaque(false);

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        filter_icon = new javax.swing.JLabel();
        filter_drop_menu = new javax.swing.JComboBox<>();
        add_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setSize(new java.awt.Dimension(1089, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(78, 78, 78));
        jButton1.setFont(new java.awt.Font("Gabarito", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Chambre");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 130, 30));

        jButton2.setBackground(new java.awt.Color(78, 78, 78));
        jButton2.setFont(new java.awt.Font("Gabarito", 0, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Client");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 130, 30));

        jButton3.setBackground(new java.awt.Color(78, 78, 78));
        jButton3.setFont(new java.awt.Font("Gabarito", 0, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Reservation");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 130, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 167, 93));
        jLabel1.setText("Reservation");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        filter_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/prime_filter.png"))); // NOI18N
        getContentPane().add(filter_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, -1, -1));

        filter_drop_menu.setBackground(new java.awt.Color(67, 65, 65));
        filter_drop_menu.setForeground(jLabel1.getForeground());
        filter_drop_menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Newest", "Oldest" }));
        filter_drop_menu.setBorder(null);
        filter_drop_menu.setOpaque(true);
        filter_drop_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter_drop_menuActionPerformed(evt);
            }
        });
        getContentPane().add(filter_drop_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 80, 30));

        add_button.setBackground(jLabel1.getForeground());
        add_button.setFont(new java.awt.Font("Gabarito", 0, 18)); // NOI18N
        add_button.setForeground(new java.awt.Color(255, 255, 255));
        add_button.setText("+ Ajouter");
        add_button.setBorder(null);
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(add_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 134, 115, 40));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        jTable1.setFont(new java.awt.Font("Helvetica", 0, 15)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {s, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 45", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        jTable1.setOpaque(false);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 210, 890, -1));

        jPanel1.setBackground(new java.awt.Color(131, 129, 129));

        jTextField1.setBackground(new java.awt.Color(131, 129, 129));
        jTextField1.setFont(new java.awt.Font("Gabarito", 0, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(66, 66, 66));
        jTextField1.setText("Search By Num_Reservation");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(131, 129, 129));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconamoon_search-thin.png"))); // NOI18N
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 139, 444, 33));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reservation.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1089, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setForeground(Color.getHSBColor(45, 51, 75));
        
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setForeground(Color.white);
        
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setForeground(Color.getHSBColor(45, 51, 75));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
       jButton3.setForeground(Color.white);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setForeground(Color.getHSBColor(45, 51, 75));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setForeground(Color.white);

    }//GEN-LAST:event_jButton2MouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_buttonActionPerformed

    private void filter_drop_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter_drop_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filter_drop_menuActionPerformed
    /**private void transparent(javax.swing.JScrollPane tab){
        tab.setBackground(new Color(0,0,0,0));
        
    }*/
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
            java.util.logging.Logger.getLogger(RESERVATION_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RESERVATION_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RESERVATION_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RESERVATION_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RESERVATION_FRAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JComboBox<String> filter_drop_menu;
    private javax.swing.JLabel filter_icon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
