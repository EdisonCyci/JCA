/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejavaencrypter;

import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.swing.JFrame;

/**
 *
 * @author ECyci
 */
public class SimpleJavaEncrypter {

    private KeySpec mySpec;
    private SecretKeyFactory skf;
    private Cipher masterChiper;
    byte[] passAsBytes;
    private String masterPass;
    SecretKey masterKey;
    

    
    public static void main(String[] args) {
        
        Login Log = new Login();
        Log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Log.setVisible(true);
        
    }
    
}
