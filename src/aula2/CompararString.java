package aula2;

/**
 *
 * @author jonasdhein
 */
public class CompararString {
    
    public static void main(String[] args) {
        
        String nome1 = "Pedro";
        String nome2 = "Jonas";
        /*
        - testar se os nomes sao iguais mas podem possuir
        capitalizações diferentes
        - testar se o texto é exatamente igual
        - testar se as letras são diferentes
        */
        if(nome1.equals(nome2)){
            System.out.println("Os nomes são exatamente iguais");
        }else if(nome1.equalsIgnoreCase(nome2)){
            System.out.println("Os nomes são iguais mas com capitalização diferente");
        }else{
            System.out.println("Os nomes são diferentes");
        }
    }
    
    
}
