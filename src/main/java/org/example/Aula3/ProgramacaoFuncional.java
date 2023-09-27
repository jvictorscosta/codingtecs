package org.example.Aula3;

import java.util.function.BiFunction;

public class ProgramacaoFuncional {
    public static void main(String[] args) {
        BiFunction<Integer,Integer, Integer> calculadora = (numero1, numero2)-> numero1+numero2;
        System.out.println(calculadora.apply(1, 2));
    }

}
