package Biblioteca;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MiBiblioteca extends javax.swing.JFrame {
    FondoPanel fondo = new FondoPanel();
    static DefaultTableModel t = new DefaultTableModel();
    static DefaultTableModel ta = new DefaultTableModel();
    static DefaultTableModel tax = new DefaultTableModel();
    ArrayList<IngresarL> listaElementos = new ArrayList<>();
    ArrayList<IngresarA> listaAlumnos = new ArrayList<>();
    int indice=-1;
    public String tipo, z,mat;
    public int xy,w;
    
    public MiBiblioteca() {
        this.setContentPane(fondo);
        initComponents();
        visible(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        t = (DefaultTableModel)tablaElementos.getModel();
        ta = (DefaultTableModel)tablaBiblioteca.getModel();
        tax = (DefaultTableModel)tablaAlumno.getModel();
        MatriculaAlumno.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char caracter = e.getKeyChar();
             if (tamaño(MatriculaAlumno.getText()) >= 10) {
                JOptionPane.showMessageDialog(RegistroAlumno, "No puede introducir más de 10 dígitos");
                e.consume();
                return;
            }
            if(((caracter < '0') ||(caracter > '9')) &&(caracter != '\b'))
                    e.consume();
        }
        });
        txtMatricula.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char caracter = e.getKeyChar();
             if (tamaño(txtMatricula.getText()) >= 10) {
                JOptionPane.showMessageDialog(RegistroAlumno, "No puede introducir más de 10 dígitos");
                e.consume();
                return;
            }
            if(((caracter < '0') ||(caracter > '9')) &&(caracter != '\b'))
                    e.consume();
        }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registros = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        GuardarRegistro = new javax.swing.JButton();
        CancelarRegistro = new javax.swing.JButton();
        txtfecha = new com.toedter.calendar.JDateChooser();
        Prestamos = new javax.swing.JDialog();
        btnBuscarPedido = new javax.swing.JButton();
        txtBuscarPedido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        letrero = new javax.swing.JLabel();
        btnSolicitar = new javax.swing.JButton();
        btncan = new javax.swing.JButton();
        consulta = new javax.swing.JDialog();
        etiqueta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaElementos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        Solicitante = new javax.swing.JDialog();
        etiqueta2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtinformacion_prestamo = new javax.swing.JTextArea();
        btnAceptarLibro = new javax.swing.JButton();
        btndevolver = new javax.swing.JButton();
        ActualizarEle = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaActualiza = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        Actualizando = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        btnGuardado = new javax.swing.JButton();
        LaBiblioteca = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaBiblioteca = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        Alumnos = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaAlumno = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        IngresarAlumnos = new javax.swing.JMenu();
        darAlta = new javax.swing.JMenuItem();
        actualizarInfo = new javax.swing.JMenuItem();
        eliminarAlumno = new javax.swing.JMenuItem();
        RegistroAlumno = new javax.swing.JDialog();
        tituloRegistro = new javax.swing.JLabel();
        NombreAlumno = new javax.swing.JLabel();
        Matricula = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        MatriculaAlumno = new javax.swing.JTextField();
        registroA = new javax.swing.JButton();
        actualizarInf = new javax.swing.JButton();
        EliminarInfo = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        login = new FondoPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuarios = new javax.swing.JComboBox<>();
        pass = new javax.swing.JPasswordField();
        btningresar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnsolicitar = new javax.swing.JButton();
        btnCambiarUser = new javax.swing.JButton();
        ActualizarElementos = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnIngresarUsuario1 = new javax.swing.JButton();
        btnEliminarElemento = new javax.swing.JButton();
        btndevolucion = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        cerrars = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuLibro = new javax.swing.JMenuItem();
        menuRevista = new javax.swing.JMenuItem();
        menuTesis = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuSolicitar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        Registros.setTitle("Registrar ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Registrar un elemento");

        jLabel5.setText("Título del elemento:");

        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTituloKeyTyped(evt);
            }
        });

        jLabel6.setText("Autor del elemento:");

        txtAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutorKeyTyped(evt);
            }
        });

        jLabel7.setText("Fecha de Publicación:");

        jLabel8.setText("Editorial y/o ISBN");

        GuardarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/accept.png"))); // NOI18N
        GuardarRegistro.setText("Guardar");
        GuardarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarRegistroActionPerformed(evt);
            }
        });

        CancelarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancel.png"))); // NOI18N
        CancelarRegistro.setText("Cancelar");
        CancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistrosLayout = new javax.swing.GroupLayout(Registros.getContentPane());
        Registros.getContentPane().setLayout(RegistrosLayout);
        RegistrosLayout.setHorizontalGroup(
            RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrosLayout.createSequentialGroup()
                .addGroup(RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrosLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel5)
                        .addGap(64, 64, 64)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegistrosLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel6)
                        .addGap(65, 65, 65)
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegistrosLayout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jLabel4))
                    .addGroup(RegistrosLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addGroup(RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(55, 55, 55)
                        .addGroup(RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEditorial)
                            .addComponent(txtfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(203, 203, 203))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrosLayout.createSequentialGroup()
                .addComponent(GuardarRegistro)
                .addGap(128, 128, 128)
                .addComponent(CancelarRegistro)
                .addGap(356, 356, 356))
        );
        RegistrosLayout.setVerticalGroup(
            RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrosLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel4)
                .addGap(64, 64, 64)
                .addGroup(RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GuardarRegistro)
                    .addComponent(CancelarRegistro))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        Prestamos.setTitle("Solicitar Elemento");

        btnBuscarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/zoom_1.png"))); // NOI18N
        btnBuscarPedido.setText("Buscar");
        btnBuscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPedidoActionPerformed(evt);
            }
        });

        txtBuscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarPedidoActionPerformed(evt);
            }
        });
        txtBuscarPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarPedidoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Solicitar");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Título: ");

        letrero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        btnSolicitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-libro-y-lápiz-16.png"))); // NOI18N
        btnSolicitar.setText("Solicitar");
        btnSolicitar.setEnabled(false);
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });

        btncan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancel.png"))); // NOI18N
        btncan.setText("Cancelar");
        btncan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrestamosLayout = new javax.swing.GroupLayout(Prestamos.getContentPane());
        Prestamos.getContentPane().setLayout(PrestamosLayout);
        PrestamosLayout.setHorizontalGroup(
            PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrestamosLayout.createSequentialGroup()
                .addGroup(PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrestamosLayout.createSequentialGroup()
                        .addGap(511, 511, 511)
                        .addComponent(jLabel9))
                    .addGroup(PrestamosLayout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(btnSolicitar)
                        .addGap(166, 166, 166)
                        .addComponent(btncan))
                    .addGroup(PrestamosLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addGroup(PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(letrero, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PrestamosLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPedido)))
                .addGap(215, 215, 215))
        );
        PrestamosLayout.setVerticalGroup(
            PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrestamosLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel9)
                .addGap(41, 41, 41)
                .addGroup(PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPedido))
                .addGap(45, 45, 45)
                .addComponent(letrero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSolicitar)
                    .addComponent(btncan))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        consulta.setMinimumSize(new java.awt.Dimension(455, 349));

        etiqueta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etiqueta.setText("Consulta de Elementos");

        tablaElementos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Título", "Autor", "Fecha de Publicación", "Editorial o ISBN", "Estado", "Matricula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaElementos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaElementosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaElementos);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/icons8-papelera-llena-16.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout consultaLayout = new javax.swing.GroupLayout(consulta.getContentPane());
        consulta.getContentPane().setLayout(consultaLayout);
        consultaLayout.setHorizontalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaLayout.createSequentialGroup()
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultaLayout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(consultaLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(consultaLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnEliminar)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        consultaLayout.setVerticalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnEliminar)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        Solicitante.setTitle("Datos para prestamo");

        etiqueta2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etiqueta2.setText("Ingresar lo solicitado");

        jLabel13.setText("Matricula:");

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        txtinformacion_prestamo.setEditable(false);
        txtinformacion_prestamo.setColumns(20);
        txtinformacion_prestamo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtinformacion_prestamo.setRows(5);
        jScrollPane1.setViewportView(txtinformacion_prestamo);

        btnAceptarLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAceptarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/accept.png"))); // NOI18N
        btnAceptarLibro.setText("Aceptar");
        btnAceptarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarLibroActionPerformed(evt);
            }
        });

        btndevolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-devolver-libro-16.png"))); // NOI18N
        btndevolver.setText("Devolver");
        btndevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndevolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SolicitanteLayout = new javax.swing.GroupLayout(Solicitante.getContentPane());
        Solicitante.getContentPane().setLayout(SolicitanteLayout);
        SolicitanteLayout.setHorizontalGroup(
            SolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SolicitanteLayout.createSequentialGroup()
                .addGroup(SolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SolicitanteLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(SolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SolicitanteLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(SolicitanteLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(etiqueta2))
                    .addGroup(SolicitanteLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(SolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btndevolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAceptarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        SolicitanteLayout.setVerticalGroup(
            SolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SolicitanteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(etiqueta2)
                .addGap(37, 37, 37)
                .addGroup(SolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btndevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        ActualizarEle.setTitle("Actualizar");
        ActualizarEle.setMinimumSize(new java.awt.Dimension(455, 349));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Actualizar Elementos");

        tablaActualiza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Título", "Autor", "Fecha de Publicación", "Editorial o ISBN", "Estado", "Matricula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaActualiza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaActualizaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaActualiza);

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-actualizar-16.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ActualizarEleLayout = new javax.swing.GroupLayout(ActualizarEle.getContentPane());
        ActualizarEle.getContentPane().setLayout(ActualizarEleLayout);
        ActualizarEleLayout.setHorizontalGroup(
            ActualizarEleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActualizarEleLayout.createSequentialGroup()
                .addGroup(ActualizarEleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ActualizarEleLayout.createSequentialGroup()
                        .addGap(600, 600, 600)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ActualizarEleLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ActualizarEleLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(btnActualizar)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        ActualizarEleLayout.setVerticalGroup(
            ActualizarEleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActualizarEleLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnActualizar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Actualizando.setTitle("Actualizando");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Datos a actualizar");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Tipo:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Titulo:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Autor:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Fecha:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Editorial:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Estado:");

        txt1.setEditable(false);
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
        });

        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2KeyTyped(evt);
            }
        });

        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3KeyTyped(evt);
            }
        });

        txt6.setEditable(false);

        btnGuardado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/accept.png"))); // NOI18N
        btnGuardado.setText("Guardar");
        btnGuardado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ActualizandoLayout = new javax.swing.GroupLayout(Actualizando.getContentPane());
        Actualizando.getContentPane().setLayout(ActualizandoLayout);
        ActualizandoLayout.setHorizontalGroup(
            ActualizandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActualizandoLayout.createSequentialGroup()
                .addGroup(ActualizandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ActualizandoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(ActualizandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(29, 29, 29)
                        .addGroup(ActualizandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(ActualizandoLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(ActualizandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(btnGuardado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        ActualizandoLayout.setVerticalGroup(
            ActualizandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActualizandoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(ActualizandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ActualizandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ActualizandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ActualizandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ActualizandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ActualizandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnGuardado)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        LaBiblioteca.setTitle("Libreria");

        tablaBiblioteca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Título", "Autor", "Fecha de Publicación", "Editorial o ISBN", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBiblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBibliotecaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaBiblioteca);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("La bibloteca");

        javax.swing.GroupLayout LaBibliotecaLayout = new javax.swing.GroupLayout(LaBiblioteca.getContentPane());
        LaBiblioteca.getContentPane().setLayout(LaBibliotecaLayout);
        LaBibliotecaLayout.setHorizontalGroup(
            LaBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LaBibliotecaLayout.createSequentialGroup()
                .addGroup(LaBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LaBibliotecaLayout.createSequentialGroup()
                        .addGap(550, 550, 550)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LaBibliotecaLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        LaBibliotecaLayout.setVerticalGroup(
            LaBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LaBibliotecaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Alumnos.setTitle("Registro de alumnos");

        tablaAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Matricula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlumnoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaAlumno);

        IngresarAlumnos.setText("Registrar Alumnos");

        darAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-añadir-16.png"))); // NOI18N
        darAlta.setText("Ingrasar nuevo alumno");
        darAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darAltaActionPerformed(evt);
            }
        });
        IngresarAlumnos.add(darAlta);

        actualizarInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-actualizar-16.png"))); // NOI18N
        actualizarInfo.setText("Actualizar información del alumno");
        actualizarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarInfoActionPerformed(evt);
            }
        });
        IngresarAlumnos.add(actualizarInfo);

        eliminarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/icons8-menos-16.png"))); // NOI18N
        eliminarAlumno.setText("Eliminar registro de alumno");
        eliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAlumnoActionPerformed(evt);
            }
        });
        IngresarAlumnos.add(eliminarAlumno);

        jMenuBar1.add(IngresarAlumnos);

        Alumnos.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout AlumnosLayout = new javax.swing.GroupLayout(Alumnos.getContentPane());
        Alumnos.getContentPane().setLayout(AlumnosLayout);
        AlumnosLayout.setHorizontalGroup(
            AlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnosLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        AlumnosLayout.setVerticalGroup(
            AlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        RegistroAlumno.setTitle("Alumnos");

        tituloRegistro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        NombreAlumno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NombreAlumno.setText("Nombre del alumno:");

        Matricula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Matricula.setText("Matricula del alumno:");

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        MatriculaAlumno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MatriculaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatriculaAlumnoActionPerformed(evt);
            }
        });

        registroA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registroA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/icons8-añadir-16.png"))); // NOI18N
        registroA.setText("Registrar");
        registroA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroAActionPerformed(evt);
            }
        });

        actualizarInf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        actualizarInf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/icons8-actualizar-16.png"))); // NOI18N
        actualizarInf.setText("Actualizar");
        actualizarInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarInfActionPerformed(evt);
            }
        });

        EliminarInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EliminarInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/icons8-menos-16.png"))); // NOI18N
        EliminarInfo.setText("Eliminar");
        EliminarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarInfoActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/cancel.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistroAlumnoLayout = new javax.swing.GroupLayout(RegistroAlumno.getContentPane());
        RegistroAlumno.getContentPane().setLayout(RegistroAlumnoLayout);
        RegistroAlumnoLayout.setHorizontalGroup(
            RegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistroAlumnoLayout.createSequentialGroup()
                        .addComponent(Matricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MatriculaAlumno))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistroAlumnoLayout.createSequentialGroup()
                        .addComponent(NombreAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, 112))
            .addGroup(RegistroAlumnoLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(RegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(actualizarInf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registroA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EliminarInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroAlumnoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar)
                .addGap(95, 95, 95))
        );
        RegistroAlumnoLayout.setVerticalGroup(
            RegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroAlumnoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(RegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreAlumno)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(RegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Matricula)
                    .addComponent(MatriculaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(registroA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualizarInf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EliminarInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(cancelar)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor De Biblioteca");
        setResizable(false);
        getContentPane().setLayout(null);

        login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido a tu biblioteca");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");

        usuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumno", "Administrador" }));

        btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/accept.png"))); // NOI18N
        btningresar.setText("Ingresar");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancel.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btningresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncancelar)
                        .addGap(157, 157, 157))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140))))
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass))
                .addGap(42, 42, 42)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btningresar)
                    .addComponent(btncancelar))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        getContentPane().add(login);
        login.setBounds(290, 130, 452, 333);

        btnsolicitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-reference-80.png"))); // NOI18N
        btnsolicitar.setText("Solicitar");
        btnsolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsolicitarActionPerformed(evt);
            }
        });
        getContentPane().add(btnsolicitar);
        btnsolicitar.setBounds(530, 40, 220, 73);

        btnCambiarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-ordenación-trasera-16.png"))); // NOI18N
        btnCambiarUser.setText("Cambiar de usuario");
        btnCambiarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnCambiarUser);
        btnCambiarUser.setBounds(30, 540, 200, 23);

        ActualizarElementos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-insertar-100.png"))); // NOI18N
        ActualizarElementos.setText("Actualizar");
        ActualizarElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarElementosActionPerformed(evt);
            }
        });
        getContentPane().add(ActualizarElementos);
        ActualizarElementos.setBounds(30, 40, 220, 73);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-libros-emoji-80.png"))); // NOI18N
        btnBuscar.setText("Mostrar Biblioteca");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(290, 40, 220, 73);

        btnIngresarUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-añadir-usuario-masculino-80.png"))); // NOI18N
        btnIngresarUsuario1.setText("Usuarios");
        btnIngresarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarUsuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarUsuario1);
        btnIngresarUsuario1.setBounds(30, 330, 220, 81);

        btnEliminarElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-eliminar-libro-80.png"))); // NOI18N
        btnEliminarElemento.setText("Eliminar");
        btnEliminarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarElementoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarElemento);
        btnEliminarElemento.setBounds(30, 190, 220, 73);

        btndevolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-devolver-libro-80.png"))); // NOI18N
        btndevolucion.setText("Devolución");
        btndevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndevolucionActionPerformed(evt);
            }
        });
        getContentPane().add(btndevolucion);
        btndevolucion.setBounds(780, 40, 220, 73);

        jMenu2.setText("Inicio");

        cerrars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/disconnect.png"))); // NOI18N
        cerrars.setText("Cerrar sesión");
        cerrars.setEnabled(false);
        cerrars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarsActionPerformed(evt);
            }
        });
        jMenu2.add(cerrars);

        menu.add(jMenu2);

        jMenu3.setText("Registro");

        menuLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-libro-16.png"))); // NOI18N
        menuLibro.setText("Libros");
        menuLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLibroActionPerformed(evt);
            }
        });
        jMenu3.add(menuLibro);

        menuRevista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-revista-16.png"))); // NOI18N
        menuRevista.setText("Revistas");
        menuRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRevistaActionPerformed(evt);
            }
        });
        jMenu3.add(menuRevista);

        menuTesis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-tesis-externa-universidad-flaticons-planos-iconos-planos-2-16.png"))); // NOI18N
        menuTesis.setText("Tesis");
        menuTesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTesisActionPerformed(evt);
            }
        });
        jMenu3.add(menuTesis);

        menu.add(jMenu3);

        jMenu4.setText("Prestamos");

        menuSolicitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-libreta-de-ahorros-16.png"))); // NOI18N
        menuSolicitar.setText("Elementos Prestados");
        menuSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSolicitarActionPerformed(evt);
            }
        });
        jMenu4.add(menuSolicitar);

        menu.add(jMenu4);

        jMenu1.setText("Reportes");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-reporte-de-negocios-16.png"))); // NOI18N
        jMenuItem5.setText("Corte");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        menu.add(jMenu1);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        String usua=(String)usuarios.getSelectedItem();
        String contra=new String(pass.getPassword());
        String u="Alumno";
        String A="Administrador", C="123";
        if(A.equals(usua)){
            if(C.equals(contra)){
                login.setVisible(false);
                cerrars.setEnabled(true);
                visible(true);
                jMenu1.setVisible(true);
                jMenu3.setVisible(true);
                jMenu4.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(login, "Error no coinciden los datos!");
            }
        }else if(u.equals(usua)){
            login.setVisible(false);
            cerrars.setEnabled(true);
            btnBuscar.setVisible(true);
            btnsolicitar.setVisible(true);
            btndevolucion.setVisible(true);
            jMenu2.setVisible(true);
            menu.setVisible(true);
            jMenu1.setVisible(false);
            jMenu3.setVisible(false);
            jMenu4.setVisible(false);
        }
    }//GEN-LAST:event_btningresarActionPerformed

    private void cerrarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarsActionPerformed
        login.setVisible(true);
        pass.setText("");
        menu.setEnabled(false);
        cerrars.setEnabled(false);
        visible(false);
    }//GEN-LAST:event_cerrarsActionPerformed

    private void menuLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLibroActionPerformed
        Registros.setSize(this.getSize());
        Registros.setVisible(true);
        tipo= "Libro";
        txtEditorial.setVisible(true);
        jLabel8.setVisible(true);
    }//GEN-LAST:event_menuLibroActionPerformed

    private void menuRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRevistaActionPerformed
        Registros.setSize(this.getSize());
        Registros.setVisible(true);
        tipo= "Revista";
        txtEditorial.setVisible(true);
        jLabel8.setVisible(true);
    }//GEN-LAST:event_menuRevistaActionPerformed

    private void menuTesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTesisActionPerformed
        Registros.setSize(this.getSize());
        Registros.setVisible(true);
        tipo= "Tesis";
        txtEditorial.setVisible(false);
        jLabel8.setVisible(false);
    }//GEN-LAST:event_menuTesisActionPerformed

    private void CancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarRegistroActionPerformed
        Registros.setVisible(false);
    }//GEN-LAST:event_CancelarRegistroActionPerformed

    private void GuardarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarRegistroActionPerformed
        if(tipo.equals("Tesis"))
            txtEditorial.setText("- - -");
        if(txtTitulo.getText().trim().isEmpty() || txtAutor.getText().trim().isEmpty()
                || txtfecha.getDate() == null || txtEditorial.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(Registros, "Hay un campo vacío");
        } 
        else{
            Date s= txtfecha.getDate();
            SimpleDateFormat form = new SimpleDateFormat("dd MMMM yyyy");
            String f=form.format(s).toUpperCase();
            z="Esta disponible";
            mat="- - -";
            IngresarL p=new IngresarL(tipo,txtTitulo.getText(),txtAutor.getText(),f,txtEditorial.getText(),z,mat);
            listaElementos.add(p);
            txtTitulo.setText("");
            txtAutor.setText("");
            txtfecha.setDate(null);
            txtEditorial.setText("");
            JOptionPane.showMessageDialog(Registros,"Elemento agregado..");
        }
    }//GEN-LAST:event_GuardarRegistroActionPerformed

    private void btnCambiarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUserActionPerformed
        visible(false);
        cerrars.setEnabled(true);
        btnBuscar.setVisible(true);
        btnsolicitar.setVisible(true);
        btndevolucion.setVisible(true);
        jMenu2.setVisible(true);
        menu.setVisible(true);
        jMenu1.setVisible(false);
        jMenu3.setVisible(false);
        jMenu4.setVisible(false);
    }//GEN-LAST:event_btnCambiarUserActionPerformed

    private void tablaElementosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaElementosMouseClicked
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_tablaElementosMouseClicked

    private void menuSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSolicitarActionPerformed
        consulta.setVisible(true);
        btnEliminar.setVisible(false);
        consulta.setSize(this.getSize());
        consulta.setTitle("Prestamos Realizados");
        etiqueta.setText("Prestamos Realizados");
        limpiaTabla();
        if(tablaElementos!=null)
           buscar(listaElementos,tablaElementos);  
    }//GEN-LAST:event_menuSolicitarActionPerformed

    private void btncanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanActionPerformed
        Prestamos.setVisible(false);
        letrero.setText("");
    }//GEN-LAST:event_btncanActionPerformed

    private void btnBuscarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPedidoActionPerformed
        mostrarTabla(tablaElementos);
        String x = txtBuscarPedido.getText().trim();
        buscando(x,1);
        txtBuscarPedido.setText("");
        if(letrero.getText().equals("Encontrado"))
            btnSolicitar.setEnabled(true);
    }//GEN-LAST:event_btnBuscarPedidoActionPerformed

    private void btnsolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsolicitarActionPerformed
        Prestamos.setSize(this.getSize());
        Prestamos.setVisible(true);
    }//GEN-LAST:event_btnsolicitarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        LaBiblioteca.setVisible(true);
        LaBiblioteca.setSize(this.getSize());
        especial();       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        txtinformacion_prestamo.setText("");
        letrero.setText("");
        Solicitante.setVisible(true);
        etiqueta2.setText("Prestamo del elemento");
        Solicitante.setBounds(0, 0, 500, 500);
        Solicitante.setLocationRelativeTo(null);
        btndevolver.setVisible(false);
        btnAceptarLibro.setVisible(true);
        IngresarL zxx= listaElementos.get(w);
        txtinformacion_prestamo.setText(zxx.toString());
    }//GEN-LAST:event_btnSolicitarActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        etiqueta.setText("Reporte de elementos");
        btnEliminar.setVisible(false);
        mostrarTabla(tablaElementos);
        consulta.setVisible(true);
        consulta.setSize(this.getSize());
        consulta.setTitle("Reporte y cierre de biblioteca");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void btnAceptarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarLibroActionPerformed
        IngresarL zx = listaElementos.get(w);
        if (listaAlumnos.isEmpty()) {
            Solicitante.setVisible(false);
            Prestamos.setVisible(false);
            JOptionPane.showMessageDialog(this, "No hay usuarios. No se presto el elemento");
            btnIngresarUsuario1.doClick();
            txtMatricula.setText("");
        } else {
            boolean alumnoEncontrado = false;
            for (IngresarA alumno : listaAlumnos) {
                if (alumno.getMatricula().equals(txtMatricula.getText())) {
                    Solicitante.setVisible(false);
                    JOptionPane.showMessageDialog(Prestamos,"Puede tomar el libro, hasta Pronto "+alumno.getNombre());
                    zx.setMatri(txtMatricula.getText());
                    zx.setEstado("Ocupado");
                    alumnoEncontrado = true;
                    break;
                }
            }
            if (!alumnoEncontrado) {
                JOptionPane.showMessageDialog(Prestamos, "No se encontró el usuario con la matrícula proporcionada.");
                Solicitante.setVisible(false);
            }
        }
        mostrarTabla(tablaElementos);
        txtMatricula.setText("");
        btnSolicitar.setEnabled(false);
    }//GEN-LAST:event_btnAceptarLibroActionPerformed

    private void tablaActualizaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaActualizaMouseClicked
        btnActualizar.setEnabled(true);
    }//GEN-LAST:event_tablaActualizaMouseClicked

    private void ActualizarElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarElementosActionPerformed
        mostrarTabla(tablaActualiza);
        ActualizarEle.setVisible(true);
        ActualizarEle.setSize(this.getSize());     
    }//GEN-LAST:event_ActualizarElementosActionPerformed

    private void btnIngresarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarUsuario1ActionPerformed
        Alumnos.setSize(this.getSize());
        Alumnos.setVisible(true);
        especial2();
    }//GEN-LAST:event_btnIngresarUsuario1ActionPerformed

    private void btnEliminarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarElementoActionPerformed
        btnEliminar.setVisible(true);
        mostrarTabla(tablaElementos);
        consulta.setVisible(true);
        consulta.setSize(this.getSize());
        consulta.setTitle("Eliminar elementos");
        etiqueta.setText("Eliminar elementos");
    }//GEN-LAST:event_btnEliminarElementoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Actualizando.setVisible(true);
        Actualizando.setBounds(0, 0, 500, 500);
        Actualizando.setLocationRelativeTo(null);
        xy=tablaActualiza.getSelectedRow();
        IngresarL zx= listaElementos.get(xy);
        txt1.setText(zx.getTipo());
        txt2.setText(zx.getTitulo());
        txt3.setText(zx.getAutor());
        txt4.setText(zx.getFecha());
        txt5.setText(zx.getEditorial());
        txt6.setText(zx.getEstado());        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardadoActionPerformed
        if(txt1.getText().trim().isEmpty() || txt2.getText().trim().isEmpty() || txt3.getText().trim().isEmpty()
                || txtfecha.getDate() == null || txt5.getText().trim().isEmpty() || txt6.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(Registros, "Hay un campo vacío");
        }
        Date s= txtfecha.getDate();
        SimpleDateFormat form = new SimpleDateFormat("dd MMMM yyyy");
        String f=form.format(s).toUpperCase();
        IngresarL zx= listaElementos.get(xy);
        zx.setTipo(txt1.getText());
        zx.setTitulo(txt2.getText());
        zx.setAutor(txt3.getText());
        zx.setFecha(f);
        zx.setEditorial(txt5.getText());
        zx.setEstado(txt6.getText());
        mostrarTabla(tablaActualiza);
    }//GEN-LAST:event_btnGuardadoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        IngresarL zx= listaElementos.get(xy);
        listaElementos.remove(zx);
        mostrarTabla(tablaActualiza);        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btndevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndevolucionActionPerformed
        txtinformacion_prestamo.setText("");
        Solicitante.setVisible(true);
        etiqueta2.setText("Devolución de elemento");
        Solicitante.setBounds(0, 0, 500, 500);
        Solicitante.setLocationRelativeTo(null);
        txtMatricula.setText("");
        btnAceptarLibro.setVisible(false);
        btndevolver.setVisible(true);
    }//GEN-LAST:event_btndevolucionActionPerformed

    private void txtBuscarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarPedidoActionPerformed

    private void tablaBibliotecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBibliotecaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaBibliotecaMouseClicked

    private void darAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darAltaActionPerformed
        RegistroAlumno.setBounds(0, 0, 500, 500);
        RegistroAlumno.setLocationRelativeTo(null);
        RegistroAlumno.setVisible(true);
        tituloRegistro.setText("Registrar Alumno");
        actualizarInf.setVisible(false);
        EliminarInfo.setVisible(false);
        registroA.setVisible(true);
        
    }//GEN-LAST:event_darAltaActionPerformed

    private void actualizarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarInfoActionPerformed
        indice = BuscarMatricula();
        if(indice>-1){
            RegistroAlumno.setBounds(0, 0, 500, 500);
            RegistroAlumno.setLocationRelativeTo(null);
            RegistroAlumno.setVisible(true);
            tituloRegistro.setText("Actualizar información de alumno");
            registroA.setVisible(false);
            EliminarInfo.setVisible(false);
            actualizarInf.setVisible(true);
            IngresarA a = listaAlumnos.get(indice);
            nombre.setText(a.getNombre());
            MatriculaAlumno.setText(a.getMatricula());
        }
        else{
            JOptionPane.showMessageDialog(Alumnos,"Datos incorrectos..");
        }
    }//GEN-LAST:event_actualizarInfoActionPerformed

    private void MatriculaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatriculaAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatriculaAlumnoActionPerformed

    private void registroAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroAActionPerformed
        boolean n=false;
        if(nombre.getText().trim().isEmpty() || MatriculaAlumno.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(RegistroAlumno, "Hay un campo vacío");
        } 
        else{
            for(IngresarA alumno: listaAlumnos){
                if(alumno.getMatricula().equals(MatriculaAlumno.getText())){
                    JOptionPane.showMessageDialog(RegistroAlumno,"Ya existe la matricula");
                    nombre.setText("");
                    MatriculaAlumno.setText("");
                    n=true;
                    break;
                }
            }
        }
        if(!n){
            IngresarA A=new IngresarA(nombre.getText(),MatriculaAlumno.getText());
            listaAlumnos.add(A);
            nombre.setText("");
            MatriculaAlumno.setText("");
            JOptionPane.showMessageDialog(RegistroAlumno,"Alumno registrado..");
        }
        especial2();
    }//GEN-LAST:event_registroAActionPerformed

    private void eliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAlumnoActionPerformed
        indice=BuscarMatricula();
        if(indice>-1){
            RegistroAlumno.setBounds(0, 0, 500, 500);
            RegistroAlumno.setLocationRelativeTo(null);
            RegistroAlumno.setVisible(true);
            tituloRegistro.setText("Eliminar información de alumno");
            registroA.setVisible(false);
            EliminarInfo.setVisible(true);
            actualizarInf.setVisible(false);
            IngresarA a = listaAlumnos.get(indice);
            nombre.setText(a.getNombre());
            MatriculaAlumno.setText(a.getMatricula());
        }
        else{
            JOptionPane.showMessageDialog(Alumnos,"Datos incorrectos..");
        }
    }//GEN-LAST:event_eliminarAlumnoActionPerformed

    private void actualizarInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarInfActionPerformed
        if(indice>-1 && nombre.getText()!=null || MatriculaAlumno.getText()!=null){
            IngresarA alumno = listaAlumnos.get(indice);
            alumno.setNombre(nombre.getText());
            alumno.setMatricula(MatriculaAlumno.getText());
            JOptionPane.showMessageDialog(RegistroAlumno,"Información actualizada..");
            nombre.setText("");
            MatriculaAlumno.setText("");
            RegistroAlumno.dispose();
            indice=-1;
        }
        else{
            JOptionPane.showMessageDialog(RegistroAlumno,"Hay un campo vacio..");
        }
        especial2();
    }//GEN-LAST:event_actualizarInfActionPerformed

    private void EliminarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarInfoActionPerformed
        if(indice>-1){
            listaAlumnos.remove(indice);
            JOptionPane.showMessageDialog(RegistroAlumno,"Información eliminada..");
            nombre.setText("");
            MatriculaAlumno.setText("");
            RegistroAlumno.dispose();
            indice=-1;
        }
        especial2();
    }//GEN-LAST:event_EliminarInfoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        nombre.setText("");
        MatriculaAlumno.setText("");
        RegistroAlumno.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char d= evt.getKeyChar();
        if(!Character.isLetter(d) && d!=' '){
            evt.consume();
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyTyped
        char d= evt.getKeyChar();
        if(!Character.isLetter(d) && d!=' '){
            evt.consume();
        }
    }//GEN-LAST:event_txtTituloKeyTyped

    private void txtAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorKeyTyped
        char d= evt.getKeyChar();
        if(!Character.isLetter(d) && d!=' '){
            evt.consume();
        }
    }//GEN-LAST:event_txtAutorKeyTyped

    private void txtBuscarPedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPedidoKeyTyped
        char d= evt.getKeyChar();
        if(!Character.isLetter(d) && d!=' '){
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarPedidoKeyTyped

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped
        char d= evt.getKeyChar();
        if(!Character.isLetter(d) && d!=' '){
            evt.consume();
        }
    }//GEN-LAST:event_txt1KeyTyped

    private void txt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyTyped

    }//GEN-LAST:event_txt2KeyTyped

    private void txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyTyped
        char d= evt.getKeyChar();
        if(!Character.isLetter(d) && d!=' '){
            evt.consume();
        }
    }//GEN-LAST:event_txt3KeyTyped

    private void btndevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndevolverActionPerformed
        boolean alumnoEncontrado = false;
            for (IngresarA alumno : listaAlumnos) {
                if (alumno.getMatricula().equals(txtMatricula.getText())) {
                    int x=buscando(txtMatricula.getText(),6);
                    IngresarL zx = listaElementos.get(x);
                    txtinformacion_prestamo.setText(zx.toString());
                    JOptionPane.showMessageDialog(Prestamos,"gracias por regresar, hasta pronto "+alumno.getNombre());
                    zx.setMatri("- - -");
                    zx.setEstado("Esta disponible");
                    txtMatricula.setText("");
                    alumnoEncontrado = true;
                    break;
                }
            }
            
            if (!alumnoEncontrado) {
                JOptionPane.showMessageDialog(Prestamos, "No se encontró el usuario con la matrícula proporcionada.");
                txtMatricula.setText("");
            }
        txtMatricula.setText("");
        txtinformacion_prestamo.setText("");
    }//GEN-LAST:event_btndevolverActionPerformed

    private void tablaAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlumnoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaAlumnoMouseClicked
    
    public void especial2(){
        int a=tax.getRowCount();      
        while(a!=0){ // Ciclo para Borrar la Tabla 1
            if(a!=0)
               tax.removeRow(0);                      
            a=tax.getRowCount();        
        }
        for (IngresarA c:listaAlumnos){
            Object[] fila= {c.getNombre(),
                c.getMatricula()
        };
         tax.addRow(fila);
        }
        tablaAlumno.setModel(tax); 
    }
    
    public static void buscar(ArrayList<IngresarL> libro,JTable x) {
        for (IngresarL a : libro) {
            if ("Ocupado".equalsIgnoreCase(a.getEstado())) {
                Object[] fila= {a.getTipo(),
                a.getTitulo(),
                a.getAutor(),
                a.getFecha(),
                a.getEditorial(),
                a.getEstado(),
                a.getMatri()
        };
         t.addRow(fila);
                
            }
        }
        x.setModel(t);
    }
   
    public int buscando(String x,int c){
        String tp, ti, a, f, e;
        boolean found = false;
        for (int i = 0; i < tablaElementos.getRowCount(); i++) {
            Object value = tablaElementos.getValueAt(i, c); 
            if (value != null && value.toString().equals(x)) {
                found = true;
                tp = (String) tablaElementos.getValueAt(i, 0);
                ti = (String) tablaElementos.getValueAt(i, 1);
                a = (String) tablaElementos.getValueAt(i, 2);
                f = (String) tablaElementos.getValueAt(i, 3);
                e = (String) tablaElementos.getValueAt(i, 4);
                letrero.setText("Encontrado");
                w=i;
                break; 
            }    
        }     
        if (!found) {
            letrero.setText("No encontrado");
        }
        return w;
    }
    
    public static void limpiaTabla(){
        int a=t.getRowCount();      
        while(a!=0){ // Ciclo para Borrar la Tabla 1
            if(a!=0)
               t.removeRow(0);                      
            a=t.getRowCount();        
        }          
    }
    
    public void mostrarTabla(JTable x){
        limpiaTabla();
        for (IngresarL a:listaElementos) {
            Object[] fila= {a.getTipo(),
                a.getTitulo(),
                a.getAutor(),
                a.getFecha(),
                a.getEditorial(),
                a.getEstado(),
                a.getMatri()
        };
         t.addRow(fila);
        }
        x.setModel(t);
    }
    
    public void especial(){
        int a=ta.getRowCount();      
        while(a!=0){ // Ciclo para Borrar la Tabla 1
            if(a!=0)
               ta.removeRow(0);                      
            a=ta.getRowCount();        
        }
        for (IngresarL c:listaElementos){
            Object[] fila= {c.getTipo(),
                c.getTitulo(),
                c.getAutor(),
                c.getFecha(),
                c.getEditorial(),
                c.getEstado()
        };
         ta.addRow(fila);
        }
        tablaBiblioteca.setModel(ta); 
    }
    
    public int BuscarMatricula(){
        String matricula = JOptionPane.showInputDialog(Alumnos, "Ingrese la matricula del Alumno");
        for(IngresarA alumno : listaAlumnos){
            if(alumno.getMatricula().equals(matricula)){
               indice= listaAlumnos.indexOf(alumno);
            }
        }
        return indice;
    }
    
    public int tamaño(String n) {
        String expresion = n;
        int cont = 0;
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            if (Character.isDigit(c)) {
                cont++;
            }
        }
        return cont;
    }
    
    public void visible(boolean x){
        ActualizarElementos.setVisible(x);
        btnEliminarElemento.setVisible(x);
        btnIngresarUsuario1.setVisible(x);
        btnBuscar.setVisible(x);
        btnsolicitar.setVisible(x);
        btndevolucion.setVisible(x);
        menu.setVisible(x);
        btnCambiarUser.setVisible(x);
    }
    
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
            java.util.logging.Logger.getLogger(MiBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Actualizando;
    private javax.swing.JDialog ActualizarEle;
    private javax.swing.JButton ActualizarElementos;
    private javax.swing.JDialog Alumnos;
    private javax.swing.JButton CancelarRegistro;
    private javax.swing.JButton EliminarInfo;
    private javax.swing.JButton GuardarRegistro;
    private javax.swing.JMenu IngresarAlumnos;
    private javax.swing.JDialog LaBiblioteca;
    private javax.swing.JLabel Matricula;
    private javax.swing.JTextField MatriculaAlumno;
    private javax.swing.JLabel NombreAlumno;
    private javax.swing.JDialog Prestamos;
    private javax.swing.JDialog RegistroAlumno;
    private javax.swing.JDialog Registros;
    private javax.swing.JDialog Solicitante;
    private javax.swing.JButton actualizarInf;
    private javax.swing.JMenuItem actualizarInfo;
    private javax.swing.JButton btnAceptarLibro;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarPedido;
    private javax.swing.JButton btnCambiarUser;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarElemento;
    private javax.swing.JButton btnGuardado;
    private javax.swing.JButton btnIngresarUsuario1;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JButton btncan;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btndevolucion;
    private javax.swing.JButton btndevolver;
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnsolicitar;
    private javax.swing.JButton cancelar;
    private javax.swing.JMenuItem cerrars;
    private javax.swing.JDialog consulta;
    private javax.swing.JMenuItem darAlta;
    private javax.swing.JMenuItem eliminarAlumno;
    private javax.swing.JLabel etiqueta;
    private javax.swing.JLabel etiqueta2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel letrero;
    private javax.swing.JPanel login;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem menuLibro;
    private javax.swing.JMenuItem menuRevista;
    private javax.swing.JMenuItem menuSolicitar;
    private javax.swing.JMenuItem menuTesis;
    private javax.swing.JTextField nombre;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton registroA;
    private javax.swing.JTable tablaActualiza;
    private javax.swing.JTable tablaAlumno;
    private javax.swing.JTable tablaBiblioteca;
    private javax.swing.JTable tablaElementos;
    private javax.swing.JLabel tituloRegistro;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtBuscarPedido;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtTitulo;
    private com.toedter.calendar.JDateChooser txtfecha;
    private javax.swing.JTextArea txtinformacion_prestamo;
    private javax.swing.JComboBox<String> usuarios;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel{
        private Image imagen;    
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/uno.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }  
    }
}
