package lambda;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isExpensive =
                prod -> (prod.preco * (1 - prod.desconto)) >= 1000 ;

        Produto produto = new Produto("Notebook", 5000.00, 0.95);
        System.out.println(isExpensive.test(produto));
    }
}
