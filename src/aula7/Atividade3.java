package aula7;

import ferramentas.Entrada;
import modelos.Cidade;

/**
 *
 * @author jonasdhein
 */
public class Atividade3 {
    
    static Cidade[] vetCidades = new Cidade[5];
        
    public static void main(String[] args) {
        
        Cidade objCidade;
        
        for (int i = 0; i < vetCidades.length; i++) {
            
            String nomeCidade;
            do {
                nomeCidade = Entrada.leiaString("Informe o nome de uma cidade");
            } while (cidadeExiste(nomeCidade));
            
            objCidade = new Cidade(i+1, nomeCidade);
            vetCidades[i] = objCidade;
            
            System.out.println("ID: " + objCidade.getId());
        }
        
    }
    
    private static boolean cidadeExiste(String cidade){
        boolean retorno = false;
        Cidade cidadeVetor;
        
        for (int i = 0; i < vetCidades.length; i++) {
            cidadeVetor = vetCidades[i];
            if(cidadeVetor != null){
                if(cidadeVetor.getNome().equalsIgnoreCase(cidade)){
                    retorno = true;
                    break;
                }
            }
        }
        
        return retorno;
        
    }
    
}
