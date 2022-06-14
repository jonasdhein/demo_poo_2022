package aula3;

import ferramentas.Entrada;

/**
 *
 * @author jonasdhein
 */
public class TestePessoa {
    
    public static void main(String[] args) {
        
        Pessoa objPessoa = new Pessoa();
        objPessoa.setNome(Entrada.leiaString("Informe um nome"));       
        
        Pessoa objPessoa2 = new Pessoa();
        objPessoa2.setNome(Entrada.leiaString("Informe um nome"));       
        
        /*6)*/ System.out.println("Pessoa 1:" + objPessoa); //imprimindo o objeto
                
        /*6)*/ System.out.println("Pessoa 2:" + objPessoa2); //imprimindo o objeto
        
        //7 - testar se o nome dos dois objetos é igual
        if(objPessoa.getNome().equals(objPessoa2.getNome())){
            System.out.println("Os nomes são iguais");
        }
        
        //8 - testar qual nome possui mais caracteres
        int tamNome1 = objPessoa.getNome().length();
        int tamNome2 = objPessoa2.getNome().length();

        if(tamNome1 > tamNome2){
            System.out.println(objPessoa.getNome() + " > " + objPessoa2.getNome());
        }else if(tamNome1 == tamNome2){
            System.out.println("Os tamanhos são iguais");
        }else{
            System.out.println(objPessoa2.getNome() + " > " + objPessoa.getNome());
        }

        
    }
    
}
