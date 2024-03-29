/*
 * questionnaire1.java
 * 
 * Rev 1
 * 
 * 20/04/2013
 * 
 * @Reference Frances Sheridan http://www.youtube.com/channel/UCtUpH8J1hPwknbP55T3Vung?feature=watch
 */
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Joanna Bautista, x12374571
 */
public class questionnaire1 extends javax.swing.JFrame {

    /**
     * @Reference Frances Sheridan http://www.youtube.com/channel/UCtUpH8J1hPwknbP55T3Vung?feature=watch
     */
    private String date;
    private String name;
    private String school;
    private String course;
    private String studentnum;
    private String email;
    
    //declare array
    protected questionnaire1 jArray[];
    
    public questionnaire1() {
        initComponents();
        date = new String();
        name = new String();
        school = new String ();
        course = new String();
        studentnum = new String();
        email = new String();
        
        jArray = new questionnaire1[100];
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        datetF = new javax.swing.JTextField();
        nametF = new javax.swing.JTextField();
        schooltF = new javax.swing.JTextField();
        coursetF = new javax.swing.JTextField();
        studentnumtF = new javax.swing.JTextField();
        emailtF = new javax.swing.JTextField();
        quest1backbutton = new javax.swing.JButton();
        quest1displaybutton = new javax.swing.JButton();
        quest1sendbutton = new javax.swing.JButton();
        quest1nextbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Self Assessment Questionnaire");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 10, 278, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confidential");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 30, 70, 30);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Personal Details:<br/>\n Please complete all of the following before submitting:<br/>\n</html>");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 60, 320, 40);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Today's date:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 129, 80, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 167, 60, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("School:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 205, 70, 14);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Course:\n");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 247, 80, 14);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Student Number:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 294, 100, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email Address:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 332, 100, 14);
        jPanel1.add(datetF);
        datetF.setBounds(138, 129, 222, 20);
        jPanel1.add(nametF);
        nametF.setBounds(138, 167, 222, 20);
        jPanel1.add(schooltF);
        schooltF.setBounds(138, 205, 222, 20);
        jPanel1.add(coursetF);
        coursetF.setBounds(138, 247, 222, 20);
        jPanel1.add(studentnumtF);
        studentnumtF.setBounds(138, 291, 222, 20);
        jPanel1.add(emailtF);
        emailtF.setBounds(138, 329, 222, 20);

        quest1backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back_PNG.png"))); // NOI18N
        quest1backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quest1backbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(quest1backbutton);
        quest1backbutton.setBounds(10, 411, 100, 35);

        quest1displaybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Display_PNG.png"))); // NOI18N
        quest1displaybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quest1displaybuttonActionPerformed(evt);
            }
        });
        jPanel1.add(quest1displaybutton);
        quest1displaybutton.setBounds(10, 375, 70, 25);

        quest1sendbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Send_PNG.png"))); // NOI18N
        quest1sendbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quest1sendbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(quest1sendbutton);
        quest1sendbutton.setBounds(290, 367, 70, 25);

        quest1nextbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Next_PNG.png"))); // NOI18N
        quest1nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quest1nextbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(quest1nextbutton);
        quest1nextbutton.setBounds(260, 411, 100, 35);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Load_TXT_PNG.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(148, 421, 70, 25);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/One.jpg"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(-820, -70, 1370, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quest1sendbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quest1sendbuttonActionPerformed
        // TODO add your handling code here:
        date = datetF.getText();
        name = nametF.getText();
        school = schooltF.getText();
        course = coursetF.getText();
        studentnum = studentnumtF.getText();
        email = emailtF.getText();
        
        //create a new object
        quest1 m = new quest1();
        
        //add contents to textfields to m
        m.setDate(date);
        m.setName(name);
        m.setSchool(school);
        m.setCourses(course);
        m.setStudentnum(studentnum);
        m.setEmail(email);
        
        File outFile;
        FileWriter fw;
        BufferedWriter bw;

        String date = datetF.getText();
        try {
            outFile = new File("Storages.txt");
            fw = new FileWriter(outFile, true);
            bw = new BufferedWriter(fw);

            bw.write(date);
            bw.newLine();
            
            bw.write(name);
            bw.newLine();
            
            bw.write(school);
            bw.newLine();
            
            bw.write(course);
            bw.newLine();
            
            bw.write(studentnum);
            bw.newLine();
            
            bw.write(email);
            bw.newLine();
            bw.close();
            
           
            JOptionPane.showMessageDialog(null, "Thank you for sending us your details.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e);
        }
        
        
        
    }//GEN-LAST:event_quest1sendbuttonActionPerformed

    private void quest1displaybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quest1displaybuttonActionPerformed
        // TODO add your handling code here:
                        JOptionPane.showMessageDialog(null, "Date: "+ date +"\n Name: "+ name +"\n School: "+ school +"\n Course: " +course +"\n Student Number:"+ studentnum + "\n Email:" +email);
    }//GEN-LAST:event_quest1displaybuttonActionPerformed

    private void quest1backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quest1backbuttonActionPerformed
        // TODO add your handling code here:
       DyslexiaScreening p = new DyslexiaScreening();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_quest1backbuttonActionPerformed

    private void quest1nextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quest1nextbuttonActionPerformed
        // TODO add your handling code here:
        questionnaire2 x = new questionnaire2();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_quest1nextbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
    String date;
    String name;
    String school;
    String course;
    String studentnum;
    String email;
    File inFile;
    FileReader fr;
    BufferedReader br;
    
    try{
        inFile = new File("Storages.txt");
        fr = new FileReader(inFile);
        br = new BufferedReader(fr);
        
        date = br.readLine();
        name = br.readLine();
        school = br.readLine();
        course = br.readLine();
        studentnum = br.readLine();
        email = br.readLine();
        
    while ((date !=null) || (name != null) || (school != null) || (course != null) || (studentnum != null) || (email != null)){
        JOptionPane.showMessageDialog(null,"Date:" + date + "\n Name:" + name + "\n School" +school +"\n Course" + course + "\n Student Number" + studentnum + "\n Email" + email);
        date = br.readLine();
        name = br.readLine();
        school = br.readLine();
        course = br.readLine();
        studentnum = br.readLine();
        email = br.readLine();
    
    }
    br.close();
   
    }catch (IOException e){
        System.out.println(e);
    }
   
        
        
    
    
    }//GEN-LAST:event_jButton1ActionPerformed
 
        
               
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
            java.util.logging.Logger.getLogger(questionnaire1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(questionnaire1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(questionnaire1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(questionnaire1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new questionnaire1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JTextField coursetF;
    private javax.swing.JTextField datetF;
    private javax.swing.JTextField emailtF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nametF;
    private javax.swing.JButton quest1backbutton;
    private javax.swing.JButton quest1displaybutton;
    private javax.swing.JButton quest1nextbutton;
    private javax.swing.JButton quest1sendbutton;
    private javax.swing.JTextField schooltF;
    private javax.swing.JTextField studentnumtF;
    // End of variables declaration//GEN-END:variables
}
