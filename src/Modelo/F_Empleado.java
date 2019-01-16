
package Modelo;

import Clases.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class F_Empleado {
  
    private Conexion mysql = new Conexion();
    private Connection cn;
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer TotalRegistros;

    

    public DefaultTableModel Mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombre", "A_Paterno", "A_Materno", "Tipo_Documento", "Número Documento", "Dirección", "Teléfono", "Email", "Sueldo","Acceso","Login","Clave","Estado"};

        String[] registro = new String[14];

        TotalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.Id_Persona,p.Nombre,p.A_Paterno,p.A_Materno,p.Tipo_Documento,p.Numero_Documento,"
                + "p.Direccion,p.Telefono,p.Email,t.Sueldo,t.Acceso,t.Login,t.Password,t.Estado from Persona p inner join Empleado t "
                + "on p.Id_Persona=t.Id_Persona where Numero_Documento like '%"
                + buscar + "%' order by Id_Persona desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Id_Persona");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("A_Paterno");
                registro[3] = rs.getString("A_Materno");
                registro[4] = rs.getString("Tipo_Documento");
                registro[5] = rs.getString("Numero_Documento");
                registro[6] = rs.getString("Direccion");
                registro[7] = rs.getString("Telefono");
                registro[8] = rs.getString("Email");
                registro[9] = rs.getString("Sueldo");
                registro[10] = rs.getString("Acceso");
                registro[11] = rs.getString("Login");
                registro[12] = rs.getString("Password");
                registro[13] = rs.getString("Estado");
                
                TotalRegistros = TotalRegistros+ 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(Empleado dts) {
        sSQL = "insert into Persona (Nombre,A_Paterno,A_Materno,Tipo_Documento,Numero_Documento,Direccion,Telefono,Email)"
                + "values (?,?,?,?,?,?,?,?)";
        sSQL2 = "insert into Emleado (Id_Persona,Sueldo,Acceso,Login,Password,Estado)"
                + "values ((select Id_Persona from Persona order by Id_Persona desc limit 1),?,?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getA_Paterno());
            pst.setString(3, dts.getA_Materno());
            pst.setString(4, dts.getTipo_Documento());
            pst.setString(5, dts.getNumero_Documento());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getTelefono());
            pst.setString(8, dts.getEmail());

            pst2.setDouble(1, dts.getSueldo());
            pst2.setString(2, dts.getAcceso());
            pst2.setString(3, dts.getLogin());
            pst2.setString(4, dts.getPassword());
            pst2.setString(5, dts.getEstado());
            
            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Empleado dts) {
        sSQL = "update Persona set Nombre=?,A_Paterno=?,A_Materno=?,Tipo_Tocumento=?,Numero_Documento=?,"
                + " Direccion=?,Telefono=?,Email=? where Id_Persona=?";
        
        sSQL2 = "update Empleado set Sueldo=?,Acceso=?,Login=?,Password=?,Estado=?"
                + " where Id_Persona=?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getA_Paterno());
            pst.setString(3, dts.getA_Materno());
            pst.setString(4, dts.getTipo_Documento());
            pst.setString(5, dts.getNumero_Documento());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getTelefono());
            pst.setString(8, dts.getEmail());
            pst.setInt(9, dts.getId_Persona());

            pst2.setDouble(1, dts.getSueldo());
            pst2.setString(2, dts.getAcceso());
            pst2.setString(3, dts.getLogin());
            pst2.setString(4, dts.getPassword());
            pst2.setString(5, dts.getEstado());
            pst2.setInt(6, dts.getId_Persona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Empleado dts) {
        sSQL = "delete from Empleado where Id_Persona=?";
        sSQL2 = "delete from Persona where Id_Persona=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            
            pst.setInt(1, dts.getId_Persona());
            pst2.setInt(1, dts.getId_Persona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    
    public DefaultTableModel login(String login,String password) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombre", "A_Paterno", "A_Materno","Acceso","Login","Password","Estado"};

        String[] registro = new String[8];

        TotalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.Id_Persona,p.Nombre,p.A_Paterno,p.A_Materno,"
                + "t.Acceso,t.Login,t.Password,t.Estado from Persona p inner join Empleado t "
                + "on p.Id_Persona=t.Id_Persona where t.Login='"
                + login + "' and t.Password='" + password + "' and t.Estado='A'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Id_Persona");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("A_Paterno");
                registro[3] = rs.getString("A_Materno");
                
                registro[4] = rs.getString("Acceso");
                registro[5] = rs.getString("Login");
                registro[6] = rs.getString("password");
                registro[7] = rs.getString("Estado");
                
                TotalRegistros = TotalRegistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
 
}
