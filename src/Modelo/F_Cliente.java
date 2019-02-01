
package Modelo;

import Clases.Cliente;
import Clases.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class F_Cliente extends Conexion{
    
   private final Conexion mysql = new Conexion();
    private Connection cn;
    private String DSQL = "";
    private String DSQL2= "";
    public Integer TotalRegistros;

    
   public DefaultTableModel mostrar(String buscar) {
        
       DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombre", "Apaterno", "Amaterno", "Tipo_Documento", "n"
                + "Númeo Documento", "Dirección", "Teléfono", "Email", "Código"};

        String[] registro = new String[10];

        TotalRegistros = 0;
        
        modelo = new DefaultTableModel(null, titulos);

        DSQL = "select p.idpersona,p.nombre,p.apaterno,p.amaterno,p.tipo_documento,p.num_documento,"
                + "p.direccion,p.telefono,p.email,c.codigo_cliente from persona p inner join cliente c "
                + "on p.idpersona=c.idpersona where num_documento like '%" 
                + buscar + "%' or nombre ilike '%" 
                + buscar + "%' order by idpersona desc";

        try {
            cn=mysql.conectar();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(DSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apaterno");
                registro[3] = rs.getString("amaterno");
                registro[4] = rs.getString("tipo_documento");
                registro[5] = rs.getString("num_documento");
                registro[6] = rs.getString("direccion");
                registro[7] = rs.getString("telefono");
                registro[8] = rs.getString("email");
                registro[9] = rs.getString("codigo_cliente");

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
        DSQL = "insert into persona (nombre,apaterno,amaterno,tipo_documento,num_documento,direccion,telefono,email)"
                + "values (?,?,?,?,?,?,?,?)";
        DSQL2= "insert into cliente (idpersona,codigo_cliente)"
                + "values ((select idpersona from persona order by idpersona desc limit 1),?)";
        try {
            cn=mysql.conectar();
            PreparedStatement pst = cn.prepareStatement(DSQL);
            PreparedStatement pst2 = cn.prepareStatement(DSQL2);

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
        DSQL = "update persona set nombre=?,apaterno=?,amaterno=?,tipo_documento=?,num_documento=?,"
                + " direccion=?,telefono=?,email=? where idpersona=?";
        
        DSQL2= "update cliente set codigo_cliente=?"
                + " where idpersona=?";
        try {
            cn=mysql.conectar();
            PreparedStatement pst = cn.prepareStatement(DSQL);
            PreparedStatement pst2 = cn.prepareStatement(DSQL2);

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

    public boolean eliminar(Cliente dts) throws ClassNotFoundException {
        DSQL = "delete from cliente where idpersona=?";
        DSQL2= "delete from persona where idpersona=?";

        try {
            cn=mysql.conectar();
            PreparedStatement pst = cn.prepareStatement(DSQL);
            PreparedStatement pst2 = cn.prepareStatement(DSQL2);

            
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

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
   
}
