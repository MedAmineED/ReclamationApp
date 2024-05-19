/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import DBconnect.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author essid
 */
public class Statistique {
    private int nombreEmp;
    private int nbrRclm;
    private int rclmTrt;
    private int rclmEncour;
    private int rclmRefuse;
    private int rclmAccepter;

    public Statistique() {
    }

    public Statistique(int nombreEmp, int nbrRclm, int rclmTrt, int rclmEncour, int rclmRefuse, int rclmAccepter) {
        this.nombreEmp = nombreEmp;
        this.nbrRclm = nbrRclm;
        this.rclmTrt = rclmTrt;
        this.rclmEncour = rclmEncour;
        this.rclmRefuse = rclmRefuse;
        this.rclmAccepter = rclmAccepter;
    }

    
    
    
    
    
    
    
    
    
    
public void getNombreEmployes() {
    try {
        Connection con = DbConnection.getConnection();
        String sql = "SELECT COUNT(*) AS total_employees FROM employee WHERE etat = 1";
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
          this.nombreEmp = rs.getInt("total_employees");
        }
        
        rs.close();
        ps.close();
        con.close(); // Close the connection after usage
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}


public void getNombreReclamation() {
    try {
        Connection con = DbConnection.getConnection();
        String sql = "SELECT COUNT(*) AS total_reclamation FROM reclamation;";
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
          this.nbrRclm = rs.getInt("total_reclamation");
        }
        
        rs.close();
        ps.close();
        con.close(); // Close the connection after usage
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}


public void getNombreReclamationTraitee() {
    try {
        Connection con = DbConnection.getConnection();
        String sql = "SELECT COUNT(*) AS total_reclamation FROM reclamation WHERE etat != 'en cours'";
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
          this.rclmTrt = rs.getInt("total_reclamation");
        }
        
        rs.close();
        ps.close();
        con.close(); // Close the connection after usage
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}


public void getNombreReclamationEncour() {
    try {
        Connection con = DbConnection.getConnection();
        String sql = "SELECT COUNT(*) AS total_reclamation FROM reclamation WHERE etat = 'en cours'";
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
          this.rclmEncour = rs.getInt("total_reclamation");
        }
        
        rs.close();
        ps.close();
        con.close(); // Close the connection after usage
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}


public void getNombreReclamationAccepte() {
    try {
        Connection con = DbConnection.getConnection();
        String sql = "SELECT COUNT(*) AS total_reclamation FROM reclamation WHERE etat = 'accepter'";
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
          this.rclmAccepter = rs.getInt("total_reclamation");
        }
        
        rs.close();
        ps.close();
        con.close(); // Close the connection after usage
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}


public void getNombreReclamationRefuse() {
    try {
        Connection con = DbConnection.getConnection();
        String sql = "SELECT COUNT(*) AS total_reclamation FROM reclamation WHERE etat = 'refuser'";
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
          this.rclmRefuse = rs.getInt("total_reclamation");
        }
        
        rs.close();
        ps.close();
        con.close(); // Close the connection after usage
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}

public void getAllStatistique() {
    this.getNombreEmployes();
    this.getNombreReclamation();
    this.getNombreReclamationTraitee();
    this.getNombreReclamationEncour();
    this.getNombreReclamationAccepte();
    this.getNombreReclamationRefuse();
}


    
    
    
    
    
    
    
    
    public int getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(int nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public int getNbrRclm() {
        return nbrRclm;
    }

    public void setNbrRclm(int nbrRclm) {
        this.nbrRclm = nbrRclm;
    }

    public int getRclmTrt() {
        return rclmTrt;
    }

    public void setRclmTrt(int rclmTrt) {
        this.rclmTrt = rclmTrt;
    }

    public int getRclmEncour() {
        return rclmEncour;
    }

    public void setRclmEncour(int rclmEncour) {
        this.rclmEncour = rclmEncour;
    }

    public int getRclmRefuse() {
        return rclmRefuse;
    }

    public void setRclmRefuse(int rclmRefuse) {
        this.rclmRefuse = rclmRefuse;
    }

    public int getRclmAccepter() {
        return rclmAccepter;
    }

    public void setRclmAccepter(int rclmAccepter) {
        this.rclmAccepter = rclmAccepter;
    }
    
    
    
}
