import java.util.*;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros) {
        HashSet<Integer> listaHash = new HashSet<Integer>();
        TreeSet<Integer> listaSet = new TreeSet<Integer>();

        for (int numeroLista : numeros){
            if (!listaHash.add(numeroLista)){
                listaSet.add(numeroLista);
            }
        }
        return listaSet;
    }
} 

