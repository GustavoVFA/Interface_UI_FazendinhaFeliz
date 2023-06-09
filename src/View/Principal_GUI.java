/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author LAB4M10
 */
public class Principal_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Principal_GUI
     */
    public Principal_GUI() {
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

        jPanel1 = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        AnimalBtn = new org.edisoncor.gui.button.ButtonIcon();
        VetBtn = new org.edisoncor.gui.button.ButtonIcon();
        VacBtn = new org.edisoncor.gui.button.ButtonIcon();
        AbateBtn = new org.edisoncor.gui.button.ButtonIcon();
        AnimalsGroupBtn = new org.edisoncor.gui.button.ButtonIcon();
        labelCustom1 = new org.edisoncor.gui.label.LabelCustom();
        labelCustom2 = new org.edisoncor.gui.label.LabelCustom();
        labelCustom3 = new org.edisoncor.gui.label.LabelCustom();
        labelCustom4 = new org.edisoncor.gui.label.LabelCustom();
        labelCustom5 = new org.edisoncor.gui.label.LabelCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema para gerenciamento");

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fundo2.jpg"))); // NOI18N
        panelImage1.setLayout(null);

        AnimalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/AnimalBtn.png"))); // NOI18N
        AnimalBtn.setText("buttonIcon1");
        panelImage1.add(AnimalBtn);
        AnimalBtn.setBounds(260, 280, 140, 110);

        VetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/VetBtn.png"))); // NOI18N
        VetBtn.setText("buttonIcon1");
        VetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VetBtnActionPerformed(evt);
            }
        });
        panelImage1.add(VetBtn);
        VetBtn.setBounds(260, 90, 140, 110);

        VacBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/VacBtn.png"))); // NOI18N
        VacBtn.setText("buttonIcon1");
        VacBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VacBtnActionPerformed(evt);
            }
        });
        panelImage1.add(VacBtn);
        VacBtn.setBounds(460, 90, 140, 110);

        AbateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/AbateBtn.png"))); // NOI18N
        AbateBtn.setText("buttonIcon2");
        AbateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbateBtnActionPerformed(evt);
            }
        });
        panelImage1.add(AbateBtn);
        AbateBtn.setBounds(60, 90, 140, 110);

        AnimalsGroupBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Grupo de Animais"), "Grupo de Animais"));
        AnimalsGroupBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/AnimalsGroupBtn.png"))); // NOI18N
        AnimalsGroupBtn.setText("Grupo de Animais");
        AnimalsGroupBtn.setName(""); // NOI18N
        AnimalsGroupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimalsGroupBtnActionPerformed(evt);
            }
        });
        panelImage1.add(AnimalsGroupBtn);
        AnimalsGroupBtn.setBounds(60, 280, 140, 110);

        labelCustom1.setText("Grupo de Animais");
        panelImage1.add(labelCustom1);
        labelCustom1.setBounds(260, 230, 140, 30);

        labelCustom2.setText("Animais");
        panelImage1.add(labelCustom2);
        labelCustom2.setBounds(60, 230, 140, 30);

        labelCustom3.setText("Veterinário");
        panelImage1.add(labelCustom3);
        labelCustom3.setBounds(260, 40, 140, 30);

        labelCustom4.setText("Abate");
        panelImage1.add(labelCustom4);
        labelCustom4.setBounds(60, 40, 140, 30);

        labelCustom5.setText("Vacinados");
        panelImage1.add(labelCustom5);
        labelCustom5.setBounds(460, 40, 140, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(676, 463));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AbateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbateBtnActionPerformed
        new Abate_GUI().setVisible(true);
    }//GEN-LAST:event_AbateBtnActionPerformed

    private void VetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VetBtnActionPerformed
       new Vet_GUI().setVisible(true);
    }//GEN-LAST:event_VetBtnActionPerformed

    private void VacBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VacBtnActionPerformed
       new Vacinados_GUI().setVisible(true);
    }//GEN-LAST:event_VacBtnActionPerformed

    private void AnimalsGroupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnimalsGroupBtnActionPerformed
        new Animais_GUI().setVisible(true);
    }//GEN-LAST:event_AnimalsGroupBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIcon AbateBtn;
    private org.edisoncor.gui.button.ButtonIcon AnimalBtn;
    private org.edisoncor.gui.button.ButtonIcon AnimalsGroupBtn;
    private org.edisoncor.gui.button.ButtonIcon VacBtn;
    private org.edisoncor.gui.button.ButtonIcon VetBtn;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.label.LabelCustom labelCustom2;
    private org.edisoncor.gui.label.LabelCustom labelCustom3;
    private org.edisoncor.gui.label.LabelCustom labelCustom4;
    private org.edisoncor.gui.label.LabelCustom labelCustom5;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
