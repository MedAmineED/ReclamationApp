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
public class EmployeEx {
    private int id_ex;
    private int id_emp;
    private int id_rh;
    private String raison;

    public EmployeEx() {
    }

    public EmployeEx(int id_emp, int id_rh, String raison) {
        this.id_emp = id_emp;
        this.id_rh = id_rh;
        this.raison = raison;
    }

    public EmployeEx(int id_ex, int id_emp, int id_rh, String raison) {
        this.id_ex = id_ex;
        this.id_emp = id_emp;
        this.id_rh = id_rh;
        this.raison = raison;
    }
    
    
    
    public void ajouter() {
        try{
            Connection con = DbConnection.getConnection();
            String sql = "INSERT INTO employesexclus (id_emp, id_rh, raison, etat)"
                + " VALUES(?,?,?,'en cours');";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, this.id_emp);
            ps.setInt(2, this.id_rh);
            ps.setString(3, this.raison);
           
            
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
                String sql= "select E.matricule, E.mdp as mot_de_passe, E.nom, E.prenom, adresse, numtel as numero_de_tel, email, Ex.etat AS decision from employee E, employesexclus Ex WHERE Ex.id_emp = E.matricule ORDER BY id_ex DESC;";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs =ps.executeQuery();
                jTabel.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
    public void traiter(int idDem, String dsc) {
       try{
        Connection con = DbConnection.getConnection();
        String tableName = "employesexclus";
        String sql = "UPDATE " + tableName + " SET etat = '"+ dsc +"' WHERE id_emp = " + idDem + ";";
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.executeUpdate();
        
        ps.close();
        con.close(); // Close the connection after usage
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
