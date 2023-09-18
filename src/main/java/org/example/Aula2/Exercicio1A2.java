package org.example.Aula2;

import java.time.LocalDate;

import java.util.Scanner;

public class Exercicio1A2 {
    //Cria um programa que receba a data da primeira dose da vacina e imprima a data das doses 2 e 3.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá");
        System.out.println("Favor informar qual dia tomou sua primeira dose");
        int dia = scanner.nextInt();
        System.out.println("qual mês tomou sua primeira dose?");
        int mes = scanner.nextInt();
        System.out.println("qual ano tomou sua primeira dose ");
        int ano = scanner.nextInt();
        LocalDate dataPrimeiraDose =LocalDate.of(ano,mes,dia);
        System.out.println(dataPrimeiraDose);
        System.out.println("Dia da segunda dose: "+dataPrimeiraDose.plusMonths(1));
        System.out.println("Dia da terceira dose: "+ dataPrimeiraDose.plusMonths(2));
    }
}
