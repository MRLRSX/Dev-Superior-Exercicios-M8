package ExercicioUm;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
       DateTimeFormatter fmt04 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
       DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;
       
       
       LocalDate d01 = LocalDate.now();
       LocalDateTime d02 = LocalDateTime.now();
       Instant d03 = Instant.now();
       LocalDate d04 = LocalDate.parse("2022-07-20");
       LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
       Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
       Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
       LocalDate d08 = LocalDate.parse("20/07/2022", fmt01);
       LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt02); 
       LocalDate d10 = LocalDate.of(2022, 7, 22);
       LocalDateTime d11 = LocalDateTime.of(2022, 7, 22, 01, 35, 29);
       
       
       
       System.out.println(d01);
       System.out.println(d02);
       System.out.println(d03);
       System.out.println(d04);
       System.out.println(d05);
       System.out.println(d06);
       System.out.println(d07);
       System.out.println(d08);
       System.out.println(d09);
       System.out.println(d10);
       System.out.println(d11);
       System.out.println(d05.format(fmt04));
       System.out.println(fmt05.format(d07));
       
       
       System.out.println(fmt01.format(d04));
       System.out.println(d04.format(fmt01));
       System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
       
       System.out.println(fmt03.format(d06));
       
       
       
	}
}
