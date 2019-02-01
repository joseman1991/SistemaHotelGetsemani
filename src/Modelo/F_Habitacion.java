
package Modelo;

import Clases.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class F_Habitacion extends Conexion {
 
    
    private Conexion mysql=new Conexion();
    private Connection cn;
    private String sSQL="";        //VARIABLE DONDE SE ALMACENA LA CADENA DE CONEXION
    public Integer TotalRegistro;  //VARIABLE PARA CONTAR EL TOTAL DE REGISTROS IGRESADOS
    
  
   public DefaultTableModel Mostrar(String buscar){      //METODO PARA MOSTRAR CON DefaultTableModel  LOS DATOS
       
       DefaultTableModel modelo;  //VARIABLE DE TIPO DefaultTableModel 
       String [] titulos = {"ID","Número","Piso","Descripción","Caracteristicas","Precio","Estado","Tipo Habitación"};//DECLARACION DE VECTOR PARA LOS TITULOS DE COLUMNAS 
       String [] registro =new String [8];  // VECTOR DONDE SE ALMACENARA REGISTRO DE CADA UNO, CON 8 INDICES
       
       TotalRegistro=0; // DECLACION DE TotalRegistro EN CERO
       
       modelo = new DefaultTableModel(null,titulos);  //AGREGO LOS TITULOS 
       
       sSQL="select * from habitacion where estado like '%"+ buscar + "%' order by idhabitacion"; //REGISTRO DE LA TABLA HABITACION
       
        try {   //PARA GENERAR LOS ERRORES
           cn=mysql.conectar();
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){                    //NAVEGAR TODOS LOS REGISTROS OBTENIDOS
               registro [0]=rs.getString("idhabitacion");
               registro [1]=rs.getString("numero");
               registro [2]=rs.getString("piso");
               registro [3]=rs.getString("descripcion");
               registro [4]=rs.getString("caracteristicas");
               registro [5]=rs.getString("precio_diario");
               registro [6]=rs.getString("estado");
               registro [7]=rs.getString("tipo_habitacion");
               
               TotalRegistro=TotalRegistro+1;
               modelo.addRow(registro); //AGREGO A LA VARIABLE MODELO A MENARA DE FILA TODO EL REGISTRO 
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
     } 
   
   public DefaultTableModel Mostrarvista(String buscar){
          
// sSQL="select * from habitacion where estado like '%"+ buscar + "%' and estado='Disponible' order by idhabitacion";
      DefaultTableModel modelo;  
       String [] titulos = {"ID","Número","Piso","Descripción","Caracteristicas","Precio","Estado","Tipo Habitación"};
       String [] registro =new String [8]; 
       
       TotalRegistro=0; 
       
       modelo = new DefaultTableModel(null,titulos); 
       
       sSQL="select * from habitacion where estado like '%"+ buscar + "%'and estado='Disponible' order by idhabitacion";
       
        try {  
           cn=mysql.conectar();
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){                   
               registro [0]=rs.getString("idhabitacion");
               registro [1]=rs.getString("numero");
               registro [2]=rs.getString("piso");
               registro [3]=rs.getString("descripcion");
               registro [4]=rs.getString("caracteristicas");
               registro [5]=rs.getString("precio_diario");
               registro [6]=rs.getString("estado");
               registro [7]=rs.getString("tipo_habitacion");
               
               TotalRegistro=TotalRegistro+1;
               modelo.addRow(registro); //AGREGO A LA VARIABLE MODELO A MENARA DE FILA TODO EL REGISTRO 
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       } 
       
     } 
 
   
   public boolean Insertar (Habitacion dts){
       sSQL="insert into habitacion (numero,piso,descripcion,caracteristicas,precio_diario,estado,tipo_habitacion)" +
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
           
           int n=pst.executeUpdate(); //DECLARO UNA VARIABLE 
                                       //QUE VA ALMACENAR LA EJECUCION DEL Statement
           
            //VERIFICAR LA INSERCION DE REGISTROS EN LA TABLA                            
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
       sSQL="update habitacion set numero=?,piso=?,descripcion=?,caracteristicas=?,precio_diario=?,estado=?,tipo_habitacion=?"+
               " where idhabitacion=?";
           
       
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
       sSQL="update habitacion set estado='Disponible'"+
               " where idhabitacion=?";
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
       sSQL="update habitacion set estado='Ocupado'"+
               " where idhabitacion=?";
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
       sSQL="delete from habitacion where idhabitacion=?";
       
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
