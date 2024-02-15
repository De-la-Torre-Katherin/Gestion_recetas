/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Recetario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
        txtid = new javax.swing.JTextField();
        txtcategoria = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtingredientes = new javax.swing.JTextArea();
        txtusuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblreceta = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtpreparacion = new javax.swing.JTextArea();
        lblid = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblcategoria = new javax.swing.JLabel();
        lblingredientes = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lblpostres = new javax.swing.JLabel();
        lbljugos = new javax.swing.JLabel();
        lbldesayunos = new javax.swing.JLabel();
        lblplatos = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

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

        lblid.setText("Nro Registro: ");

        lbltitulo.setText("Titulo:");

        lblcategoria.setText("Categoria:");

        lblingredientes.setText("Ingredientes:");

        lblusuario.setText("Usuario:");

        lblpostres.setText("1)POSTRES");

        lbljugos.setText("2)JUGOS ");

        lbldesayunos.setText("3)DESAYUNOS ");

        lblplatos.setText("4)PATOS FUERTES ");

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

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblingredientes, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addComponent(lblpreparacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbltitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblcategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblpostres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbljugos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbldesayunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblplatos, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLayout.createSequentialGroup()
                                        .addComponent(txtcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnactualizar)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2))
                            .addComponent(btnregresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addGap(72, 72, 72))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnactualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblid))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(lblpostres, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbljugos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbldesayunos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbltitulo)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3))))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(lblplatos)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblingredientes)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnregresar)))
                .addGap(12, 12, 12)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcategoria)
                            .addComponent(lblusuario)
                            .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblpreparacion))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
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

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed

        Recetario p = new Recetario(Integer.parseInt(txtid.getText()),txttitulo.getText(),txtingredientes.getText(), txtpreparacion.getText(), Integer.parseInt(txtcategoria.getText()),Integer.parseInt(txtusuario.getText()));

        RecetasController u= new RecetasController();

        u.ActualizarRecetas(p);
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        int id = Integer.parseInt(txtid.getText());
        Recetario p = new Recetario(id,txttitulo.getText(),txtingredientes.getText(), txtpreparacion.getText(), Integer.parseInt(txtcategoria.getText()),Integer.parseInt(txtusuario.getText()));

        RecetasController rc = new RecetasController();
        rc.EliminarReceta(p);
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void tblrecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblrecetaMouseClicked
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) tblreceta.getModel();

        int filaSeleccionada = tblreceta.getSelectedRow();
        if (filaSeleccionada != -1) {

            txtid.setText(dtm.getValueAt(filaSeleccionada, 0).toString());
            txttitulo.setText((String) dtm.getValueAt(filaSeleccionada, 1));
            txtingredientes.setText((String) dtm.getValueAt(filaSeleccionada, 2));
            txtpreparacion.setText((String) dtm.getValueAt(filaSeleccionada, 3));
            txtcategoria.setText(dtm.getValueAt(filaSeleccionada, 4).toString());
            txtusuario.setText(dtm.getValueAt(filaSeleccionada, 5).toString());
        } else {

            JOptionPane.showMessageDialog(null, "Seleccione una fila antes de editar.");
        }
    }//GEN-LAST:event_tblrecetaMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
       String titulo = txttitulo.getText().toUpperCase();
        Recetario ct = new Recetario(0, titulo, txtingredientes.getText(), txtpreparacion.getText(),Integer.parseInt(txtcategoria.getText()),Integer.parseInt(txtusuario.getText()));
        RecetasController c = new RecetasController();
        c.CrearReceta(ct);
        listaReceta.add(ct);
        setDatos();

       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
     txtid.setText("");
    txttitulo.setText("");
    txtingredientes.setText("");
    txtpreparacion.setText("");
    txtcategoria.setText("");
    txtusuario.setText("");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttituloKeyTyped
        // TODO add your handling code here:zzzzzzz
    }//GEN-LAST:event_txttituloKeyTyped

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
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblcategoria;
    private javax.swing.JLabel lbldesayunos;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblingredientes;
    private javax.swing.JLabel lbljugos;
    private javax.swing.JLabel lblplatos;
    private javax.swing.JLabel lblpostres;
    private javax.swing.JLabel lblpreparacion;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTable tblreceta;
    private javax.swing.JTextField txtcategoria;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextArea txtingredientes;
    private javax.swing.JTextArea txtpreparacion;
    private javax.swing.JTextField txttitulo;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
