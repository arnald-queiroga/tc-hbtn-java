import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

public class AnalisadorFrase {


    public static TreeMap<String,Integer> contagemPalavras(String palavra) {
       String palavraMinuscula = palavra.toLowerCase(Locale.ROOT);

       palavraMinuscula = palavraMinuscula.replaceAll("[!.?]","");

       String[] frases = palavraMinuscula.split(" ");

       TreeMap<String, Integer> mantem = new TreeMap<>();

       for (String chave: frases){
           mantem.put(chave, Collections.frequency(List.of(frases), chave));
       }
       return mantem;
    }
} 

