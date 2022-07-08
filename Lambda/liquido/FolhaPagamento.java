public class FolhaPagamento {

    public static double calcularLiquido(Funcionario funcionario, CalculadorDeSalario calcSalario) {
        return calcSalario.calcular(funcionario.getSalario());
    }
} 

