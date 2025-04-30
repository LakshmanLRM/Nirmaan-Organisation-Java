package day13;

import java.util.Scanner;

public class Methodoverriding {

	public static void main(String[] args) {
		Librarymanagement lm = new Librarymanagement();
		Scanner sc = new Scanner(System.in);
		boolean work=true;
		while(work) {
			System.out.println("Enter 1 for enter details");
			System.out.println("Enter 2 for edit details");
			System.out.println("Enter 3 for show details");
			System.out.println("Enter 4 for exit:");
			int a = sc.nextInt();
			switch(a) {
			case 1:
				sc.nextLine();
				System.out.println("Enter The Book Name");
				String BookName = sc.nextLine();
				System.out.println("Enter Student ID");
				int IDNum= sc.nextInt();
				System.out.println("Enter Book Price");
				int price=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Author Name");
				String Author=sc.nextLine();
				lm=new Librarymanagement(BookName,IDNum,price,Author);
				break;
			case 2:
			sc.nextLine();
			System.out.println("Enter The Book Name:");
			String Bname = sc.nextLine();
			System.out.println("Enter Student ID:");
			int IDnum= sc.nextInt();
			System.out.println("Enter Book Price:");
			int NewPrice=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Author Name:");
			String UpdateAuthor=sc.nextLine();
            lm.setBookname(Bname);	
            lm.setStudentid(IDnum);
            lm.setBookprice(NewPrice);
            lm.setAuthorName(UpdateAuthor);
            break;
			case 3:
				System.out.println(lm);
				break;
			case 4:
				work=false;
				break;
			case 5:
				if(a>=5) {
					System.out.println("Thank You");
				}
				break;
            
			}
		}
	
	}

}
