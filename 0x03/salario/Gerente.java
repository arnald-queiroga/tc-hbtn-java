public class Gerente extends Empregado{
    public Departamento departamento;
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }
    @Override
    public double calcularBonus(Departamento departamento){
        double salarioFixo = getSalarioFixo();
        if (departamento.alcancouMeta()){
            return salarioFixo * 0.2 + (0.01 * (departamento.valorAtingidoMeta - departamento.valorMeta));
        } else {
            return 0;
        }
    }

} 
