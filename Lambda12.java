

import java.util.ArrayList;
import java.util.List;

public interface Max {

	Void maxArray(int a[]);
}



public class Lambda12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>list = new ArrayList<Integer>();
		Max n=(int a[])->{
			
			for(int i=1;i<a.length;i++) {
				list.add(a[i]);
				
			}
			Integer Maximumno =list.stream().max((e1,e2)->e1>e2? 1:-1).get();
			//return null;
			System.out.println(Maximumno);
			
			
		};
		n.maxArray(new int [] {65,87,23,56,78,56});
	}

}
