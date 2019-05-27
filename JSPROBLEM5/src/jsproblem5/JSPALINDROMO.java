package jsproblem5;
import java.util.Scanner;
public class JSPALINDROMO {
	public static void main (String[] args) {
		Scanner lector = new Scanner(System.in);
		String palabra,palabrainvertida="";
		
		
		
		System.out.print("Dame la palabra: ");
		palabra = lector.nextLine();
		
		for(int x=palabra.length()-1;x>=0;x--)
		palabrainvertida+=palabra.charAt(x);
		
		if(palabra.equals(palabrainvertida))
			
		System.out.print("PALINDROMO");
		
		else 
			System.out.print("NO PALINDROMO");
			
		
	}


}
