package modelos;

/**
 *
 * @author jonasdhein
 */
public class Aluno {
    
    private String nome;
    private int idade;
    private double altura; //medida em metros
    private char sexo;
    
    public int variavel_publica;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    protected void fazAniversario(){
        idade++;
    }
    
    public void imprimir(){
        System.out.println("O aluno " + nome + " tem " + idade + " anos");
    }
    
}
