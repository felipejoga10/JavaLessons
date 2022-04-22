package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media =
                (n1, n2) -> (n1 + n2) / 2.0;
        System.out.println(media.apply(9.1,5.6));

        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = ((n1 + n2) / 2);
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultado.apply(8.4, 5.3));

        Function <Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(9.8, 7.3));
        }
    }

