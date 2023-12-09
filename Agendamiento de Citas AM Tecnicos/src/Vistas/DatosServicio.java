package Vistas;

import Configuraciones.Conexion;
import Configuraciones.RedimencionarImagenes;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DatosServicio extends javax.swing.JFrame {

    public static int idser;
    public static String tiposer;
    public static String producto;

    Conexion con = new Conexion();
    Connection cn = con.conectado();
    PreparedStatement ps = null;

    public DatosServicio() {

        initComponents();
        this.setResizable(false);

        RedimencionarImagenes im = new RedimencionarImagenes();
        im.redimensionarImagenes(imgen, "src/resourses/servicio.png");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        pnlPrincipal2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnAtras = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        imgen = new javax.swing.JLabel();
        rservicio = new javax.swing.JRadioButton();
        rfumigacion = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        pnlenfoqeu = new javax.swing.JPanel();
        jenfoque = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        pnlfumi = new javax.swing.JPanel();
        rcucaracha = new javax.swing.JRadioButton();
        rroedores = new javax.swing.JRadioButton();
        rcontrol = new javax.swing.JRadioButton();
        rdesinfeccion = new javax.swing.JRadioButton();
        pnltecnico = new javax.swing.JPanel();
        rvisita = new javax.swing.JRadioButton();
        rserviciop = new javax.swing.JRadioButton();
        rterminaciones = new javax.swing.JRadioButton();
        robras = new javax.swing.JRadioButton();
        rmantenimiento = new javax.swing.JRadioButton();
        rinstalacion = new javax.swing.JRadioButton();
        rreparacion = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txtnSer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos del servicio");
        setIconImage(getIconImage());

        pnlPrincipal2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourses/icono.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Datos del servicio");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("¿Qué tipo de servicio solicitas?");

        jSeparator2.setForeground(new java.awt.Color(51, 153, 0));

        btnAtras.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAtras.setText("<<< Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar en BD");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        imgen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourses/servicio.png"))); // NOI18N

        rservicio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rservicio);
        rservicio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rservicio.setText("Servicio Tecnico");
        rservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rservicioActionPerformed(evt);
            }
        });

        rfumigacion.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rfumigacion);
        rfumigacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rfumigacion.setText("Fumigación");
        rfumigacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfumigacionActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(51, 153, 0));

        pnlenfoqeu.setBackground(new java.awt.Color(204, 255, 204));
        pnlenfoqeu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enfoque en productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        jenfoque.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jenfoque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Neveras", "Lavadoras", "Secadoras", "Televisores", "Sesores ", "Camaras" }));
        jenfoque.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Seleccione un producto");

        javax.swing.GroupLayout pnlenfoqeuLayout = new javax.swing.GroupLayout(pnlenfoqeu);
        pnlenfoqeu.setLayout(pnlenfoqeuLayout);
        pnlenfoqeuLayout.setHorizontalGroup(
            pnlenfoqeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlenfoqeuLayout.createSequentialGroup()
                .addGroup(pnlenfoqeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlenfoqeuLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlenfoqeuLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jenfoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlenfoqeuLayout.setVerticalGroup(
            pnlenfoqeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlenfoqeuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jenfoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pnlfumi.setBackground(new java.awt.Color(255, 255, 255));
        pnlfumi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        rcucaracha.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rcucaracha);
        rcucaracha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rcucaracha.setText("Control de cucarachas");
        rcucaracha.setEnabled(false);
        rcucaracha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcucarachaActionPerformed(evt);
            }
        });

        rroedores.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rroedores);
        rroedores.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rroedores.setText("Control de roedores");
        rroedores.setEnabled(false);

        rcontrol.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rcontrol);
        rcontrol.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rcontrol.setText("Control de chinces ");
        rcontrol.setEnabled(false);

        rdesinfeccion.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdesinfeccion);
        rdesinfeccion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rdesinfeccion.setText("Desinfección");
        rdesinfeccion.setEnabled(false);

        javax.swing.GroupLayout pnlfumiLayout = new javax.swing.GroupLayout(pnlfumi);
        pnlfumi.setLayout(pnlfumiLayout);
        pnlfumiLayout.setHorizontalGroup(
            pnlfumiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlfumiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlfumiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rcucaracha)
                    .addComponent(rcontrol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlfumiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rroedores)
                    .addComponent(rdesinfeccion))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnlfumiLayout.setVerticalGroup(
            pnlfumiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfumiLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlfumiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rcucaracha)
                    .addComponent(rdesinfeccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlfumiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rroedores)
                    .addComponent(rcontrol))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnltecnico.setBackground(new java.awt.Color(255, 255, 255));
        pnltecnico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        rvisita.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rvisita);
        rvisita.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rvisita.setText("Visita técnica ");
        rvisita.setEnabled(false);
        rvisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rvisitaActionPerformed(evt);
            }
        });

        rserviciop.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rserviciop);
        rserviciop.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rserviciop.setText("Servicio de plomería ");
        rserviciop.setEnabled(false);

        rterminaciones.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rterminaciones);
        rterminaciones.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rterminaciones.setText("Terminaciones civiles");
        rterminaciones.setEnabled(false);

        robras.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(robras);
        robras.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        robras.setText("Obras Civiles");
        robras.setEnabled(false);

        rmantenimiento.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup3.add(rmantenimiento);
        rmantenimiento.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rmantenimiento.setText("Mantenimiento ");
        rmantenimiento.setEnabled(false);
        rmantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmantenimientoActionPerformed(evt);
            }
        });

        rinstalacion.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup3.add(rinstalacion);
        rinstalacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rinstalacion.setText("Instalaciones ");
        rinstalacion.setEnabled(false);
        rinstalacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rinstalacionActionPerformed(evt);
            }
        });

        rreparacion.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup3.add(rreparacion);
        rreparacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rreparacion.setText("Reparación");
        rreparacion.setEnabled(false);
        rreparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rreparacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnltecnicoLayout = new javax.swing.GroupLayout(pnltecnico);
        pnltecnico.setLayout(pnltecnicoLayout);
        pnltecnicoLayout.setHorizontalGroup(
            pnltecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltecnicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnltecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rterminaciones)
                    .addComponent(rmantenimiento)
                    .addComponent(rvisita))
                .addGap(18, 18, 18)
                .addGroup(pnltecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnltecnicoLayout.createSequentialGroup()
                        .addGroup(pnltecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rserviciop)
                            .addComponent(robras))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnltecnicoLayout.createSequentialGroup()
                        .addComponent(rinstalacion)
                        .addGap(18, 18, 18)
                        .addComponent(rreparacion)
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        pnltecnicoLayout.setVerticalGroup(
            pnltecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltecnicoLayout.createSequentialGroup()
                .addGroup(pnltecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rvisita)
                    .addComponent(rserviciop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnltecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rterminaciones)
                    .addComponent(robras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnltecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rmantenimiento)
                    .addComponent(rinstalacion)
                    .addComponent(rreparacion))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Ingrese el número del servicio *");

        txtnSer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtnSer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnSerKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipal2Layout = new javax.swing.GroupLayout(pnlPrincipal2);
        pnlPrincipal2.setLayout(pnlPrincipal2Layout);
        pnlPrincipal2Layout.setHorizontalGroup(
            pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                        .addGroup(pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipal2Layout.createSequentialGroup()
                                .addGroup(pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                                        .addComponent(imgen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))
                    .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                        .addGroup(pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rservicio)
                            .addComponent(rfumigacion))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar))
                    .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                        .addComponent(pnltecnico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlenfoqeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
            .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(pnlfumi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txtnSer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPrincipal2Layout.setVerticalGroup(
            pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imgen, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11)
                        .addGap(5, 5, 5)
                        .addComponent(rfumigacion)))
                .addGroup(pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(pnlfumi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipal2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rservicio)
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnltecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlenfoqeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnGuardar))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rcucarachaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcucarachaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcucarachaActionPerformed

    private void rservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rservicioActionPerformed
        if (rfumigacion.isSelected() && rservicio.isSelected() == false) {
            desbloquearfumi(pnlfumi);
            bloquearfumi(pnltecnico);
        } else if (rservicio.isSelected() && rfumigacion.isSelected() == false) {
            desbloquearfumi(pnltecnico);
            bloquearfumi(pnlfumi);
        } else {
            bloquearfumi(pnlfumi);
            bloquearfumi(pnltecnico);
        }
    }//GEN-LAST:event_rservicioActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Tecnicos init = new Tecnicos();
        this.setVisible(false);
        init.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (rfumigacion.isEnabled() == false && rservicio.isEnabled() == false) {
            JOptionPane.showMessageDialog(null, "debe seleccionar un servicio");
        } else {
            if (txtnSer.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "No ha ingresado el número de servicio");
            } else {
                if (txtnSer.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "No se puede inserto el codigo del servicio");
                } else {
                    try {
                        //insertar datos a la base de datos
                        ps = cn.prepareStatement("INSERT INTO servicio VALUES (?,?,?,?)");

                        idser = Integer.parseInt(txtnSer.getText());
                        tiposer = "";
                        producto = "";
                        String enfoque = "";
                        if (rfumigacion.isSelected()) {
                            tiposer = "Fumigación";
                            if (rcucaracha.isSelected()) {
                                producto = "Control de cucarachas";
                            } else if (rcontrol.isSelected()) {
                                producto = "control de chinches";
                            } else if (rroedores.isSelected()) {
                                producto = "Control de roeedores";
                            } else if (rdesinfeccion.isSelected()) {
                                producto = "Desinfección";
                            } else {
                                producto = "por definir";
                            }
                        } else if (rservicio.isSelected()) {
                            tiposer = "Servicio tecnico";
                            if (rvisita.isSelected()) {
                                producto = "Visita tecnica";
                            } else if (rserviciop.isSelected()) {
                                producto = "Servicio de plomería";
                            } else if (rterminaciones.isSelected()) {
                                producto = "Terminaciones civiles";
                            } else if (robras.isSelected()) {
                                producto = "Obras civiles";
                            } else if (rmantenimiento.isSelected()) {
                                producto = "Mantenimiento";
                                enfoque = jenfoque.getItemAt(jenfoque.getSelectedIndex());
                            } else if (rreparacion.isSelected()) {
                                producto = "Reparación";
                                enfoque = jenfoque.getItemAt(jenfoque.getSelectedIndex());
                            } else if (rinstalacion.isSelected()) {
                                producto = "Instalaciones";
                                enfoque = jenfoque.getItemAt(jenfoque.getSelectedIndex());
                            }
                        }
                        ps.setInt(1, idser);
                        ps.setString(2, tiposer);
                        ps.setString(3, producto);
                        ps.setString(4, enfoque);

                        int resultado = ps.executeUpdate();//devuelve 1
                        //ps.close();

                        if (resultado > 0) {//si hay datos
                            JOptionPane.showMessageDialog(null, "Datos Almacenados");
                            this.setVisible(false);
                            Visita cita = new Visita();
                            cita.setVisible(true);//luego de guardar los primeros datos voy a interfaz ubicacion
                        } else {
                            JOptionPane.showMessageDialog(null, "No se guardaron");
                            this.setVisible(true);
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(MenuInicio.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, "No se conecto");
                    }

                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void rvisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rvisitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rvisitaActionPerformed

    private void txtnSerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnSerKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txtnSerKeyTyped

    public void bloquearfumi(JPanel pnl) {
        for (Component a : pnl.getComponents()) {
            a.setEnabled(false);
        }
    }

    public void desbloquearfumi(JPanel pnl) {
        for (Component a : pnl.getComponents()) {
            a.setEnabled(true);
        }
    }

    private void rfumigacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfumigacionActionPerformed
        if (rfumigacion.isSelected() && rservicio.isSelected() == false) {
            desbloquearfumi(pnlfumi);
            bloquearfumi(pnltecnico);
        } else if (rservicio.isSelected() && rfumigacion.isSelected() == false) {
            desbloquearfumi(pnltecnico);
            bloquearfumi(pnlfumi);
        } else {
            bloquearfumi(pnlfumi);
            bloquearfumi(pnltecnico);
        }
    }//GEN-LAST:event_rfumigacionActionPerformed

    private void rmantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmantenimientoActionPerformed
        if (rmantenimiento.isSelected()) {
            desbloquearfumi(pnlenfoqeu);
        } else if (rreparacion.isSelected()) {
            desbloquearfumi(pnlenfoqeu);
        } else if (rinstalacion.isSelected()) {
            desbloquearfumi(pnlenfoqeu);
        } else {
            bloquearfumi(pnlenfoqeu);
        }
    }//GEN-LAST:event_rmantenimientoActionPerformed

    private void rreparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rreparacionActionPerformed
        if (rmantenimiento.isSelected()) {
            desbloquearfumi(pnlenfoqeu);
        } else if (rreparacion.isSelected()) {
            desbloquearfumi(pnlenfoqeu);
        } else if (rinstalacion.isSelected()) {
            desbloquearfumi(pnlenfoqeu);
        } else {
            bloquearfumi(pnlenfoqeu);
        }
    }//GEN-LAST:event_rreparacionActionPerformed

    private void rinstalacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rinstalacionActionPerformed
        if (rmantenimiento.isSelected()) {
            desbloquearfumi(pnlenfoqeu);
        } else if (rreparacion.isSelected()) {
            desbloquearfumi(pnlenfoqeu);
        } else if (rinstalacion.isSelected()) {
            desbloquearfumi(pnlenfoqeu);
        } else {
            bloquearfumi(pnlenfoqeu);
        }
    }//GEN-LAST:event_rinstalacionActionPerformed

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
            java.util.logging.Logger.getLogger(DatosServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosServicio().setVisible(true);
            }
        });
    }

    @Override
    public Image getIconImage() {//Método sobrescrito para poner icono
        Image retvalue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("resourses/icono.png"));
        return retvalue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel imgen;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> jenfoque;
    private javax.swing.JPanel pnlPrincipal2;
    private javax.swing.JPanel pnlenfoqeu;
    private javax.swing.JPanel pnlfumi;
    private javax.swing.JPanel pnltecnico;
    private javax.swing.JRadioButton rcontrol;
    private javax.swing.JRadioButton rcucaracha;
    private javax.swing.JRadioButton rdesinfeccion;
    private javax.swing.JRadioButton rfumigacion;
    private javax.swing.JRadioButton rinstalacion;
    private javax.swing.JRadioButton rmantenimiento;
    private javax.swing.JRadioButton robras;
    private javax.swing.JRadioButton rreparacion;
    private javax.swing.JRadioButton rroedores;
    private javax.swing.JRadioButton rservicio;
    private javax.swing.JRadioButton rserviciop;
    private javax.swing.JRadioButton rterminaciones;
    private javax.swing.JRadioButton rvisita;
    private javax.swing.JTextField txtnSer;
    // End of variables declaration//GEN-END:variables
}
