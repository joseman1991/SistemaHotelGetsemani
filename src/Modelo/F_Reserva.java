
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
       
       String [] titulos = {"ID","IdHabitacion","Numero","IdCliente","Cliente","IdTrabajador","Trabajador","Tipo Reserva","Fecha Reserva","Fecha Ingreso","Fecha Salida","Costo","Estado"};
       
       String [] registro =new String [13];
       
       TotalRegistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select r.IdReserva,r.IdHabitacion,h.Numero,r.IdCliente,"+
               "(select Nombre from Persona where IdPersona=r.IdCliente)as Clienten,"+
               "(select APaterno from Persona where IdPersona=r.IdCliente)as Clienteap,"+
               "r.IdTrabajador,(select Nombre from Persona where IdPersona=r.IdTrabajador)as Trabajadorn,"+
               "(select apaterno from persona where idpersona=r.idtrabajador)as trabajadorap,"+
               "r.Tipo_Reserva,r.Fecha_Reserva,r.fec"
               + "ha_Ingresa,r.Fecha_Salida,"+
               "r.Costo_Alojamiento,r.estado from Reserva r inner join Habitacion h on r.IdHabitacion=h.IdHabitacion order by IdReserva desc";
       
       try {
           cn=mysql.conectar();
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("Idreserva");
               registro [1]=rs.getString("IdHabitacion");
               registro [2]=rs.getString("Numero");
               registro [3]=rs.getString("IdCliente");
               registro [4]=rs.getString("Clienten") + " " + rs.getString("clienteap") ;
               registro [5]=rs.getString("IdTrabajador");
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
           JOptionPane.showMessageDialog(null, e.getMessage());
           return null;
       }
       
       
       
   } 
   
   public boolean Insertar (Reserva dts){
       sSQL="insert into Reserva (IdHabitacion,IdCliente,IdTrabajador,Tipo_Reserva,Fecha_Reserva,Fecha_Ingresa,Fecha_Salida,Costo_Alojamiento,Estado)" +
               "values (?,?,?,?,?,?,?,?,?)";
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdHabitacion());
           pst.setInt(2, dts.getIdCliente());
           pst.setInt(3, dts.getIdEmpleado());
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
       sSQL="update Reserva set IdHabitacion=?,IdCliente=?,IdTrabajador=?,Tipo_Reserva=?,Fecha_Reserva=?,Fecha_Ingresa=?,Fecha_Salida=?,Costo_Alojamiento=?,Estado=?"+
               " where IdReserva=?";
           
       
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdHabitacion());
           pst.setInt(2, dts.getIdCliente());
           pst.setInt(3, dts.getIdEmpleado());
           pst.setString(4, dts.getTipo_Reserva());
           pst.setDate(5, dts.getFecha_Reserva());
           pst.setDate(6, dts.getFecha_Ingreso());
           pst.setDate(7, dts.getFecha_Ingreso());
           pst.setDouble(8, dts.getCosto_Alojamiento());
           pst.setString(9, dts.getEstado());
           pst.setInt(10, dts.getIdReserva());
           
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
               " where IdReserva=?";
           //alt + 39
       
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
             
           
           pst.setInt(1, dts.getIdReserva());
           
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
       sSQL="delete from Reserva where IdReserva=?";
       
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdReserva());
           
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
