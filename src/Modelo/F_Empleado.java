package Modelo;

import Clases.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class F_Empleado {

    private final Conexion mysql = new Conexion();
    private Connection cn;
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer TotalRegistros;

    public DefaultTableModel Mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombre", "APaterno", "AMaterno", "Tipo_Documento", "Número Documento", "Dirección", "Teléfono", "Email", "Sueldo", "Acceso", "Login", "Clave", "Estado"};

        String[] registro = new String[14];

        TotalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.IdPersona,p.Nombre,p.APaterno,p.AMaterno,p.Tipo_Documento,p.num_documento,"
                + "p.Direccion,p.Telefono,p.Email,t.Sueldo,t.Acceso,t.Login,t.Password,t.Estado from Persona p inner join trabajador t "
                + "on p.IdPersona=t.IdPersona where num_documento like '%"
                + buscar + "%' order by IdPersona desc";

        try {
             cn = mysql.conectar();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("IdPersona");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("APaterno");
                registro[3] = rs.getString("AMaterno");
                registro[4] = rs.getString("Tipo_Documento");
                registro[5] = rs.getString("num_documento");
                registro[6] = rs.getString("Direccion");
                registro[7] = rs.getString("Telefono");
                registro[8] = rs.getString("Email");
                registro[9] = rs.getString("Sueldo");
                registro[10] = rs.getString("Acceso");
                registro[11] = rs.getString("Login");
                registro[12] = rs.getString("Password");
                registro[13] = rs.getString("Estado");

                TotalRegistros = TotalRegistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(Empleado dts) {
        sSQL = "insert into Persona (Nombre,APaterno,AMaterno,Tipo_Documento,num_documento,Direccion,Telefono,Email)"
                + "values (?,?,?,?,?,?,?,?)";
        sSQL2 = "insert into trabajador (IdPersona,Sueldo,Acceso,Login,Password,Estado)"
                + "values ((select IdPersona from Persona order by IdPersona desc limit 1),?,?,?,?,?)";
        try {
            cn = mysql.conectar();
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
        sSQL = "update Persona set Nombre=?,APaterno=?,AMaterno=?,Tipo_Tocumento=?,num_documento=?,"
                + " Direccion=?,Telefono=?,Email=? where IdPersona=?";

        sSQL2 = "update trabajador set Sueldo=?,Acceso=?,Login=?,Password=?,Estado=?"
                + " where IdPersona=?";
        try {
            cn = mysql.conectar();
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
            pst.setInt(9, dts.getIdPersona());

            pst2.setDouble(1, dts.getSueldo());
            pst2.setString(2, dts.getAcceso());
            pst2.setString(3, dts.getLogin());
            pst2.setString(4, dts.getPassword());
            pst2.setString(5, dts.getEstado());
            pst2.setInt(6, dts.getIdPersona());

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
        sSQL = "delete from trabajador where IdPersona=?";
        sSQL2 = "delete from Persona where IdPersona=?";

        try {
            cn = mysql.conectar();
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setInt(1, dts.getIdPersona());
            pst2.setInt(1, dts.getIdPersona());

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

    public DefaultTableModel login(String login, String password) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombre", "APaterno", "AMaterno", "Acceso", "Login", "Password", "Estado"};

        String[] registro = new String[8];

        TotalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.IdPersona,p.Nombre,p.APaterno,p.AMaterno,"
                + "t.Acceso,t.Login,t.Password,t.Estado from Persona p inner join trabajador t "
                + "on p.IdPersona=t.IdPersona where t.Login='"
                + login + "' and t.Password='" + password + "' and t.Estado='A'";

        try {
            cn = mysql.conectar();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("IdPersona");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("APaterno");
                registro[3] = rs.getString("AMaterno");

                registro[4] = rs.getString("Acceso");
                registro[5] = rs.getString("Login");
                registro[6] = rs.getString("password");
                registro[7] = rs.getString("Estado");

                TotalRegistros = TotalRegistros + 1;
                modelo.addRow(registro);

            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }

    }

}
