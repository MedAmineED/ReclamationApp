/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import DBconnect.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author essid
 */
public class Historique {
    private int id;
    private String contenu;
   

    
    public Historique() {
    }

    public Historique(String contenu) {
        this.contenu = contenu;
    }
        
    
    public Historique(int id, String contenu) {
        this.id = id;
        this.contenu = contenu;
    }

    
    
    
    
    public void ajouter() {
        try{
            Connection con = DbConnection.getConnection();
            String sql = "INSERT INTO historiques (contenu)"
                + " VALUES(?);";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.contenu);
           
            
            ps.executeUpdate();
            
            ps.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }   
    
    
     public void afficher(JTable jTabel){
            Connection con = DbConnection.getConnection();
            try{
                String sql= "select contenu AS historiques FROM historiques ORDER BY id_h DESC;";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs =ps.executeQuery();
                jTabel.setModel(DbUtils.resultSetToTableModel(rs));
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

    
    
    
}
