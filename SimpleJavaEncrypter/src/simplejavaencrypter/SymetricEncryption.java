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
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
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
public class SymetricEncryption extends javax.swing.JFrame {
private Cipher masterChiper;
private SecretKey masterKey;
    /** Creates new form AssymetricEncryption */
    public SymetricEncryption() {
        initComponents();
    }
    
    public SymetricEncryption(SecretKey Key) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException {
        this.masterChiper = Cipher.getInstance("DES");
        this.masterKey = Key;       
        this.masterChiper.init(Cipher.ENCRYPT_MODE, masterKey);
        initComponents();
    }   
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        GenKeyBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        chKeyBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        chFileBTN = new javax.swing.JButton();
        keyPathField = new javax.swing.JTextField();
        filePathField = new javax.swing.JTextField();
        ecnFileBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        chDesFileBTN = new javax.swing.JButton();
        dFilePathField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Gen Key & Store In File");

        GenKeyBTN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        GenKeyBTN.setText("Gen Encryption Key");
        GenKeyBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenKeyBTNActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Use Key From File");

        chKeyBTN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        chKeyBTN.setText("Choose Key");
        chKeyBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chKeyBTNActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Choose File to Encrypt");

        chFileBTN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        chFileBTN.setText("Choose File");
        chFileBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chFileBTNActionPerformed(evt);
            }
        });

        keyPathField.setEditable(false);
        keyPathField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        keyPathField.setText("No Key Selected");

        filePathField.setEditable(false);
        filePathField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        filePathField.setText("No File Selected");

        ecnFileBTN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ecnFileBTN.setText("Encrypt Selected File");
        ecnFileBTN.setToolTipText("Make Sure Both an Encryption Key and a File are Selected");
        ecnFileBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecnFileBTNActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Choose Destination File");

        chDesFileBTN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        chDesFileBTN.setText("Choose Destination file");
        chDesFileBTN.setActionCommand("Choose Destination File");
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
                        .addGap(107, 107, 107)
                        .addComponent(ecnFileBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(61, 61, 61))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(GenKeyBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chKeyBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chFileBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(31, 31, 31)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chDesFileBTN)
                                .addGap(31, 31, 31)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dFilePathField)
                            .addComponent(filePathField)
                            .addComponent(keyPathField, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GenKeyBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(keyPathField)
                    .addComponent(chKeyBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filePathField)
                    .addComponent(chFileBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chDesFileBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(ecnFileBTN)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dFilePathField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chKeyBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chKeyBTNActionPerformed
        JFileChooser chooseKey = new JFileChooser();
        chooseKey.showOpenDialog(null);
        File f = chooseKey.getSelectedFile();
        String keyPath = f.getAbsolutePath();
        keyPathField.setText(keyPath);
    }//GEN-LAST:event_chKeyBTNActionPerformed

    private void chFileBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chFileBTNActionPerformed
        JFileChooser chooseFile = new JFileChooser();
        chooseFile.showOpenDialog(null);
        File f = chooseFile.getSelectedFile();
        String keyPath = f.getAbsolutePath();
        filePathField.setText(keyPath);
    }//GEN-LAST:event_chFileBTNActionPerformed

    private void GenKeyBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenKeyBTNActionPerformed
    try {
        JFileChooser chooseFile = new JFileChooser();
        chooseFile.showOpenDialog(null);
        File f = chooseFile.getSelectedFile();
        String keyPath = f.getAbsolutePath();
        KeyGenerator kg = KeyGenerator.getInstance("DES");
        kg.init(new SecureRandom());
        SecretKey Key = kg.generateKey();        
        byte[] key = Key.getEncoded();
        byte[] encKey = masterChiper.doFinal(key);
        FileOutputStream keyfos = new FileOutputStream(keyPath);
        keyfos.write(encKey);
        keyfos.close();

        JOptionPane.showMessageDialog(this, "Key was Generated, Stored and Encrypted Successfully!");
        
    } catch (NoSuchAlgorithmException ex) {
        Logger.getLogger(SymetricEncryption.class.getName()).log(Level.SEVERE, null, ex);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(SymetricEncryption.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(SymetricEncryption.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalBlockSizeException ex) {
        Logger.getLogger(SymetricEncryption.class.getName()).log(Level.SEVERE, null, ex);
    } catch (BadPaddingException ex) {
        Logger.getLogger(SymetricEncryption.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_GenKeyBTNActionPerformed

    private void ecnFileBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecnFileBTNActionPerformed
        if(keyPathField.getText()!="No Key Selected"&&filePathField.getText()!="No File Selected"&&dFilePathField.getText()!="No File Selected")
        {
            FileInputStream keyfis = null;
            try {                
                keyfis = new FileInputStream(keyPathField.getText());//get the key
                byte[] encKey = new byte[keyfis.available()];
                keyfis.read(encKey);//get the necrypted key bytes
                keyfis.close();
                Cipher deChipher =Cipher.getInstance("DES");
                deChipher.init(Cipher.DECRYPT_MODE, masterKey);//init a decipher so we can decrypt the key with the master key
                byte[] key = new byte[8];
                key =  deChipher.doFinal(encKey);//get actual keybytes
                DESKeySpec desKeySpec = new DESKeySpec(key);//use bytes to make keySpec
                SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
                SecretKey secretKey = keyFactory.generateSecret(desKeySpec);//gen the key from keyspec
                Cipher cipher1 = Cipher.getInstance("DES");
                cipher1.init(Cipher.ENCRYPT_MODE, secretKey);//use key to init a cipher
                FileInputStream fis = new FileInputStream(filePathField.getText());
                CipherInputStream cis = new CipherInputStream(fis, cipher1);
                FileOutputStream fos = new FileOutputStream(dFilePathField.getText());
                byte[] buffer = new byte[8];
                int i = cis.read(buffer);
                while ( i != -1)//encrypt the data
                {
                    fos.write(buffer);
                    i = cis.read(buffer);
                }                   
                fis.close();
                cis.close();
                fos.close();
                
                JOptionPane.showMessageDialog(this, "File was Encrypted Successfully!");
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SymetricEncryption.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SymetricEncryption.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeyException ex) {
                Logger.getLogger(SymetricEncryption.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(SymetricEncryption.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeySpecException ex) {
                Logger.getLogger(SymetricEncryption.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
                Logger.getLogger(SymetricEncryption.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalBlockSizeException ex) {
                Logger.getLogger(SymetricEncryption.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadPaddingException ex) {
                Logger.getLogger(SymetricEncryption.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    keyfis.close();
                } catch (IOException ex) {
                    Logger.getLogger(SymetricEncryption.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You MUST choose and ECRYPTION KEY, a FILE and a DESTINATION FILE!");
        }
    }//GEN-LAST:event_ecnFileBTNActionPerformed

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
            java.util.logging.Logger.getLogger(SymetricEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SymetricEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SymetricEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SymetricEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SymetricEncryption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenKeyBTN;
    private javax.swing.JButton chDesFileBTN;
    private javax.swing.JButton chFileBTN;
    private javax.swing.JButton chKeyBTN;
    private javax.swing.JTextField dFilePathField;
    private javax.swing.JButton ecnFileBTN;
    private javax.swing.JTextField filePathField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField keyPathField;
    // End of variables declaration//GEN-END:variables

}
