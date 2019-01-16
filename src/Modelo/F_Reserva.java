
package Modelo;

import Clases.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class F_Reserva {
 
   private Conexion mysql=new Conexion();
   private Connection cn;
   private String sSQL="";
   public Integer TotalRegistros;

    public F_Reserva() {
       
    }
   
   
   public DefaultTableModel Mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Id_Habitacion","Numero","Id_Cliente","Cliente","Id_Trabajador","Trabajador","Tipo Reserva","Fecha Reserva","Fecha Ingreso","Fecha Salida","Costo","Estado"};
       
       String [] registro =new String [13];
       
       TotalRegistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select r.Id_Reserva,r.Id_Habitacion,h.Numero,r.Id_Cliente,"+
               "(select Nombre from Persona where Id_Persona=r.Id_Cliente)as Clienten,"+
               "(select A_Paterno from Persona where Id_Persona=r.Id_Cliente)as Clienteap,"+
               "r.Id_Trabajador,(select Nombre from Persona where Id_Persona=r.Id_Trabajador)as Trabajadorn,"+
               "(select apaterno from persona where idpersona=r.idtrabajador)as trabajadorap,"+
               "r.Tipo_Reserva,r.Fecha_Reserva,r.fec"
               + "ha_Ingresa,r.Fecha_Salida,"+
               "r.Costo_Alojamiento,r.estado from Reserva r inner join Habitacion h on r.Id_Habitacion=h.Id_Habitacion where r.Fecha_Reserva like '%"+ buscar + "%' order by Id_Reserva desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("Id_reserva");
               registro [1]=rs.getString("Id_Habitacion");
               registro [2]=rs.getString("Numero");
               registro [3]=rs.getString("Id_Cliente");
               registro [4]=rs.getString("Clienten") + " " + rs.getString("clienteap") ;
               registro [5]=rs.getString("Id_Trabajador");
               registro [6]=rs.getString("Trabajadorn") + " " + rs.getString("trabajadorap");
               registro [7]=rs.getString("Tipo_Reserva");
               registro [8]=rs.getString("Fecha_Reserva");
               registro [9]=rs.getString("Fecha_Ingresa");
               registro [10]=rs.getString("Fecha_Salida");
               registro [11]=rs.getString("Costo_Alojamiento");
               registro [12]=rs.getString("Estado");
               
               TotalRegistros=TotalRegistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean Insertar (Reserva dts){
       sSQL="insert into Reserva (Id_Habitacion,Id_Cliente,Id_Trabajador,Tipo_Reserva,Fecha_Reserva,Fecha_Ingresa,Fecha_Salida,Costo_Alojamiento,Estado)" +
               "values (?,?,?,?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getId_Habitacion());
           pst.setInt(2, dts.getId_Cliente());
           pst.setInt(3, dts.getId_Empleado());
           pst.setString(4, dts.getTipo_Reserva());
           pst.setDate(5, dts.getFecha_Reserva());
           pst.setDate(6, dts.getFecha_Reserva());
           pst.setDate(7, dts.getFecha_Salida());
           pst.setDouble(8, dts.getCosto_Alojamiento());
           pst.setString(9, dts.getEstado());
           
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
   
   public boolean editar (Reserva dts){
       sSQL="update Reserva set Id_Habitacion=?,Id_Cliente=?,Id_Trabajador=?,Tipo_Reserva=?,Fecha_Reserva=?,Fecha_Ingresa=?,Fecha_Salida=?,Costo_Alojamiento=?,Estado=?"+
               " where Id_Reserva=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getId_Habitacion());
           pst.setInt(2, dts.getId_Cliente());
           pst.setInt(3, dts.getId_Empleado());
           pst.setString(4, dts.getTipo_Reserva());
           pst.setDate(5, dts.getFecha_Reserva());
           pst.setDate(6, dts.getFecha_Ingreso());
           pst.setDate(7, dts.getFecha_Ingreso());
           pst.setDouble(8, dts.getCosto_Alojamiento());
           pst.setString(9, dts.getEstado());
           pst.setInt(10, dts.getId_Reserva());
           
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
   
   public boolean Pagar (Reserva dts){
       sSQL="update Reserva set Estado='Pagada'"+
               " where Id_Reserva=?";
           //alt + 39
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
             
           
           pst.setInt(1, dts.getId_Reserva());
           
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
   
  
   public boolean Eliminar (Reserva dts){
       sSQL="delete from Reserva where Id_Reserva=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getId_Reserva());
           
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
