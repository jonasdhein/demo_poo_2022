package aula1;

/**
 *
 * @author jonasdhein
 */
public class Aluno {
    
    public String nome;
    public int idade;
    //criar mais 2 atributos
    
    public void fazAniversario(){
        idade = idade + 1;
    }
    
    public void imprimir(){
        System.out.println("O aluno " + nome + " tem " + idade + " anos");
    }
    
    
}
