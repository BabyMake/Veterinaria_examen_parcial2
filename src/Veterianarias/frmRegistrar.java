/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veterianarias;

import Clases.ColaMedicamentos;
import Interfaces.frmMenu;
import java.awt.event.KeyEvent;

/**
 *
 * @author HECTOR MAURICIO
 */
public class frmRegistrar extends javax.swing.JFrame {

    frmMenu menu;
    ColaMedicamentos colaMedicamentos;
    
     String nombreDoctor;
     String nombreMascota;
     float ganancias;
     String medicina;
     float costo;
    
    public frmRegistrar(frmMenu menu, ColaMedicamentos colaMedicamentos) {
        initComponents();
        
        this.menu = menu;
        this.colaMedicamentos = colaMedicamentos;
        
        String nombreDoctor = "";
        String nombreMascota = "";
        float ganancias = 0;
        String medicina = "";
        float costo = 0;
        
        jcbRefacccionaria.addItem("Nueva salvacion");
        jcbRefacccionaria.addItem("Veterinaria Lucas");
        jcbRefacccionaria.addItem("Nueva vida");
        jcbRefacccionaria.addItem("+kota");
        jcbRefacccionaria.addItem("Ceti veterinaira");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfNombreTrabajador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfSueldo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfCosto = new javax.swing.JTextField();
        jbnAgregar = new javax.swing.JButton();
        jbnSalir = new javax.swing.JButton();
        jcbRefacccionaria = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlTipos = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Registrar consulta");

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Veterinaria");

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Nombre del sagrado veterinario");

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("costo de consulta");

        jtfNombreTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreTrabajadorActionPerformed(evt);
            }
        });
        jtfNombreTrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfNombreTrabajadorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreTrabajadorKeyTyped(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Medicina");

        jtfSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfSueldoKeyTyped(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Costo la medicina");

        jtfCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCostoActionPerformed(evt);
            }
        });

        jbnAgregar.setText("Agregar");
        jbnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnAgregarActionPerformed(evt);
            }
        });

        jbnSalir.setText("Salir");
        jbnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSalirActionPerformed(evt);
            }
        });

        jcbRefacccionaria.setForeground(new java.awt.Color(204, 255, 204));
        jcbRefacccionaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbRefacccionariaActionPerformed(evt);
            }
        });

        jlTipos.setBackground(new java.awt.Color(204, 255, 255));
        jlTipos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Antibiotico", "Vacunas", "Penasilina", "Gotas" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlTipos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(312, 312, 312)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jbnAgregar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(90, 499, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jcbRefacccionaria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jtfSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfNombreTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(67, 67, 67)
                .addComponent(jbnSalir)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbRefacccionaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNombreTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnAgregar)
                    .addComponent(jbnSalir))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSalirActionPerformed
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbnSalirActionPerformed

    private void jbnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnAgregarActionPerformed
        // TODO add your handling code here:
        datos();
        colaMedicamentos.encolar(medicina, costo, nombreDoctor, nombreMascota, ganancias);
        
    }//GEN-LAST:event_jbnAgregarActionPerformed

    private void jtfCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCostoActionPerformed

    private void jtfNombreTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreTrabajadorActionPerformed

    private void jtfNombreTrabajadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreTrabajadorKeyPressed
        
    }//GEN-LAST:event_jtfNombreTrabajadorKeyPressed

    private void jtfNombreTrabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreTrabajadorKeyTyped
                char tam = 12;

        char caracter = evt.getKeyChar();

        if(!Character.isLetter(caracter))
        {
            getToolkit().beep();
            evt.consume();
        }

        if(jtfNombreTrabajador.getText().length()>=tam)
        {
            getToolkit().beep();
            evt.consume();
        }
         if(caracter == KeyEvent.VK_ENTER)
        {
            jtfNombreTrabajador.requestFocus();
            
        }
    }//GEN-LAST:event_jtfNombreTrabajadorKeyTyped

    private void jtfSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSueldoKeyTyped
        // TODO add your handling code here:
        
                        char tam = 12;

        char caracter = evt.getKeyChar();

        if(Character.isLetter(caracter))
        {
            getToolkit().beep();
            evt.consume();
        }

        if(jtfSueldo.getText().length()>=tam)
        {
            getToolkit().beep();
            evt.consume();
        }
         if(caracter == KeyEvent.VK_ENTER)
        {
            jtfSueldo.requestFocus();
            
        }
    
    }//GEN-LAST:event_jtfSueldoKeyTyped

    private void jcbRefacccionariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbRefacccionariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbRefacccionariaActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmRegistrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbnAgregar;
    private javax.swing.JButton jbnSalir;
    private javax.swing.JComboBox jcbRefacccionaria;
    private javax.swing.JList jlTipos;
    private javax.swing.JTextField jtfCosto;
    private javax.swing.JTextField jtfNombreTrabajador;
    private javax.swing.JTextField jtfSueldo;
    // End of variables declaration//GEN-END:variables

    private void datos() {
        
      nombreDoctor = String.valueOf(jcbRefacccionaria.getSelectedItem());
      nombreMascota = String.valueOf(jtfNombreTrabajador.getText());
      ganancias = Float.parseFloat(String.valueOf(jtfSueldo.getText()));
      medicina = String.valueOf(jlTipos.getSelectedValue());
      costo = Float.parseFloat(jtfCosto.getText());
        
        
    }
}