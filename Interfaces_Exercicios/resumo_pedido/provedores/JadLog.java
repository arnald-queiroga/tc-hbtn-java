package provedores;

public class JadLog implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double totalFrete = 0.0;
        if (peso > 2000){
            totalFrete = valor * 0.07;
        } else {
            totalFrete = valor * 0.045;
        }

        return new Frete(totalFrete, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
} 

