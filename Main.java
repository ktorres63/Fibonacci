package fibonacci;
import java.util.*;
public class Main {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("ingresa numero: ");
		Fibonacci fib = new Fibonacci(sc.nextInt());
		fib.showList();	
		}
		catch(InputMismatchException e) {
			System.out.println("solo se admiten numeros");
		}
		
	}

}

