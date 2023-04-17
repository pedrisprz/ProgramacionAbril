package Arrays;

import java.util.Random;

public class EjercicioArrays6 {
    
    public static int[][] crearMatriz() {
        Random rand = new Random();
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void leerPorFilas(int[][] matriz) {
        System.out.println("Lectura por filas:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void leerPorColumnas(int[][] matriz) {
        System.out.println("Lectura por columnas:");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void leerPorFilasInverso(int[][] matriz) {
        System.out.println("Lectura por filas (inverso):");
        for (int i = 3; i >= 0; i--) {
            for (int j = 3; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void leerPorColumnasInverso(int[][] matriz) {
        System.out.println("Lectura por columnas (inverso):");
        for (int j = 3; j >= 0; j--) {
            for (int i = 3; i >= 0; i--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirDiagonal(int[][] matriz) {
        System.out.println("Diagonal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[][] matriz = crearMatriz();
        imprimirMatriz(matriz);
        leerPorFilas(matriz);
        leerPorColumnas(matriz);
        leerPorFilasInverso(matriz);
        leerPorColumnasInverso(matriz);
        imprimirDiagonal(matriz);
    }
}
