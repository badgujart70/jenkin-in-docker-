package org.example.Java_Jenkin_in_Docker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println(checkIfInputIsAnEvenNumber(122));
			// Testing in the main method
			 }
	
	public static boolean checkIfInputIsAnEvenNumber(int
			number){
			 return number % 2 == 0;
			 }
}
