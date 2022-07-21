package aula15;

/**
 *
 * @author jonasdhein
 */

//classes abstratas não podem ser instanciadas
public class Pessoa {

    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public double tirarCopias(int numero){
        return 0.10 * (double) numero;
    }
    
    /*public final double tirarCopias(int numero){
        return 0.10 * (double) numero;
    }*/
    
}
