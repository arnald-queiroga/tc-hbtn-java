import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas) {
        TreeMap<String, TreeSet<Pessoa>> listaTreeMap = pessoas.stream()
                .collect(
                        Collectors.groupingBy(
                                Pessoa::getCargo,
                                () -> new TreeMap<>(Comparator.reverseOrder()),
                                Collectors.toCollection(TreeSet::new)
                        )

                );
        return listaTreeMap;

    }
    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas) {
        Function<Pessoa, String> obterPessoaCargo = (Pessoa::getCargo);
        return pessoas.stream()
                .collect(
                        Collectors.groupingBy(
                                obterPessoaCargo,
                                Collectors.counting()
                        )
                );
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoas) {
        Function<Pessoa, String> obterPessoaCargo = (Pessoa::getCargo);
        return pessoas.stream()
                .collect(
                        Collectors.groupingBy(
                                obterPessoaCargo,
                                Collectors.groupingBy(Pessoa::getIdade, Collectors.counting())
                        )
                );
    }
} 
