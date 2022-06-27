package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MarkList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		List<Integer> mlist = new ArrayList<Integer>();
		
		
	for(int i=0;i<=5;i++) {
		int mark=sc.nextInt();
		//MarkList.add(mark);
		mlist.add(mark);
	}
	
	for(int d:mlist) {
		System.out.println(d);
	}
	Double avg = mlist.stream().collect(Collectors.averagingDouble(m->m));
	System.out.println("Average of marks is:-"+avg);
	

	System.out.println("Distinect Mark from Given List"); 
	List<Integer> disti = mlist.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println("Distinect Marks from ArrayList:-"+disti);
	}

}
