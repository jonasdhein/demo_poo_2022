package modelos;

/**
 *
 * @author jonasdhein
 */
public class ContaBanco{
    
    private String agencia;
    private String conta;
    private String titular;
    private double saldo;
    private double chequeEspecial;
    private String chavePix;

    public ContaBanco(){
        
    }
    
    public ContaBanco(String agencia, String conta, String titular, double saldo, 
            double chequeEspecial, String chavePix) {
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
        this.chavePix = chavePix;
    }
    
    public boolean saque(double valorSaque, boolean imprime){
        if(this.saldo >= valorSaque){
            this.saldo -= valorSaque;
            if(imprime){
                System.out.println("Saque efetuado no valor de R$ " + valorSaque);
            }
            return true;
        }else{
            System.out.println("Saldo insuficiente, saque não autorizado");
            return false;
        }
    }
    
    public void deposito(double valorDeposito, boolean imprime){
        this.saldo += valorDeposito;
        if(imprime){
            System.out.println("Depósito efetuado no valor de R$ " + valorDeposito);
        }
    }
    
    public void transferir(ContaBanco contaRecebimento, double valorTransferencia){
        boolean realizado = saque(valorTransferencia, false);
        if(realizado){
            contaRecebimento.deposito(valorTransferencia, false);
            System.out.println("Transferência para conta " + contaRecebimento.titular + " realizada!");
        }
    }
    
    public void transferirPix(ContaBanco contaRecebimento, double valorTransferencia){
        transferir(contaRecebimento, valorTransferencia);
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
    
    

    @Override
    public String toString() {
        return "----------\nConta: " + conta + "\n" + "Saldo: " + saldo + "\n----------";
    }
    
}
