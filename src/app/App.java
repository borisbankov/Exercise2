package app;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class App extends javax.swing.JFrame {
    
    public boolean moved = false;
    public int counter = 0;
    public JButton btn = new JButton();
    public ArrayList<JLabel> arrL = new ArrayList<JLabel>();
    public App() {
        
        initComponents();
        jTextField1.setText("Boris");        
        jTextField2.setText("Bankov");
        
        btn.setSize(200, 20);
        btn.setText("New Button");
        jPanel1.add(btn);
        btn.setLocation(jPanel1.getWidth()/2 - btn.getWidth()/2, 
                        jPanel1.getHeight()/2 - btn.getHeight()/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel1.setLayout(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(27, 27, 149, 28);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(30, 70, 149, 31);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Swap");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(27, 116, 149, 32);

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(27, 166, 149, 32);

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(214, 33, 141, 16);

        jButton3.setBackground(new java.awt.Color(153, 102, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("Create Label");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 320, 149, 32);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(30, 270, 149, 31);

        jButton4.setBackground(new java.awt.Color(255, 255, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("Move Label");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(27, 216, 149, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String temp;
        temp = jTextField1.getText();
        jTextField1.setText(jTextField2.getText());
        jTextField2.setText(temp);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int number = Integer.parseInt(jTextField3.getText());
        for(int j = 0; j < arrL.size(); j++) {
            jPanel1.remove(arrL.get(j));         
        }
        arrL.clear();
        for (int i = 0; i < number; i++) {
            JLabel label = new JLabel();
            label.setText("Label " + (i + 1));
            label.setSize(jPanel1.getWidth()/number - 10, 20);
            jPanel1.add(label);
            label.setLocation(0 + i*(label.getWidth() + 10), 
                    jPanel1.getHeight() - label.getHeight());
            label.setOpaque(true);
            label.setBackground(Color.red);
            arrL.add(label);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        btn.setLocation(jPanel1.getWidth()/2 - btn.getWidth()/2, 
                        jPanel1.getHeight()/2 - btn.getHeight()/2);
        for(int i = 0; i < arrL.size(); i++) {
            arrL.get(i).setSize(jPanel1.getWidth()/arrL.size() - 10, 20);
            arrL.get(i).setLocation(0 + i*(arrL.get(i).getWidth() + 10), 
                    jPanel1.getHeight() - arrL.get(i).getHeight());
        }
    }//GEN-LAST:event_formComponentResized

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{ 
            int x = Integer.parseInt(jTextField1.getText());
            int y = Integer.parseInt(jTextField2.getText());
            } catch (NumberFormatException e ){
                System.out.println(e);
                if(!moved){
        //            jLabel1.setLocation(x, y);
                    jLabel1.setSize(200, 25);
                    jLabel1.setText("Label Moved!");
                    moved = !moved;
                } else { 
                    jLabel1.setLocation(
                                        jLabel1.getX() + 10,
                                        jLabel1.getY() + 15);
                    counter++;
                    jLabel1.setText("Label Moved " + counter +  " Times Again!");
                    
                    
                }
            }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
