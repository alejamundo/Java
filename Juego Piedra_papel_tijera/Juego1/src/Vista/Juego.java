package Vista;

import Setup.Conexion;
import Setup.Redimencionar;
import static Vista.Registro.doc;
import static Vista.Registro.nom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Juego extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conectado();
    PreparedStatement ps = null;
    Registro fk = new Registro();
    int ganapc = 0;
    int ganaUsiario = 0;
    int intentos = 0;

    public Juego() {
        initComponents();
        this.setResizable(true);
        Redimencionar im = new Redimencionar();
        im.redimensionarImagenes(lblPapel, "src/Resources/papel.png");
        im.redimensionarImagenes(lblPiedra1, "src/Resources/piedra.png");
        im.redimensionarImagenes(lblTijeras, "src/Resources/tijeras.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPapel = new javax.swing.JLabel();
        lblTijeras = new javax.swing.JLabel();
        lblPiedra1 = new javax.swing.JLabel();
        btnPapel = new javax.swing.JButton();
        btnPiedra = new javax.swing.JButton();
        btnTijeras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblintentos = new javax.swing.JLabel();
        lblGanador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTiro = new javax.swing.JLabel();

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Jugar >>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Juego Piedra, Papel y Tijera");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Resultados...");

        lblPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/papel.png"))); // NOI18N

        lblTijeras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/tijeras.png"))); // NOI18N

        lblPiedra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/piedra.png"))); // NOI18N

        btnPapel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnPapel.setText("Papel");
        btnPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapelActionPerformed(evt);
            }
        });

        btnPiedra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnPiedra.setText("Piedra");
        btnPiedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiedraActionPerformed(evt);
            }
        });

        btnTijeras.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnTijeras.setText("Tijeras");
        btnTijeras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTijerasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Número de intentos: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Ganador: ");

        jSeparator1.setForeground(new java.awt.Color(204, 255, 204));

        lblintentos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblintentos.setText("?");

        lblGanador.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblGanador.setText("?");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Elija una opción");

        lblTiro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTiro.setText("!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnPiedra)
                                .addGap(77, 77, 77)
                                .addComponent(btnPapel)
                                .addGap(53, 53, 53)
                                .addComponent(btnTijeras))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPiedra1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTijeras, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblintentos, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(lblTiro, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(202, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(175, 175, 175)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTijeras, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTijeras)
                            .addComponent(btnPapel))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPiedra1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPiedra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTiro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblintentos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(389, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapelActionPerformed
        int Jugada = (int) (Math.random() * (3) + 1);
        String elecionPC = "";
        intentos++;

        if (Jugada == 1) {
            elecionPC = "Piedra";
            lblTiro.setText("PC tiro piedra y usted Papel: Gana PC! ");
            ganapc++;
        } else if (Jugada == 2) {
            elecionPC = "Papel";
            lblTiro.setText("PC tiro Papel y usted tambien: EMPATE!");
        } else {
            elecionPC = "Tijeras";
            lblTiro.setText("PC tiro Tijeras y usted papel: Gana Usted ");
            ganaUsiario++;
        }
        lblintentos.setText(String.valueOf(intentos));
        if (ganapc == 2 || ganaUsiario == 2) {
            
            JOptionPane.showMessageDialog(null, "El juego termino");
            if (ganapc == 2) {
                lblGanador.setText("PC");
                JOptionPane.showMessageDialog(null, "El ganador es: PC");
            } else {
                lblGanador.setText(fk.nom);
                JOptionPane.showMessageDialog(null, "El ganador es: "+fk.nom);
            }
            grabar();
        }
    }//GEN-LAST:event_btnPapelActionPerformed

    private void btnPiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiedraActionPerformed
        //calcula tiro de la pc
        int Jugada = (int) (Math.random() * (3) + 1);
        String elecionPC = "";
        intentos++;

        if (Jugada == 1) {
            elecionPC = "Piedra";
            lblTiro.setText("PC tiro piedra y usted tambien: EMPATE! ");
        } else if (Jugada == 2) {
            elecionPC = "Papel";
            lblTiro.setText("PC tiro Papel y usted Piedra: Gana usted ");
            ganaUsiario++;
        } else {
            elecionPC = "Tijeras";
            lblTiro.setText("PC tiro Tijeras y usted Piedra: Gana PC ");
            ganapc++;
        }
        lblintentos.setText(String.valueOf(intentos));
        if (ganapc == 2 || ganaUsiario == 2) {
            
            JOptionPane.showMessageDialog(null, "El juego termino");
            if (ganapc == 2) {
                lblGanador.setText("PC");
                JOptionPane.showMessageDialog(null, "El ganador es: PC");
            } else {
                lblGanador.setText(fk.nom);
                JOptionPane.showMessageDialog(null, "El ganador es: "+fk.nom);
            }
            grabar();
        }
    }//GEN-LAST:event_btnPiedraActionPerformed

    private void btnTijerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTijerasActionPerformed
        int Jugada = (int) (Math.random() * (3) + 1);
        String elecionPC = "";
        intentos++;

        if (Jugada == 1) {
            elecionPC = "Piedra";
            lblTiro.setText("PC tiro piedra y usted Tijeras: Gana PC! ");
            ganapc++;
        } else if (Jugada == 2) {
            elecionPC = "Papel";
            lblTiro.setText("PC tiro Papel y usted Tijeras: Gana usted ");
            ganaUsiario++;
        } else {
            elecionPC = "Tijeras";
            lblTiro.setText("PC tiro Tijeras y usted Tijeras: EMPATE! ");
        }
        lblintentos.setText(String.valueOf(intentos));
        if (ganapc == 2 || ganaUsiario == 2) {
            
            JOptionPane.showMessageDialog(null, "El juego termino");
            if (ganapc == 2) {
                lblGanador.setText("PC");
                JOptionPane.showMessageDialog(null, "El ganador es: PC");
            } else {
                lblGanador.setText(fk.nom);
                JOptionPane.showMessageDialog(null, "El ganador es: "+fk.nom);
            }
            grabar();
        }
    }//GEN-LAST:event_btnTijerasActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    private void grabar() {
        try {
            //insertar datos a la base de datos
            ps = cn.prepareStatement("INSERT INTO juego VALUES (null,?,?)"); 
            ps.setString(1, lblGanador.getText());
            ps.setInt(2, fk.doc);
            int resultado = ps.executeUpdate();//devuelve 1

            if (resultado > 0) {//si hay datos
                JOptionPane.showMessageDialog(null, "Se almacenaron los resultados de esta partida");
                this.setVisible(false);
                Registro cr = new Registro();
                cr.setVisible(true);//luego de guardar los primeros datos voy a interfaz ubicacion
            } else {
                JOptionPane.showMessageDialog(null, "No se Registraron los datos");
                this.setVisible(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se Conecto");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPapel;
    private javax.swing.JButton btnPiedra;
    private javax.swing.JButton btnTijeras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblGanador;
    private javax.swing.JLabel lblPapel;
    private javax.swing.JLabel lblPiedra1;
    private javax.swing.JLabel lblTijeras;
    private javax.swing.JLabel lblTiro;
    private javax.swing.JLabel lblintentos;
    // End of variables declaration//GEN-END:variables
}
