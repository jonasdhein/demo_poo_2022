package ferramentas;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jonasdhein
 */
public class Globais {

    public static int gerarNumero(int max) {
        try {

            Random rand = new Random(); //instance of random class
            int upperbound = max;
            //generate random values from 0-max
            int int_random = rand.nextInt(upperbound);
            
            return int_random + 1;

        } catch (Exception ex) {
            return 0;
        }
    }
    
    public static void exibirMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public static String gerarMD5(String texto){
        try {
            String retorno = "";
            if(!texto.equals("")){
                MessageDigest m;

                m = MessageDigest.getInstance("MD5");
                m.update(texto.getBytes(),0, texto.length());
                retorno = new BigInteger(1,m.digest()).toString(16);
            }
            return retorno;
            
         } catch (NoSuchAlgorithmException ex) {
            System.out.println("Erro ao gerar MD5");
            return "";
        }
    }

}
