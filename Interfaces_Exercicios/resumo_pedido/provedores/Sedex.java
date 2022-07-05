package provedores;

public class Sedex implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double totalFrete;
        if (peso > 1000){
            totalFrete = valor * 0.10;
        } else {
            totalFrete = valor * 0.05;
        }

        return new Frete(totalFrete, obterTipoProvedorFrete());

    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
} 

