
package Modelo;

import Clases.Consumo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class F_Consumo {
    
   private Conexion mysql=new Conexion();
   private Connection cn;
   
   private String sSQL="";
   public Integer TotalRegistros;
   public Double TotalConsumo;
   
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"Id","Id_Reserva","Id_Producto","Producto","Cantidad","Precio Venta","Estado"};
       
       String [] registro =new String [7];
       
       TotalRegistros=0;
       TotalConsumo=0.0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select c.Id_consumo,c.Id_Reserva,c.Id_Producto,p.Nombre,c.Cantidad,c.Precio_Venta "
               + ",c.Estado from Consumo c inner join Producto p on c.Id_Producto=p.Id_Producto"
               + " where c.Id_Reserva ="+ buscar + " order by c.Id_Consumo desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("Id_consumo");
               registro [1]=rs.getString("Id_Reserva");
               registro [2]=rs.getString("Id_Producto");
               registro [3]=rs.getString("Nombre");
               registro [4]=rs.getString("Cantidad");
               registro [5]=rs.getString("Precio_Venta");
               registro [6]=rs.getString("Estado");
               
               TotalRegistros=TotalRegistros+1;
               TotalConsumo=TotalConsumo + (rs.getDouble("Cantidad") * rs.getDouble("Precio_Venta") );
               
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean insertar (Consumo dts){
       sSQL="insert into Consumo (Id_Reserva,Id_Producto,Cantidad,Precio_Venta,Estado)" +
               "values (?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getId_Reserva());
           pst.setInt(2, dts.getId_Producto());
           pst.setDouble(3, dts.getCantidad());
           pst.setDouble(4, dts.getPrecio_Venta());
           pst.setString(5, dts.getEstado());
           
           
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
   
   public boolean editar (Consumo dts){
       sSQL="update consumo set Id_Reserva=?,Id_Producto()=?,Cantidad=?,Precio_Venta=?,Estado=?"+
               " where Id_Consumo=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getId_Reserva());
           pst.setInt(2, dts.getId_Producto());
           pst.setDouble(3, dts.getCantidad());
           pst.setDouble(4, dts.getPrecio_Venta());
           pst.setString(5, dts.getEstado());
           pst.setInt(6, dts.getId_Consumo());
           
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
  
   public boolean eliminar (Consumo dts){
       sSQL="delete from Consumo where Id_Consumo=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getId_Consumo());
           
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
