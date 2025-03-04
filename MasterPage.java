/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MasterPage.java
 *
 * Created on Feb 24, 2016, 1:22:21 PM
 */
package eyetrackingsystem.User;

import eyetrackingsystem.*;
import java.awt.Desktop;
import java.awt.Dimension;
import javax.xml.soap.Detail;
import javax.xml.ws.Response;
import org.opencv.core.Core;

/**
 *
 * @author mannu
 */
public class MasterPage extends javax.swing.JFrame 
{

    /** Creates new form MasterPage */
    public MasterPage() 
    {
        initComponents();
          setExtendedState(getExtendedState() | MAXIMIZED_BOTH);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        btnImageEnhan = new javax.swing.JButton();
        btnImageEnhancement = new javax.swing.JButton();
        btnIriseDetection = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnClose1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eye Tracking System");
        setBackground(new java.awt.Color(240, 27, 91));
        setType(java.awt.Window.Type.POPUP);

        jLabel1.setBackground(new java.awt.Color(255, 102, 51));
        jLabel1.setFont(new java.awt.Font("Lucida Bright", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("a Human Eye Computer Interaction System");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(360, 80, 1230, 50);

        btnImageEnhan.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnImageEnhan.setText("Camera Detection");
        btnImageEnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageEnhanActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnImageEnhan);
        btnImageEnhan.setBounds(70, 290, 220, 80);

        btnImageEnhancement.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnImageEnhancement.setText("Face Detection");
        btnImageEnhancement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageEnhancementActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnImageEnhancement);
        btnImageEnhancement.setBounds(350, 290, 220, 80);

        btnIriseDetection.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnIriseDetection.setText("Eye  Detection");
        btnIriseDetection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIriseDetectionActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnIriseDetection);
        btnIriseDetection.setBounds(70, 410, 220, 80);

        jLabel2.setBackground(new java.awt.Color(255, 204, 0));
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(620, 80, 680, 490);

        btnClose.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnClose.setText("LogOut");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnClose);
        btnClose.setBounds(210, 520, 220, 80);

        jLabel3.setBackground(new java.awt.Color(255, 102, 51));
        jLabel3.setFont(new java.awt.Font("Lucida Bright", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setText("Imlementation Of Real Time Image Processing For ");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(250, 20, 1230, 50);

        btnClose1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnClose1.setText("Mouse Activity");
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnClose1);
        btnClose1.setBounds(350, 410, 220, 80);

        jMenu1.setText("Home");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1412, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
// TODO add your handling code here:
      
      
}//GEN-LAST:event_jMenu1ActionPerformed



private void btnImageEnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageEnhanActionPerformed
// TODO add your handling code here:
   Detection r=new Detection();
   jDesktopPane1.add(r);
   
   
   
   r.setLocation((jDesktopPane1.getWidth()-r.getWidth())/2, (jDesktopPane1.getHeight()-r.getHeight())/2);
   
   
   r.setVisible(true);
}//GEN-LAST:event_btnImageEnhanActionPerformed

private void btnImageEnhancementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageEnhancementActionPerformed
// TODO add your handling code here:
FaceDetection r=new FaceDetection();
   jDesktopPane1.add(r);
    r.setLocation((jDesktopPane1.getWidth()-r.getWidth())/2, (jDesktopPane1.getHeight()-r.getHeight())/2);
   r.setVisible(true);
   
}//GEN-LAST:event_btnImageEnhancementActionPerformed

private void btnIriseDetectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIriseDetectionActionPerformed
 EyeDetection r=new EyeDetection();
   jDesktopPane1.add(r);
    r.setLocation((jDesktopPane1.getWidth()-r.getWidth())/2, (jDesktopPane1.getHeight()-r.getHeight())/2);
   r.setVisible(true);
    
}//GEN-LAST:event_btnIriseDetectionActionPerformed

private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
// TODO add your handling code here:
    setVisible(false);
}//GEN-LAST:event_btnCloseActionPerformed

private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
// TODO add your handling code here:
   MouseHandle r=new MouseHandle();
   jDesktopPane1.add(r);
   r.setVisible(true);
}//GEN-LAST:event_btnClose1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
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
            java.util.logging.Logger.getLogger(MasterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       //    MasterPage().setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        /* Create and display the form */
        MasterPage p=new MasterPage();
        p.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MasterPage().setVisible(true);
               
               
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnClose1;
    private javax.swing.JButton btnImageEnhan;
    private javax.swing.JButton btnImageEnhancement;
    private javax.swing.JButton btnIriseDetection;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
