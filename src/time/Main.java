package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main(String[] args) {
        // Current date
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        // Current time
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        // Current datetime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // Format date and time
        System.out.println("Before formatting: " + localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd-MM-yyyy HH:mm:ss");
        String formattedDate = localDateTime.format(dateTimeFormatter);
        System.out.println("After formatting: " + formattedDate);
    }
}
