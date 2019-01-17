
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
       
       String [] titulos = {"Id","IdReserva","IdProducto","Producto","Cantidad","Precio Venta","Estado"};
       
       String [] registro =new String [7];
       
       TotalRegistros=0;
       TotalConsumo=0.0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select c.Idconsumo,c.IdReserva,c.IdProducto,p.Nombre,c.Cantidad,c.Precio_Venta "
               + ",c.Estado from Consumo c inner join Producto p on c.IdProducto=p.IdProducto"
               + " where c.IdReserva ="+ buscar + " order by c.IdConsumo desc";
       
       try {
           cn=mysql.conectar();
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("Idconsumo");
               registro [1]=rs.getString("IdReserva");
               registro [2]=rs.getString("IdProducto");
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
       sSQL="insert into Consumo (IdReserva,IdProducto,Cantidad,Precio_Venta,Estado)" +
               "values (?,?,?,?,?)";
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdReserva());
           pst.setInt(2, dts.getIdProducto());
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
       sSQL="update consumo set IdReserva=?,IdProducto()=?,Cantidad=?,Precio_Venta=?,Estado=?"+
               " where IdConsumo=?";
           
       
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdReserva());
           pst.setInt(2, dts.getIdProducto());
           pst.setDouble(3, dts.getCantidad());
           pst.setDouble(4, dts.getPrecio_Venta());
           pst.setString(5, dts.getEstado());
           pst.setInt(6, dts.getIdConsumo());
           
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
       sSQL="delete from Consumo where IdConsumo=?";
       
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdConsumo());
           
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
