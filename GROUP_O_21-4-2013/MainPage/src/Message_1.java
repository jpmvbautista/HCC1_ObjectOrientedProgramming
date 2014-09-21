
import java.io.*;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x11380471
 */
public class Message_1 extends javax.swing.JFrame {
    private String name;
    private String course;
    private String msg;
    
    //declare array
    protected Message mArray[];
    /**
     * Creates new form Message
     */
    public Message_1() {
        initComponents();
         name = new String();
       course = new String();
          msg = new String();
        
        //array of messages maxmimum: 1!
        mArray = new Message[100];
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
        jPanel3 = new javax.swing.JPanel();
        Display = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Send = new javax.swing.JButton();
        msg_course = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        msg_msg = new javax.swing.JLabel();
        msg_name = new javax.swing.JLabel();
        Message = new javax.swing.JTextField();
        msg_title = new javax.swing.JLabel();
        Course = new javax.swing.JTextField();
        file = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(null);

        Display.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Display_PNG.png"))); // NOI18N
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });
        jPanel3.add(Display);
        Display.setBounds(300, 330, 70, 25);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back_PNG.png"))); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel3.add(Back);
        Back.setBounds(170, 370, 100, 35);

        Send.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Send_PNG.png"))); // NOI18N
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });
        jPanel3.add(Send);
        Send.setBounds(190, 330, 70, 25);

        msg_course.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        msg_course.setForeground(new java.awt.Color(255, 255, 255));
        msg_course.setText("Course:");
        jPanel3.add(msg_course);
        msg_course.setBounds(80, 110, 50, 20);
        jPanel3.add(Name);
        Name.setBounds(140, 70, 190, 20);

        msg_msg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        msg_msg.setForeground(new java.awt.Color(255, 255, 255));
        msg_msg.setText("Message:");
        jPanel3.add(msg_msg);
        msg_msg.setBounds(70, 150, 60, 20);

        msg_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        msg_name.setForeground(new java.awt.Color(255, 255, 255));
        msg_name.setText("Name:");
        jPanel3.add(msg_name);
        msg_name.setBounds(90, 70, 40, 20);

        Message.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel3.add(Message);
        Message.setBounds(140, 150, 190, 170);

        msg_title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        msg_title.setForeground(new java.awt.Color(255, 255, 255));
        msg_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msg_title.setText("Message");
        jPanel3.add(msg_title);
        msg_title.setBounds(170, 20, 67, 22);
        jPanel3.add(Course);
        Course.setBounds(140, 110, 190, 20);

        file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Load_TXT_PNG.png"))); // NOI18N
        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });
        jPanel3.add(file);
        file.setBounds(80, 330, 70, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/two.jpg"))); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(-10, -10, 430, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        // TODO add your handling code here:
        name = Name.getText();
        course = Course.getText();
        msg = Message.getText();
        
        Int_class i = new Int_class();
        
        i.setName(name);
        i.setCourse(course);
        i.setMsg(msg);
        
         File outFile;
        FileWriter fw;
        BufferedWriter bw;
        
        String name = Name.getText();
        String course = Course.getText();
        String msg = Message.getText();
                
        try{
            outFile = new File("Message.txt");
            fw = new FileWriter(outFile, true);
            bw = new BufferedWriter(fw);
            
            bw.write(name);
            bw.newLine();
            
            bw.write(course);
            bw.newLine();
              
            bw.write(msg);
            bw.newLine();
            bw.close();
        
        } catch(IOException e){
            System.out.println("Error writing to file: " + e);
        }
        
    }//GEN-LAST:event_SendActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        DisabilitySupportGUI a = new DisabilitySupportGUI();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null, "Name: "+ name +"\nCourse: "+ course +"\nMessage: "+ msg);
        
    }//GEN-LAST:event_DisplayActionPerformed

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        // TODO add your handling code here:
         String name;
        String course;
        String msg;
        File inFile;
        FileReader fr;
        BufferedReader br;
        
        try{ 
            inFile = new File("Message.txt");
            fr = new FileReader(inFile);
            br = new BufferedReader(fr);
            
            name = br.readLine();
            course = br.readLine();
            msg = br.readLine();
            
            while((name != null) || (course != null) || (msg != null)){
                JOptionPane.showMessageDialog(null, "Name: "+ name +"\n Course: "+ course +"\n Message: "+ msg);
                name = br.readLine();               
                course = br.readLine();
                msg = br.readLine();
            }
            br.close();
            
        }catch (IOException e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_fileActionPerformed

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
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Message().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField Course;
    private javax.swing.JButton Display;
    private javax.swing.JTextField Message;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Send;
    private javax.swing.JButton file;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel msg_course;
    private javax.swing.JLabel msg_msg;
    private javax.swing.JLabel msg_name;
    private javax.swing.JLabel msg_title;
    // End of variables declaration//GEN-END:variables
}