package org.example.Aula2;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Exercicio2A2 {
    /*Transformando Strings em Datas
    Dada uma lista de strings representando datas no formato "yyyy-MM-dd", converta cada uma delas em objetos LocalDate.
            List<String> datasStrings = new ArrayList<>();
datasStrings.add("2023-08-10");
datasStrings.add("2022-05-20");
datasStrings.add("2021-11-30");*/

    public static void main(String[] args) {

        List<String> datasStrings = new ArrayList<>();
        datasStrings.add("2023-08-10");
        datasStrings.add("2022-05-20");
        datasStrings.add("2021-11-30");
        List<LocalDate> datasLocalDate = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");



        for (int i=0; i<datasStrings.size();i++){
            datasLocalDate.add(LocalDate.parse(datasStrings.get(i),formatter));
        }
        for (LocalDate date : datasLocalDate){
            System.out.println(date);

        }
    }
}
