package ferramentas;

import java.util.Random;
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

}
