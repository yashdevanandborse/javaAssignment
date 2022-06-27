

import java.util.function.Predicate;

public class EvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Predicate<Integer>pp2=a->a%2==0;
		System.out.println("no is even:="+pp2.test(7));
	}

}
