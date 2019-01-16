
package Vistas;


public class Inicio_Menu extends javax.swing.JFrame {

  
    public Inicio_Menu() {
        initComponents();
        this.setExtendedState(Inicio_Menu.MAXIMIZED_BOTH);
        this.setTitle("Sistema de Reserva de Habitaciones y Gestión de ventas - Hotel Getsamani");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        PanelEscritorio = new javax.swing.JPanel();
        labelidpersona = new javax.swing.JLabel();
        labelnombre = new javax.swing.JLabel();
        labelapaterno = new javax.swing.JLabel();
        labelamaterno = new javax.swing.JLabel();
        labelacceso = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        MenuItemReservasConsumo = new javax.swing.JMenuItem();
        MenuItemClientes = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        MenuArchivo = new javax.swing.JMenu();
        MenuItemHabitacon = new javax.swing.JMenuItem();
        MenuItemProductos = new javax.swing.JMenuItem();
        helpMenu1 = new javax.swing.JMenu();
        contentMenuItem1 = new javax.swing.JMenuItem();
        aboutMenuItem1 = new javax.swing.JMenuItem();
        MenuConfiguraciones = new javax.swing.JMenu();
        MenuItemUsuarioAcceso = new javax.swing.JMenuItem();
        helpMenu3 = new javax.swing.JMenu();
        contentMenuItem3 = new javax.swing.JMenuItem();
        aboutMenuItem3 = new javax.swing.JMenuItem();
        helpMenu4 = new javax.swing.JMenu();
        contentMenuItem4 = new javax.swing.JMenuItem();
        aboutMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(java.awt.SystemColor.control);

        labelidpersona.setText("jLabel1");

        labelnombre.setText("jLabel1");

        labelapaterno.setText("jLabel2");

        labelamaterno.setText("jLabel3");

        labelacceso.setText("jLabel4");

        javax.swing.GroupLayout PanelEscritorioLayout = new javax.swing.GroupLayout(PanelEscritorio);
        PanelEscritorio.setLayout(PanelEscritorioLayout);
        PanelEscritorioLayout.setHorizontalGroup(
            PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelnombre)
                    .addComponent(labelapaterno)
                    .addComponent(labelamaterno)
                    .addComponent(labelacceso))
                .addContainerGap(791, Short.MAX_VALUE))
        );
        PanelEscritorioLayout.setVerticalGroup(
            PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEscritorioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelidpersona)
                .addGap(18, 18, 18)
                .addComponent(labelnombre)
                .addGap(18, 18, 18)
                .addComponent(labelapaterno)
                .addGap(18, 18, 18)
                .addComponent(labelamaterno)
                .addGap(18, 18, 18)
                .addComponent(labelacceso)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sistemas.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Sistema_Reserva  ");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/resserva.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Reservas  ");

        MenuItemReservasConsumo.setMnemonic('t');
        MenuItemReservasConsumo.setText("Reservas y Consumos");
        MenuItemReservasConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemReservasConsumoActionPerformed(evt);
            }
        });
        editMenu.add(MenuItemReservasConsumo);

        MenuItemClientes.setMnemonic('y');
        MenuItemClientes.setText("Clientes");
        MenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemClientesActionPerformed(evt);
            }
        });
        editMenu.add(MenuItemClientes);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Pagos");
        editMenu.add(pasteMenuItem);

        menuBar.add(editMenu);

        MenuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivo.png"))); // NOI18N
        MenuArchivo.setMnemonic('h');
        MenuArchivo.setText("Archivos  ");

        MenuItemHabitacon.setMnemonic('c');
        MenuItemHabitacon.setText("Habitaciones");
        MenuItemHabitacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemHabitaconActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuItemHabitacon);

        MenuItemProductos.setMnemonic('a');
        MenuItemProductos.setText("Productos");
        MenuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemProductosActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuItemProductos);

        menuBar.add(MenuArchivo);

        helpMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_consultar.png"))); // NOI18N
        helpMenu1.setMnemonic('h');
        helpMenu1.setText("Consultas ");

        contentMenuItem1.setMnemonic('c');
        contentMenuItem1.setText("Contents");
        helpMenu1.add(contentMenuItem1);

        aboutMenuItem1.setMnemonic('a');
        aboutMenuItem1.setText("About");
        helpMenu1.add(aboutMenuItem1);

        menuBar.add(helpMenu1);

        MenuConfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/options.png"))); // NOI18N
        MenuConfiguraciones.setMnemonic('h');
        MenuConfiguraciones.setText("Configuraciones");

        MenuItemUsuarioAcceso.setMnemonic('c');
        MenuItemUsuarioAcceso.setText("Usuarios y Accesos");
        MenuItemUsuarioAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemUsuarioAccesoActionPerformed(evt);
            }
        });
        MenuConfiguraciones.add(MenuItemUsuarioAcceso);

        menuBar.add(MenuConfiguraciones);

        helpMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayuda.png"))); // NOI18N
        helpMenu3.setMnemonic('h');
        helpMenu3.setText("Ayuda  ");

        contentMenuItem3.setMnemonic('c');
        contentMenuItem3.setText("Acerca de ...");
        helpMenu3.add(contentMenuItem3);

        aboutMenuItem3.setMnemonic('a');
        aboutMenuItem3.setText("Ayuda");
        helpMenu3.add(aboutMenuItem3);

        menuBar.add(helpMenu3);

        helpMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ex.png"))); // NOI18N
        helpMenu4.setMnemonic('h');
        helpMenu4.setText(" Salir   ");

        contentMenuItem4.setMnemonic('c');
        contentMenuItem4.setText("Contents");
        helpMenu4.add(contentMenuItem4);

        aboutMenuItem4.setMnemonic('a');
        aboutMenuItem4.setText("About");
        helpMenu4.add(aboutMenuItem4);

        menuBar.add(helpMenu4);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(919, 919, 919)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void MenuItemHabitaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemHabitaconActionPerformed
         FrmHabitacion form =new FrmHabitacion ();
        PanelEscritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_MenuItemHabitaconActionPerformed

    private void MenuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemProductosActionPerformed
        FrmProducto form =new  FrmProducto();
        PanelEscritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_MenuItemProductosActionPerformed

    private void MenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemClientesActionPerformed
        FCliente form =new FCliente();
        PanelEscritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_MenuItemClientesActionPerformed

    private void MenuItemReservasConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemReservasConsumoActionPerformed
       FrmReserva form = new FrmReserva();
        PanelEscritorio.add(form);
        form.toFront();
        form.setVisible(true);
        FrmReserva.txtidempleado.setText(labelidpersona.getText());
        FrmReserva.txtempleado.setText(labelnombre.getText() + " " + labelapaterno.getText());
        FrmReserva.idusuario=Integer.parseInt(labelidpersona.getText());
    }//GEN-LAST:event_MenuItemReservasConsumoActionPerformed

    private void MenuItemUsuarioAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemUsuarioAccesoActionPerformed
        FrmEmpleado form =new FrmEmpleado();
        PanelEscritorio.add(form);
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
            java.util.logging.Logger.getLogger(Inicio_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu MenuArchivo;
    public static javax.swing.JMenu MenuConfiguraciones;
    private javax.swing.JMenuItem MenuItemClientes;
    private javax.swing.JMenuItem MenuItemHabitacon;
    private javax.swing.JMenuItem MenuItemProductos;
    private javax.swing.JMenuItem MenuItemReservasConsumo;
    private javax.swing.JMenuItem MenuItemUsuarioAcceso;
    public static javax.swing.JPanel PanelEscritorio;
    private javax.swing.JMenuItem aboutMenuItem1;
    private javax.swing.JMenuItem aboutMenuItem3;
    private javax.swing.JMenuItem aboutMenuItem4;
    private javax.swing.JMenuItem contentMenuItem1;
    private javax.swing.JMenuItem contentMenuItem3;
    private javax.swing.JMenuItem contentMenuItem4;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu1;
    private javax.swing.JMenu helpMenu3;
    private javax.swing.JMenu helpMenu4;
    public static javax.swing.JLabel labelacceso;
    public static javax.swing.JLabel labelamaterno;
    public static javax.swing.JLabel labelapaterno;
    public static javax.swing.JLabel labelidpersona;
    public static javax.swing.JLabel labelnombre;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
