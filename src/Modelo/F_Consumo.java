
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
   
   private String DSQL="";
   public Integer TotalRegistros;
   public Double TotalConsumo;
   
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"Id","idreserva","idproducto","producto","cantidad","precio venta","estado"};
       
       String [] registro =new String [7];
       
       TotalRegistros=0;
       TotalConsumo=0.0;
       modelo = new DefaultTableModel(null,titulos);
       
       DSQL="select c.idconsumo,c.idreserva,c.idproducto,p.nombre,c.cantidad,c.precio_venta "
               + ",c.estado from consumo c inner join producto p on c.idproducto=p.idproducto"
               + " where c.idreserva ="+ buscar + " order by c.idconsumo desc";
       
       try {
           cn=mysql.conectar();
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(DSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idconsumo");
               registro [1]=rs.getString("idreserva");
               registro [2]=rs.getString("idproducto");
               registro [3]=rs.getString("nombre");
               registro [4]=rs.getString("cantidad");
               registro [5]=rs.getString("precio_venta");
               registro [6]=rs.getString("estado");
               
               TotalRegistros=TotalRegistros+1;
               TotalConsumo=TotalConsumo + (rs.getDouble("cantidad") * rs.getDouble("precio_venta") );
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       } 
   } 
   
   public boolean insertar (Consumo dts){
       DSQL="insert into consumo (idreserva,idproducto,cantidad,precio_venta,estado)" +
               "values (?,?,?,?,?)";
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(DSQL);
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
       DSQL="update consumo set idreserva=?,idproducto()=?,cantidad=?,precio_venta=?,estado=?"+
               " where idconsumo=?";
           
       
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(DSQL);
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
       DSQL="delete from consumo where idconsumo=?";
       
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(DSQL);
           
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
