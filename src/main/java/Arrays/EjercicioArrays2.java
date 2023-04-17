package Arrays;

import java.util.Random;
import java.util.Scanner;

public class EjercicioArrays2 {
	/*
	 * Ejercicio 2: Crea un array de números donde le indicamos por teclado el tamaño del array, 
	 * rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición 
	 * y la suma de todos los valores. Haz un método para rellenar el array 
	 * (que tenga como parámetros los números entre los que tenga que generar), para mostrar el contenido y la suma del array 
	 * y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).
	 */
	

	 public static int TamanyoArray() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Tamaño del Array: ");
	        return sc.nextInt();
	    }
	 
	 private static int generarNumeroAleatorio(int min, int max) {
		 return (int) (Math.random() * (max - min + 1) + min); 
	 }
	 
	 public static void rellenarArray(int[] array, int min, int max) {
	        for (int i = 0; i < array.length; i++) {
	            array[i] = generarNumeroAleatorio(min, max);
	        }
	    }
	 
	 public static void mostrarValores(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.println("Valor " + i + " del array: " + array[i]);
	        }
	    }
	 
	 public static void mostrarSuma(int[] array) {
	        int suma = 0;
	        for (int i = 0; i < array.length; i++) {
	            suma += array[i];
	        }
	        System.out.println("La suma de los valores es: " + suma);
	    }
	
	 public static void main(String[] args) {
	        int[] miArray = new int[TamanyoArray()];

	        rellenarArray(miArray, 0, 9);
	        mostrarValores(miArray);
	        mostrarSuma(miArray);
	    }

	 
}
