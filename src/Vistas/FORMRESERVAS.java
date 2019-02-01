package Vistas;

import Vistas.FORVISTAHABITACION;
import Clases.Cliente;
import Clases.Habitacion;
import Clases.Reserva;
import Modelo.F_Habitacion;
import Modelo.F_Cliente;
import Modelo.F_Reserva;
import static Vistas.FORMINICIO.jDesktopPane1;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FORMRESERVAS extends javax.swing.JInternalFrame {

    public FORMRESERVAS() {
        initComponents();
        mostrar("");
        inhabilitar();

    }

    private String accion = "guardar";
    public static int idusuario;

    void ocultar_columnas() {
        tablalista.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalista.getColumnModel().getColumn(0).setMinWidth(0);
        tablalista.getColumnModel().getColumn(0).setPreferredWidth(0);

        tablalista.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalista.getColumnModel().getColumn(1).setMinWidth(0);
        tablalista.getColumnModel().getColumn(1).setPreferredWidth(0);

        tablalista.getColumnModel().getColumn(3).setMaxWidth(0);
        tablalista.getColumnModel().getColumn(3).setMinWidth(0);
        tablalista.getColumnModel().getColumn(3).setPreferredWidth(0);

        tablalista.getColumnModel().getColumn(5).setMaxWidth(0);
        tablalista.getColumnModel().getColumn(5).setMinWidth(0);
        tablalista.getColumnModel().getColumn(5).setPreferredWidth(0);
    }

    void inhabilitar() {

        txtidreserva.setVisible(false);
        txtidhabitacion.setVisible(false);
        txtidcliente.setVisible(false);
        txtidempleado.setVisible(false);

        txtnumero.setEnabled(false);
        txtcliente.setEnabled(false);
        txtempleado.setEnabled(false);
        cbotipo_reserva.setEnabled(false);

        fecha_reserva.setEnabled(false);
        fecha_ingreso.setEnabled(false);
        fecha_salida.setEnabled(false);

        txtcosto_alojamiento.setEnabled(false);
        cbotipo_reserva.setEnabled(false);
        cboestado.setEnabled(false);

        BotonGuardar.setEnabled(false);
        BotonCancelar.setEnabled(false);
        BotonEliminar.setEnabled(false);
        btnbuscacliente.setEnabled(false);
        btnbuscahabitacion.setEnabled(false);

        txtidreserva.setText("");
        txtidcliente.setText("");
        txtnumero.setText("");
        txtcliente.setText("");
        txtcosto_alojamiento.setText("");
        txtidhabitacion.setText("");

    }

    void habilitar() {
        txtidreserva.setVisible(false);
        txtidhabitacion.setVisible(false);
        txtidcliente.setVisible(false);
        txtidempleado.setVisible(false);
        txtnumero.setEnabled(false);
        txtcliente.setEnabled(false);
        txtempleado.setEnabled(false);

        cbotipo_reserva.setEnabled(true);
        fecha_reserva.setEnabled(true);
        fecha_ingreso.setEnabled(true);
        fecha_salida.setEnabled(true);
        txtcosto_alojamiento.setEnabled(true);
        cboestado.setEnabled(true);

        BotonEliminar.setEnabled(true);
        BotonGuardar.setEnabled(true);
        BotonCancelar.setEnabled(true);
        btnbuscacliente.setEnabled(true);
        btnbuscahabitacion.setEnabled(true);

        txtidreserva.setText("");
        txtidcliente.setText("");
        txtnumero.setText("");
        txtcliente.setText("");
        txtcosto_alojamiento.setText("");
        txtidhabitacion.setText("");

    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            F_Reserva func = new F_Reserva();
            modelo = func.Mostrar(buscar);

            tablalista.setModel(modelo);
            ocultar_columnas();
            lbltotalregistros.setText("Total Registros " + Integer.toString(func.TotalRegistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtidreserva = new javax.swing.JTextField();
        habitacion = new javax.swing.JLabel();
        txtidhabitacion = new javax.swing.JTextField();
        cliente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcosto_alojamiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbotipo_reserva = new javax.swing.JComboBox();
        txtnumero = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        txtcliente = new javax.swing.JTextField();
        empleado = new javax.swing.JLabel();
        txtidempleado = new javax.swing.JTextField();
        txtempleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox();
        btnbuscahabitacion = new javax.swing.JButton();
        btnbuscacliente = new javax.swing.JButton();
        BotonNuevo = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        fecha_reserva = new com.toedter.calendar.JDateChooser();
        fecha_ingreso = new com.toedter.calendar.JDateChooser();
        fecha_salida = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalista = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lbltotalregistros = new javax.swing.JLabel();
        botonverconsumo = new javax.swing.JButton();
        btnrealizarpagos = new javax.swing.JButton();
        BotonBuscarCliente = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Reservas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14), new java.awt.Color(0, 204, 204))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        habitacion.setText("Habitación:");

        txtidhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidhabitacionActionPerformed(evt);
            }
        });

        cliente.setText("Cliente:");

        jLabel6.setText("Costo:");

        txtcosto_alojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcosto_alojamientoActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo Reserva:");

        cbotipo_reserva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reserva", "Alquiler" }));
        cbotipo_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipo_reservaActionPerformed(evt);
            }
        });

        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        txtidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclienteActionPerformed(evt);
            }
        });

        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });

        empleado.setText("Empleado");

        txtidempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidempleadoActionPerformed(evt);
            }
        });

        txtempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempleadoActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha Reserva:");

        jLabel8.setText("Fecha Ingreso:");

        jLabel10.setText("Fecha Salida:");

        jLabel11.setText("Estado Reserva:");

        cboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alquiler", "Pagada", "Anulada" }));
        cboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboestadoActionPerformed(evt);
            }
        });

        btnbuscahabitacion.setText("...");
        btnbuscahabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscahabitacionActionPerformed(evt);
            }
        });

        btnbuscacliente.setText("...");
        btnbuscacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaclienteActionPerformed(evt);
            }
        });

        BotonNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NUEVO.png"))); // NOI18N
        BotonNuevo.setText("Nuevo");
        BotonNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });

        BotonGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GUARDAR.png"))); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.jpg"))); // NOI18N
        BotonCancelar.setText("Cancelar");
        BotonCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10))
                                .addGap(255, 255, 255))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonGuardar)
                        .addGap(15, 15, 15)
                        .addComponent(BotonCancelar)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(empleado)
                                        .addGap(44, 44, 44))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7))
                                        .addGap(34, 34, 34)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(fecha_salida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fecha_ingreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fecha_reserva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbotipo_reserva, javax.swing.GroupLayout.Alignment.LEADING, 0, 148, Short.MAX_VALUE))
                                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcosto_alojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(habitacion)
                                    .addComponent(cliente))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtidhabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                    .addComponent(txtidcliente))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnumero)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnbuscahabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnbuscacliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(habitacion)
                    .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscahabitacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cliente)
                    .addComponent(btnbuscacliente)
                    .addComponent(txtidcliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empleado)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbotipo_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(fecha_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(fecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(fecha_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcosto_alojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonNuevo)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonCancelar))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Reservas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14), new java.awt.Color(0, 204, 204))); // NOI18N

        tablalista.setModel(new javax.swing.table.DefaultTableModel(
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
        tablalista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablalista);

        jLabel9.setText("Buscar");

        lbltotalregistros.setText("Registros");

        botonverconsumo.setText("Consumos");
        botonverconsumo.setEnabled(false);
        botonverconsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonverconsumoActionPerformed(evt);
            }
        });

        btnrealizarpagos.setText("Realizar Pagos");
        btnrealizarpagos.setEnabled(false);
        btnrealizarpagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrealizarpagosActionPerformed(evt);
            }
        });

        BotonBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.jpg"))); // NOI18N
        BotonBuscarCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonBuscarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BotonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarClienteActionPerformed(evt);
            }
        });

        BotonEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_1.jpg"))); // NOI18N
        BotonEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(botonverconsumo)
                        .addGap(18, 18, 18)
                        .addComponent(btnrealizarpagos)
                        .addGap(63, 63, 63)
                        .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BotonBuscarCliente)
                            .addGap(30, 30, 30)
                            .addComponent(BotonEliminar)
                            .addGap(32, 32, 32)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonBuscarCliente)
                            .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonverconsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbltotalregistros)
                        .addComponent(btnrealizarpagos)))
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reservas");
        jLabel1.setPreferredSize(new java.awt.Dimension(32, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidhabitacionActionPerformed

    }//GEN-LAST:event_txtidhabitacionActionPerformed

    private void txtcosto_alojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcosto_alojamientoActionPerformed
        txtcosto_alojamiento.transferFocus();
    }//GEN-LAST:event_txtcosto_alojamientoActionPerformed

    private void cbotipo_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipo_reservaActionPerformed
        cbotipo_reserva.transferFocus();
    }//GEN-LAST:event_cbotipo_reservaActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        txtnumero.transferFocus();
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed

    }//GEN-LAST:event_txtidclienteActionPerformed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        txtcliente.transferFocus();
    }//GEN-LAST:event_txtclienteActionPerformed

    private void txtidempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidempleadoActionPerformed

    }//GEN-LAST:event_txtidempleadoActionPerformed

    private void txtempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempleadoActionPerformed
        txtempleado.transferFocus();
    }//GEN-LAST:event_txtempleadoActionPerformed

    private void cboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadoActionPerformed
        cboestado.transferFocus();
    }//GEN-LAST:event_cboestadoActionPerformed

    private void btnbuscahabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscahabitacionActionPerformed
        FORVISTAHABITACION form = new FORVISTAHABITACION();
        FORMINICIO.jDesktopPane1.add(form);
        form.setLocation(jDesktopPane1.getWidth() / 2 - form.getWidth() / 2, jDesktopPane1.getHeight() / 2 - form.getHeight() / 2);
        form.toFront();
        form.setVisible(true);


    }//GEN-LAST:event_btnbuscahabitacionActionPerformed

    private void btnbuscaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaclienteActionPerformed
        FORVISTACLIENTE form = new FORVISTACLIENTE();
        FORMINICIO.jDesktopPane1.add(form);
        form.setLocation(jDesktopPane1.getWidth() / 2 - form.getWidth() / 2, jDesktopPane1.getHeight() / 2 - form.getHeight() / 2);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnbuscaclienteActionPerformed

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        habilitar();
        BotonGuardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed

        if (txtidhabitacion.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Seleccionar una Habitación");
            txtidhabitacion.requestFocus();
            return;
        }
        if (txtidcliente.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Seleccionar un Cliente");
            txtidcliente.requestFocus();
            return;
        }

        if (txtcosto_alojamiento.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un precio del Alojamiento");
            txtcosto_alojamiento.requestFocus();
            return;
        }

        Reserva dts = new Reserva();
        F_Reserva func = new F_Reserva();

        dts.setIdHabitacion(Integer.parseInt(txtidhabitacion.getText()));
        dts.setIdCliente(Integer.parseInt(txtidcliente.getText()));
        dts.setIdEmpleado(idusuario);

        int seleccionado = cbotipo_reserva.getSelectedIndex();
        dts.setTipo_Reserva((String) cbotipo_reserva.getItemAt(seleccionado));

        Calendar cal;
        int d, m, a;
        cal = fecha_reserva.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFecha_Reserva(new Date(a, m, d));

        cal = fecha_ingreso.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFecha_Ingreso(new Date(a, m, d));

        cal = fecha_salida.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFecha_Salida(new Date(a, m, d));

        dts.setCosto_Alojamiento(Double.parseDouble(txtcosto_alojamiento.getText()));

        seleccionado = cboestado.getSelectedIndex();
        dts.setEstado((String) cboestado.getItemAt(seleccionado));

        if (accion.equals("guardar")) {
            if (func.Insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "Reserva Registrada Satisfactoriamente");
                mostrar("");
                inhabilitar();

                //ocupamos la Habitación alquilada
                F_Habitacion func3 = new F_Habitacion();
                Habitacion dts3 = new Habitacion();

                dts3.setIdHabitacion(Integer.parseInt(txtidhabitacion.getText()));
                func3.Ocupar(dts3);
            }
        } else if (accion.equals("editar")) {
            dts.setIdReserva(Integer.parseInt(txtidreserva.getText()));
            dts.setIdEmpleado(Integer.parseInt(txtidempleado.getText()));
            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "Reserva Editada Satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        inhabilitar();
    }//GEN-LAST:event_BotonCancelarActionPerformed
    int fila = -1;
    private void tablalistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistaMouseClicked

        BotonGuardar.setText("Editar");
        habilitar();
        BotonEliminar.setEnabled(true);
        accion = "editar";
        fila = tablalista.rowAtPoint(evt.getPoint());
        if (!tablalista.getValueAt(fila, 12).toString().equals("Pagada")) {
            botonverconsumo.setEnabled(true);
            btnrealizarpagos.setEnabled(true);
        } else {
            botonverconsumo.setEnabled(false);
            btnrealizarpagos.setEnabled(false);
        }

        txtidreserva.setText(tablalista.getValueAt(fila, 0).toString());
        txtidhabitacion.setText(tablalista.getValueAt(fila, 1).toString());
        txtnumero.setText(tablalista.getValueAt(fila, 2).toString());
        txtidcliente.setText(tablalista.getValueAt(fila, 3).toString());
        txtcliente.setText(tablalista.getValueAt(fila, 4).toString());
        txtidempleado.setText(tablalista.getValueAt(fila, 5).toString());
        txtempleado.setText(tablalista.getValueAt(fila, 6).toString());

        cbotipo_reserva.setSelectedItem(tablalista.getValueAt(fila, 7).toString());
        fecha_reserva.setDate(Date.valueOf(tablalista.getValueAt(fila, 8).toString()));
        fecha_ingreso.setDate(Date.valueOf(tablalista.getValueAt(fila, 9).toString()));
        fecha_salida.setDate(Date.valueOf(tablalista.getValueAt(fila, 10).toString()));
        txtcosto_alojamiento.setText(tablalista.getValueAt(fila, 11).toString());
        cboestado.setSelectedItem(tablalista.getValueAt(fila, 12).toString());

    }//GEN-LAST:event_tablalistaMouseClicked

    private void botonverconsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonverconsumoActionPerformed
        if (fila >= 0) {
            int fila = tablalista.getSelectedRow(); //para aobter la fila que el usu a hecho clic
            FORMCONSUMO.idreserva = tablalista.getValueAt(fila, 0).toString();
            FORMCONSUMO.cliente = tablalista.getValueAt(fila, 4).toString();

            FORMCONSUMO form = new FORMCONSUMO();
            FORMINICIO.jDesktopPane1.add(form);
//        form.setLocation( jDesktopPane1.getWidth()/2 - form.getWidth()/2, jDesktopPane1.getHeight()/2 - form.getHeight()/2);
            form.toFront();
            form.setVisible(true);
        }

    }//GEN-LAST:event_botonverconsumoActionPerformed

    private void btnrealizarpagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrealizarpagosActionPerformed

        int fila = tablalista.getSelectedRow();

        FORMPAGO.IdReserva = tablalista.getValueAt(fila, 0).toString();
        FORMPAGO.Cliente = tablalista.getValueAt(fila, 4).toString();
        FORMPAGO.TotalReserva = Double.parseDouble(tablalista.getValueAt(fila, 11).toString());

        FORMPAGO.IdHabitacion = tablalista.getValueAt(fila, 1).toString();
        FORMPAGO.Habitacion = tablalista.getValueAt(fila, 2).toString();

        FORMPAGO form = new FORMPAGO();
        FORMINICIO.jDesktopPane1.add(form);
        form.toFront();
        form.setVisible(true);

    }//GEN-LAST:event_btnrealizarpagosActionPerformed

    private void BotonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarClienteActionPerformed
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_BotonBuscarClienteActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed

        if (!txtidreserva.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar la Reserva?", "Confirmar", 2);

            if (confirmacion == 0) {
                F_Reserva func = new F_Reserva();
                Reserva dts = new Reserva();

                dts.setIdReserva(Integer.parseInt(txtidreserva.getText()));
                func.Eliminar(dts);
                mostrar("");
                inhabilitar();

            }

        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscarCliente;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JButton botonverconsumo;
    private javax.swing.JButton btnbuscacliente;
    private javax.swing.JButton btnbuscahabitacion;
    private javax.swing.JButton btnrealizarpagos;
    private javax.swing.JComboBox cboestado;
    private javax.swing.JComboBox cbotipo_reserva;
    private javax.swing.JLabel cliente;
    private javax.swing.JLabel empleado;
    private com.toedter.calendar.JDateChooser fecha_ingreso;
    private com.toedter.calendar.JDateChooser fecha_reserva;
    private com.toedter.calendar.JDateChooser fecha_salida;
    private javax.swing.JLabel habitacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tablalista;
    private javax.swing.JTextField txtBuscar;
    public static javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtcosto_alojamiento;
    public static javax.swing.JTextField txtempleado;
    public static javax.swing.JTextField txtidcliente;
    public static javax.swing.JTextField txtidempleado;
    public static javax.swing.JTextField txtidhabitacion;
    private javax.swing.JTextField txtidreserva;
    public static javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
