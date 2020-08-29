package recursividad;

public class Factorial {
	public static void main(String[] args) {
		int x = factorial(6);
		System.out.println("El resultado es: " + x);
	}
	public static int factorial(int i) {
		if (i == 0) {
			return 1;
		} 
		
		return i * factorial(i - 1);
	}
}


