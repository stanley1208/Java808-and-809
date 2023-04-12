package package11;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class ex8 {

	public static void main(String[] args) throws InterruptedException {
		Instant loginTime=Instant.now();
		Thread.sleep(1000);
		Instant logoutTime=Instant.now();
		
		loginTime=loginTime.truncatedTo(ChronoUnit.MINUTES);
		logoutTime=logoutTime.truncatedTo(ChronoUnit.MINUTES);

		
		if(logoutTime.isAfter(loginTime)) {
			System.out.println("Logged out at: "+logoutTime);
		}else {
			System.out.println("Cannot logout");
		}
	}

}
