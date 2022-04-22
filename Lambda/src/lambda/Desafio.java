package lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {


        Function <Produto, Double> precoFinal =
                produto -> produto.preco * (1- produto.desconto);
        UnaryOperator<Double>impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double>frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double>arredondamento =
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(".",",");

        Produto p = new Produto("iPad", 3518, 0.05);

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondamento)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preço final é R$ " + preco);
    }
}
