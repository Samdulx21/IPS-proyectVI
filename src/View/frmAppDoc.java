/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.ImageIcon;

/**
 *
 * @author Millow
 */
public class frmAppDoc extends javax.swing.JFrame {

    /**
     * Creates new form frmAppDoc
     */
    public frmAppDoc() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/LogosIMG/LogoWachi.png")).getImage());
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BtnIncertar = new javax.swing.JButton();
        BtnEntrar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        BtnEntrar2 = new javax.swing.JButton();
        BtnMenu = new javax.swing.JButton();
        BtnMini = new javax.swing.JButton();
        BtnCerrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbDoc = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(236, 252, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(178, 252, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PERFIL");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 210, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 220));

        jPanel3.setBackground(new java.awt.Color(178, 252, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Datos del Paciente");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtUser.setBackground(new java.awt.Color(236, 252, 255));
        txtUser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.setBorder(null);
        jPanel3.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 270, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Agregar Historia");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, -1));

        BtnIncertar.setBackground(new java.awt.Color(178, 252, 255));
        BtnIncertar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtnIncertar.setForeground(new java.awt.Color(0, 0, 0));
        BtnIncertar.setText("INSERTAR");
        BtnIncertar.setBorder(null);
        BtnIncertar.setBorderPainted(false);
        BtnIncertar.setContentAreaFilled(false);
        BtnIncertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnIncertar.setFocusPainted(false);
        jPanel3.add(BtnIncertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 110, 40));

        BtnEntrar1.setBackground(new java.awt.Color(178, 252, 255));
        BtnEntrar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtnEntrar1.setForeground(new java.awt.Color(0, 0, 0));
        BtnEntrar1.setText("MODIFICAR");
        BtnEntrar1.setBorder(null);
        BtnEntrar1.setBorderPainted(false);
        BtnEntrar1.setContentAreaFilled(false);
        BtnEntrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEntrar1.setFocusPainted(false);
        jPanel3.add(BtnEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 110, 40));

        jTextArea1.setBackground(new java.awt.Color(236, 252, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 470, 120));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Buscar:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 40, -1));

        BtnEntrar2.setBackground(new java.awt.Color(178, 252, 255));
        BtnEntrar2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtnEntrar2.setForeground(new java.awt.Color(0, 0, 0));
        BtnEntrar2.setText("IMPRIMIR");
        BtnEntrar2.setBorder(null);
        BtnEntrar2.setBorderPainted(false);
        BtnEntrar2.setContentAreaFilled(false);
        BtnEntrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEntrar2.setFocusPainted(false);
        jPanel3.add(BtnEntrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 110, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 610, 220));

        BtnMenu.setBackground(new java.awt.Color(236, 252, 255));
        BtnMenu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtnMenu.setForeground(new java.awt.Color(0, 0, 0));
        BtnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogosIMG/logout_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        BtnMenu.setBorder(null);
        BtnMenu.setBorderPainted(false);
        BtnMenu.setContentAreaFilled(false);
        BtnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMenu.setFocusPainted(false);
        jPanel1.add(BtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        BtnMini.setBackground(new java.awt.Color(236, 252, 255));
        BtnMini.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtnMini.setForeground(new java.awt.Color(0, 0, 0));
        BtnMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogosIMG/remove_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        BtnMini.setBorder(null);
        BtnMini.setBorderPainted(false);
        BtnMini.setContentAreaFilled(false);
        BtnMini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMini.setFocusPainted(false);
        BtnMini.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(BtnMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 40, 40));

        BtnCerrar.setBackground(new java.awt.Color(236, 252, 255));
        BtnCerrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        BtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogosIMG/close_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        BtnCerrar.setBorder(null);
        BtnCerrar.setBorderPainted(false);
        BtnCerrar.setContentAreaFilled(false);
        BtnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCerrar.setFocusPainted(false);
        jPanel1.add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 50, 40));

        jtbDoc.setBackground(new java.awt.Color(236, 252, 255));
        jtbDoc.setForeground(new java.awt.Color(0, 0, 0));
        jtbDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Cedula", "Celular", "Tipo de Consulta", "Hora", "E-Mail", "Sexo", "Historia Clinica"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbDoc.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jtbDoc.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jtbDoc);
        if (jtbDoc.getColumnModel().getColumnCount() > 0) {
            jtbDoc.getColumnModel().getColumn(0).setResizable(false);
            jtbDoc.getColumnModel().getColumn(1).setResizable(false);
            jtbDoc.getColumnModel().getColumn(2).setResizable(false);
            jtbDoc.getColumnModel().getColumn(3).setResizable(false);
            jtbDoc.getColumnModel().getColumn(4).setResizable(false);
            jtbDoc.getColumnModel().getColumn(5).setResizable(false);
            jtbDoc.getColumnModel().getColumn(6).setResizable(false);
            jtbDoc.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 900, 430));

        jLabel6.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("!Bienvenido/a¡ + nombre de usuario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -2, 344, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(frmAppDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAppDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAppDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAppDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAppDoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnCerrar;
    public javax.swing.JButton BtnEntrar1;
    public javax.swing.JButton BtnEntrar2;
    public javax.swing.JButton BtnIncertar;
    public javax.swing.JButton BtnMenu;
    public javax.swing.JButton BtnMini;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTable jtbDoc;
    public javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}