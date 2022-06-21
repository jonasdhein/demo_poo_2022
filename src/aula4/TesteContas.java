package aula4;

import ferramentas.Entrada;
import modelos.ContaBanco;

/**
 *
 * @author jonasdhein
 */
public class TesteContas {
    
    public static void main(String[] args) {
        
        ContaBanco objConta1 = new ContaBanco("111", "123", "Pedro", 1000, 300, "33333333");
        ContaBanco objConta2 = new ContaBanco("222", "444", "Jorge", 400, 5000, "jdhein@univates");
        ContaBanco objConta3 = new ContaBanco("333", "555", "João", 5000, 3000, "017");
        
        System.out.println(objConta1);
        System.out.println(objConta2);
        System.out.println(objConta3);
        
        objConta1.saque(100, true);
        System.out.println(objConta1);

        objConta1.saque(1000, true);
        System.out.println(objConta1);
        
        System.out.println(objConta1);        
        System.out.println(objConta2);        
        System.out.println(objConta3);

        
    }
    
}
