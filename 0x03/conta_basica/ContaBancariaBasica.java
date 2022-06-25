import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo = 0;
    private double taxaJurosAnual = 0;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0.0;
    }
    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0){
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        } this.saldo += this.saldo + valor;

    }
    public void sacar(double valor) throws OperacaoInvalidaException{
        if (valor < 0){
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        } else if (valor > this.saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        } this.saldo -= valor;
    }
    public double calcularTarifaMensal(){
        return Math.min(10.0, 0.1*saldo);
    }
    public double calcularJurosMensal(){
        if (saldo < 0){
            return 0.0;
        } return (taxaJurosAnual / 100 / 12) * saldo;
    }
    public void aplicarAtualizacaoMensal(){
        this.saldo = (saldo - calcularTarifaMensal()) + calcularJurosMensal();
    }
    public String getNumeracao() {
        return numeracao;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
} 
