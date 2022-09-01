package wrapperclass;

public class print_numbers_alphabet_seprately {

	public static void main(String[] args) {
		
		String a = "selenium123#@%";
		
		char [] abc = a.toCharArray();
		
		for(int i=0;i<abc.length;i++)
		{
			if(Character.isDigit(abc[i]))
			{
				System.out.println("digits are :" + abc[i]);
			}
			else if(Character.isAlphabetic(abc[i]))
			{
				System.out.println("characters are :" + abc[i]);
			}
			else
			{
				System.out.println("specials char are :" +abc[i]);
			}
		}

	}

}
