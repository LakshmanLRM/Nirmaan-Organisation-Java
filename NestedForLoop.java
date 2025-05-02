package day7;

public class NestedForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println("");
			for(int k=i;k>=1;k--) {
				System.out.println();
			}
			
			for(int j=1;j<=i;j++) {
				System.out.println("*");
				System.out.println("");
			}
		}
	}

}
