package Modelo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
 
//    protected Connection conexion = null; //Cargar el Drive
//    PreparedStatement st; //Conecta al motor 
//    ResultSet rs; //Procesa las consultas  (INFORMACION)
    
    
    public String db="SistemaHotelGetsamani";
    public String url="jdbc:postgresql://localhost:5432/" +db;
    public String user="postgres";
    public String pass="0202572723";

    
        public Conexion() {
    }
    
  
   public Connection conectar(){
        Connection link=null;
        
        try {
            Class.forName("org.postgresql.Driver");
            link=DriverManager.getConnection(this.url, this.user, this.pass);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
        
        return link;
    }
  
}
