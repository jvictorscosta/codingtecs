package org.example.Aula3.Exercicio.Exercicio1;

import java.util.List;
import java.util.function.Function;


/*criar um método que receba uma lista com produtos  e uma lambda com implementação do método por parâmetro.
Requisitos de implementação:
Classe Produto com os atributos getter e setter.
Classe Main com um método calcular.
lambda com o corpo do método para somar todos os preços do carrinho de compras.
*/
public class Exercicio1 {
    public static void main(String[] args) {
        List<Produto> carrinhoDeCompras = List.of(
                new Produto("Ovo",15.00),
                new Produto("Macarrão",9.00),
                new Produto("Farinha",5.50)
        );
        //ContarGenerics contarGenerics=new ContarGenerics;
        /*double calcular(List<Produto> carrinhoDeCompras, ContarGenerics contarGenerics ){
            double total=0;

            return total;
        }*/
    }
}
