
package Vistas;


public class FORMINICIO extends javax.swing.JFrame {


  
    public FORMINICIO() {
        initComponents();
        this.setExtendedState(FORMINICIO.MAXIMIZED_BOTH);
        this.setTitle("Sistema de Reserva de Habitaciones y Gestión de Ventas - Hotel Getsamani");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        labelidpersona = new javax.swing.JLabel();
        labelnombre = new javax.swing.JLabel();
        labelapaterno = new javax.swing.JLabel();
        labelamaterno = new javax.swing.JLabel();
        labelacceso = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();
        MenuItemReservasConsumo = new javax.swing.JMenuItem();
        MenuItemClientes = new javax.swing.JMenuItem();
        MenuArchivo = new javax.swing.JMenu();
        MenuItemHabitacon = new javax.swing.JMenuItem();
        MenuItemProductos = new javax.swing.JMenuItem();
        helpMenu1 = new javax.swing.JMenu();
        MenuItem1VISTAHABITACION = new javax.swing.JMenuItem();
        MenuItem1VISTACLIENTE = new javax.swing.JMenuItem();
        MenuItemVISTAPRODUCTO = new javax.swing.JMenuItem();
        MenuConfiguraciones = new javax.swing.JMenu();
        MenuItemUsuarioAcceso = new javax.swing.JMenuItem();
        helpMenu3 = new javax.swing.JMenu();
        contentMenuItem3 = new javax.swing.JMenuItem();
        aboutMenuItem3 = new javax.swing.JMenuItem();
        helpMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(30, 155, 217));

        labelidpersona.setText("jLabel1");
        jDesktopPane1.add(labelidpersona);
        labelidpersona.setBounds(10, 0, 60, 20);

        labelnombre.setText("jLabel1");
        jDesktopPane1.add(labelnombre);
        labelnombre.setBounds(80, 0, 160, 20);

        labelapaterno.setText("jLabel2");
        jDesktopPane1.add(labelapaterno);
        labelapaterno.setBounds(270, 0, 90, 20);

        labelamaterno.setText("jLabel3");
        jDesktopPane1.add(labelamaterno);
        labelamaterno.setBounds(390, 0, 60, 20);

        labelacceso.setText("jLabel4");
        jDesktopPane1.add(labelacceso);
        labelacceso.setBounds(490, 0, 90, 20);

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sistemahotel.jpg"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Sistema_Reserva  ");
        menuBar.add(fileMenu);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reservas.jpg"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Reservas  ");

        MenuItemReservasConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reservas_consumos.png"))); // NOI18N
        MenuItemReservasConsumo.setMnemonic('t');
        MenuItemReservasConsumo.setText("Reservas y Consumos");
        MenuItemReservasConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemReservasConsumoActionPerformed(evt);
            }
        });
        editMenu.add(MenuItemReservasConsumo);

        MenuItemClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.jpg"))); // NOI18N
        MenuItemClientes.setMnemonic('y');
        MenuItemClientes.setText("Clientes");
        MenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemClientesActionPerformed(evt);
            }
        });
        editMenu.add(MenuItemClientes);

        menuBar.add(editMenu);

        MenuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivos.jpg"))); // NOI18N
        MenuArchivo.setMnemonic('h');
        MenuArchivo.setText("Archivos  ");

        MenuItemHabitacon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busca_habitacion.jpg"))); // NOI18N
        MenuItemHabitacon.setMnemonic('c');
        MenuItemHabitacon.setText("Habitaciones");
        MenuItemHabitacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemHabitaconActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuItemHabitacon);

        MenuItemProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto.jpg"))); // NOI18N
        MenuItemProductos.setMnemonic('a');
        MenuItemProductos.setText("Productos");
        MenuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemProductosActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuItemProductos);

        menuBar.add(MenuArchivo);

        helpMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.jpg"))); // NOI18N
        helpMenu1.setMnemonic('h');
        helpMenu1.setText("Consultas ");

        MenuItem1VISTAHABITACION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/habit.jpg"))); // NOI18N
        MenuItem1VISTAHABITACION.setMnemonic('c');
        MenuItem1VISTAHABITACION.setText("Habitaciones");
        MenuItem1VISTAHABITACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem1VISTAHABITACIONActionPerformed(evt);
            }
        });
        helpMenu1.add(MenuItem1VISTAHABITACION);

        MenuItem1VISTACLIENTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busca_cliente.jpg"))); // NOI18N
        MenuItem1VISTACLIENTE.setMnemonic('a');
        MenuItem1VISTACLIENTE.setText("Cliente");
        MenuItem1VISTACLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem1VISTACLIENTEActionPerformed(evt);
            }
        });
        helpMenu1.add(MenuItem1VISTACLIENTE);

        MenuItemVISTAPRODUCTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos.jpg"))); // NOI18N
        MenuItemVISTAPRODUCTO.setMnemonic('a');
        MenuItemVISTAPRODUCTO.setText("Producto");
        MenuItemVISTAPRODUCTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVISTAPRODUCTOActionPerformed(evt);
            }
        });
        helpMenu1.add(MenuItemVISTAPRODUCTO);

        menuBar.add(helpMenu1);

        MenuConfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cofigurar.jpg"))); // NOI18N
        MenuConfiguraciones.setMnemonic('h');
        MenuConfiguraciones.setText("Configuraciones");

        MenuItemUsuarioAcceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleados.jpg"))); // NOI18N
        MenuItemUsuarioAcceso.setMnemonic('c');
        MenuItemUsuarioAcceso.setText("Usuarios y Accesos");
        MenuItemUsuarioAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemUsuarioAccesoActionPerformed(evt);
            }
        });
        MenuConfiguraciones.add(MenuItemUsuarioAcceso);

        menuBar.add(MenuConfiguraciones);

        helpMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/help.jpg"))); // NOI18N
        helpMenu3.setMnemonic('h');
        helpMenu3.setText("Ayuda  ");

        contentMenuItem3.setMnemonic('c');
        contentMenuItem3.setText("Acerca de ...");
        helpMenu3.add(contentMenuItem3);

        aboutMenuItem3.setMnemonic('a');
        aboutMenuItem3.setText("Ayuda");
        helpMenu3.add(aboutMenuItem3);

        menuBar.add(helpMenu3);

        helpMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir_1.jpg"))); // NOI18N
        helpMenu4.setMnemonic('h');
        helpMenu4.setText(" Salir   ");
        helpMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMenu4MouseClicked(evt);
            }
        });
        menuBar.add(helpMenu4);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemHabitaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemHabitaconActionPerformed
        FORMHABITACION form =new  FORMHABITACION();
        jDesktopPane1.add(form);
        form.setLocation( jDesktopPane1.getWidth()/2 - form.getWidth()/2, jDesktopPane1.getHeight()/2 - form.getHeight()/2);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_MenuItemHabitaconActionPerformed

    private void MenuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemProductosActionPerformed
        FORMPRODUCTO form =new  FORMPRODUCTO();
        jDesktopPane1.add(form);
        form.setLocation( jDesktopPane1.getWidth()/2 - form.getWidth()/2, jDesktopPane1.getHeight()/2 - form.getHeight()/2);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_MenuItemProductosActionPerformed

    private void MenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemClientesActionPerformed
        FORMCLIENTE form =new FORMCLIENTE();
        jDesktopPane1.add(form);
        form.setLocation( jDesktopPane1.getWidth()/2 - form.getWidth()/2, jDesktopPane1.getHeight()/2 - form.getHeight()/2);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_MenuItemClientesActionPerformed

    private void MenuItemReservasConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemReservasConsumoActionPerformed
       FORMRESERVAS form = new FORMRESERVAS();
        jDesktopPane1.add(form);
        form.setLocation( jDesktopPane1.getWidth()/2 - form.getWidth()/2, jDesktopPane1.getHeight()/2 - form.getHeight()/2);
        form.toFront();
        form.setVisible(true);
        FORMRESERVAS.txtidempleado.setText(labelidpersona.getText());
        FORMRESERVAS.txtempleado.setText(labelnombre.getText() + " " + labelapaterno.getText());
        FORMRESERVAS.idusuario=Integer.parseInt(labelidpersona.getText());
        
    }//GEN-LAST:event_MenuItemReservasConsumoActionPerformed

    private void MenuItem1VISTAHABITACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem1VISTAHABITACIONActionPerformed
        FORVISTAHABITACION form =new FORVISTAHABITACION();
        jDesktopPane1.add(form);
        form.setLocation( jDesktopPane1.getWidth()/2 - form.getWidth()/2, jDesktopPane1.getHeight()/2 - form.getHeight()/2);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_MenuItem1VISTAHABITACIONActionPerformed

    private void MenuItem1VISTACLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem1VISTACLIENTEActionPerformed
        FORVISTACLIENTE form =new FORVISTACLIENTE();
        jDesktopPane1.add(form);
        form.setLocation( jDesktopPane1.getWidth()/2 - form.getWidth()/2, jDesktopPane1.getHeight()/2 - form.getHeight()/2);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_MenuItem1VISTACLIENTEActionPerformed

    private void MenuItemVISTAPRODUCTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVISTAPRODUCTOActionPerformed
        FORVISTAPRODUCTO form =new FORVISTAPRODUCTO();
        jDesktopPane1.add(form);
        form.setLocation( jDesktopPane1.getWidth()/2 - form.getWidth()/2, jDesktopPane1.getHeight()/2 - form.getHeight()/2);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_MenuItemVISTAPRODUCTOActionPerformed

    private void helpMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenu4MouseClicked
        this.dispose();
    }//GEN-LAST:event_helpMenu4MouseClicked

    private void MenuItemUsuarioAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemUsuarioAccesoActionPerformed
        FORMEMPLEADO form =new FORMEMPLEADO();
        jDesktopPane1.add(form);
        form.setLocation( jDesktopPane1.getWidth()/2 - form.getWidth()/2, jDesktopPane1.getHeight()/2 - form.getHeight()/2);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_MenuItemUsuarioAccesoActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FORMINICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORMINICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORMINICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORMINICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORMINICIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu MenuArchivo;
    public static javax.swing.JMenu MenuConfiguraciones;
    private javax.swing.JMenuItem MenuItem1VISTACLIENTE;
    private javax.swing.JMenuItem MenuItem1VISTAHABITACION;
    private javax.swing.JMenuItem MenuItemClientes;
    private javax.swing.JMenuItem MenuItemHabitacon;
    private javax.swing.JMenuItem MenuItemProductos;
    private javax.swing.JMenuItem MenuItemReservasConsumo;
    private javax.swing.JMenuItem MenuItemUsuarioAcceso;
    private javax.swing.JMenuItem MenuItemVISTAPRODUCTO;
    private javax.swing.JMenuItem aboutMenuItem3;
    private javax.swing.JMenuItem contentMenuItem3;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu1;
    private javax.swing.JMenu helpMenu3;
    private javax.swing.JMenu helpMenu4;
    public static javax.swing.JDesktopPane jDesktopPane1;
    public static javax.swing.JLabel labelacceso;
    public static javax.swing.JLabel labelamaterno;
    public static javax.swing.JLabel labelapaterno;
    public static javax.swing.JLabel labelidpersona;
    public static javax.swing.JLabel labelnombre;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
