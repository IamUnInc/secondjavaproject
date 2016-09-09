//import java.util.*;
import java.io.*;

public class Thirdsetup {
	
//	static Scanner userInput = new Scanner(System.in);
	
	public static void main (String[] args) {
		getAFile("./somestuff.txt");
		
		
	}
	
	public static void getAFile(String fileName) {
		try
		{
			FileInputStream file = new FileInputStream(fileName);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Sorry can't find that file");
		}
		
		catch(IOException e)
		{
			System.out.println("UnKnown IO Error");
		}
		
		
		catch(Exception e)
		{
			System.out.println("Some error occurred");
		}
		
		finally{
			System.out.print("");
		}
	}
		
//		System.out.print("How old are you?");
//		int age = checkValidAge();
//		
//		if (age != 0){
//			System.out.println("You are " + age + " years old");;
//		}
//			
//	}
//	
//	public static int checkValidAge() {
//		
//		try
//		{
//			return userInput.nextInt();
//		}
//		
//		catch (InputMismatchException e)
//		{
//			userInput.next();
//			System.out.print("That isnt a whole number");
//			return 0;
//		}
//	}
		
//		divideByZero(2);
//		
//	}
//
//	public static void divideByZero(int a){
//		
//		try
//		{
//			
//			System.out.println(a/0);
//			
//		}
//		
//		catch (ArithmeticException e)
//		{
//			System.out.println("You cant do that");
//			
//			System.out.println(e.getMessage());
//		}
//		
//	}
	
}
