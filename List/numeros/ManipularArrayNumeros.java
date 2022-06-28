import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> numeros, Integer i){
        if (!numeros.contains(i)){
            return -1;
        }
        return numeros.indexOf(i);
    }
    public static void adicionarNumero(List<Integer> numeros, Integer i) throws Exception {
        if(buscarPosicaoNumero(numeros, i) != -1){
            throw new Exception("Numero jah contido na lista");
        }
        numeros.add(i);
    }
    public static void removerNumero(List<Integer> numeros, Integer i) throws Exception {
        if (buscarPosicaoNumero(numeros, i) == -1){
            throw new Exception("Numero nao encontrado na lista");
        }
        numeros.remove(i);
    }
    public static void substituirNumero(List<Integer> numeros, Integer i, Integer z) {
        if (buscarPosicaoNumero(numeros, i) != -1){
            numeros.set(buscarPosicaoNumero(numeros, i), z);
        } else
            numeros.add(z);
    }
} 

