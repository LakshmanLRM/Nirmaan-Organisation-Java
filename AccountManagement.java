package day14;

import java.util.Scanner;

class Details{
	     private int Id;
	     private String Name;
	     private int Accountno;
	     private long balance=500000000;
	     private int pin=1234;
	     public Details(int id,String name,int accountno) {
	    	 super();
	    	 this.Id= id;
             this.Name = name;
	    	 this.Accountno = accountno;
	    	 
	     }
	     
		public Details() {

		}

		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getAccountno() {
			return Accountno;
		}
		public void setAccountno(int accountno) {
			Accountno = accountno;
		}
		public long getBalance() {
			return balance;
		}
		public boolean setBalance(long balance,int pin) {
			this.balance = balance;
			return true;
		}

		@Override
		public String toString() {
			return "Details [Id=" + Id + ", Name=" + Name + ", Accountno=" + Accountno + ", balance=" + balance
					+ ", pin=" + pin + "]";
		}
		
}
public class AccountManagement{
	    public static void main(String[]args) {
	    	Details D = new Details();
	    	Scanner sc= new Scanner(System.in);
	    	boolean checking =true;
	    	while(checking) {
	    		System.out.println("choise is yours:1.Add 2.Update 3.view 4.Balance access 5.Exit");
	    		System.out.println("Enter your choise");
	    		int check=sc.nextInt();
	    		switch(check) {
	    		case 1:
	    			System.out.println("Enter ID:");
	    			int id = sc.nextInt();
	    			sc.nextLine();
	    			System.out.println("Enter Name:");
	    			String name =sc.nextLine();
	    			System.out.println("Enter AccountNo :");
	    			int acno=sc.nextInt();
	    			D=new Details(id,name,acno);
	    			break;
	    		case 2:
	    			System.out.println("Enter ID:");
	    			int Id = sc.nextInt();
	    			D.setId(Id);
	    			sc.nextLine();
	    			System.out.println("Enter Name:");
	    			String Name =sc.nextLine();
	    			D.setName(Name);
	    			System.out.println("Enter AccountNo :");
	    			int Acno=sc.nextInt();
	    			D.setId(Acno);
	    		case 3:
	    			System.out.println(D);
	    			break;
	    		case 4:
	    			System.out.println("Enter your Pin:");
	    			int p=sc.nextInt();
	    			if(p==1234) {
	    				System.out.println("Enter new balance amount");
	    				int amount=sc.nextInt();
	    				if(D.setBalance(amount,p)) {
	    					System.out.println("Enter new balance amount");
	    				}else {
	    					System.out.println("Pin incorrect.Balance not updated.");
	    				}
	    			}else {
	    				System.out.println("Incorrect PIN");
	    			}
	    			break;
	    		case 5:
	    			checking=false;
	    			break;
	    		
	    		}
	    	}
	    	
	    	
	    }
}
   

