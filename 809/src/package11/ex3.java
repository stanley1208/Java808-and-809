package package11;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ex3 {

	public static void main(String[] args) {
		ZonedDateTime depart=ZonedDateTime.of(2015,1,15,3,0,0,0,ZoneId.of("UTC-7")); // 10
		ZonedDateTime arrive=ZonedDateTime.of(2015,1,15,9,0,0,0,ZoneId.of("UTC-5")); // 14
		long hrs=ChronoUnit.HOURS.between(depart, arrive);
		System.out.println("Travel time is: "+hrs+" hours");

	}

}