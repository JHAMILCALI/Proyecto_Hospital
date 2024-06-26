/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Clases.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Opcion1 extends javax.swing.JFrame {
    private Principal v1;

    /**
     * Creates new form Opcion1
     */
    public Opcion1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Opcion1(Principal aThis){
        initComponents();
        this.v1 = aThis;
    }

    public Ventanas.Principal getV1() {
        return v1;
    }

    public void setV1(Ventanas.Principal v1) {
        this.v1 = v1;
    }

    public JTextField getCampoHospital() {
        return campoHospital;
    }

    public void setCampoHospital(JTextField campoHospital) {
        this.campoHospital = campoHospital;
    }

    public JTextField getCampoSalaY() {
        return campoSalaY;
    }

    public void setCampoSalaY(JTextField campoSalaY) {
        this.campoSalaY = campoSalaY;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        boton_Atras = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        campoHospital = new javax.swing.JTextField();
        campoSalaY = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonVerificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pantalla_Camas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        campoCamas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        campoPacintes = new javax.swing.JLabel();
        botonMostrarCamas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ESCASES DE CAMAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        boton_Atras.setText("ATRAS");
        boton_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AtrasActionPerformed(evt);
            }
        });

        jButton1.setText("AGREGAR CAMAS");
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
                .addGap(68, 68, 68)
                .addComponent(boton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 566, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(boton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 880, 80));

        campoHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHospitalActionPerformed(evt);
            }
        });
        getContentPane().add(campoHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 144, 150, 30));

        campoSalaY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSalaYActionPerformed(evt);
            }
        });
        getContentPane().add(campoSalaY, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 150, 30));

        jLabel1.setText("HOSPITAL ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 80, -1));

        jLabel2.setText("SALA DE ESPERA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 120, -1));

        botonVerificar.setText("VERIFICAR");
        botonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 120, 30));

        jScrollPane1.setViewportView(Pantalla_Camas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 370, 200));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setForeground(new java.awt.Color(153, 204, 255));

        campoCamas.setBackground(new java.awt.Color(255, 255, 255));
        campoCamas.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CAMAS ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addComponent(campoCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(campoCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 210, 50));

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setForeground(new java.awt.Color(153, 204, 255));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PACIENTES");

        campoPacintes.setBackground(new java.awt.Color(255, 255, 255));
        campoPacintes.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(campoPacintes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(campoPacintes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 210, 50));

        botonMostrarCamas.setText("MOSTRAR CAMAS");
        botonMostrarCamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarCamasActionPerformed(evt);
            }
        });
        getContentPane().add(botonMostrarCamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AtrasActionPerformed
        // TODO add your handling code here:
        this.v1.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_boton_AtrasActionPerformed

    private void campoHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoHospitalActionPerformed

    private void campoSalaYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSalaYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSalaYActionPerformed

    private void botonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerificarActionPerformed
        // TODO add your handling code here:
        try {
            String HosX = campoHospital.getText();
            String SalaY = campoSalaY.getText();
            String titulos [] = {"NOMBRE","ID","URGENCIA","EDAD","CI"};
            DefaultTableModel pantalla = new DefaultTableModel(null,titulos);
            PilaHospital aux1 = new PilaHospital();
            if (!(HosX.equals("") && SalaY.equals(""))) {
                
                while (!v1.getHos().esVacia()) {                    
                    Hospital hos = v1.getHos().eli();
                    if (hos.getNombreHos().equals(HosX)) {
                        NodoPlanta R = hos.getPlanta().getP();
                        while (R!=null) {                            
                            PilaSala_Atencion aux2 = new PilaSala_Atencion();
                            while (!R.getSalaAtencion().esVacia()) {                                
                                Sala_Atencion sa = R.getSalaAtencion().eli();
                                System.out.println("slas "+sa.getNomSalaArea());
                                if (sa.getNomSalaArea().equals(SalaY)) {
                                    int nroCamas=camasOcupadas(sa.getCama());
                                    int nroPacientes=sa.getPaciente().nroNodos();
                                    this.campoCamas.setText(Integer.toHexString(nroCamas));
                                    this.campoPacintes.setText(Integer.toHexString(nroPacientes));
                                    System.out.println(" camas "+nroCamas+" nro Pacientes "+nroPacientes);
                                    if (nroCamas>nroPacientes) {
                                        JOptionPane.showMessageDialog(null, "Aun ay espacios disponibles de Camas en la Sala de "+sa.getNomSalaArea());
                                    }else{
                                        if (nroCamas==nroPacientes) {
                                            JOptionPane.showMessageDialog(null, "La cantidad de camas son la misma cantdiad de pacientes puede agregar camas");
                                        }else{
                                            JOptionPane.showMessageDialog(null, "No ay espacio disponible de camas que cubra la cantidad de pacintes en la sala de "+sa.getNomSalaArea()+" agregue camas!!!!!");
                                        }
                                    }
                                }
                                aux2.adi(sa);
                            }
                            R.getSalaAtencion().vaciar(aux2);
                            R=R.getSig();
                        }
                    }
                    aux1.adi(hos);
                }
                v1.getHos().vaciar(aux1);
            }else{
                JOptionPane.showMessageDialog(null, "DATOS NO VALIDOS!!!");

            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DATOS NO VALIDOS!!!");

        }
        
        
    }//GEN-LAST:event_botonVerificarActionPerformed

    private void botonMostrarCamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarCamasActionPerformed
        // TODO add your handling code here:
        try {
            String HosX = campoHospital.getText();
            String SalaY = campoSalaY.getText();
            String titulos [] = {"ID CAMA","ID OCUPANTE","DISPONIBLE"};
            DefaultTableModel pantalla = new DefaultTableModel(null,titulos);
            PilaHospital aux1 = new PilaHospital();
            if (!(HosX.equals("") && SalaY.equals(""))) {
                
                while (!v1.getHos().esVacia()) {                    
                    Hospital hos = v1.getHos().eli();
                    if (hos.getNombreHos().equals(HosX)) {
                        NodoPlanta R = hos.getPlanta().getP();
                        while (R!=null) {                            
                            PilaSala_Atencion aux2 = new PilaSala_Atencion();
                            while (!R.getSalaAtencion().esVacia()) {                                
                                Sala_Atencion sa = R.getSalaAtencion().eli();
                                System.out.println("slas "+sa.getNomSalaArea());
                                if (sa.getNomSalaArea().equals(SalaY)) {
                                    NodoCama S = sa.getCama().getP();
                                    int nroNod = sa.getCama().nroNodos();
                                    for (int i = 0; i < nroNod; i++) {
                                        Cama ca = S.getX();
                                        String fila[]={ca.getIDCama(),ca.getIDOcupante(),ca.getDisponible()};
                                        pantalla.addRow(fila);
                                        S=S.getSig();
                                    }
                                }
                                aux2.adi(sa);
                            }
                            R.getSalaAtencion().vaciar(aux2);
                            R=R.getSig();
                        }
                    }
                    aux1.adi(hos);
                }
                Pantalla_Camas.setModel(pantalla);
                v1.getHos().vaciar(aux1);
            }else{
                JOptionPane.showMessageDialog(null, "DATOS NO VALIDOS!!!");

            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DATOS NO VALIDOS!!!");

        }
    }//GEN-LAST:event_botonMostrarCamasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Agregar_Camas c1 = new Agregar_Camas(this);
        c1.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Opcion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opcion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opcion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opcion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opcion1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Pantalla_Camas;
    private javax.swing.JButton botonMostrarCamas;
    private javax.swing.JButton botonVerificar;
    private javax.swing.JButton boton_Atras;
    private javax.swing.JLabel campoCamas;
    private javax.swing.JTextField campoHospital;
    private javax.swing.JLabel campoPacintes;
    private javax.swing.JTextField campoSalaY;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private int camasOcupadas(LS_CircularCama a) {
        NodoCama R = a.getP();
		int nro = a.nroNodos();
		int cont=0;
		for (int i = 0; i < nro; i++) {
			Cama ca = R.getX();
			if (ca.getDisponible().equals("si")) {
				cont++;
			}
			R=R.getSig();
		}
		return cont;
    }
}
