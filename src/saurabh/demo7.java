package saurabh;

public class demo7 {
	
	public static int abc()
	{
		int a [] = {100,200,300,4000,500};
		
		int max= a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i]) 
			{
				max=a[i];
				System.out.println(max);
			}
			
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		
		demo7.abc();
		
		

	}

}