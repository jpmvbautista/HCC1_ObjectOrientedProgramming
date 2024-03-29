/*
 * AlertMindTraining.java
 * 
 * Rev 1
 * 
 * 20/04/13
 * 
 * @reference http://www.youtube.com/user/ProgrammingKnowledge?feature=watch
 * 
 * @author Joanna Bautista, x12374571
 */

/**
 *
 * @author Joanna Bautista, x12374571
 */
public class AlertMindTraining extends javax.swing.JFrame {

    /**
     * @reference http://www.youtube.com/user/ProgrammingKnowledge?feature=watch
     */
    public AlertMindTraining() {
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
        alertjLheading = new javax.swing.JLabel();
        alertjLdescription = new javax.swing.JLabel();
        alertjBback = new javax.swing.JButton();
        alertjLlink = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        alertjLheading.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        alertjLheading.setForeground(new java.awt.Color(255, 255, 255));
        alertjLheading.setText("Alert\n");
        jPanel1.add(alertjLheading);
        alertjLheading.setBounds(160, 26, 43, 22);

        alertjLdescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alertjLdescription.setForeground(new java.awt.Color(255, 255, 255));
        alertjLdescription.setText("<html> \nThese are accessible games that <br/>\nmay be used in a learning environment.<br/>\n<br/>\nThis list is neither definitive nor exhaustive. <br/>\nBut it's a quick way to find the type of<br/>\n accessible learning games you want.<br/>\n<br/>\nGames Accessible to People who are Blind,<br/>\n Visually Impaired, or Color Blind<br/>\n<br/>\nVisit the website to play the games:\n\n</html>");
        jPanel1.add(alertjLdescription);
        alertjLdescription.setBounds(55, 77, 277, 202);

        alertjBback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back_PNG.png"))); // NOI18N
        alertjBback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertjBbackActionPerformed(evt);
            }
        });
        jPanel1.add(alertjBback);
        alertjBback.setBounds(134, 383, 100, 35);

        alertjLlink.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        alertjLlink.setForeground(new java.awt.Color(255, 255, 255));
        alertjLlink.setText("<html>\n<a href=\"http://www.7128.com/alert/alert_where.html\"> www.7128.com/alert </a>\n</html>");
        alertjLlink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                alertjLlinkMousePressed(evt);
            }
        });
        jPanel1.add(alertjLlink);
        alertjLlink.setBounds(55, 305, 229, 29);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/One.jpg"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(-800, -120, 1480, 600);

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

    private void alertjBbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertjBbackActionPerformed
        // TODO add your handling code here:
        MindTraining p = new MindTraining();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_alertjBbackActionPerformed

    private void alertjLlinkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alertjLlinkMousePressed
        // TODO add your handling code here:
                try{
            String URL ="http://www.7128.com/alert/alert_where.html";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } catch(Exception e){
            System.out.println("error getting url");
        }
    }//GEN-LAST:event_alertjLlinkMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlertMindTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlertMindTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlertMindTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlertMindTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AlertMindTraining().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alertjBback;
    private javax.swing.JLabel alertjLdescription;
    private javax.swing.JLabel alertjLheading;
    private javax.swing.JLabel alertjLlink;
    private javax.swing.JLabel bg;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
