package ExercicioUm;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;

public class ConversaoGlobalLocal {
	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       
       LocalDate d01 = LocalDate.parse("2022-07-20");
       LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:25");
       Instant d03 = Instant.parse("2022-07-22T01:30:26Z");
       
       LocalDate d04 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
       LocalDate d05 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
       
       System.out.println(d01);
       System.out.println(d02);
       System.out.println(d03);
       System.out.println(d04);
       System.out.println(d05);
       
       System.out.println(d04.getDayOfMonth());
       System.out.println(d04.getMonthValue());
       System.out.println(d04.getYear());
       
	}
}
