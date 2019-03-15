         import java.text.DateFormat;
         import java.text.SimpleDateFormat;
         import java.time.Duration;
         import java.time.LocalDate;
         import java.time.LocalDateTime;
         import java.time.LocalTime;
         import java.time.Period;
         import java.time.ZoneId;
         import java.time.ZonedDateTime;
         import java.time.format.DateTimeFormatter;
         import java.time.temporal.TemporalAdjuster;
         import java.time.temporal.TemporalAdjusters;
         import java.util.Calendar;
         import java.util.Date;
         import java.util.GregorianCalendar;

public class JavaTimeExample {

    public static void main(String[] args) {
        //The following snippet demonstrates -
        //
        //LocalDate - Date without Timezone
        //LocalTime - Time without Timezone
        //Period and duration examples


        System.out.println("\nLocaldate and Localtime examples\n");


        /*
        * The most commonly used classes are LocalDate, LocalTime and LocalDateTime.
        * As their names indicate, they represent the local Date/Time from the context of the observer.
        * These classes are mainly used when timezone are not required to be explicitly specified in the context.
        * */


        LocalDate currentLocalDate = LocalDate.now();
        System.out.println("currentLocalDate - yyyy-MM-dd - " + currentLocalDate);

        // Month now not based on 0, and year not based on 1900
        LocalDate parse2019LocalDate = LocalDate.of(2019, 3, 13);
        System.out.println("Thirteenth of March 2019 LocalDate - yyyy-MM-dd - " + parse2019LocalDate);

        parse2019LocalDate = parse2019LocalDate.withYear(2017).withMonth(12).withDayOfMonth(25);
        System.out.println("Thirteenth of March 2019 LocalDate - with -  " + parse2019LocalDate);

        LocalDate parseTwentySevenFeb2017LocalDate = LocalDate.parse("2017-02-27", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("parse Thirteenth of March 2019 LocalDate - pattern - yyyy-MM-dd - " + parse2019LocalDate);

        // increment using plus, decrement using minus
        parse2019LocalDate = parse2019LocalDate.plusDays(1);
        System.out.println("Thirteenth of March 2019 LocalDate - immutable - " + parse2019LocalDate);

        // Time with no date
        LocalTime currentLocalTime = LocalTime.now();
        System.out.println("currentLocalTime - yyyy-MM-dd - " + currentLocalTime);

        LocalTime parseLocalTime = LocalTime.parse("13:44");
        System.out.println("parseLocalTime - " + parseLocalTime);

        parseLocalTime = LocalTime.parse("13:44:25");
        System.out.println("parseLocalTime - immutable - " + parseLocalTime);

        System.out.println("\nPeriod and duration examples\n");

        /*
        * The Period class represents a quantity of time in terms of years,
        * months and days and the Duration class represents a quantity of
        * time in terms of seconds and nano seconds.
        * The Period class is widely used to modify values of given a
        * date or to obtain the difference between two dates
        * */

        // Period - Duration in day, weeks, month, years
        Period examplePeriod = Period.of(72,6,10);
        System.out.println("example Period " + examplePeriod);

        LocalDate localDatePlusExamplePeriod = LocalDate.now().plus(examplePeriod);
        System.out.println("local Date Plus Example Period " + localDatePlusExamplePeriod);

        // Duration - can be days, hours, minutes, seconds
        Duration exampleDuration = Duration.ofHours(5);
        System.out.println("example Duration " + exampleDuration);

        //We calculate a new time using the duration plus the current time
        LocalTime exampleDurationLocalTime = LocalTime.now().plus(exampleDuration);
        System.out.println("example Duration LocalTime " + exampleDurationLocalTime);
    }
}
