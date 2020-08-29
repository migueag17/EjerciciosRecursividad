package recursividad;

public class ArregloParImpar {
	static int par = 0;
	static int impar = 0;
	public static void main(String[] args) {
		
	       int arreglo[]={4,2,3,9,18,8,10,11};
	       int contador = contadorNumeros(arreglo, 0);
	       
	       System.out.println("La suma de los pares es: "+ par);
	       
	       System.out.println("La suma de los impares: "+ impar);
	       
}
	public static int contadorNumeros(int arr[], int pos) {
		if(pos<arr.length) {
			if (arr[pos]%2 == 0) {
				par++;		
			}
				else {
					impar++;
				}
			return contadorNumeros(arr, pos+1);
		}
		return 0;
	}	
}