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
		// Login time:2015-01-12T21:58:18.817z
		Instant loginTime=Instant.now();
		Thread.sleep(1000);

		// Logout time:2015-01-12T21:58:19.880Z
		Instant logoutTime=Instant.now();

		loginTime=loginTime.truncatedTo(ChronoUnit.MINUTES); //line n1
		logoutTime=logoutTime.truncatedTo(ChronoUnit.MINUTES);

		if (logoutTime.isAfter(loginTime))
			System.out.println("Logged out at: "+logoutTime);
		else
			System.out.println("Can't logout");
	}

}
