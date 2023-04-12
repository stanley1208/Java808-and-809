package package11;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class ex6 {

	public static void main(String[] args) {
		List<Integer>nums=Arrays.asList(1,20,8);
		System.out.println(
				nums.stream().max(Comparator.comparing(a -> a)).get()
//				nums.stream().max(Integer::max).get()
				);
	}

}
