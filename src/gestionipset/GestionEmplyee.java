/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestionipset;

import Models.Employee;
import Models.Historique;
import Models.Specialite;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author essid
 */
public class GestionEmplyee extends javax.swing.JFrame {

    private int matricule;
    /**
     * Creates new form GestionEtudiant
     */
    public GestionEmplyee() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.matricule = 222;
        Employee etd = new Employee();
        etd.afficher(tableEtudiant);
        Specialite sp = new Specialite();
        ArrayList<Specialite> toutSp = sp.getSpecialite();
        for(Specialite spt : toutSp){
                spCmb.addItem(spt.getIdSp() + "_" + spt.getLebelle());
        }
    }

    public GestionEmplyee(int id_rh) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.matricule = id_rh;
        Employee etd = new Employee();
        etd.afficher(tableEtudiant);
        Specialite sp = new Specialite();
        ArrayList<Specialite> toutSp = sp.getSpecialite();
        for(Specialite spt : toutSp){
                spCmb.addItem(spt.getIdSp() + "_" + spt.getLebelle());
        }
        this.historiqueBtn.setVisible(false);
        this.statistiqueBtn.setVisible(false);
        this.empExBtn.setVisible(false);
    }
    



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        rechInput = new javax.swing.JTextField();
        ajtBtn = new javax.swing.JButton();
        mdpEmp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        suppBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rechBtn = new javax.swing.JButton();
        nomEmp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEtudiant = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adrEmp = new javax.swing.JTextField();
        emailEmp = new javax.swing.JTextField();
        prEmp = new javax.swing.JTextField();
        mtEmp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numtelEmp = new javax.swing.JTextField();
        modBtn = new javax.swing.JButton();
        idInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        spCmb = new javax.swing.JComboBox<>();
        historiqueBtn = new javax.swing.JButton();
        empExBtn = new javax.swing.JButton();
        statistiqueBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Source Sans Pro Black", 1, 18)); // NOI18N
        jLabel5.setText("email");

        ajtBtn.setText("Ajouter");
        ajtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajtBtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Source Sans Pro Black", 1, 18)); // NOI18N
        jLabel10.setText("Matricule");

        suppBtn.setText("Supprimer");
        suppBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Source Sans Pro Black", 1, 18)); // NOI18N
        jLabel7.setText("Mot de pass");

        rechBtn.setText("Rechercher");
        rechBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechBtnActionPerformed(evt);
            }
        });

        tableEtudiant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(tableEtudiant);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gestion employe");

        jLabel2.setFont(new java.awt.Font("Source Sans Pro Black", 1, 18)); // NOI18N
        jLabel2.setText("Nom");

        jLabel8.setFont(new java.awt.Font("Source Sans Pro Black", 1, 18)); // NOI18N
        jLabel8.setText("numero de telephone");

        jLabel3.setFont(new java.awt.Font("Source Sans Pro Black", 1, 18)); // NOI18N
        jLabel3.setText("Prenom");

        jLabel4.setFont(new java.awt.Font("Source Sans Pro Black", 1, 18)); // NOI18N
        jLabel4.setText("Address");

        modBtn.setText("Modifier");
        modBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("matricule");

        jLabel9.setFont(new java.awt.Font("Source Sans Pro Black", 1, 18)); // NOI18N
        jLabel9.setText("Specialite");

        spCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "specialite" }));
        spCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spCmbActionPerformed(evt);
            }
        });

        historiqueBtn.setText("Afficher historique");
        historiqueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiqueBtnActionPerformed(evt);
            }
        });

        empExBtn.setText("les employes exclus");
        empExBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empExBtnActionPerformed(evt);
            }
        });

        statistiqueBtn.setText("les satatistiques");
        statistiqueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistiqueBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mtEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(prEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mdpEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(adrEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(historiqueBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ajtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statistiqueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(numtelEmp, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(emailEmp, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addComponent(empExBtn)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rechInput, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rechBtn)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(suppBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(historiqueBtn)
                            .addComponent(empExBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(statistiqueBtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(numtelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel3)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(adrEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(mtEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mdpEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ajtBtn))))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rechInput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rechBtn)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suppBtn)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajtBtnActionPerformed
                        Specialite sp = new Specialite(Integer.parseInt(spCmb.getSelectedItem().toString().split("_")[0]), spCmb.getSelectedItem().toString().split("_")[1]);
                        Employee emp = new Employee(Integer.parseInt(mtEmp.getText()), mdpEmp.getText(), nomEmp.getText(), prEmp.getText(), adrEmp.getText(), numtelEmp.getText(), emailEmp.getText(), sp);
                        Historique hst = new Historique("le RH a ajoutee l'employe => nom : " + emp.getNom() + "| prenom : " + emp.getPrenom() + "| matricule : " + emp.getMatricule() + " comme un " + sp.getLebelle());
                        emp.ajouter();
                        emp.afficher(tableEtudiant);
                        hst.ajouter();
                        
    }//GEN-LAST:event_ajtBtnActionPerformed

    private void suppBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppBtnActionPerformed
                    if(this.matricule == 222) {
                        Employee emp = new Employee();
                        emp.supprimer(Integer.parseInt(idInput.getText()));
                        emp.afficher(tableEtudiant);
                    }else {
                        DemandeExclu dmn = new DemandeExclu(Integer.parseInt(idInput.getText()), this.matricule);
                        dmn.show(true);
                    }

                    
    }//GEN-LAST:event_suppBtnActionPerformed

    private void rechBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechBtnActionPerformed

    }//GEN-LAST:event_rechBtnActionPerformed

    private void modBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modBtnActionPerformed
             String sp = this.matricule == 222? "admin" : "RH";
             ModiferEmp md = new ModiferEmp(Integer.parseInt(this.idInput.getText()), tableEtudiant, sp);
             md.show(true);
    }//GEN-LAST:event_modBtnActionPerformed

    private void spCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spCmbActionPerformed

    private void historiqueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiqueBtnActionPerformed
        HistoriqueForm hst = new HistoriqueForm();
        hst.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        hst.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                hst.dispose(); // Close the frame when the window is being closed
            }
        });
        hst.show(true);
    }//GEN-LAST:event_historiqueBtnActionPerformed

    private void empExBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empExBtnActionPerformed
        EmployeExForm empex = new EmployeExForm();
        empex.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        empex.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                empex.dispose(); // Close the frame when the window is being closed
            }
        });
        empex.show(true);
    }//GEN-LAST:event_empExBtnActionPerformed

    private void statistiqueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statistiqueBtnActionPerformed
        StatistiqueForm stfrm =new StatistiqueForm();
        stfrm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        stfrm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                stfrm.dispose(); // Close the frame when the window is being closed
            }
        });
        stfrm.show(true);
    }//GEN-LAST:event_statistiqueBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu mn;    
        if(this.matricule == 222) {
                mn = new Menu();
        }
        else {
               mn = new Menu(this.matricule);
        }
               mn.setVisible(true);
               this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GestionEmplyee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionEmplyee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionEmplyee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionEmplyee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionEmplyee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adrEmp;
    private javax.swing.JButton ajtBtn;
    private javax.swing.JTextField emailEmp;
    private javax.swing.JButton empExBtn;
    private javax.swing.JButton historiqueBtn;
    private javax.swing.JTextField idInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mdpEmp;
    private javax.swing.JButton modBtn;
    private javax.swing.JTextField mtEmp;
    private javax.swing.JTextField nomEmp;
    private javax.swing.JTextField numtelEmp;
    private javax.swing.JTextField prEmp;
    private javax.swing.JButton rechBtn;
    private javax.swing.JTextField rechInput;
    private javax.swing.JComboBox<String> spCmb;
    private javax.swing.JButton statistiqueBtn;
    private javax.swing.JButton suppBtn;
    private javax.swing.JTable tableEtudiant;
    // End of variables declaration//GEN-END:variables
}
