

import java.util.function.Predicate;

public class Countevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no[]= {22,45,78,45,44,88,90,67,11};
		int evenno=0;
		int oddno=0;
		
		Predicate<Integer> list=n->(n%2==0);
		for(int i=0;i<no.length;i++) {
			if(list.test(no[i])) {
				evenno++;
				
			}else
				oddno++;
		}
		System.out.println("Total even No is:- "+evenno);
		System.out.println("Total odd No is :- "+oddno);

	}

}
