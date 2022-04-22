package lambda;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(33));

        Function<String, String> oResultadoE =
                valor -> "O resultado é " + valor;

        Function<String, String> empolgacao =
                valor -> valor + "!!!!";

        String resultadoFinal = parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgacao)
                .apply(14);

        System.out.println(resultadoFinal);
    }
}
