
package Modelo;

import Clases.Pago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class F_Pago {
  
   private Conexion mysql=new Conexion();
   private Connection cn;
   private String sSQL="";
   public Integer TotalRegistros;

  
   
   public DefaultTableModel Mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","IdReserva","Comprobante","Número","Iva","Total","Fecha Emisión","Fecha Pago"};
       
       String [] registro =new String [8];
       
       TotalRegistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from Pago where IdReserva="+ buscar + " order by IdPago desc";
       
       try {
           cn=mysql.conectar();
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("Id.Pago");
               registro [1]=rs.getString("IdReserva");
               registro [2]=rs.getString("Tipo_Comprobante");
               registro [3]=rs.getString("Numero_Comprobante");
               registro [4]=rs.getString("Iva");
               registro [5]=rs.getString("Total_Pago");
               registro [6]=rs.getString("Fecha_Emision");
               registro [7]=rs.getString("Fecha_Pago");
               
               TotalRegistros=TotalRegistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
      
   } 
   
   public boolean Insertar (Pago dts){
       sSQL="insert into Pago (IdReserva,Tipo_Comprobante,Numero_Comprobante,Iva,Total_Pago,Fecha_Emision,Fecha_Pago)" +
               "values (?,?,?,?,?,?,?)";
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdReserva());
           pst.setString(2, dts.getTipo_Comprobante());
           pst.setString(3, dts.getNumero_Comprobante());
           pst.setDouble(4, dts.getIva());
           pst.setDouble(5, dts.getTotal_Pago());
           pst.setDate(6, dts.getFecha_Emision());
           pst.setDate(7, dts.getFecha_Pago());
           
           
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
   
   public boolean Editar (Pago dts){
       sSQL="update Pago set IdReserva=?,Tipo_Comprobante=?,Numero_Comprobante=?,Iva=?,Total_Pago=?,Fecha_Emision=?,Fecha_Pago=?"+
               " where IdPago=?";
           
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdReserva());
           pst.setString(2, dts.getTipo_Comprobante());
           pst.setString(3, dts.getNumero_Comprobante());
           pst.setDouble(4, dts.getIva());
           pst.setDouble(5, dts.getTotal_Pago());
           pst.setDate(6, dts.getFecha_Emision());
           pst.setDate(7, dts.getFecha_Pago());
           pst.setInt(8, dts.getIdPago());
           
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
  
   public boolean eliminar (Pago dts){
       sSQL="delete from Pago where IdPago=?";
       
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdPago());
           
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
