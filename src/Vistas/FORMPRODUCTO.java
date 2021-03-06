
package Vistas;

import Clases.Producto;
import Modelo.F_Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FORMPRODUCTO extends javax.swing.JInternalFrame {

   
    public FORMPRODUCTO() {
        initComponents();
         mostrar("");
        inhabilitar();
    }

   private String accion = "guardar";

    void ocultar_columnas() {
        TablaLista.getColumnModel().getColumn(0).setMaxWidth(0);
        TablaLista.getColumnModel().getColumn(0).setMinWidth(0);
        TablaLista.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
     void inhabilitar() {
        txtIdProducto.setVisible(false);
        txtNombre.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecioVenta.setEnabled(false);
        CbUnidadMedida.setEnabled(false);
        
        BotonGuardar.setEnabled(false);
        BotonCancelar.setEnabled(false);
        BotonEliminar.setEnabled(false);
        
        txtIdProducto.setText("");
        txtPrecioVenta.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");

    }
     void habilitar() {
        txtIdProducto.setVisible(false);
        txtNombre.setEnabled(true);
        txtDescripcion.setEnabled(true);
        txtPrecioVenta.setEnabled(true);
        CbUnidadMedida.setEnabled(true);

        BotonGuardar.setEnabled(true);
        BotonCancelar.setEnabled(true);
        BotonEliminar.setEnabled(true);
        
        txtIdProducto.setText("");
        txtPrecioVenta.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");

    }
     void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            F_Producto func = new F_Producto();
            modelo = func.Mostrar(buscar);

            TablaLista.setModel(modelo);
            ocultar_columnas();
            LabelTotalRegistros.setText("Total Registros " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel3 = new javax.swing.JPanel();
        txtIdProducto = new java.awt.TextField();
        label1 = new java.awt.Label();
        txtNombre = new java.awt.TextField();
        label3 = new java.awt.Label();
        txtDescripcion = new java.awt.TextArea();
        label4 = new java.awt.Label();
        txtPrecioVenta = new java.awt.TextField();
        label5 = new java.awt.Label();
        CbUnidadMedida = new javax.swing.JComboBox<>();
        BotonGuardar = new javax.swing.JButton();
        BotonNuevo = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        label7 = new java.awt.Label();
        txtBuscar = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaLista = new javax.swing.JTable();
        BotonBuscar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        LabelTotalRegistros = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        Panel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        Panel3.setForeground(new java.awt.Color(51, 51, 51));

        label1.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        label3.setText("Descripcion");

        label4.setText("Precio Venta");

        txtPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaActionPerformed(evt);
            }
        });

        label5.setText("Unidad Medida");

        CbUnidadMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KG", "UND", "LT", "UMin", "UGlb" }));
        CbUnidadMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbUnidadMedidaActionPerformed(evt);
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

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addComponent(BotonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(BotonCancelar))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CbUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonNuevo)
                            .addComponent(BotonGuardar)
                            .addComponent(BotonCancelar)))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        Panel2.setForeground(new java.awt.Color(51, 51, 51));

        label7.setText("Buscar");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        TablaLista.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaLista);

        BotonBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.jpg"))); // NOI18N
        BotonBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
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

        LabelTotalRegistros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelTotalRegistros.setText("Registros");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Total Resgistros");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addComponent(LabelTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(BotonEliminar)))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Panel2Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(BotonEliminar)))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRODUCTOS,.jpg"))); // NOI18N
        jLabel1.setText("Producto");
        jLabel1.setPreferredSize(new java.awt.Dimension(32, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaActionPerformed
        txtPrecioVenta.transferFocus();
    }//GEN-LAST:event_txtPrecioVentaActionPerformed

    private void CbUnidadMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbUnidadMedidaActionPerformed
        CbUnidadMedida.transferFocus();
    }//GEN-LAST:event_CbUnidadMedidaActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        if (txtNombre.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un nombre para el producto");
            txtNombre.requestFocus();
            return;
        }
        if (txtDescripcion.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una descripción para el producto");
            txtDescripcion.requestFocus();
            return;
        }

        if (txtPrecioVenta.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un precio diario para para la venta del producto");
            txtPrecioVenta.requestFocus();
            return;
        }

        Producto dts = new Producto();
        F_Producto func = new F_Producto();

        dts.setNombre(txtNombre.getText());
        dts.setDescripcion(txtDescripcion.getText());
        dts.setPrecio_Venta(Double.parseDouble(txtPrecioVenta.getText()));

        int seleccionado = CbUnidadMedida.getSelectedIndex();
        dts.setUnidad_Medida((String) CbUnidadMedida.getItemAt(seleccionado));

        if (accion.equals("guardar")) {
            if (func.Insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "el Producto fue registrado satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
        }
        else if (accion.equals("editar")){
            dts.setIdProducto(Integer.parseInt(txtIdProducto.getText()));

            if (func.Editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El producto fue Editado satisfactoriamente");
                mostrar("");
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
        inhabilitar();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        txtBuscar.transferFocus();
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        if (!txtIdProducto.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el Producto?","Confirmar",2);

            if (confirmacion==0) {
                F_Producto func = new F_Producto();
                Producto dts= new Producto();

                dts.setIdProducto(Integer.parseInt(txtIdProducto.getText()));
                func.Eliminar(dts);
                mostrar("");
                inhabilitar();

            }

        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void TablaListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaListaMouseClicked
        
        BotonGuardar.setText("Editar");
        habilitar();
        BotonEliminar.setEnabled(true);
        accion="editar";

        int fila = TablaLista.rowAtPoint(evt.getPoint());

        txtIdProducto.setText(TablaLista.getValueAt(fila, 0).toString());
        txtNombre.setText(TablaLista.getValueAt(fila, 1).toString());
        txtDescripcion.setText(TablaLista.getValueAt(fila, 2).toString());
        CbUnidadMedida.setSelectedItem(TablaLista.getValueAt(fila, 3).toString());
        txtPrecioVenta.setText(TablaLista.getValueAt(fila, 4).toString());

    }//GEN-LAST:event_TablaListaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JComboBox<String> CbUnidadMedida;
    private javax.swing.JLabel LabelTotalRegistros;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JTable TablaLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label7;
    private java.awt.TextField txtBuscar;
    public java.awt.TextArea txtDescripcion;
    public static java.awt.TextField txtIdProducto;
    private java.awt.TextField txtNombre;
    private java.awt.TextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
