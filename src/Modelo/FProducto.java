
package Modelo;

import Clases.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FProducto extends Conexion {
   
   private Conexion mysql=new Conexion();
   private Connection cn;
   private String sSQL="";
   public Integer totalregistros;

   
   public DefaultTableModel Mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Producto","Descripción","Unidad Medida","Precio Venta"};
       
       String [] registro =new String [5];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from Producto where Nombre like '%"+ buscar + "%' order by Id_Producto desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("Id_Producto");
               registro [1]=rs.getString("Nombre");
               registro [2]=rs.getString("Descripcion");
               registro [3]=rs.getString("Unidad_Medida");
               registro [4]=rs.getString("Precio_Venta");
               
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean Insertar (Producto dts){
       sSQL="insert into Producto (Nombre,Descripcion,Unidad_Medida,Precio_Venta)" +
               "values (?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getNombre());
           pst.setString(2, dts.getDescripcion());
           pst.setString(3, dts.getUnidad_Medida());
           pst.setDouble(4, dts.getPrecio_Venta());
           
           
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
   
   public boolean Editar (Producto dts){
       sSQL="update Producto set Nombre=?,Descripcion=?,Unidad_Medida=?,Precio_Venta=?"+
               " where Id_Producto=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getNombre());
           pst.setString(2, dts.getDescripcion());
           pst.setString(3, dts.getUnidad_Medida());
           pst.setDouble(4, dts.getPrecio_Venta());
           pst.setInt(5, dts.getId_Producto());
           
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
  
   public boolean Eliminar (Producto dts){
       sSQL="delete from Producto where Id_Producto=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getId_Producto());
           
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
