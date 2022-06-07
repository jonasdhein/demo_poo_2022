package aula1;
/**
 *
 * @author jonasdhein
 */
public class ExerciciosAluno {
    
    //public => É o modificador de acesso
    //permite que o método fique visível para outras classes
    //private => Permite que apenas a própria classe utilize o método
    //protected => ?
    //static => permite que o método seja invocado sem necessidade de criar uma
    //nova instância
    //void => o método em questão não tem retorno
    public static void main(String[] args){
        
        Aluno aluno1 = new Aluno();
        aluno1.idade = 36;
        aluno1.nome = "Bruno";
        
        Aluno aluno2 = new Aluno();
        aluno2.idade = 23;
        aluno2.nome = "Yuri";
        
        //o método imprimir deve mostrar o nome e a idade do aluno juntos
        aluno1.imprimir();
        aluno2.imprimir();
        
        aluno2.fazAniversario();
        aluno2.imprimir();
        
        
    }
    
    
}