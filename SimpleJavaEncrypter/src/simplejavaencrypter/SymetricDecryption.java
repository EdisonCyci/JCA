/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejavaencrypter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import static javax.crypto.Cipher.ENCRYPT_MODE;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ECyci
 */
public class SymetricDecryption extends javax.swing.JFrame {
    private Cipher masterChiper;
    private SecretKey masterKey;
    /**
     * Creates new form AssymetricDecryption
     */
    public SymetricDecryption() {
        initComponents();
    }

    public SymetricDecryption(SecretKey Key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException{
        this.masterChiper = Cipher.getInstance("DES");
        this.masterKey = Key;
        this.masterChiper.init(Cipher.DECRYPT_MODE, masterKey);
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

        filePathField = new javax.swing.JTextField();
        decFileBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        chkeyBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        chFileBTN = new javax.swing.JButton();
        keyPathField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        chDesFileBTN = new javax.swing.JButton();
        dFilePathField = new javax.swing.JTextField();

        filePathField.setEditable(false);
        filePathField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        filePathField.setText("No File Selected");

        decFileBTN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        decFileBTN.setText("Decrypt Selected File");
        decFileBTN.setToolTipText("Make Sure Both an Encryption Key and a File are Selected");
        decFileBTN.setName("DecryptFileBTN"); // NOI18N
        decFileBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decFileBTNActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Use Key From File");
        jLabel2.setToolTipText("");
        jLabel2.setName(""); // NOI18N

        chkeyBTN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        chkeyBTN.setText("Choose Key");
        chkeyBTN.setName("ChooseKeyBTN"); // NOI18N
        chkeyBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkeyBTNActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Choose File to Decrypt");

        chFileBTN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        chFileBTN.setText("Choose File");
        chFileBTN.setName("ChooseFileBTN"); // NOI18N
        chFileBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chFileBTNActionPerformed(evt);
            }
        });

        keyPathField.setEditable(false);
        keyPathField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        keyPathField.setText("No Key Selected");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Choose Destination File");

        chDesFileBTN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        chDesFileBTN.setText("Choose Destination File");
        chDesFileBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chDesFileBTNActionPerformed(evt);
            }
        });

        dFilePathField.setEditable(false);
        dFilePathField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dFilePathField.setText("No File Selected");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(decFileBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(chFileBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkeyBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                            .addComponent(chDesFileBTN))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(filePathField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(keyPathField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dFilePathField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkeyBTN)
                    .addComponent(keyPathField))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filePathField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chFileBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chDesFileBTN)
                    .addComponent(dFilePathField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(decFileBTN)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkeyBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkeyBTNActionPerformed
        JFileChooser chooseKey = new JFileChooser();
        chooseKey.showOpenDialog(null);
        File f = chooseKey.getSelectedFile();
        String keyPath = f.getAbsolutePath();
        keyPathField.setText(keyPath);
    }//GEN-LAST:event_chkeyBTNActionPerformed

    private void chFileBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chFileBTNActionPerformed
        JFileChooser chooseFile = new JFileChooser();
        chooseFile.showOpenDialog(null);
        File f = chooseFile.getSelectedFile();
        String keyPath = f.getAbsolutePath();
        filePathField.setText(keyPath);
    }//GEN-LAST:event_chFileBTNActionPerformed

    private void decFileBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decFileBTNActionPerformed
        if(keyPathField.getText()!="No Key Selected"&&filePathField.getText()!="No File Selected"&&dFilePathField.getText()!="No File Selected")
        {
            try {
                byte[] buffer = new byte[8];             
                FileInputStream keyfis = null;
                keyfis = new FileInputStream(keyPathField.getText());
                byte[] encKey = new byte[keyfis.available()];
                keyfis.read(encKey);
                keyfis.close();
                byte[] key = new byte[8]; 
                key =  masterChiper.doFinal(encKey);//get actual keybytes
                DESKeySpec desKeySpec = new DESKeySpec(key);//use bytes to make keySpec
                SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
                SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
                Cipher cipher2 = Cipher.getInstance("DES");
                cipher2.init(Cipher.DECRYPT_MODE, secretKey);
                
                FileInputStream fis2 = new FileInputStream(filePathField.getText());
                FileOutputStream fos2 = new FileOutputStream(dFilePathField.getText());
                CipherOutputStream cos = new CipherOutputStream(fos2, cipher2);
                
                int i = fis2.read(buffer);
                
                while ( i != -1)
                {
                    cos.write(buffer);
                    i = fis2.read(buffer);
                }
                
                fis2.close();
                fos2.close();
                cos.close();
                
                JOptionPane.showMessageDialog(this, "File was Decrypted Successfully!");
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SymetricDecryption.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SymetricDecryption.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeyException ex) {
                Logger.getLogger(SymetricDecryption.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(SymetricDecryption.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeySpecException ex) {
                Logger.getLogger(SymetricDecryption.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
                Logger.getLogger(SymetricDecryption.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalBlockSizeException ex) {
                Logger.getLogger(SymetricDecryption.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadPaddingException ex) {
                Logger.getLogger(SymetricDecryption.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You MUST choose and ECRYPTION KEY, a FILE and a DESTINATION FILE!");
        }
    }//GEN-LAST:event_decFileBTNActionPerformed

    private void chDesFileBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chDesFileBTNActionPerformed
        JFileChooser chooseFile = new JFileChooser();
        chooseFile.showOpenDialog(null);
        File f = chooseFile.getSelectedFile();
        String keyPath = f.getAbsolutePath();
        dFilePathField.setText(keyPath);
    }//GEN-LAST:event_chDesFileBTNActionPerformed

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
            java.util.logging.Logger.getLogger(SymetricDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SymetricDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SymetricDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SymetricDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SymetricDecryption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chDesFileBTN;
    private javax.swing.JButton chFileBTN;
    private javax.swing.JButton chkeyBTN;
    private javax.swing.JTextField dFilePathField;
    private javax.swing.JButton decFileBTN;
    private javax.swing.JTextField filePathField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField keyPathField;
    // End of variables declaration//GEN-END:variables
}