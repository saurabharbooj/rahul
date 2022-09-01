package saurabh;

public class demo6 {
	
	
	
public static void main(String[] args) {
		
	String a ="java";

	char b [] =a.toCharArray();
	
	for(int i=0;i<b.length;i++)
	{
		System.out.print(b[i]);
	}
	
	//System.out.println("----------------------");
	System.out.println();

	for(int i=b.length-1;i>=0;i--)
	{
		System.out.print(b[i]);
	}
	}
	
}
