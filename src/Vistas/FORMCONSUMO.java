
package Vistas;

import Clases.Cliente;
import Clases.Consumo;
import Modelo.F_Consumo;
import static Vistas.FORMINICIO.jDesktopPane1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FORMCONSUMO extends javax.swing.JInternalFrame {

    public static String idreserva;
    public static String cliente;
    
    private String accion = "guardar";
    
    public FORMCONSUMO() {
        initComponents();
        mostrar(idreserva);
        text_Cliente.setText(cliente);
        text_Id_Reserva.setText(idreserva);
        inhabilitar();
    }
 
     void ocultar_columnas() {
        Tabla_Listado.getColumnModel().getColumn(0).setMaxWidth(0);
        Tabla_Listado.getColumnModel().getColumn(0).setMinWidth(0);
        Tabla_Listado.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        Tabla_Listado.getColumnModel().getColumn(1).setMaxWidth(0);
        Tabla_Listado.getColumnModel().getColumn(1).setMinWidth(0);
        Tabla_Listado.getColumnModel().getColumn(1).setPreferredWidth(0);
        
        Tabla_Listado.getColumnModel().getColumn(2).setMaxWidth(0);
        Tabla_Listado.getColumnModel().getColumn(2).setMinWidth(0);
        Tabla_Listado.getColumnModel().getColumn(2).setPreferredWidth(0);
    }

   void inhabilitar() {
       
       text_Id_Consumo.setVisible(false);
       text_Id_Reserva.setVisible(false);
       text_Cliente.setEnabled(false);
       text_Id_Producto.setVisible(false);
       text_Producto.setEnabled(false);
       text_Cantidad.setEnabled(false);
       text_Precio.setEnabled(false);
       CB_Estado.setEnabled(false);

       BotonGuardar.setEnabled(false);
       BotonCancelar.setEnabled(false);
       BotonEliminar.setEnabled(false);

       text_Id_Consumo.setText("");
       text_Precio.setText("");
       text_Id_Producto.setText("");
       text_Producto.setText("");
       text_Cantidad.setText("");

    }
   void habilitar() {
        
        text_Id_Consumo.setVisible(false);
        text_Id_Reserva.setVisible(false);
        text_Cliente.setEnabled(true);
        text_Id_Producto.setVisible(false);
        text_Producto.setEnabled(true);
        text_Cantidad.setEnabled(true);       
        text_Precio.setEnabled(true);
        CB_Estado.setEnabled(true);
        
        BotonGuardar.setEnabled(true);
        BotonCancelar.setEnabled(true);
        BotonEliminar.setEnabled(true);
        
        text_Id_Consumo.setText("");
        text_Id_Reserva.setText("");
        text_Id_Producto.setText("");
        text_Producto.setText("");
        text_Cantidad.setText("");

    }
   
   void mostrar(String buscar) {
        
       try {
            DefaultTableModel modelo;
            F_Consumo func = new F_Consumo();
            modelo = func.mostrar(buscar);

            Tabla_Listado.setModel(modelo);
            
            Lbl_Total_Registros.setText("Total Registros " + Integer.toString(func.TotalRegistros));
            Lbl_Consumo.setText("Consumo Total $. " + func.TotalConsumo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel3 = new javax.swing.JPanel();
        text_Id_Consumo = new java.awt.TextField();
        label1 = new java.awt.Label();
        text_Id_Reserva = new java.awt.TextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        text_Id_Producto = new java.awt.TextField();
        label5 = new java.awt.Label();
        CB_Estado = new javax.swing.JComboBox<>();
        BotonGuardar = new javax.swing.JButton();
        BotonNuevo = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        text_Precio = new java.awt.TextField();
        Boton_Buscar_Producto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        text_Cantidad = new java.awt.TextField();
        text_Cliente = new javax.swing.JTextField();
        text_Producto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Listado = new javax.swing.JTable();
        BotonEliminar = new javax.swing.JButton();
        Lbl_Total_Registros = new javax.swing.JLabel();
        Lbl_Consumo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        Panel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Consumo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        Panel3.setForeground(new java.awt.Color(51, 51, 51));

        label1.setText("Reserva");

        text_Id_Reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_Id_ReservaActionPerformed(evt);
            }
        });

        label2.setText("Cantidad");

        label3.setText("Precio");

        label5.setText("Estado");

        CB_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceptado", "Cancelado", " " }));
        CB_Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_EstadoActionPerformed(evt);
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

        BotonNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NUEVO.png"))); // NOI18N
        BotonNuevo.setText("Nuevo");
        BotonNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
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

        text_Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_PrecioActionPerformed(evt);
            }
        });

        Boton_Buscar_Producto.setText("........");
        Boton_Buscar_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Buscar_ProductoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Producto");

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(text_Id_Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel3Layout.createSequentialGroup()
                                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CB_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(text_Id_Producto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(text_Id_Reserva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_Cliente)
                                    .addComponent(text_Producto))
                                .addGap(18, 18, 18)
                                .addComponent(Boton_Buscar_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                        .addComponent(BotonNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonGuardar)
                        .addGap(27, 27, 27)
                        .addComponent(BotonCancelar)))
                .addContainerGap())
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_Id_Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(text_Id_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_Id_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_Buscar_Producto))))
                .addGap(20, 20, 20)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonNuevo)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonCancelar))
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSUMO");
        jLabel1.setPreferredSize(new java.awt.Dimension(32, 32));

        Panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Consumo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        Panel2.setForeground(new java.awt.Color(51, 51, 51));

        Tabla_Listado.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabla_Listado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_ListadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Listado);

        BotonEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_1.jpg"))); // NOI18N
        BotonEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        Lbl_Total_Registros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_Total_Registros.setText("Total Registros");

        Lbl_Consumo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Lbl_Consumo.setText("Total  Consumos");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Lbl_Consumo)
                                .addGap(18, 18, 18)
                                .addComponent(Lbl_Total_Registros))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                                .addComponent(BotonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_Total_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void text_Id_ReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_Id_ReservaActionPerformed
          text_Id_Reserva.transferFocus();
    }//GEN-LAST:event_text_Id_ReservaActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
         text_Id_Reserva.setText(idreserva);
        if (text_Id_Producto.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes seleccionar un producto");
            Boton_Buscar_Producto.requestFocus();
            return;
        }
        if (text_Cantidad.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una cantidad de consumo");
            text_Cantidad.requestFocus();
            return;
        }

        if (text_Precio.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un precio de venta del producto");
            text_Precio.requestFocus();
            return;
        }
        
        Consumo dts = new Consumo();
        F_Consumo func = new F_Consumo();

        dts.setIdReserva(Integer.parseInt(text_Id_Reserva.getText()));
        dts.setIdProducto(Integer.parseInt(text_Id_Producto.getText()));
        dts.setCantidad(Integer.parseInt(text_Cantidad.getText()));
        dts.setPrecio_Venta(Double.parseDouble(text_Precio.getText()));
        int seleccionado = CB_Estado.getSelectedIndex();
        dts.setEstado((String) CB_Estado.getItemAt(seleccionado));

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El Consumo " + text_Producto.getText() + " del Cliente " 
                        + text_Cliente.getText() + " Ha sido Registrado Correctamente");
                mostrar(idreserva);
                inhabilitar();

            }

        }
        else if (accion.equals("editar")){
            dts.setIdConsumo(Integer.parseInt(text_Id_Consumo.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El Consumo del Cliente "
                    + text_Cliente.getText() + " Ha sido Modificado Correctamente ");
                mostrar(idreserva);
                inhabilitar();
            }
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        
        habilitar();
        BotonGuardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        inhabilitar() ;
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        
        if (!text_Id_Consumo.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el Producto?","Confirmar",2);

            if (confirmacion==0) {
                F_Consumo func = new F_Consumo ();
                Consumo dts= new Consumo();

                dts.setIdConsumo(Integer.parseInt(text_Id_Consumo.getText()));
                func.eliminar(dts);
                mostrar(idreserva);
                inhabilitar();

            }

        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void Boton_Buscar_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Buscar_ProductoActionPerformed
        
        FORVISTAPRODUCTO form = new FORVISTAPRODUCTO ();
        FORMINICIO.jDesktopPane1.add(form);
        form.setLocation( jDesktopPane1.getWidth()/2 - form.getWidth()/2, jDesktopPane1.getHeight()/2 - form.getHeight()/2);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_Boton_Buscar_ProductoActionPerformed

    private void Tabla_ListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_ListadoMouseClicked
       
        BotonGuardar.setText("Editar");
        habilitar();
        BotonEliminar.setEnabled(true);
        accion = "editar";

        int fila = Tabla_Listado.rowAtPoint(evt.getPoint());
        text_Id_Consumo.setText(Tabla_Listado.getValueAt(fila, 0).toString());
        text_Id_Reserva.setText(Tabla_Listado.getValueAt(fila, 1).toString());
        text_Id_Producto.setText(Tabla_Listado.getValueAt(fila, 2).toString());
        text_Producto.setText(Tabla_Listado.getValueAt(fila, 3).toString());
        text_Cantidad.setText(Tabla_Listado.getValueAt(fila, 4).toString());
        text_Precio.setText(Tabla_Listado.getValueAt(fila, 5).toString());
        CB_Estado.setSelectedItem(Tabla_Listado.getValueAt(fila, 6).toString());

    }//GEN-LAST:event_Tabla_ListadoMouseClicked

    private void text_PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_PrecioActionPerformed
        text_Precio.transferFocus();
    }//GEN-LAST:event_text_PrecioActionPerformed

    private void CB_EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_EstadoActionPerformed
         CB_Estado.transferFocus();
    }//GEN-LAST:event_CB_EstadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JButton Boton_Buscar_Producto;
    private javax.swing.JComboBox<String> CB_Estado;
    private javax.swing.JLabel Lbl_Consumo;
    private javax.swing.JLabel Lbl_Total_Registros;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JTable Tabla_Listado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label5;
    private java.awt.TextField text_Cantidad;
    private javax.swing.JTextField text_Cliente;
    private java.awt.TextField text_Id_Consumo;
    public static java.awt.TextField text_Id_Producto;
    private java.awt.TextField text_Id_Reserva;
    public static java.awt.TextField text_Precio;
    public static javax.swing.JTextField text_Producto;
    // End of variables declaration//GEN-END:variables
}
