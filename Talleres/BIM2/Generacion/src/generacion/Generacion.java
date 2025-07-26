package Generacion;

/**
 *
 * @author Alisson Condoy
 */
public class Generacion {
public static void main(String[] args) {
        int cantidad = 100;
        long semilla = 12345;

        double[] numeros = generarPseudoaleatorios(semilla, cantidad);

        System.out.println("Números pseudoaleatorios generados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static double[] generarPseudoaleatorios(long semilla, int cantidad) {
        // Parámetros del generador (Numerical Recipes)
        long a = 1664525;
        long c = 1013904223;
        long m = (long) Math.pow(2, 32);

        double[] resultados = new double[cantidad];
        long x = semilla;

        for (int i = 0; i < cantidad; i++) {
            x = (a * x + c) % m;
            resultados[i] = (double) x / m; 
        }

        return resultados;
    }
}
