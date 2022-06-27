
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

 public class EmployeeOperation{
	 
	 public static void main(String s[])
	{
		List<Emp> elist = new ArrayList<Emp>();
		elist.add(new Emp(1,"Sunil Kumar",23400));
		elist.add(new Emp(2,"vijay Warma",32450));
		elist.add(new Emp(3,"Rahul Kumar",20000));
		elist.add(new Emp(4,"Yogesh Kapde", 043020));
		elist.add(new Emp(5,"Shubham Bhosle",54000));
		elist.add(new Emp(6,"Sunil Mane",20400));
		elist.add(new Emp(7,"Rakesh Patre",40000));
		elist.add(new Emp(8,"Sagar magar",32400));
		elist.add(new Emp(9,"Nilesh Avale",29000));
		elist.add(new Emp(10,"Sanjaa Dolas",25000));
		elist.add(new Emp(11,"Pragti Kulkarni",34400));
		
	System.out.println("===By Using For Loop===");
List<String> result2= new ArrayList<>();
for(Emp x: elist) {
	result2.add(x.getEname());
}
	System.out.println(result2);
	System.out.println("===By Using For List===");
	List<String> total =elist.stream().map(x->x.getEname()).collect(Collectors.toList());
	System.out.println(total);
	
	System.out.println("=== ToSet====");
	
	Set<String> emplist = elist.stream().map(p->p.ename).collect(Collectors.toSet());
	System.out.println(emplist);
	
	System.out.println("=== ToMap====");
	Map<Integer,String> empmap = elist.stream().collect(Collectors.toMap(p->p.eid,p->p.ename));
	System.out.println(empmap);

 }
 }


