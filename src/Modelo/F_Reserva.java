
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
       
       String [] titulos = {"ID","IdHabitacion","Numero","IdCliente","Cliente","IdEmpleado","Empleado","Tipo Reserva","Fecha Reserva","Fecha Ingreso","Fecha Salida","Costo","Estado"};
       
       String [] registro =new String [13];
       
       TotalRegistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select r.idreserva,r.idhabitacion,h.numero,r.idcliente,"+
               "(select nombre from persona where idpersona=r.idcliente)as clienten,"+
               "(select apaterno from persona where idpersona=r.idcliente)as clienteap,"+
               "r.idempleado,(select nombre from persona where idpersona=r.idempleado)as empleadon,"+
               "(select apaterno from persona where idpersona=r.idempleado)as empleadoap,"+
               "r.tipo_reserva,r.fecha_reserva,r.fecha_ingresa,r.fecha_salida,r.costo_alojamiento,r.estado "+
               "from reserva r inner join habitacion h on r.idhabitacion=h.idhabitacion where r.estado like '%"+ buscar + "%' order by idreserva desc";
       
       try {
           cn=mysql.conectar();
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idreserva");
               registro [1]=rs.getString("idhabitacion");
               registro [2]=rs.getString("numero");
               registro [3]=rs.getString("idcliente");
               registro [4]=rs.getString("clienten") + " " + rs.getString("clienteap") ;
               registro [5]=rs.getString("idempleado");
               registro [6]=rs.getString("empleadon") + " " + rs.getString("empleadoap");
               registro [7]=rs.getString("tipo_reserva");
               registro [8]=rs.getString("fecha_reserva");
               registro [9]=rs.getString("fecha_ingresa");
               registro [10]=rs.getString("fecha_salida");
               registro [11]=rs.getString("costo_alojamiento");
               registro [12]=rs.getString("estado");
               
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
       sSQL="insert into reserva (idhabitacion,idcliente,idempleado,tipo_reserva,fecha_reserva,fecha_ingresa,fecha_salida,costo_alojamiento,estado)" +
               "values (?,?,?,?,?,?,?,?,?)";
       try {
           cn=mysql.conectar();
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdHabitacion());
           pst.setInt(2, dts.getIdCliente());
           pst.setInt(3, dts.getIdEmpleado());
           pst.setString(4, dts.getTipo_Reserva());
           pst.setDate(5, dts.getFecha_Reserva());
           pst.setDate(6, dts.getFecha_Ingreso());
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
       sSQL="update reserva set idhabitacion=?,idcliente=?,idempleado=?,tipo_reserva=?,fecha_reserva=?,fecha_ingresa=?,fecha_salida=?,costo_alojamiento=?,estado=?"+
               " where idreserva=?";
           
       
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
   
   public boolean Eliminar (Reserva dts){
       sSQL="delete from reserva where idreserva=?";
       
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
   
    public boolean Pagar (Reserva dts){
       sSQL="update reserva set estado='Pagada'"+
               " where idreserva=?";
           
       
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
