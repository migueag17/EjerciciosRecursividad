package recursividad;

public class Division {
	public static void main(String[] args) {
		int x = dividir(500, 50);
		System.out.println("El resultado es: " + x);
	}
	public static int dividir(int i, int j) {
		if (i-j < 0) {
			return 0;
		} 
		
		return 1 + dividir(i - j, j);
	}
}
