package aula5;

/**
 *
 * @author jonasdhein
 */
public class TesteDebug {
    
    public static void main(String[] args) {
            
        int valor1;
        try{

            valor1 = 123;

            if(Integer.parseInt("JONAS") == valor1){
                System.out.println("IGUAIS");
            }else{
                System.out.println("NOPS");
            }

            String nome = "Jonas";

        }catch(Exception ex){
            System.out.println("Erro:" + ex.getMessage());
        }
    }
    
}
