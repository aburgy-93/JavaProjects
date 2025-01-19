package mypackage;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    public void main() {
        LocalDate date = LocalDate.now();

        LocalTime time = LocalTime.now();

        LocalDateTime dateTime = LocalDateTime.now();

        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);

        LocalDateTime dateTime2 = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String newDateTime = dateTime2.format(formatter);

        System.out.println(newDateTime);
    }
}
