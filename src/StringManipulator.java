import java.util.Scanner;

public class StringManipulator
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input a string. ");
		String str = keyboard.nextLine();
	    int strLength = str.length();
	    System.out.println("The legnth is " + strLength);
	    char firstChar = str.charAt(0);
	    char lastChar = str.charAt(strLength - 1);
	    System.out.println("The first letter is " + firstChar + "and the last letter is " + lastChar + ".");
	    str.substring(0,strLength/2);
	    System.out.println("Please enter a character to search for: ");
	    char character = keyboard.nextLine();
	    System.out.println(character);
	    
	    

	}

}
