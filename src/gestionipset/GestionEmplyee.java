/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestionipset;

import Models.Employee;
import Models.Historique;
import Models.Specialite;
import java.awt.Dimension;
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

        suppBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        modBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        nomEmp = new javax.swing.JTextField();
        prEmp = new javax.swing.JTextField();
        mtEmp = new javax.swing.JTextField();
        mdpEmp = new javax.swing.JTextField();
        adrEmp = new javax.swing.JTextField();
        numtelEmp = new javax.swing.JTextField();
        emailEmp = new javax.swing.JTextField();
        spCmb = new javax.swing.JComboBox<>();
        ajtBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        statistiqueBtn = new javax.swing.JButton();
        empExBtn = new javax.swing.JButton();
        historiqueBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEtudiant = new javax.swing.JTable();
        rechInput = new javax.swing.JTextField();
        rechBtn = new javax.swing.JButton();
        idInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboOpt = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        suppBtn.setBackground(new java.awt.Color(153, 153, 153));
        suppBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        suppBtn.setText("Supprimer");
        suppBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppBtnActionPerformed(evt);
            }
        });
        getContentPane().add(suppBtn);
        suppBtn.setBounds(829, 135, 110, 24);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Gestion Employe");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(376, 18, 290, 36);

        modBtn.setBackground(new java.awt.Color(153, 153, 153));
        modBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        modBtn.setText("Modifier");
        modBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modBtnActionPerformed(evt);
            }
        });
        getContentPane().add(modBtn);
        modBtn.setBounds(709, 135, 110, 24);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 51, 102));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1)
                .addContainerGap(854, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 940, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 960, 80);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));

        spCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "specialite" }));
        spCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spCmbActionPerformed(evt);
            }
        });

        ajtBtn.setBackground(new java.awt.Color(153, 153, 153));
        ajtBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ajtBtn.setText("Ajouter");
        ajtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajtBtnActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("- Specialite");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("- E-mail");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("- Numero de Telephone");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("- Address");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("- Mot de pass");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("- Matricule");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("- Pernom");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("- Nom");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mtEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mdpEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adrEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numtelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mtEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mdpEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adrEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numtelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ajtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, 407, -1));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 80, 440, 520);

        jPanel5.setBackground(new java.awt.Color(0, 51, 102));

        statistiqueBtn.setBackground(new java.awt.Color(153, 153, 153));
        statistiqueBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        statistiqueBtn.setText("les satatistiques");
        statistiqueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistiqueBtnActionPerformed(evt);
            }
        });

        empExBtn.setBackground(new java.awt.Color(153, 153, 153));
        empExBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        empExBtn.setText("les employes exclus");
        empExBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empExBtnActionPerformed(evt);
            }
        });

        historiqueBtn.setBackground(new java.awt.Color(153, 153, 153));
        historiqueBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        historiqueBtn.setText("Afficher historique");
        historiqueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiqueBtnActionPerformed(evt);
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

        rechBtn.setBackground(new java.awt.Color(153, 153, 153));
        rechBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rechBtn.setText("Rechercher");
        rechBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("- Matricule");

        comboOpt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tout", "Matrecule", "Nom", "Prenom", "Num_Tel", "Specialiter", " " }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(comboOpt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(rechInput, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6)
                        .addGap(11, 11, 11)
                        .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(historiqueBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(rechBtn))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(statistiqueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empExBtn)))
                .addGap(36, 36, 36))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rechInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboOpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rechBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statistiqueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historiqueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empExBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(440, 80, 520, 520);

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
                Employee emp = new Employee();
                emp.rechercher(tableEtudiant, this.comboOpt.getSelectedItem().toString(), this.rechInput.getText());
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
    private javax.swing.JComboBox<String> comboOpt;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
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
