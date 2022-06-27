
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Max{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {11,29,23,44,57,68,70};
		
		String [] str = {"Rjiv Gandhi","Rahil Gandhi"};
		
		System.out.println("===max no from array===");
		int max = Arrays.stream(arr)
				  .max()
				  .getAsInt(); 
		System.out.println("max no in array is:-"+max);
		
		System.out.println("===Length of Given string ===");
		List<Integer> strcount=new ArrayList<Integer>();
		
		for(String s:str) {
			int count=0;
			char[] ch1=s.toCharArray();
			for(char ch:ch1) {
				count++;
			}
			strcount.add(count);
			
		}
		
		System.out.println(strcount);
		Integer max1 = strcount.stream().max((s1,s2)->s1>s2?1:-1).get();
		System.out.println("Max length of string array is:-"+max1);
	}
		
}		