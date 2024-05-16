/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import DBconnect.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author essid
 */
public class Reclamation {
    private int numRec;
    private String contenu;
    private int matriculeEmp;
    private String etat;

    public Reclamation() {
    }

    public Reclamation(int matriculeEmp) {
        this.matriculeEmp = matriculeEmp;
    }
    public Reclamation(String contenu, int matriculeEmp, String etat) {
        this.numRec = numRec;
        this.contenu = contenu;
        this.matriculeEmp = matriculeEmp;
        this.etat = etat;
    }
    public Reclamation(int numRec, int matriculeEmp) {
        this.numRec = numRec;
        this.matriculeEmp = matriculeEmp;
    }
    
        public Reclamation(int numRec, String contenu, int matriculeEmp, String etat) {
        this.numRec = numRec;
        this.contenu = contenu;
        this.matriculeEmp = matriculeEmp;
        this.etat = etat;
    }

    public void ajouter() {
        try{
            Connection con = DbConnection.getConnection();
            String sql = "INSERT INTO reclamation (contenu, mat_et, etat)"
                + " VALUES(?,?,?);";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.contenu);
            ps.setInt(2, this.matriculeEmp);
            ps.setString(3, this.etat);
            
            ps.executeUpdate();
            
            ps.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
   
   public void afficherRec(JTable jTabel){
            Connection con = DbConnection.getConnection();
            try{
                String sql = "SELECT num_dem AS numero_de_demande, contenu, etat, commentaire " +
             "FROM reclamation WHERE mat_et = " + this.matriculeEmp + " ORDER BY num_dem DESC;";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs =ps.executeQuery();
                jTabel.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
        
   public void afficher(JTable jTabel){
            Connection con = DbConnection.getConnection();
            try{
                String sql= "SELECT R.num_dem AS numero_Reclammation, contenu, E.nom, E.prenom, E.matricule, R.etat, R.commentaire FROM reclamation R, employee E WHERE mat_et = matricule ORDER BY num_dem DESC;";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs =ps.executeQuery();
                jTabel.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
      
   public void modifier(int numRec, String etat, String commentaire) {
    try {
        Connection con = DbConnection.getConnection();
        String sql = "UPDATE reclamation SET etat=?, commentaire=? WHERE num_dem=? AND etat = 'en cours'";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, etat);
        ps.setString(2, commentaire);
        ps.setInt(3, numRec);
        
        int rowsAffected = ps.executeUpdate();
        
        if (rowsAffected > 0) {
            System.out.println("etat " + etat + " updated successfully.");
        } else {
            System.out.println("error: " + etat + ".");
        }
        
        ps.close();
        con.close(); // Close the connection after usage
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
   }
      
    public void supprimer() {
            try{
                Connection con = DbConnection.getConnection();
                
                String sql= "select * from reclamation WHERE num_dem = ? AND mat_et = ? AND etat = 'en cours';";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, this.numRec);
                ps.setInt(2, this.matriculeEmp);
        
                ResultSet rs = ps.executeQuery();
                
                System.out.println("num rec = " + this.numRec);
                if (rs.next()) {
                    String etat = rs.getString("etat");
                    System.out.println("etat = " + etat);
                    if(etat.equals("en cours")){
                        String tableName = "reclamation";
                        String columnName = "num_dem";
                        sql = "DELETE FROM " + tableName + " WHERE " + tableName + "." + columnName + " = " + this.numRec + ";";
        
                        ps = con.prepareStatement(sql);
                        ps.executeUpdate();
                    }
                }
                ps.close();
                con.close(); // Close the connection after usage
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    
    public int getNumRec() {
        return numRec;
    }

    public void setNumRec(int numRec) {
        this.numRec = numRec;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public int getMatriculeEmp() {
        return matriculeEmp;
    }

    public void setMatriculeEmp(int matriculeEmp) {
        this.matriculeEmp = matriculeEmp;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
    
    
}
