/*
 * HarvardReferencing.java
 * 
 * Rev 1
 * 
 * 20/04/2013
 * 
 * @reference http://www.youtube.com/watch?v=s3Jqc7WGrrE
 * 
 * @author Joanna Bautista, x12374571
 * 
 */

/**
 *
 * @author Joanna Bautista, x12374571
 */
public class HarvardReferencing extends javax.swing.JFrame {

    /**
     *@reference http://www.youtube.com/watch?v=s3Jqc7WGrrE
     */
    public HarvardReferencing() {
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
        harvardSheadingjL = new javax.swing.JLabel();
        harvardSjBback = new javax.swing.JButton();
        harvardSdescription2jL = new javax.swing.JLabel();
        harvardSlink2jL = new javax.swing.JLabel();
        harvardSdescription1jL = new javax.swing.JLabel();
        harvardSlink1jL = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 370, 440));
        setMinimumSize(new java.awt.Dimension(370, 440));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        harvardSheadingjL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        harvardSheadingjL.setForeground(new java.awt.Color(255, 255, 255));
        harvardSheadingjL.setText("Harvard Style Referencing");
        jPanel1.add(harvardSheadingjL);
        harvardSheadingjL.setBounds(87, 27, 203, 22);

        harvardSjBback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back_PNG.png"))); // NOI18N
        harvardSjBback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harvardSjBbackActionPerformed(evt);
            }
        });
        jPanel1.add(harvardSjBback);
        harvardSjBback.setBounds(153, 385, 100, 35);

        harvardSdescription2jL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        harvardSdescription2jL.setForeground(new java.awt.Color(255, 255, 255));
        harvardSdescription2jL.setText("<html>\nCopy and past the link below to watch Mike Goldrick<br/>\nexplain Harvard Referencing<br/>\n</html>");
        jPanel1.add(harvardSdescription2jL);
        harvardSdescription2jL.setBounds(63, 67, 241, 75);

        harvardSlink2jL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        harvardSlink2jL.setText("<html>\n<a href=\"http://www.youtube.com/watch?v=s3Jqc7WGrrE\"> Harvard Style Referencing </a>\n</html>");
        harvardSlink2jL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                harvardSlink2jLMousePressed(evt);
            }
        });
        jPanel1.add(harvardSlink2jL);
        harvardSlink2jL.setBounds(63, 148, 152, 53);

        harvardSdescription1jL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        harvardSdescription1jL.setForeground(new java.awt.Color(255, 255, 255));
        harvardSdescription1jL.setText("<html>\nThis Link, will provide and <br/>\ngenerate the referencing for <br/>\nyou:<br/>\n</html>\n");
        jPanel1.add(harvardSdescription1jL);
        harvardSdescription1jL.setBounds(63, 207, 171, 51);

        harvardSlink1jL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        harvardSlink1jL.setText("<html>\n<a href=\"http://www.citethisforme.com/\">Online Referencing Generator </a>\n</html>");
        harvardSlink1jL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                harvardSlink1jLMousePressed(evt);
            }
        });
        jPanel1.add(harvardSlink1jL);
        harvardSlink1jL.setBounds(63, 264, 137, 83);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/One.jpg"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(-820, -140, 1480, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void harvardSjBbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harvardSjBbackActionPerformed
        // TODO add your handling code here:
        LearningSupportGUI e = new LearningSupportGUI();
        e.setVisible(true);
        dispose();
    }//GEN-LAST:event_harvardSjBbackActionPerformed

    private void harvardSlink2jLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_harvardSlink2jLMousePressed
        // TODO add your handling code here:
          try{
            String URL ="http://www.youtube.com/watch?v=s3Jqc7WGrrE";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } catch(Exception e){
            System.out.println("error getting url");
        }
    }//GEN-LAST:event_harvardSlink2jLMousePressed

    private void harvardSlink1jLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_harvardSlink1jLMousePressed
        // TODO add your handling code here:
             try{
            String URL ="http://www.citethisforme.com/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } catch(Exception e){
            System.out.println("error getting url");
        }
    }//GEN-LAST:event_harvardSlink1jLMousePressed

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
            java.util.logging.Logger.getLogger(HarvardReferencing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HarvardReferencing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HarvardReferencing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HarvardReferencing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HarvardReferencing().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel harvardSdescription1jL;
    private javax.swing.JLabel harvardSdescription2jL;
    private javax.swing.JLabel harvardSheadingjL;
    private javax.swing.JButton harvardSjBback;
    private javax.swing.JLabel harvardSlink1jL;
    private javax.swing.JLabel harvardSlink2jL;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}