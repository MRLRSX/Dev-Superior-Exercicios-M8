package ExercicioUm;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class AlteracaoData {
	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      
      LocalDate d01 = LocalDate.parse("2022-07-20");
      LocalDateTime d02 = LocalDateTime.parse("2022-07-20T22:00:30");
      Instant d03 = Instant.parse("2022-07-20T20:00:30Z");
      
      LocalDate pastWeekLocalDate = d01.minusDays(7);
      LocalDate nextWeekLocalDate = d01.plusDays(7);
      
      LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
      LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
      
      Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
      Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
      
      Duration t1 = Duration.between(pastWeekInstant, nextWeekInstant);
      Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), nextWeekLocalDate.atTime(0, 0));
      Duration t3 = Duration.between(pastWeekLocalDateTime, nextWeekLocalDateTime);
      
      System.out.println(pastWeekLocalDate);
      System.out.println(nextWeekLocalDate);
      System.out.println(t2.toDays());
      
      System.out.println(pastWeekLocalDateTime);
      System.out.println(nextWeekLocalDateTime);
      System.out.println(t3.toDays());
      
      System.out.println(pastWeekInstant);
      System.out.println(nextWeekInstant);
      System.out.println(t1.toDays());
      
      
      
      
      
	}
}
