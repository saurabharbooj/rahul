package wrapperclass;

public class print_only_numbers_from_String {

	public static void main(String[] args) {
		
		String a = "abc123d";
		
		char [] abc = a.toCharArray();
		
		for(int i=0;i<abc.length;i++)
		{
			if(Character.isDigit(abc[i]))
			{
				System.out.println(abc[i]);
			}
		}
		

	}

}
