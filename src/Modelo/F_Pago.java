package Modelo;

import Clases.Pago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class F_Pago {

    private Conexion mysql = new Conexion();
    private Connection cn;
    private String DSQL = "";
    public Integer TotalRegistros;

    public String nextID() throws SQLException {
        String st = "";
        try {
            cn = mysql.conectar();
            PreparedStatement ps = cn.prepareStatement("select max(num_comprobante) from pago");
            ResultSet r = ps.executeQuery();
            if (r.next()) {
                int id = r.getInt(1)+1;
                DecimalFormat DS = new DecimalFormat("000000");
                st = DS.format(id);

            }
        } catch (ClassNotFoundException e) {
        }
        return st;
    }

    public DefaultTableModel Mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdReserva", "Comprobante", "Número", "Iva", "Total", "Fecha Emisión", "Fecha Pago"};

        String[] registro = new String[8];

        TotalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        DSQL = "select * from pago where idreserva=" + buscar + " order by idpago desc";

        try {
            cn = mysql.conectar();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(DSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idpago");
                registro[1] = rs.getString("idreserva");
                registro[2] = rs.getString("tipo_comprobante");
                registro[3] = rs.getString("num_comprobante");
                registro[4] = rs.getString("iva");
                registro[5] = rs.getString("total_pago");
                registro[6] = rs.getString("fecha_emision");
                registro[7] = rs.getString("fecha_pago");

                TotalRegistros = TotalRegistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean Insertar(Pago dts) {
        DSQL = "insert into pago (idreserva,tipo_comprobante,num_comprobante,iva,total_pago,fecha_emision,fecha_pago)"
                + "values (?,?,?,?,?,?,?)";
        try {
            cn = mysql.conectar();
            PreparedStatement pst = cn.prepareStatement(DSQL);
            pst.setInt(1, dts.getIdReserva());
            pst.setString(2, dts.getTipo_Comprobante());
            pst.setString(3, dts.getNumero_Comprobante());
            pst.setDouble(4, dts.getIva());
            pst.setDouble(5, dts.getTotal_Pago());
            pst.setDate(6, dts.getFecha_Emision());
            pst.setDate(7, dts.getFecha_Pago());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean Editar(Pago dts) {
        DSQL = "update pago set idreserva=?,tipo_comprobante=?,num_comprobante=?,iva=?,total_pago=?,fecha_emision=?,fecha_pago=?"
                + " where idpago=?";

        try {
            cn = mysql.conectar();
            PreparedStatement pst = cn.prepareStatement(DSQL);
            pst.setInt(1, dts.getIdReserva());
            pst.setString(2, dts.getTipo_Comprobante());
            pst.setString(3, dts.getNumero_Comprobante());
            pst.setDouble(4, dts.getIva());
            pst.setDouble(5, dts.getTotal_Pago());
            pst.setDate(6, dts.getFecha_Emision());
            pst.setDate(7, dts.getFecha_Pago());
            pst.setInt(8, dts.getIdPago());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Pago dts) {
        DSQL = "delete from pago where idpago=?";

        try {
            cn = mysql.conectar();
            PreparedStatement pst = cn.prepareStatement(DSQL);

            pst.setInt(1, dts.getIdPago());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
