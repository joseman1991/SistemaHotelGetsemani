
package Modelo;

import Clases.Cliente;
import Clases.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class F_Cliente extends Conexion{
    
   private final Conexion mysql = new Conexion();
    private Connection cn;
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer TotalRegistros;

    
   public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombre", "APaterno", "AMaterno", "Tipo_Documento", "Númeo Documento", "Dirección", "Teléfono", "Email", "Código"};

        String[] registro = new String[10];

        TotalRegistros = 0;
        
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.IdPersona,p.Nombre,p.APaterno,p.AMaterno,p.Tipo_Documento,p.num_documento,"
                + "p.Direccion,p.Telefono,p.Email,c.Codigo_Cliente from Persona p inner join Cliente c "
                + "on p.IdPersona=c.IdPersona where num_documento like '%"
                + buscar + "%' order by IdPersona desc";

        try {
            cn=mysql.conectar();
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
                registro[9] = rs.getString("Codigo_Cliente");

                TotalRegistros = TotalRegistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(Cliente dts) {
        sSQL = "insert into Persona (Nombre,APaterno,AMaterno,Tipo_Documento,num_documento,Direccion,Telefono,Email)"
                + "values (?,?,?,?,?,?,?,?)";
        sSQL2 = "insert into Cliente (IdPersona,Codigo_Cliente)"
                + "values ((select IdPersona from Persona order by IdPersona desc limit 1),?)";
        try {
cn=mysql.conectar();
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

            pst2.setString(1, dts.getCodigo_Cliente());

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

    public boolean editar(Cliente dts) {
        sSQL = "update Persona set Nombre=?,APaterno=?,AMaterno=?,Tipo_Documento=?,num_documento=?,"
                + " Direccion=?,Telefono=?,Email=? where IdPersona=?";
        
        sSQL2 = "update Cliente set Codigo_Cliente=?"
                + " where IdPersona=?";
        try {
cn=mysql.conectar();
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

            pst2.setString(1, dts.getCodigo_Cliente());
            pst2.setInt(2, dts.getIdPersona());

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

    public boolean eliminar(Cliente dts) {
        sSQL = "delete from Cliente where IdPersona=?";
        sSQL2 = "delete from Persona where IdPersona=?";

        try {
cn=mysql.conectar();
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
   
}
