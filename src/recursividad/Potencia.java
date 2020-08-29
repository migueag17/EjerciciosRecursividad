package recursividad;

public class Potencia {
	public static void main(String[] args) {
		int x = potencia(7, 4);
		System.out.println("El resultado es: " + x);
	}
	public static int potencia(int a, int b) {
		if (b == 1) {
			return a;
		} 
		
		return a * potencia(a, b-1);
	}
}


