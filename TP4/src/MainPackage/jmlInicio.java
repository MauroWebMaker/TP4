import javax.swing.JOptionPane;

/*
 * @author Grupo 11
 */
public class jmlInicio extends javax.swing.JFrame {

    public jmlInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        menu_principal = new javax.swing.JMenuBar();
        Alumno = new javax.swing.JMenu();
        AltaDeAlumnos = new javax.swing.JMenuItem();
        Materia = new javax.swing.JMenu();
        AltaDeMaterias = new javax.swing.JMenuItem();
        Inscripcion = new javax.swing.JMenu();
        FormularioDeInscripcion = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        menu_principal.setToolTipText("");
        menu_principal.setMaximumSize(new java.awt.Dimension(227, 23));

        Alumno.setText("Alumno");

        AltaDeAlumnos.setText("Alta de alumnos");
        AltaDeAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaDeAlumnosActionPerformed(evt);
            }
        });
        Alumno.add(AltaDeAlumnos);

        menu_principal.add(Alumno);
        Alumno.getAccessibleContext().setAccessibleName("Alumnos");

        Materia.setText("Materia");

        AltaDeMaterias.setText("Alta de materias");
        AltaDeMaterias.setActionCommand("AgregarMateria");
        AltaDeMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaDeMateriasActionPerformed(evt);
            }
        });
        Materia.add(AltaDeMaterias);

        menu_principal.add(Materia);

        Inscripcion.setText("Inscripcion");

        FormularioDeInscripcion.setText("Formulario de Incripciones");
        FormularioDeInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioDeInscripcionActionPerformed(evt);
            }
        });
        Inscripcion.add(FormularioDeInscripcion);

        menu_principal.add(Inscripcion);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        Salir.setText("Salir?");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        salir.add(Salir);

        menu_principal.add(salir);

        setJMenuBar(menu_principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AltaDeAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaDeAlumnosActionPerformed
        VentanaAlumnos aux = new VentanaAlumnos();
        menu_principal.add(aux);
        aux.setVisible(true);
    }//GEN-LAST:event_AltaDeAlumnosActionPerformed

    private void AltaDeMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaDeMateriasActionPerformed
        VentanaMateria aux = new VentanaMateria();
        menu_principal.add(aux);
        aux.setVisible(true);
    }//GEN-LAST:event_AltaDeMateriasActionPerformed

    private void FormularioDeInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioDeInscripcionActionPerformed
        VentanaInscripcion aux = new VentanaInscripcion();
        menu_principal.add(aux);
        aux.setVisible(true);
    }//GEN-LAST:event_FormularioDeInscripcionActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

    }//GEN-LAST:event_salirActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

        int aux = JOptionPane.showConfirmDialog(rootPane, "Seguro que desea salir ?","Estas seguro ??", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (aux==JOptionPane.YES_OPTION) {
            System.out.println("Bai");
            System.exit(0);
        }else{
            System.out.println("Casi te vas jaja");
        }
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(jmlInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jmlInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jmlInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jmlInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jmlInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AltaDeAlumnos;
    private javax.swing.JMenuItem AltaDeMaterias;
    private javax.swing.JMenu Alumno;
    private javax.swing.JMenuItem FormularioDeInscripcion;
    private javax.swing.JMenu Inscripcion;
    private javax.swing.JMenu Materia;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar menu_principal;
    private javax.swing.JMenu salir;
    // End of variables declaration//GEN-END:variables
}
