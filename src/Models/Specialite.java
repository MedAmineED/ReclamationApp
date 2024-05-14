/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import DBconnect.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author essid
 */
public class Specialite {
    private int idSp;
    private String lebelle;

    public Specialite() {
    }

    public Specialite(int idSp, String lebelle) {
        this.idSp = idSp;
        this.lebelle = lebelle;
    }
    
    
    
    public ArrayList<Specialite> getSpecialite(){
            ArrayList<Specialite> allSpecialite = new ArrayList<>();
            Connection con = DbConnection.getConnection();
            if(con == null){
              return null;
            }
        
        String query = "SELECT * FROM specialite";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Specialite equipe = new Specialite(
                    rs.getInt("id_sp"),
                    rs.getString("lebelle")
                );
                allSpecialite.add(equipe);
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allSpecialite;
    }
    
    
    
    
    
    
    

    public int getIdSp() {
        return idSp;
    }

    public void setIdSp(int idSp) {
        this.idSp = idSp;
    }

    public String getLebelle() {
        return lebelle;
    }

    public void setLebelle(String lebelle) {
        this.lebelle = lebelle;
    }
    
    
}
