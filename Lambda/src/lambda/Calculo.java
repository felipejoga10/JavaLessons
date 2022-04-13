package lambda;

@FunctionalInterface
public interface Calculo {

    double executar(double a, double b);

    default String legal() {
        return "nova string";
    }

    static String muyLegale() {
        return "muyyLegale";
    }
}
