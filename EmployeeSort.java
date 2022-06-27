
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp{
    
	int eid;
	String ename;
	int salary;

	Emp(int eid,String ename,int salary)
	{
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}

 public class EmployeeSort{
	 
	 public static void main(String s[])
	{
		List<Emp> elist = new ArrayList<Emp>();
		elist.add(new Emp(1,"Sunil Kumar",23400));
		elist.add(new Emp(2,"vijay Warma",32450));
		elist.add(new Emp(3,"Rahul Kumar",20000));
		elist.add(new Emp(4,"Yogesh Kapde", 043020));
		elist.add(new Emp(5,"Shubham Bhosle",54000));
		elist.add(new Emp(6,"Sunil Mane",20400));
		elist.add(new Emp(7,"Sunil Mane",20400));
		
		
		 Map result1 = elist.stream()
	                .sorted(Comparator.comparingInt(Emp::getSalary))
	                .collect(
	                        Collectors.toMap(
	                                Emp::getEname, Emp::getSalary, 
	                                (oldValue, newValue) -> oldValue,      
	                                LinkedHashMap::new                      
	                        ));

	        System.out.println("Result 1 : " + result1);

	        
	System.out.println("======xxxxx======");
	
	
	//List<Emp> disti= elist.stream().distinect().
	List<String> disti = elist.stream().distinct().sorted().map(e->e.ename).collect(Collectors.toList());
	System.out.println(disti);
	

 }


 }