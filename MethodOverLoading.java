package Day12;

public class MethodOverLoading {
public void add(int a,int b) {
System.out.println(a+b);
}
public void add(int a,int b,int c) {
System.out.println(a+b+c);
}
MethodOverLoading(){
	System.out.println("Empty constructor");
}
MethodOverLoading (int a,int b){
	System.out.println(a+b);
}
	public static void main(String[] args) {
		MethodOverLoading method1 = new MethodOverLoading();
		method1.add(20,30,50);
		
	}

}



