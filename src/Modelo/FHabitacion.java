
package Modelo;

import Clases.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FHabitacion extends Conexion {
 
    public Integer TotalRegistro;
    private Conexion mysql=new Conexion();
    private Connection cn;
    private String sSQL="";

    

   
    
   
   
   public DefaultTableModel Mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Número","Piso","Descripción","Caracteristicas","Precio","Estado","Tipo habitación"};
       
       String [] registro =new String [8];
       
       TotalRegistro=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from Habitacion where Piso like '%"+ buscar + "%' order by IdHabitacion";
       
       try {
           cn=mysql.conectar();
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("IdHabitacion");
               registro [1]=rs.getString("Numero");
               registro [2]=rs.getString("Piso");
               registro [3]=rs.getString("Descripcion");
               registro [4]=rs.getString("Caracteristicas");
               registro [5]=rs.getString("Precio_Diario");
               registro [6]=rs.getString("Estado");
               registro [7]=rs.getString("Tipo_Habitacion");
               
               TotalRegistro=TotalRegistro+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
     } 
   
   public DefaultTableModel Mostrarvista(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Número","Piso","Descripción","Caracteristicas","Precio","Estado","Tipo Habitación"};
       
       String [] registro =new String [8];
       
       TotalRegistro=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from Habitacion where Piso like '%"+ buscar + "%' and Estado='Disponible' order by IdHabitacion";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("IdHabitacion");
               registro [1]=rs.getString("Numero");
               registro [2]=rs.getString("Piso");
               registro [3]=rs.getString("Descripcion");
               registro [4]=rs.getString("Caracteristicas");
               registro [5]=rs.getString("Precio_Diario");
               registro [6]=rs.getString("Estado");
               registro [7]=rs.getString("Tipo_Habitacion");
               
               TotalRegistro=TotalRegistro+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
     } 
 
   
   public boolean Insertar (Habitacion dts){
       sSQL="insert into Habitacion Numero,Piso,Descripcion,Caracteristicas,Precio_Dia,Estado,Tipo_Habitacion)" +
               "values (?,?,?,?,?,?,?)";
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getNumero());
           pst.setString(2, dts.getPiso());
           pst.setString(3, dts.getDescripcion());
           pst.setString(4, dts.getCaracteristicas());
           pst.setDouble(5, dts.getPrecio_Dia());
           pst.setString(6, dts.getEstado());
           pst.setString(7, dts.getTipo_Habitacion());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
           
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
   
   public boolean Editar (Habitacion dts){
       sSQL="update Habitacion set Numero=?,Piso=?,Descripcion=?,Caracteristicas=?,Precio_Diario=?,Estado=?,Tipo_Habitacion=?"+
               " where IdHabitacion=?";
           
       
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getNumero());
           pst.setString(2, dts.getPiso());
           pst.setString(3, dts.getDescripcion());
           pst.setString(4, dts.getCaracteristicas());
           pst.setDouble(5, dts.getPrecio_Dia());
           pst.setString(6, dts.getEstado());
           pst.setString(7, dts.getTipo_Habitacion());
           pst.setInt(8, dts.getIdHabitacion());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   } 
  
   public boolean desocupar (Habitacion dts){
       sSQL="update Habitacion set Estado='Disponible'"+
               " where IdHabitacion=?";
           //alt + 39
       
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getIdHabitacion());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   } 
  
   
   public boolean Ocupar (Habitacion dts){
       sSQL="update Habitacion set Estado='Ocupado'"+
               " where IdHabitacion=?";
           //alt + 39
       
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getIdHabitacion());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   } 
  
   
   public boolean Eliminar (Habitacion dts){
       sSQL="delete from Habitacion where IdHabitacion=?";
       
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdHabitacion());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
  
   
   
    
   
   
  
  
}
