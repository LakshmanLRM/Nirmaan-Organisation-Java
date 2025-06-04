package day5;

public class Conditionaloperator {

	public static void main(String[] args) {

		 int a = 10, b = 20;
	        System.out.println("Ternary Operator:");
	        String result = (a > b) ? "a is greater" : "b is greater";
	        System.out.println(result);

	        System.out.println("\nLogical AND Operator:");
	        if (a > 5 && b > 15) {
	            System.out.println("Both conditions are true");
	        } else {
	            System.out.println("At least one condition is false");
	        }

	        System.out.println("\nLogical OR Operator:");
	        if (a > 15 || b > 15) {
	            System.out.println("At least one condition is true");
	        } else {
	            System.out.println("Both conditions are false");
	        }
	        

	}

}
