package aula15;

/**
 *
 * @author jonasdhein
 */
public class Aluno extends Pessoa {

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public double tirarCopias(int numero){
        return 0.07 * (double) numero;
    }
    
}
