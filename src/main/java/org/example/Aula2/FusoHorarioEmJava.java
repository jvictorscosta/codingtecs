package org.example.Aula2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FusoHorarioEmJava {
    public static void main(String[] args) {
        for (String zoneId : ZoneId.getAvailableZoneIds()){
            //System.out.println(zoneId);
        }
        System.out.println(ZoneId.getAvailableZoneIds().size());
        LocalDateTime hojeAgora = LocalDateTime.now();
        System.out.println(hojeAgora);
        System.out.println();

        ZonedDateTime dataHoraAtualFusoHorario = ZonedDateTime.now();
        System.out.println(dataHoraAtualFusoHorario);
        ZonedDateTime dataHoraAtualEmParis = dataHoraAtualFusoHorario.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println(dataHoraAtualEmParis);
    }
}
