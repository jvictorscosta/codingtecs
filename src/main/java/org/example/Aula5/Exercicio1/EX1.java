package org.example.Aula5.Exercicio1;

import java.util.Arrays;
import java.util.List;

public class EX1 {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 2500.0, 10),
                new Produto("Impressora", 800.0, 5),
                new Produto("Mouse", 50.0, 20),
                new Produto("Teclado", 100.0, 15)
        );
        System.out.println("produtos acima de 500");

        produtos.stream().filter(produto -> produto.getPreco() > 500).forEach(p -> System.out.println(p.getNome()));


    }
}
