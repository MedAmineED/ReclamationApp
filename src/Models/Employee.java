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
public class Employee {
    private int id;
    private int matricule;
    private String mdp;
    private String nom;
    private String prenom;
    private String adresse;
    private String numtel;
    private String email;
    private Specialite sp;

    public Employee() {
    }
    
    public Employee(int id, int matricule, String pwd, String nom, String prenom, String adresse, String numtel, String email, Specialite sp){
        this.id = id;
        this.matricule = matricule;
        this.mdp = pwd;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numtel = numtel;
        this.email = email;
        this.sp = sp;
    }
    
    public Employee( int matricule, String pwd, String nom, String prenom, String adresse, String numtel, String email, Specialite sp){
        this.matricule = matricule;
        this.mdp = pwd;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numtel = numtel;
         this.email = email;
         this.sp = sp;
    }
    
      public Employee(int matricule, String pwd){
        this.matricule = matricule;
        this.mdp = pwd;
    }
    
    
    public boolean connexion(){
            Connection con = DbConnection.getConnection();
            if(con == null){
              return false;
            }
        
        String query = "SELECT E.*, S.lebelle FROM employee E, specialite S WHERE etat = 1 AND matricule = ? AND E.sp_id = S.id_sp;";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, this.matricule);
            ResultSet rst = ps.executeQuery();
            boolean exist = false;
            
            while (rst.next()) {                
                if(rst.getString(3).equals(this.mdp)){
                    exist = true;
                    this.matricule = rst.getInt(2);
                    this.sp = new Specialite(rst.getString(12));
                    return true;
                }
                else {
                    return false;
                }
            }
            if(!exist)return false;
            ps.close();
        }catch(Exception e){
            e.getMessage();
            return false;
        }
        return false;
    }

    public void afficher(JTable jTabel){
            Connection con = DbConnection.getConnection();
            try{
                String sql= "select E.matricule, E.mdp as mot_de_passe, E.nom, E.prenom, adresse, numtel as numero_de_tel, email, S.lebelle as specialite from employee E, specialite S WHERE etat = 1 AND E.sp_id = S.id_sp;";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs =ps.executeQuery();
                jTabel.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
    
    public void rechercher(JTable jTabel, String option, String valeur) {
            Connection con = DbConnection.getConnection();
           String sql= "select E.matricule, E.mdp as mot_de_passe, E.nom, E.prenom, adresse, numtel as numero_de_tel, email, S.lebelle as specialite from employee E, specialite S WHERE etat = 1 AND E.sp_id = S.id_sp;";
           switch (option) {
            case "Tout":
                sql= "select E.matricule, E.mdp as mot_de_passe, E.nom, E.prenom, adresse, numtel as numero_de_tel, email, S.lebelle as specialite from employee E, specialite S WHERE etat = 1 AND E.sp_id = S.id_sp;";
                break;
           case "Matrecule":
                sql= "select E.matricule, E.mdp as mot_de_passe, E.nom, E.prenom, adresse, numtel as numero_de_tel, email, S.lebelle as specialite from employee E, specialite S WHERE matricule = "+ valeur +" AND etat = 1 AND E.sp_id = S.id_sp;";
                break;
            case "Nom":
                sql= "select E.matricule, E.mdp as mot_de_passe, E.nom, E.prenom, adresse, numtel as numero_de_tel, email, S.lebelle as specialite from employee E, specialite S WHERE nom LIKE "+ valeur +" AND etat = 1 AND E.sp_id = S.id_sp;";
                break;
            case "Prenom":
                sql= "select E.matricule, E.mdp as mot_de_passe, E.nom, E.prenom, adresse, numtel as numero_de_tel, email, S.lebelle as specialite from employee E, specialite S WHERE prenom LIKE "+ valeur +" AND etat = 1 AND E.sp_id = S.id_sp;";
                break;
            case "Num_Tel":
                sql= "select E.matricule, E.mdp as mot_de_passe, E.nom, E.prenom, adresse, numtel as numero_de_tel, email, S.lebelle as specialite from employee E, specialite S WHERE numtel = "+ valeur +" AND etat = 1 AND E.sp_id = S.id_sp;";
                break;
            case "Specialiter":
                sql= "select E.matricule, E.mdp as mot_de_passe, E.nom, E.prenom, adresse, numtel as numero_de_tel, email, S.lebelle as specialite from employee E, specialite S WHERE S.lebelle = "+ valeur +" AND etat = 1 AND E.sp_id = S.id_sp;";
                break;
            default:
                throw new AssertionError();
        }
            try{
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs =ps.executeQuery();
                jTabel.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
 public void getEmployeeByMatricule(int matricule) {
    try {
        Connection con = DbConnection.getConnection();
        String sql = "SELECT * FROM employee WHERE etat = 1 AND matricule=?";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, matricule);
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
          this.matricule = rs.getInt("matricule");
          this.mdp = rs.getString("mdp");
          this.nom = rs.getString("nom");
          this.prenom = rs.getString("prenom");
          this.adresse = rs.getString("adresse");
          this.numtel = rs.getString("numtel");
          this.email = rs.getString("email");
        }
        
        rs.close();
        ps.close();
        con.close(); // Close the connection after usage
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}
    
    public void ajouter() {
        try{
            Connection con = DbConnection.getConnection();
            String sql = "INSERT INTO employee (matricule, mdp, nom, prenom, adresse, numtel, email, sp_id)"
                + " VALUES(?,?,?,?,?,?,?,?);";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, this.matricule);
            ps.setString(2, this.mdp);
            ps.setString(3, this.nom);
            ps.setString(4, this.prenom);
            ps.setString(5, this.adresse);
            ps.setString(6, this.numtel);
            ps.setString(7, this.email);
            ps.setInt(8, this.sp.getIdSp());
            
            ps.executeUpdate();
            
            ps.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void supprimer(int matricule) {
            try{
        Connection con = DbConnection.getConnection();
        String tableName = "employee";
        String sql = "UPDATE " + tableName + " SET etat = 0 WHERE matricule = " + matricule + ";";
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.executeUpdate();
        
        ps.close();
        con.close(); // Close the connection after usage
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
public void modifier() {
    try {
        Connection con = DbConnection.getConnection();
        String sql = "UPDATE employee SET mdp=?, nom=?, prenom=?, adresse=?, numtel=?, email=?, sp_id=? WHERE etat = 1 AND matricule=?";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, this.mdp);
        ps.setString(2, this.nom);
        ps.setString(3, this.prenom);
        ps.setString(4, this.adresse);
        ps.setString(5, this.numtel);
        ps.setString(6, this.email);
        ps.setInt(7, this.sp.getIdSp());
        ps.setInt(8, this.matricule);
        
        
        int rowsAffected = ps.executeUpdate();
        
        if (rowsAffected > 0) {
            System.out.println("Employee with matricule " + matricule + " updated successfully.");
        } else {
            System.out.println("No employee found with matricule " + matricule + ".");
        }
        
        ps.close();
        con.close(); // Close the connection after usage
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumtel() {
        return numtel;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Specialite getSp() {
        return sp;
    }

    public void setSp(Specialite sp) {
        this.sp = sp;
    }
}

