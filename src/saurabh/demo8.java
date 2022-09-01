package saurabh;

public class demo8 {
	
	public void abc() {
		System.out.println("abc method with 0 args");//0
	}
	
	
	public void abc(int a) {
		System.out.println("abc method with 1 int args");//1
	}
	
	public void abc(String b) {
		System.out.println("abc method with 1 String args");//3
	}
	
	public static void main(String[] args) {
		
		demo8 obj =new demo8();
		obj.abc(10);
		obj.abc();
		obj.abc("Selenium");
		
	}

}


