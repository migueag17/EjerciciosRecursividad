package recursividad;

public class Arreglo {
	public static void main(String[] args) {
	       int arreglo[]={16,5,3,9,7,20};
	       System.out.println("La suma del arreglo es: "+sumar(arreglo,0));
	    }
	 
	 public static int sumar (int arr[], int pos){
	        if(pos<arr.length) {
	            return arr[pos]+sumar(arr,pos+1);
	        }
	        return 0;
	    }
	}
