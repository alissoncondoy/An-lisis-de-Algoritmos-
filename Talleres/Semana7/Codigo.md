# Ejemplo de Recursividad en la Serie de Fibonacci

```java
package fibonacci;

/**
 * 
 * @author Alisson Condoy
 */
public class Fibonacci {

    // Método recursivo para calcular el término n de Fibonacci
    public static int calcularFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int limite = 10;

        System.out.println("\t\tRecursividad en Fibonacci");

        for (int i = 0; i <= limite; i++) {
            System.out.printf("F(%d) = %d\n", i, calcularFibonacci(i));
        }
    }
}
