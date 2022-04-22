package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
        Consumer<Produto> imprimir =
                p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Caneta", 20.00, 0.1);
        imprimir.accept(p1);

        Produto p2 = new Produto("Caderno", 15.00, 0.1);
        Produto p3 = new Produto("Pão", 8.00, 0.1);
        Produto p4 = new Produto("Queijo", 22.00, 0.1);
        Produto p5 = new Produto("Salame", 26.00, 0.1);
        Produto p6 = new Produto("Ovos", 23.50, 0.1);
        Produto p7 = new Produto("Cenoura", 10.00, 0.1);


        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
