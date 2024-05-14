package Models;

import DBconnect.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
/**
 *
 * @author essid
 */
public class Admin {
    private int id;
    private int matricule;
    private String pwd;

    public Admin() {
    }
    
    public Admin(int matricule, String pwd){
        this.id = id;
        this.matricule = matricule;
        this.pwd = pwd;
    }
    
    
     public boolean connexion(){
            Connection con = DbConnection.getConnection();
            if(con == null){
              return false;
            }
        
        String query = "SELECT * FROM admin WHERE matricule = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, this.matricule);
            ResultSet rst = ps.executeQuery();
            boolean exist = false;
            
            while (rst.next()) {                
                if(rst.getString(3).equals(this.pwd)){
                    exist = true;
                    System.out.print("\t"+ rst.getInt(2));
                    System.out.print("\t"+ rst.getString(3));
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
        return true;
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    
}
