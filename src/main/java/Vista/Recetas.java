/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Recetario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Controlador.RecetasController;


/**
 *
 * @author HP
 */
public class Recetas extends javax.swing.JFrame {
    ArrayList<Recetario>listaReceta=new ArrayList<>();
    
    DefaultTableModel modelo=new DefaultTableModel();
  
    
    /**
     * Creates new form Recetas
     */
    public Recetas() {
        initComponents();
        setModel(); 
    }

      public void setModel(){
        String[] cabecera={"Nro","Nombre","Ingredientes","Preparacion","Categoria","Usuario"};
        modelo.setColumnIdentifiers(cabecera);
         tblreceta.setModel(modelo);
    
    }  
   public void setDatos(){
       
       Object[] fila = new Object[modelo.getColumnCount()];
   int nro=1;
   for( Recetario datos : listaReceta){
       fila[0]=nro;
       fila[1]=datos.getTitulo();
       fila[2]=datos.getIngredientes();
       fila[3]=datos.getPreparacion();
       fila[4]=datos.getCatid();
       fila[5]=datos.getUsuid();
       

       nro++;
       modelo.addRow(fila);
       
       
   }
   }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        txttitulo = new javax.swing.JTextField();
        lblpreparacion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtingredientes = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblreceta = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtpreparacion = new javax.swing.JTextArea();
        lbltitulo = new javax.swing.JLabel();
        lblcategoria = new javax.swing.JLabel();
        lblingredientes = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cmbusuario = new javax.swing.JComboBox<>();
        CheckBoxPostre = new javax.swing.JCheckBox();
        CheckBoxJugos = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        ChecBoxDesayuno = new javax.swing.JCheckBox();
        scroldesplazamiento = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        txttitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttituloKeyTyped(evt);
            }
        });

        lblpreparacion.setText("Preparacion:");

        txtingredientes.setColumns(20);
        txtingredientes.setRows(5);
        jScrollPane2.setViewportView(txtingredientes);

        tblreceta.setModel(new javax.swing.table.DefaultTableModel(
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
        tblreceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblrecetaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblreceta);

        txtpreparacion.setColumns(20);
        txtpreparacion.setRows(5);
        jScrollPane3.setViewportView(txtpreparacion);

        lbltitulo.setText("Titulo:");

        lblcategoria.setText("Categoria:");

        lblingredientes.setText("Ingredientes:");

        lblusuario.setText("Usuario:");

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cmbusuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Juan", "Samanta" }));

        CheckBoxPostre.setText("Postres");

        CheckBoxJugos.setText("Jugos");
        CheckBoxJugos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxJugosActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Platos Fuertes");

        ChecBoxDesayuno.setText("Desayunos");

        scroldesplazamiento.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scroldesplazamientoAdjustmentValueChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lblpreparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblingredientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(lblcategoria)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CheckBoxPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CheckBoxJugos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ChecBoxDesayuno)
                                            .addComponent(jCheckBox3)))
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelLayout.createSequentialGroup()
                                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(41, 41, 41)
                                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnactualizar)
                                                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(btnregresar))))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(scroldesplazamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbltitulo)
                                    .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(lblingredientes))
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CheckBoxPostre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckBoxJugos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ChecBoxDesayuno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)))
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpreparacion)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnGuardar)
                                    .addComponent(btneliminar))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(btnactualizar))
                                .addGap(18, 18, 18)
                                .addComponent(btnregresar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scroldesplazamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
           RecetasController rc=new RecetasController();
        
       ArrayList<Object[]>listas= rc.ObtenerRecetas();
       
        for (Object[] filas : listas) {
            modelo.addRow(filas);
          }
        tblreceta.setModel(modelo);
        
        
        
        
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        txttitulo.setText("");
        txtingredientes.setText("");
        txtpreparacion.setText("");
        ChecBoxDesayuno.setSelected(false);
        CheckBoxJugos.setSelected(false);
        jCheckBox3.setSelected(false);
        CheckBoxPostre.setSelected(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        String usu = (String) cmbusuario.getSelectedItem();
        String titulo = txttitulo.getText().toUpperCase();

        int idCat = 0;

        if (CheckBoxPostre.isSelected()) {
            idCat = 1;
        } else if (CheckBoxJugos.isSelected()) {
            idCat = 2;
        } else if (ChecBoxDesayuno.isSelected()) {
            idCat = 3;
        } else if (jCheckBox3.isSelected()) {
            idCat = 4;
        }

        int idusu;

        switch (usu) {
            case "Juan":
            idusu = 1;
            break;
            case "Samanta":
            idusu = 8;
            break;
            default:
            idusu = 0;
            break;
        }

        Recetario ct = new Recetario(0, titulo, txtingredientes.getText(), txtpreparacion.getText(),idCat,idusu);
        RecetasController c = new RecetasController();
        c.EliminarReceta(ct);

    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        String usu = (String) cmbusuario.getSelectedItem();
        String titulo = txttitulo.getText().toUpperCase();
        int idCat = 0;

        if (CheckBoxPostre.isSelected()) {
            idCat = 1;
        } else if (CheckBoxJugos.isSelected()) {
            idCat = 2;
        } else if (ChecBoxDesayuno.isSelected()) {
            idCat = 3;
        } else if (jCheckBox3.isSelected()) {
            idCat = 4;
        }

        int idusu;

        switch (usu) {
            case "Juan":
            idusu = 1;
            break;
            case "Samanta":
            idusu = 8;
            break;
            default:
            idusu = 0;
            break;
        }

        try {
            Recetario ct = new Recetario(0, titulo, txtingredientes.getText(), txtpreparacion.getText(), idCat, idusu);
            RecetasController c = new RecetasController();
            c.CrearReceta(ct);
            listaReceta.add(ct);
            setDatos();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed

        String usu = (String) cmbusuario.getSelectedItem();

        String titulo = txttitulo.getText().toUpperCase();

        int idCat = 0;

        if (CheckBoxPostre.isSelected()) {
            idCat = 1;
        } else if (CheckBoxJugos.isSelected()) {
            idCat = 2;
        } else if (ChecBoxDesayuno.isSelected()) {
            idCat = 3;
        } else if (jCheckBox3.isSelected()) {
            idCat = 4;
        }

        int idUsu = 0;

        // Usuario
        if ("Juan".equals(usu)) {
            idUsu = 1;
        } else if ("Samanta".equals(usu)) {
            idUsu = 8;
        }

        Recetario ct = new Recetario(0, titulo, txtingredientes.getText(), txtpreparacion.getText(),idCat,idUsu);

        RecetasController c = new RecetasController();
        c.ActualizarRecetas(ct);

    }//GEN-LAST:event_btnactualizarActionPerformed

    private void tblrecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblrecetaMouseClicked
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) tblreceta.getModel();

        int filaSeleccionada = tblreceta.getSelectedRow();
        

            txttitulo.setText(getString(dtm.getValueAt(filaSeleccionada, 1)));
            txtingredientes.setText(getString(dtm.getValueAt(filaSeleccionada,2)));
            txtpreparacion.setText(getString(dtm.getValueAt(filaSeleccionada, 3)));
            cmbusuario.setSelectedItem(getString(dtm.getValueAt(filaSeleccionada,4 )));
        
        
    }//GEN-LAST:event_tblrecetaMouseClicked

    private void txttituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttituloKeyTyped
        // TODO add your handling code here:zzzzzzz
    }//GEN-LAST:event_txttituloKeyTyped

    private void scroldesplazamientoAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scroldesplazamientoAdjustmentValueChanged
        int value = evt.getValue();

        jPanel.setLocation(jPanel.getX(), -value);

    }//GEN-LAST:event_scroldesplazamientoAdjustmentValueChanged

    private void CheckBoxJugosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxJugosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxJugosActionPerformed
private String getString(Object value) {
    return (value != null) ? value.toString() : "";
}

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
            java.util.logging.Logger.getLogger(Recetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recetas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChecBoxDesayuno;
    private javax.swing.JCheckBox CheckBoxJugos;
    private javax.swing.JCheckBox CheckBoxPostre;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JComboBox<String> cmbusuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblcategoria;
    private javax.swing.JLabel lblingredientes;
    private javax.swing.JLabel lblpreparacion;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JScrollBar scroldesplazamiento;
    private javax.swing.JTable tblreceta;
    private javax.swing.JTextArea txtingredientes;
    private javax.swing.JTextArea txtpreparacion;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables
}
