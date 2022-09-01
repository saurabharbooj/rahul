package saurabh;

public class demo5 {

	public static void main(String[] args) {
		
		String a="selenium";//SCM
		String b="Selenium";//SCM
		String c="selenium";//SCM
		
		System.out.println(a==b);//true
		System.out.println(a==c);//true
		
		
		System.out.println(a.equals(b));//true
		System.out.println(a.equals(c));//true
		
		System.out.println("-----------------------------");
		
		String x =new String("Selenium");
		String y =new String("Selenium");
		String z =new String("Selenium");
		
		System.out.println(x==y);//false
		System.out.println(x==z);//false
		
		System.out.println(x.equals(y));//true
		System.out.println(x.equals(z));//true
			
		}
	}

