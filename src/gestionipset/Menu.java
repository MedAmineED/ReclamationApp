/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestionipset;

import javax.swing.JFrame;

/**
 *
 * @author essid
 */
public class Menu extends javax.swing.JFrame {

    private int matricule;
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pcRec.setVisible(false);
    }
    
    public Menu(int matricule) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.matricule = matricule;
        this.traiterRec.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gdtEmp = new javax.swing.JButton();
        traiterRec = new javax.swing.JButton();
        pcRec = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gdtEmp.setBackground(new java.awt.Color(0, 51, 102));
        gdtEmp.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        gdtEmp.setForeground(new java.awt.Color(255, 255, 255));
        gdtEmp.setText("Gestion employee");
        gdtEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gdtEmpActionPerformed(evt);
            }
        });
        getContentPane().add(gdtEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 280, 90));

        traiterRec.setBackground(new java.awt.Color(0, 51, 102));
        traiterRec.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        traiterRec.setForeground(new java.awt.Color(255, 255, 255));
        traiterRec.setText("Traiter les reclamations");
        traiterRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traiterRecActionPerformed(evt);
            }
        });
        getContentPane().add(traiterRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 290, 90));

        pcRec.setBackground(new java.awt.Color(0, 51, 102));
        pcRec.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        pcRec.setForeground(new java.awt.Color(255, 255, 255));
        pcRec.setText("Passer une reclamation");
        pcRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcRecActionPerformed(evt);
            }
        });
        getContentPane().add(pcRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 280, 90));

        jLabel2.setText(".                                                                                                                                       .");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 410, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\essid\\Downloads\\aaaa.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -10, 1080, 570));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 510, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void traiterRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traiterRecActionPerformed
        GestionRec rc = new GestionRec();
        rc.show(true);
        this.dispose();
    }//GEN-LAST:event_traiterRecActionPerformed

    private void gdtEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gdtEmpActionPerformed
        GestionEmplyee emp; 
        if(this.matricule > 0){
            emp= new GestionEmplyee(this.matricule);
        }else {
            emp= new GestionEmplyee();
        }
        emp.show(true);
        this.dispose();
    }//GEN-LAST:event_gdtEmpActionPerformed

    private void pcRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcRecActionPerformed
          ReclamtionEmp rcEmp = new ReclamtionEmp(this.matricule, "RH");
          rcEmp.show(true);
    }//GEN-LAST:event_pcRecActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gdtEmp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pcRec;
    private javax.swing.JButton traiterRec;
    // End of variables declaration//GEN-END:variables
}
