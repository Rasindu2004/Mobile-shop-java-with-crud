/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Rasindu
 */
public class JDBC {
    public static void main(String[] args) {
        
        connectdb();
    }
    public static Connection connectdb(){
        
     try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.
          getConnection("jdbc:mysql://localhost/phone","root", "RV118821");
           
          return conn;
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
           return null;
        }
    
    }
    
    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    Object connetdb() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
