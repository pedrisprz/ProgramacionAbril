package Arrays;

public class EjercicioArrays4 {

	public static boolean comparacionArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
	
	
	public static void main(String[] args) {
		
		String[] array1 = {"Esto", "es", "una","prueba"};
        String[] array2 = {"Esto", "es", "una","prueba"};
        String[] array3 = {"Esto", "es", "otra","prueba"};
        
        System.out.println("El array1 y el 2 son iguales: " + comparacionArrays(array1, array2));
        System.out.println("El array1 y 3 son iguales: " + comparacionArrays(array1, array3));
        System.out.println("El array2 y 3 son iguales : " + comparacionArrays(array2, array3));


	

}
}
