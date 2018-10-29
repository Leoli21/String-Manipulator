import java.util.Scanner;

public class StringManipulator
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please input a string: ");
		String str = keyboard.nextLine();
	    int strLength = str.length();
	    System.out.println("The legnth is " + strLength);
	    char firstChar = str.charAt(0);
	    char lastChar = str.charAt(strLength - 1);
	    System.out.println("The first letter is " + firstChar + " and the last letter is " + lastChar + ".");
	    str.substring(0,strLength/2);
	    System.out.print("Please enter a character to search for: ");
	    String character = keyboard.nextLine();
	    int index = str.indexOf(character);
	    System.out.println("The index is at " + index);
	    System.out.println("Please enter a start index: ");
	    String startIndex = keyboard.nextLine();
	    System.out.println("Please enter a stop index: ");
	    String endIndex = keyboard.nextLine();
	    int startIndex1 = Integer.parseInt(startIndex);
	    int endIndex1 = Integer.parseInt(endIndex);
	    String substring = str.substring(startIndex1, endIndex1);
	    System.out.println("The substring is: " + substring);

	}

}
