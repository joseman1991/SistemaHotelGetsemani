
package Vistas;

import Clases.Habitacion;
import Clases.Pago;
import Clases.Reserva;
import Modelo.F_Consumo;
import Modelo.F_Habitacion;
import Modelo.F_Pago;
import Modelo.F_Reserva;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;





public class FORMPAGO extends javax.swing.JInternalFrame {
    
    private String accion = "guardar";
    public static String IdReserva;
    public static String Cliente;
    public static String IdHabitacion;
    public static String Habitacion;
    public static Double TotalReserva;
    
    private void idNextId(){
        F_Pago p= new F_Pago();
        try {
            txtNumComprobante.setText(p.nextID());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public FORMPAGO() {
        initComponents();
        mostrar(IdReserva);
        inhabilitar();
        txtIdReserva.setText(IdReserva);
        txtCliente.setText(Cliente);
        txtHabitacion.setText(Habitacion);
        txtIdHabitacion.setText(IdHabitacion);
        txtTotalReserva.setText(Double.toString(TotalReserva));

        F_Consumo func = new F_Consumo();
        func.mostrar(IdReserva);
        txtTotal_Pago.setText(Double.toString(TotalReserva + func.TotalConsumo));
        idNextId();
    }

  void ocultar_columnaspagos() {
        TablaListaPagos.getColumnModel().getColumn(0).setMaxWidth(0);
        TablaListaPagos.getColumnModel().getColumn(0).setMinWidth(0);
        TablaListaPagos.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        TablaListaPagos.getColumnModel().getColumn(1).setMaxWidth(0);
        TablaListaPagos.getColumnModel().getColumn(1).setMinWidth(0);
        TablaListaPagos.getColumnModel().getColumn(1).setPreferredWidth(0);
    }
    void ocultar_columnasconsumo() {
        TablaListaConsumo.getColumnModel().getColumn(0).setMaxWidth(0);
        TablaListaConsumo.getColumnModel().getColumn(0).setMinWidth(0);
        TablaListaConsumo.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        TablaListaConsumo.getColumnModel().getColumn(1).setMaxWidth(0);
        TablaListaConsumo.getColumnModel().getColumn(1).setMinWidth(0);
        TablaListaConsumo.getColumnModel().getColumn(1).setPreferredWidth(0);
        
        TablaListaConsumo.getColumnModel().getColumn(2).setMaxWidth(0);
        TablaListaConsumo.getColumnModel().getColumn(2).setMinWidth(0);
        TablaListaConsumo.getColumnModel().getColumn(2).setPreferredWidth(0);
    }
        
    void inhabilitar() {
        txtIdPago.setVisible(false);
        txtIdReserva.setVisible(false);
        txtCliente.setEnabled(false);
        txtNumComprobante.setEnabled(false);
        CboTipoComprobante.setEnabled(false);
        txtIva.setEnabled(false);
        txtTotal_Pago.setEnabled(false);
        txtTotalReserva.setEnabled(false);
        fecha_emision.setEnabled(false);
        fecha_pago.setEnabled(false);
        
        txtIdHabitacion.setVisible(false);
        txtHabitacion.setEnabled(false);
         
        BotonGuardar.setEnabled(false);
        BotonCancelar.setEnabled(false);
        BotonEliminar.setEnabled(false);
        txtIdPago.setText("");
        txtNumComprobante.setText("");
        txtIva.setText("");
        txtTotal_Pago.setText("");

    }
    void habilitar() {
        txtIdPago.setVisible(false);
        txtIdReserva.setVisible(true);
        txtCliente.setEnabled(true);
//        txtNumComprobante.setEnabled(true);
        CboTipoComprobante.setEnabled(true);
        txtIva.setEnabled(true);
        txtTotal_Pago.setEnabled(true);
        txtTotalReserva.setEnabled(true);
        fecha_emision.setEnabled(true);
        fecha_pago.setEnabled(true);
        
        txtIdHabitacion.setVisible(true);
        txtHabitacion.setEnabled(true);
         
        BotonGuardar.setEnabled(true);
        BotonCancelar.setEnabled(true);
        BotonEliminar.setEnabled(true);
        txtIdPago.setText("");
//        txtNumComprobante.setText("");
        txtIva.setText("");
        //txtTotal_Pago.setText("");

    }
    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            F_Pago func = new F_Pago();
            modelo = func.Mostrar(buscar);

            TablaListaPagos.setModel(modelo);
            ocultar_columnaspagos();
            LabelTotalRegistosPagos.setText("Total Pagos " + Integer.toString(func.TotalRegistros));
            
            //Mostrar los datos de los consumos
            F_Consumo func2 = new F_Consumo();
            modelo= func2.mostrar(buscar);
            TablaListaConsumo.setModel(modelo);
            ocultar_columnasconsumo();
            
            LabelTotalRegistro.setText("Total Consumos " + func2.TotalRegistros);
            lbltotalconsumo.setText("Consumo Total: $." + func2.TotalConsumo );
            

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        LabelTotalRegistosPagos = new javax.swing.JLabel();
        BotonEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaListaPagos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txttotal_reserva = new javax.swing.JPanel();
        txtIdPago = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdReserva = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumComprobante = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CboTipoComprobante = new javax.swing.JComboBox();
        txtCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTotalReserva = new javax.swing.JTextField();
        txtIdHabitacion = new javax.swing.JTextField();
        txtHabitacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTotal_Pago = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BotonNuevo = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        fecha_emision = new com.toedter.calendar.JDateChooser();
        fecha_pago = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaListaConsumo = new javax.swing.JTable();
        LabelTotalRegistro = new javax.swing.JLabel();
        lbltotalconsumo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Pagos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        LabelTotalRegistosPagos.setText("Registros");

        BotonEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_1.jpg"))); // NOI18N
        BotonEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        TablaListaPagos.setBackground(new java.awt.Color(240, 240, 240));
        TablaListaPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaListaPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaListaPagosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaListaPagos);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LabelTotalRegistosPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonEliminar)
                        .addGap(274, 274, 274)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTotalRegistosPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonEliminar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txttotal_reserva.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Pagos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel2.setText("Reserva:");

        txtIdReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdReservaActionPerformed(evt);
            }
        });

        jLabel4.setText("Habitación:");

        jLabel6.setText("Num Comprobante:");

        txtNumComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumComprobanteActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo Comprobante:");

        CboTipoComprobante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Boleta", "Factura", "Ticket", "Otro" }));
        CboTipoComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboTipoComprobanteActionPerformed(evt);
            }
        });

        jLabel3.setText("Total Reserva:");

        txtIdHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdHabitacionActionPerformed(evt);
            }
        });

        jLabel8.setText("Iva:");

        txtIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIvaActionPerformed(evt);
            }
        });

        jLabel10.setText("Total Pago:");

        txtTotal_Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal_PagoActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha Emisión:");

        jLabel11.setText("Fecha Pago:");

        BotonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NUEVO.png"))); // NOI18N
        BotonNuevo.setText("Nuevo");
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });

        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GUARDAR.png"))); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.jpg"))); // NOI18N
        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txttotal_reservaLayout = new javax.swing.GroupLayout(txttotal_reserva);
        txttotal_reserva.setLayout(txttotal_reservaLayout);
        txttotal_reservaLayout.setHorizontalGroup(
            txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txttotal_reservaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIdPago, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(txttotal_reservaLayout.createSequentialGroup()
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(txttotal_reservaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(txttotal_reservaLayout.createSequentialGroup()
                                .addComponent(txtIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCliente))
                            .addComponent(txtTotalReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(txttotal_reservaLayout.createSequentialGroup()
                                .addComponent(txtIdHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(txttotal_reservaLayout.createSequentialGroup()
                        .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txttotal_reservaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addGroup(txttotal_reservaLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CboTipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addGroup(txttotal_reservaLayout.createSequentialGroup()
                                        .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNumComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(txttotal_reservaLayout.createSequentialGroup()
                                        .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel11))
                                        .addGap(40, 40, 40)
                                        .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(txttotal_reservaLayout.createSequentialGroup()
                                                .addComponent(txtTotal_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(fecha_emision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fecha_pago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(txttotal_reservaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BotonNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonGuardar)
                                .addGap(31, 31, 31)))
                        .addComponent(BotonCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        txttotal_reservaLayout.setVerticalGroup(
            txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txttotal_reservaLayout.createSequentialGroup()
                .addComponent(txtIdPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTotalReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CboTipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTotal_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha_emision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(fecha_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonNuevo)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonCancelar))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Consumos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        TablaListaConsumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaListaConsumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaListaConsumoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaListaConsumo);

        LabelTotalRegistro.setText("Registros");

        lbltotalconsumo.setText("Consumos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbltotalconsumo)
                .addGap(48, 48, 48)
                .addComponent(LabelTotalRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTotalRegistro)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbltotalconsumo)
                        .addContainerGap())))
        );

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagos.jpg"))); // NOI18N
        jLabel1.setText("PAGOS");
        jLabel1.setPreferredSize(new java.awt.Dimension(32, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txttotal_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txttotal_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        
        if (!txtIdPago.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el Pago seleccionado?","Confirmar",2);

            if (confirmacion==0) {
                F_Pago func = new F_Pago();
                Pago dts= new Pago();

                dts.setIdPago(Integer.parseInt(txtIdPago.getText()));
                func.eliminar(dts);
                mostrar(IdReserva);
                inhabilitar();
            }
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void TablaListaPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaListaPagosMouseClicked
       
        BotonGuardar.setText("Editar");
        habilitar();
        BotonEliminar.setEnabled(true);
        accion="editar";

        int fila = TablaListaPagos.rowAtPoint(evt.getPoint());

        txtIdPago.setText(TablaListaPagos.getValueAt(fila, 0).toString());
        //txtidreserva.setText(Tablalista.getValueAt(fila, 1).toString());

        CboTipoComprobante.setSelectedItem(TablaListaPagos.getValueAt(fila, 2).toString());
        txtNumComprobante.setText(TablaListaPagos.getValueAt(fila, 3).toString());
        txtIva.setText(TablaListaPagos.getValueAt(fila, 4).toString());
        txtTotal_Pago.setText(TablaListaPagos.getValueAt(fila, 5).toString());

        fecha_emision.setDate(Date.valueOf(TablaListaPagos.getValueAt(fila, 6).toString()));
        fecha_pago.setDate(Date.valueOf(TablaListaPagos.getValueAt(fila, 7).toString()));

    }//GEN-LAST:event_TablaListaPagosMouseClicked

    private void txtIdReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdReservaActionPerformed
        txtIdReserva.transferFocus();
    }//GEN-LAST:event_txtIdReservaActionPerformed

    private void txtNumComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumComprobanteActionPerformed
        txtNumComprobante.transferFocus();
    }//GEN-LAST:event_txtNumComprobanteActionPerformed

    private void CboTipoComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboTipoComprobanteActionPerformed
        CboTipoComprobante.transferFocus();
    }//GEN-LAST:event_CboTipoComprobanteActionPerformed

    private void txtIdHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdHabitacionActionPerformed
        txtIdHabitacion.transferFocus();
    }//GEN-LAST:event_txtIdHabitacionActionPerformed

    private void txtIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIvaActionPerformed
        txtIva.transferFocus();
    }//GEN-LAST:event_txtIvaActionPerformed

    private void txtTotal_PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal_PagoActionPerformed

    }//GEN-LAST:event_txtTotal_PagoActionPerformed

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        habilitar();
        BotonGuardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        
        if (txtIva.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el iva del Comprobante de pago a generar");
            txtIva.requestFocus();
            return;
        }
        if (txtTotal_Pago.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el total de pago del comprobante");
            txtTotal_Pago.requestFocus();
            return;
        }

        if (txtNumComprobante.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Número de Comprobante del Pago");
            txtNumComprobante.requestFocus();
            return;
        }

        Pago dts = new Pago();
        F_Pago func = new F_Pago();

        dts.setIdReserva(Integer.parseInt(txtIdReserva.getText()));

        int seleccionado = CboTipoComprobante.getSelectedIndex();
        dts.setTipo_Comprobante((String) CboTipoComprobante.getItemAt(seleccionado));

        dts.setNum_Comprobante(txtNumComprobante.getText());
        dts.setIva(Double.parseDouble(txtIva.getText()));
        dts.setTotal_Pago(Double.parseDouble(txtTotal_Pago.getText()));

        Calendar cal;
        int d,m,a;

        cal=fecha_pago.getCalendar();//ojo revisar
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR) - 1900;

        dts.setFecha_Pago(new Date (a,m,d));

        cal=fecha_emision.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR) - 1900;

        dts.setFecha_Emision(new Date (a,m,d));

        if (accion.equals("guardar")) {
            if (func.Insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, " El pago $. " + txtTotal_Pago.getText() +
                    " del Sr. " + txtCliente.getText() + " Ha sido realizado con Éxito");
                

                //Desocupar la Habitación
                F_Habitacion func2 = new F_Habitacion();
                Habitacion dts2 = new Habitacion();

                dts2.setIdHabitacion(Integer.parseInt(txtIdHabitacion.getText()));
                func2.desocupar(dts2);

                //Cancelar o pagar la reserva

                F_Reserva func3 = new F_Reserva();
                Reserva dts3 = new Reserva();

                dts3.setIdReserva(Integer.parseInt(txtIdReserva.getText()));
                func3.Pagar(dts3);
                idNextId();
                mostrar(IdReserva);
                inhabilitar();
            }
        }
        else if (accion.equals("editar")){
            dts.setIdPago(Integer.parseInt(txtIdPago.getText()));

            if (func.Editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El pago del Sr. " +
                    txtCliente.getText() + " Ha sido Modificado Correctamente");
                mostrar(IdReserva);
                inhabilitar();
            }
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void TablaListaConsumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaListaConsumoMouseClicked

    }//GEN-LAST:event_TablaListaConsumoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JComboBox CboTipoComprobante;
    private javax.swing.JLabel LabelTotalRegistosPagos;
    private javax.swing.JLabel LabelTotalRegistro;
    private javax.swing.JTable TablaListaConsumo;
    private javax.swing.JTable TablaListaPagos;
    private com.toedter.calendar.JDateChooser fecha_emision;
    private com.toedter.calendar.JDateChooser fecha_pago;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbltotalconsumo;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JTextField txtIdHabitacion;
    private javax.swing.JTextField txtIdPago;
    private javax.swing.JTextField txtIdReserva;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNumComprobante;
    private javax.swing.JTextField txtTotalReserva;
    private javax.swing.JTextField txtTotal_Pago;
    private javax.swing.JPanel txttotal_reserva;
    // End of variables declaration//GEN-END:variables
}
