/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import DBconnect.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author essid
 */
public class Commentaire {
    private int id;
    private String contenu;
    private int idRec;

    public Commentaire() {
    }

    public Commentaire(String contenu, int idRec) {
        this.contenu = contenu;
        this.idRec = idRec;
    }
    
    
    public Commentaire(int id, String contenu, int idRec) {
        this.id = id;
        this.contenu = contenu;
        this.idRec = idRec;
    }

    
    public void ajouter() {
        try{
            Connection con = DbConnection.getConnection();
            String sql = "INSERT INTO commentaire (contenu, id_rec)"
                + " VALUES(?,?);";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.contenu);
            ps.setInt(2, this.idRec);
           
            
            ps.executeUpdate();
            
            ps.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public int getIdRec() {
        return idRec;
    }

    public void setIdRec(int idRec) {
        this.idRec = idRec;
    }
    
    
    
    
    
}
