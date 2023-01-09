package Lesson2.Task25;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Замеряем точку начала программы для подсчета времени выполнения
        long allStart = System.currentTimeMillis();

        //Task25 part1 Создаем и выводим на печать объекты даты рождения различных классов

        //Замер времени для создания и вывода на печать объекта Date. Создаем две переменные до начала выполнения и после и вычисляем разницу
        Instant dateStart = Instant.now();//точка отсчета времени до создания объекта Date

        //1. Date
        // Создаем объект даты дня рождения
        Date myBirthday1 = new Date(86, Calendar.SEPTEMBER, 8, 10, 20, 0); //год вычитаем 1900 от года рождения, месяц с 0-11
        //Вывод даты дня рождения с помощью метода format класса SimpleDateFormat
        System.out.println("1. Вывод объекта Date в разных форматах");
        System.out.println("Вывод без форматирования - " + myBirthday1);
        System.out.println("Вывод по паттерну <EEEE, d MMMM  yyyy> - " + new SimpleDateFormat("EEEE, d MMMM  yyyy").format(myBirthday1));
        System.out.println("Вывод по паттерну <EEE MMM dd yyyy>, Locale.ENGLISH - " + new SimpleDateFormat("EEE MMM dd yyyy", Locale.ENGLISH).format(myBirthday1));
        System.out.println("Вывод по паттерну <HH:mm dd-MMM-yyyy>, Locale.ENGLISH,UpperCase  - " + new SimpleDateFormat("HH:mm dd-MMMM-yyyy", Locale.ENGLISH).format(myBirthday1).toUpperCase());
        System.out.println("Вывод по паттерну <d MMMM yyyy> - " + new SimpleDateFormat("d MMMM yyyy").format(myBirthday1));
        System.out.println("");
        Instant dateFinish = Instant.now();// точка после вывода на печать объекта Date

        //Task25 part2: Создаем выводим на печать объекты Date, LocalDate, LocalDateTime, ZonedDateTime, GregorianCalendar

        //2. LocalDate
        //Замеряем время до начала создания объекта LocalDate с помощью Instant и Duration
        Instant localDateStart = Instant.now();
        LocalDate myBirthday2 = LocalDate.of(1986, 9, 8);
        System.out.println("2. Вывод объекта LocalDate в разных форматах");
        System.out.println("Вывод без форматирования - " + myBirthday2);
        System.out.println("Формат ISO_LOCAL_DATE - " + DateTimeFormatter.ISO_LOCAL_DATE.format(myBirthday2));
        System.out.println("Формат ofLocalizedDate, стиль FULL - " + DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(myBirthday2));
        System.out.println("Формат ofLocalizedDate, стиль LONG - " + DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(myBirthday2));
        System.out.println("Формат ofLocalizedDate, стиль MEDIUM - " + DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(myBirthday2));
        System.out.println("Формат ofLocalizedDate, стиль SHORT - " + DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(myBirthday2));
        System.out.println("Вывод по паттерну EEEE, dd.MM.yyyy - " + DateTimeFormatter.ofPattern("EEEE, dd.MM.yyyy").format(myBirthday2));
        Instant localDateFinish = Instant.now();
        System.out.println("");

        //3. LocalDateTime
        //Замеряем время до начала создания объекта LocalDateTime с помощью Instant и Duration
        Instant localDateTimeStart = Instant.now();
        LocalDateTime myBirthday3 = LocalDateTime.of(1986, 9, 8, 10, 20, 0);
        System.out.println("3. Вывод объекта LocalDateTime в разных форматах");
        System.out.println("Вывод без форматирования объекта LocalDateTime - " + myBirthday3);
        System.out.println("Формат ISO_LOCAL_DATE_TIME - " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(myBirthday3));
        System.out.println("Формат ISO_DATE - " + DateTimeFormatter.ISO_DATE.format(myBirthday3));
        System.out.println("Вывод по паттерну dd.MM.yyyy HH:mm - " + DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm").format(myBirthday3));
        System.out.println("Вывод по паттерну EEEE, dd.MM.yyyy HH:mm - " + DateTimeFormatter.ofPattern("EEEE, dd.MM.yyyy HH:mm").format(myBirthday3));
        Instant localDateTimeFinish = Instant.now();
        System.out.println("");

        //4. ZonedDateTime +
        //Замеряем время до начала создания объекта ZonedDatetime с помощью Instant и Duration
        Instant zonedDateTimeStart = Instant.now();
        ZoneId zone = ZoneId.of("Europe/Kiev");
        ZonedDateTime myBirthday4 = ZonedDateTime.of(myBirthday3, zone);
        System.out.println("4. Вывод объекта ZonedDateTime в разных форматах");
        System.out.println("Без форматирования - " + myBirthday4);
        System.out.println("Вывод по паттерну dd.MM.yyyy HH:mm - " + DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm").format(myBirthday4));
        System.out.println("Формат ISO_LOCAL_DATE_TIME, стиль FULL - " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(myBirthday4));
        System.out.println("Формат ISO_LOCAL_DATE_TIME, стиль LONG - " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(myBirthday4));
        System.out.println("Формат ISO_LOCAL_DATE_TIME, стиль MEDIUM - " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(myBirthday4));
        System.out.println("Формат ISO_LOCAL_DATE_TIME, стиль SHORT - " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(myBirthday4));
        Instant zonedDateTimeFinish = Instant.now();
        System.out.println("");

        //5. Calendar +
        Instant calendarStart = Instant.now(); //Замеряем время до начала создания объекта Calendar с помощью Instant и Duration
        Calendar myBirhdayCalendar = new GregorianCalendar(1986, Calendar.SEPTEMBER, 8, 10, 20, 0);
        System.out.println("5. Вывод объекта Calendar в разных форматах");
        System.out.println("Calendar без форматирования по паттерну - " + myBirhdayCalendar.getTime());
        System.out.println("Calendar в формате <dd-MM-yyyy> - " + new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(myBirhdayCalendar.getTime()));
        System.out.println("Calendar в формате <EEEE, d MMMM yyyy> - " + new SimpleDateFormat("EEEE, d MMMM yyyy").format(myBirhdayCalendar.getTime()));
        System.out.println("Calendar в формате <EEEE, d MMMM yyyy>, Locale.ENGLISH - " + new SimpleDateFormat("EEEE, d MMMM yyyy", Locale.ENGLISH).format(myBirhdayCalendar.getTime()));
        System.out.println("Calendar в формате <dd.MM.yyyy hh:mm> - " + new SimpleDateFormat("dd.MM.yyyy hh:mm").format(myBirhdayCalendar.getTime()));
        System.out.println("");

        Instant calendarFinish = Instant.now();//Замеряем время окончания создания и вывода на печать объекта Calendar с помощью Instant и Duration
        long allFinish = System.currentTimeMillis();// Создаем точку завершения блоков по созданию объектов и их выводу на печать

        // Task 25 part 2 - Сравнение даты рождения с текущей датой
        //1.Date
        System.out.println("1.Cравнение текущей даты с датой рождения объекта Date");

        Date currentDate = new Date();
        System.out.println("Метод before() - " + currentDate.before(myBirthday1)); // //ожидаем false
        System.out.println("Метод after() - " + currentDate.after(myBirthday1));//ожидаем true
        System.out.println("Метод equals() - " + currentDate.equals(myBirthday1));//ожидаем false
        System.out.println("Разница между объектами Date - " + (currentDate.getTime() - myBirthday1.getTime()) + " ms" + "\n");

        //2.Calendar
        System.out.println("2.Cравнение текущей даты с датой рождения объекта Calendar");
        Calendar calendarNow = Calendar.getInstance();
        System.out.println("Метод after() - " + calendarNow.after(myBirhdayCalendar)); //ожидаем true
        System.out.println("Метод before() - " + calendarNow.before(myBirhdayCalendar)); // ожидаем false
        System.out.println("Метод equals() - " + calendarNow.equals(myBirhdayCalendar)); // ожидаем false
        System.out.println("Разница между объектами Calendar - " + (calendarNow.getTimeInMillis() - myBirhdayCalendar.getTimeInMillis()) + " ms" + "\n");

        //3.LocalDate
        System.out.println("3.Cравнение текущей даты с датой рождения объекта LocalDate");
        LocalDate now1 = LocalDate.now();
        System.out.println("Метод equals() - " + now1.equals(myBirthday2));//ожидаем false
        System.out.println("Метод isBefore() - " + now1.isBefore(myBirthday2));// ожидаем false
        System.out.println("Метод isAfter() - " + now1.isAfter(myBirthday2));//ожидаем true

        Period period = Period.between(myBirthday2, now1);
        System.out.println("Разница между датой рождения и текущей датой: " + period.getYears() + " years, "
                + period.getMonths() + " months, "
                + period.getDays() + " days" + "\n");

        //4.LocalDateTime
        System.out.println("4.Cравнение текущей даты с датой рождения объекта LocalDateTime");
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("Метод equals() - " + now2.equals(myBirthday3)); //ожидаем false
        System.out.println("Метод isBefore() - " + now2.isBefore(myBirthday3)); // ожидаем false
        System.out.println("Метод isAfter() - " + now2.isAfter(myBirthday3)); //ожидаем true

        //С помощью ChronoUnit вывод разницы в ms, возможен вывод разницы в годах, днях, неделях и т.д.
        System.out.println("Разница между объектами LocalDateTime - " + ChronoUnit.MILLIS.between(myBirthday3, now2) + " ms" + "\n");

        //5.ZonedDateTime
        System.out.println("5.Cравнение текущей даты с датой рождения объекта ZonedDateTime");
        ZonedDateTime now3 = ZonedDateTime.now(ZoneId.systemDefault());
        System.out.println("Метод equals() - " + now3.equals(myBirthday4)); //ожидаем false
        System.out.println("Метод isBefore() - " + now3.isBefore(myBirthday4)); // ожидаем false
        System.out.println("Метод isAfter() - " + now3.isAfter(myBirthday4)); //ожидаем true
        //С помощью ChronoUnit вывод разницы в ms, возможен вывод разницы в годах, днях, неделях и т.д.
        System.out.println("Разница между объектами ZonedDateTime- " + ChronoUnit.MILLIS.between(myBirthday4, now3) + " ms" + "\n");

        //Task 25 part 3  //Task 25 part 4 Только вывод
        //Считаем общее количество времени за которое выполняется программа из первого задания. Alltime-ms
        System.out.println("Общее время выполнения:");
        System.out.println("Alltime - " + (allFinish - allStart) + " ms");

        //Task 25 part 4 Только вывод, точки начала и завершения блоков созданы до и после соответствующих блоков
        // Считаем время выполнения в миллисекундах (создание объекта + вывод на экран) по объектам Date, LocalDate, LocalDateTime, ZonedDateTime, GregorianCalendar
        System.out.println("Время выполнения блоков в миллисекундах:");
        System.out.println("Date - " + Duration.between(dateStart, dateFinish).toMillis() + " ms");
        System.out.println("LocalDate - " + Duration.between(localDateStart, localDateFinish).toMillis() + " ms");
        System.out.println("LocalDateTime - " + Duration.between(localDateTimeStart, localDateTimeFinish).toMillis() + " ms");
        System.out.println("ZonedDateTime - " + Duration.between(zonedDateTimeStart, zonedDateTimeFinish).toMillis() + " ms");
        System.out.println("Calendar - " + Duration.between(calendarStart, calendarFinish).toMillis() + " ms");
    }

}
