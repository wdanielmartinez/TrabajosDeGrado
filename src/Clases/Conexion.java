package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    private final String base = "trabajodegrados";
    private final String user = "root";
    private final String password = "wild24174485***";//contraseña
    private final String url = "jdbc://myql://localhost:3306/" + base;
    private Connection con = null;
    
    public Connection getConexion(){
        

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
   
  
        return con;
    }
    
}
