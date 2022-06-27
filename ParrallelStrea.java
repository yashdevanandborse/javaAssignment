

import java.util.Arrays;
import java.util.List;

public class ParrallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.parallelStream().forEach(no->System.out.println(no+" "));
	}

}
