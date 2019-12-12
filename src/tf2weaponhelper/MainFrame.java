/*
 * Copyright (C) 2019 Matthew Cumbo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tf2weaponhelper;

/**
 *
 * @author Matthew Cumbo
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        tabbedPane = new javax.swing.JTabbedPane();
        infBasicSettings = new javax.swing.JInternalFrame();
        lblWeaponNumber = new javax.swing.JLabel();
        txtWeaponNumber = new javax.swing.JTextField();
        lblClassname = new javax.swing.JLabel();
        txtClassname = new javax.swing.JTextField();
        lblWeaponNumber2 = new javax.swing.JLabel();
        txtWeaponNumber2 = new javax.swing.JTextField();
        lblWeaponNumber3 = new javax.swing.JLabel();
        lblWeaponNumber4 = new javax.swing.JLabel();
        txtWeaponNumber4 = new javax.swing.JTextField();
        lblWeaponNumber5 = new javax.swing.JLabel();
        txtWeaponNumber5 = new javax.swing.JTextField();
        lblWeaponNumber6 = new javax.swing.JLabel();
        txtWeaponNumber6 = new javax.swing.JTextField();
        boxSlot = new javax.swing.JComboBox<>();
        infAttributes = new javax.swing.JInternalFrame();
        infWeaponCode = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        codeText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TF2 Custom Weapon Helper");

        infBasicSettings.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        infBasicSettings.setFrameIcon(null);
        infBasicSettings.setVisible(true);
        infBasicSettings.getContentPane().setLayout(null);

        lblWeaponNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblWeaponNumber.setText("Weapon number:");
        infBasicSettings.getContentPane().add(lblWeaponNumber);
        lblWeaponNumber.setBounds(10, 10, 140, 22);

        txtWeaponNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWeaponNumber.setText("10000");
        infBasicSettings.getContentPane().add(txtWeaponNumber);
        txtWeaponNumber.setBounds(210, 10, 90, 23);

        lblClassname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblClassname.setText("Classname:");
        infBasicSettings.getContentPane().add(lblClassname);
        lblClassname.setBounds(10, 40, 140, 22);

        txtClassname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClassname.setText("tf_weapon_rocketlauncher");
        infBasicSettings.getContentPane().add(txtClassname);
        txtClassname.setBounds(210, 40, 240, 23);

        lblWeaponNumber2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblWeaponNumber2.setText("Index:");
        infBasicSettings.getContentPane().add(lblWeaponNumber2);
        lblWeaponNumber2.setBounds(10, 70, 140, 22);

        txtWeaponNumber2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWeaponNumber2.setText("228");
        infBasicSettings.getContentPane().add(txtWeaponNumber2);
        txtWeaponNumber2.setBounds(210, 70, 140, 23);

        lblWeaponNumber3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblWeaponNumber3.setText("Slot:");
        infBasicSettings.getContentPane().add(lblWeaponNumber3);
        lblWeaponNumber3.setBounds(10, 100, 140, 22);

        lblWeaponNumber4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblWeaponNumber4.setText("Quality:");
        infBasicSettings.getContentPane().add(lblWeaponNumber4);
        lblWeaponNumber4.setBounds(10, 130, 140, 22);

        txtWeaponNumber4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWeaponNumber4.setText("6");
        infBasicSettings.getContentPane().add(txtWeaponNumber4);
        txtWeaponNumber4.setBounds(210, 130, 50, 23);

        lblWeaponNumber5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblWeaponNumber5.setText("Level:");
        infBasicSettings.getContentPane().add(lblWeaponNumber5);
        lblWeaponNumber5.setBounds(10, 160, 140, 22);

        txtWeaponNumber5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWeaponNumber5.setText("29");
        infBasicSettings.getContentPane().add(txtWeaponNumber5);
        txtWeaponNumber5.setBounds(210, 160, 50, 23);

        lblWeaponNumber6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblWeaponNumber6.setText("Ammo:");
        infBasicSettings.getContentPane().add(lblWeaponNumber6);
        lblWeaponNumber6.setBounds(10, 190, 140, 22);

        txtWeaponNumber6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWeaponNumber6.setText("20");
        infBasicSettings.getContentPane().add(txtWeaponNumber6);
        txtWeaponNumber6.setBounds(210, 190, 80, 23);

        boxSlot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxSlot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primary", "Secondary", "Melee" }));
        infBasicSettings.getContentPane().add(boxSlot);
        boxSlot.setBounds(210, 100, 180, 23);

        tabbedPane.addTab("Basic settings", infBasicSettings);

        infAttributes.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        infAttributes.setFrameIcon(null);
        infAttributes.setVisible(true);

        javax.swing.GroupLayout infAttributesLayout = new javax.swing.GroupLayout(infAttributes.getContentPane());
        infAttributes.getContentPane().setLayout(infAttributesLayout);
        infAttributesLayout.setHorizontalGroup(
            infAttributesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        infAttributesLayout.setVerticalGroup(
            infAttributesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Attributes", infAttributes);

        infWeaponCode.setFrameIcon(null);
        infWeaponCode.setVisible(true);

        codeText.setEditable(false);
        codeText.setColumns(20);
        codeText.setRows(5);
        codeText.setText("\"10000\"\n{\n\t\"classname\"\t\t\"tf_weapon_rocketlauncher\"\n\t\"index\"\t\t\t\"228\"\n\t\"slot\"\t\t\t\"0\"\n\t\"quality\"\t\t\"6\"\n\t\"level\"\t\t\t\"29\"\n\t\"attribs\"\t\t\"134 ; 19\"\n\t\"ammo\"\t\t\"20\"\n}");
        codeText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(codeText);

        javax.swing.GroupLayout infWeaponCodeLayout = new javax.swing.GroupLayout(infWeaponCode.getContentPane());
        infWeaponCode.getContentPane().setLayout(infWeaponCodeLayout);
        infWeaponCodeLayout.setHorizontalGroup(
            infWeaponCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );
        infWeaponCodeLayout.setVerticalGroup(
            infWeaponCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Weapon code", infWeaponCode);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxSlot;
    private javax.swing.JTextArea codeText;
    private javax.swing.JInternalFrame infAttributes;
    private javax.swing.JInternalFrame infBasicSettings;
    private javax.swing.JInternalFrame infWeaponCode;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClassname;
    private javax.swing.JLabel lblWeaponNumber;
    private javax.swing.JLabel lblWeaponNumber2;
    private javax.swing.JLabel lblWeaponNumber3;
    private javax.swing.JLabel lblWeaponNumber4;
    private javax.swing.JLabel lblWeaponNumber5;
    private javax.swing.JLabel lblWeaponNumber6;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField txtClassname;
    private javax.swing.JTextField txtWeaponNumber;
    private javax.swing.JTextField txtWeaponNumber2;
    private javax.swing.JTextField txtWeaponNumber4;
    private javax.swing.JTextField txtWeaponNumber5;
    private javax.swing.JTextField txtWeaponNumber6;
    // End of variables declaration//GEN-END:variables
}
