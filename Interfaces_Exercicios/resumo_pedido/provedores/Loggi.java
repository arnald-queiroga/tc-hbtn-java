package provedores;

public class Loggi implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double totalFrete;
        if (peso > 5000){
            totalFrete = valor * 0.12;
        } else {
            totalFrete = valor * 0.04;
        }

        return new Frete(totalFrete, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
} 

