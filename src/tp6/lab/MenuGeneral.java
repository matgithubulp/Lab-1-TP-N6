/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp6.lab;

/**
 *
 * @author ejarq
 */
public class MenuGeneral extends javax.swing.JFrame {

    /**
     * Creates new form MenuGeneral
     */
    public MenuGeneral() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmenuItemProductos = new javax.swing.JCheckBoxMenuItem();
        jmenuConsultas = new javax.swing.JMenu();
        jmenuItemRubro = new javax.swing.JCheckBoxMenuItem();
        jmenuItemNombre = new javax.swing.JCheckBoxMenuItem();
        jmenuItemPrecio = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Administracion");

        jmenuItemProductos.setSelected(true);
        jmenuItemProductos.setText("Productos");
        jmenuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuItemProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jmenuItemProductos);

        jMenuBar1.add(jMenu1);

        jmenuConsultas.setText("Consultas");

        jmenuItemRubro.setSelected(true);
        jmenuItemRubro.setText("Por Rubro");
        jmenuItemRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuItemRubroActionPerformed(evt);
            }
        });
        jmenuConsultas.add(jmenuItemRubro);

        jmenuItemNombre.setSelected(true);
        jmenuItemNombre.setText("Por Nombre");
        jmenuItemNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuItemNombreActionPerformed(evt);
            }
        });
        jmenuConsultas.add(jmenuItemNombre);

        jmenuItemPrecio.setSelected(true);
        jmenuItemPrecio.setText("Por Precio");
        jmenuItemPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuItemPrecioActionPerformed(evt);
            }
        });
        jmenuConsultas.add(jmenuItemPrecio);

        jMenuBar1.add(jmenuConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmenuItemRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuItemRubroActionPerformed
       
        PorRubro rubro = new PorRubro();
        rubro.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jmenuItemRubroActionPerformed

    private void jmenuItemNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuItemNombreActionPerformed
        PorNombre nombre = new PorNombre();
        nombre.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmenuItemNombreActionPerformed

    private void jmenuItemPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuItemPrecioActionPerformed
        PorPrecio precio = new PorPrecio();
        precio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmenuItemPrecioActionPerformed

    private void jmenuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuItemProductosActionPerformed
        
        Producto producto = new Producto();
        producto.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jmenuItemProductosActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmenuConsultas;
    private javax.swing.JCheckBoxMenuItem jmenuItemNombre;
    private javax.swing.JCheckBoxMenuItem jmenuItemPrecio;
    private javax.swing.JCheckBoxMenuItem jmenuItemProductos;
    private javax.swing.JCheckBoxMenuItem jmenuItemRubro;
    // End of variables declaration//GEN-END:variables
}
