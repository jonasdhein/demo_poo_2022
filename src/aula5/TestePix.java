package aula5;

import ferramentas.Entrada;
import modelos.ContaBanco;

/**
 *
 * @author jonasdhein
 */
public class TestePix {
    
    static ContaBanco[] contas = new ContaBanco[3];
    
    public static void main(String[] args) {
        
        ContaBanco objConta1 = new ContaBanco("111", "123", "Pedro", 1000, 300, "000");
        ContaBanco objConta2 = new ContaBanco("222", "444", "Jorge", 400, 5000, "jdhein@univates.br");
        ContaBanco objConta3 = new ContaBanco("333", "555", "João", 5000, 3000, "017");
        
        contas[0] = objConta1;
        contas[1] = objConta2;
        contas[2] = objConta3;
        
        String contaOrigem = Entrada.leiaString("Informe a conta de origem");
        ContaBanco objContaOrigem = localizaContaOrigem(contaOrigem);
        if(objContaOrigem != null){
            double valorPix = Entrada.leiaDouble("Informe o valor do PIX");
        
            String chavePixDestino = Entrada.leiaString("Informe a chave PIX de destino");
            ContaBanco objContaDestino = localizaContaDestino(chavePixDestino);
            if(objContaDestino != null){
                System.out.println(objContaOrigem.toString());
                System.out.println(objContaDestino.toString());

                objContaOrigem.transferirPix(objContaDestino, valorPix);


                System.out.println(objContaOrigem.toString());
                System.out.println(objContaDestino.toString());
                
            }else{
                System.out.println("Conta de destino não localizada");
            }
        }else{
            System.out.println("Conta origem não localizada");
        }

    }
    
    private static ContaBanco localizaContaDestino(String chavePix){
        
        for (int i = 0; i < contas.length; i++) {
            if(contas[i].getChavePix().equals(chavePix)){
                return contas[i];
            }
        }
        
        return null;
        
    }
    
    private static ContaBanco localizaContaOrigem(String conta){
        
        ContaBanco contaRetorno = null;
        
        for (int i = 0; i < contas.length; i++) {
            if(contas[i].getConta().equals(conta)){
                contaRetorno = contas[i];
            }
        }
        
        return contaRetorno;
    }
}
