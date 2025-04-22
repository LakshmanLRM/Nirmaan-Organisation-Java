package lakshman;


public class day9 {
 String name;
 long phoneNo;
 double salary;
 public void employee() {
	 System.out.println("Employee Name:"+name);
	 System.out.println("Employee PhoneNo"+phoneNo);
	 System.out.println("Employee salary"+salary);
 }
	public static void main(String[] args) {
		day9 emp=new day9();
		emp.name= "Perumal";
		emp.phoneNo=3938337398l;
		emp.salary=2000000;
		emp.employee();
		
		day9 emp1=new day9();
		emp1.name= "Prassana";
		emp1.phoneNo=39383377898l;
		emp1.salary=354000000;
		emp1.employee();
		
		day9 emp2=new day9();
		emp2.name= "Harish";
		emp2.phoneNo=368337398l;
		emp2.salary=50000000;
		emp2.employee();
		
		day9 emp3=new day9();
		emp3.name= "Mohanraj";
		emp3.phoneNo=8768337398l;
		emp3.salary=69870000;
		emp3.employee();

	}

}
