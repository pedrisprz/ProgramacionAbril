package Arrays;

import java.util.Scanner;


public class EjercicioArrays1 {
/** Ejercicio 1: Crea un array de 10 posiciones de números con valores pedidos por teclado. 
 * Muestra por consola el indice y el valor al que corresponde. 
 * Haz dos métodos, uno para rellenar valores y otro para mostrar.*/
	

	
	 public static void rellenarValoresArray (int[] array) {
	        Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < array.length; i++) {
	            System.out.print("Valor para la posición " + i + ": ");
	            array[i] = sc.nextInt();
	        }
	    }
	 
	 public static void mostrarValoresArray(int[] array) {
		 
	        for (int i = 0; i < array.length; i++) {
	            System.out.println("Valor " + i + " del Array: " + array[i]);
	        }
	    }	
	 
	 	public static void main(String[] args) {
	 		
			int[] ej1_Array = new int[10];
			
			rellenarValoresArray(ej1_Array);
			mostrarValoresArray(ej1_Array);
	}
	
}
