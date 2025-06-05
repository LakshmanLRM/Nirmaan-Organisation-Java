package day27;
    class ThreadClass1{
    	void display() {
    		
    		for(int i=1;i<10;i++) {
    			if(i%2!=0) {
    			System.out.println("Threadclass1");
    			
    		}
    	}
    }
    }
    class ThreadClass2{
    	void display() {
    		
    		for(int i=1;i<10;i++){ 
    			if(i%2==0) {
    		
    			System.out.println("Threadclass2");
    		}
    	}
    }
    }
public class priorityExample {
     public static  void main(String[]args) {
    	   ThreadClass1 tc1=new  ThreadClass1();
    	   ThreadClass2 tc2=new  ThreadClass2();
    	   Runnable r1= ()-> tc1.display();
    	   Runnable r2= ()-> tc2.display();
    	   Thread th1=new Thread(r1);
    	   Thread th2=new Thread(r2);
    	   th1.setPriority(10);
    	   th1.start();
    	   th1.setPriority(1);
    	   th2.start();
       }
}
    
  