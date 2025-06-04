package day6;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.err.println("---------------------------------------------------------------------------------------");
		System.err.println("Your Choice is: 1.Print(3)divisible Numbers / 2.PrintName / 3.PrintThe Count / 4.Tables");
		System.err.println("---------------------------------------------------------------------------------------");
		System.err.println("Enter the choise");
		int select = sc.nextInt();
		if(select == 1) {
			for(int i = 0; i <= 100; i++) {
				if(i % 3 == 0) {
					System.out.println(i);
				}
			}
		}
		else if(select == 2) {
			for(int i = 0;i <= 10;i++) {
				if(i % 4 == 0) {
					System.out.println("SelvaPrasanna");
				}
			}
		}
		else if(select == 3) {
			int count=0;
			for(int i = 0 ; i<= 100;i++) {
				if(i%3 == 0) {
					count++;
				}
			}
			System.out.println("Divide by 3 Counts :> "+count);
		}
		else if(select == 4) {
			System.err.print("Enter your Table : ");
			int table  = sc.nextInt();
			System.err.print("Enter The Range : ");
			int range = sc.nextInt();
			
			for(int i = 1;i <= range;i++) {
				System.out.println(" " + table + " X " + i + " = " +i * table);
			}
		}
	}

}
