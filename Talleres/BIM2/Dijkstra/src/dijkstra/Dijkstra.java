package Dijkstra;
/**
 *
 * @author Alisson Condoy
 */
import java.util.Arrays;

public class Dijkstra {
    private static final int DISTANCIA_INFINITA = Integer.MAX_VALUE;

    public static void calcularCaminosMasCortos(int[][] matrizAdyacencia, int nodoInicial) {
        int numNodos = matrizAdyacencia.length;

        // Arreglo que guarda la distancia más corta desde el nodo inicial hacia cada nodo
        int[] distanciasMinimas = new int[numNodos];

        // Indica qué nodos ya han sido evaluados de forma definitiva
        boolean[] nodosProcesados = new boolean[numNodos];

        // Se asigna infinito a todas las distancias inicialmente
        Arrays.fill(distanciasMinimas, DISTANCIA_INFINITA);

        // El nodo inicial siempre tiene distancia cero hacia sí mismo
        distanciasMinimas[nodoInicial] = 0;

        // Bucle para recorrer todos los nodos y actualizar las rutas más cortas
        for (int i = 0; i < numNodos - 1; i++) {
            // Elegir el nodo con la menor distancia estimada que aún no ha sido procesado
            int nodoActual = encontrarNodoConMenorDistancia(distanciasMinimas, nodosProcesados);

            // Marcar ese nodo como ya visitado
            nodosProcesados[nodoActual] = true;

            // Revisar todos los vecinos del nodo actual para ver si se puede mejorar su distancia
            for (int v = 0; v < numNodos; v++) {
                if (!nodosProcesados[v] && matrizAdyacencia[nodoActual][v] != 0 &&
                        distanciasMinimas[nodoActual] != DISTANCIA_INFINITA &&
                        distanciasMinimas[nodoActual] + matrizAdyacencia[nodoActual][v] < distanciasMinimas[v]) {
                    distanciasMinimas[v] = distanciasMinimas[nodoActual] + matrizAdyacencia[nodoActual][v];
                }
            }
        }

        // Mostrar las distancias más cortas desde el nodo inicial
        mostrarResultados(distanciasMinimas, nodoInicial);
    }

    private static int encontrarNodoConMenorDistancia(int[] distancias, boolean[] procesado) {
        int distanciaMinimaActual = DISTANCIA_INFINITA;
        int indiceNodoMinimo = -1; // -1 indica que aún no se ha encontrado un nodo válido

        for (int i = 0; i < distancias.length; i++) {
            if (!procesado[i] && distancias[i] <= distanciaMinimaActual) {
                distanciaMinimaActual = distancias[i];
                indiceNodoMinimo = i;
            }
        }
        return indiceNodoMinimo;
    }

    private static void mostrarResultados(int[] distancias, int origen) {
        System.out.println("Rutas más cortas desde el nodo " + origen + ":");
        for (int i = 0; i < distancias.length; i++) {
            String distanciaStr = (distancias[i] == DISTANCIA_INFINITA) ? "INF" : String.valueOf(distancias[i]);
            System.out.println("  Hacia el nodo " + i + ": " + distanciaStr);
        }
    }

    public static void main(String[] args) {
        int[][] grafoEjemplo = {
                {0, 2, 0, 4, 0},
                {2, 0, 5, 0, 0},
                {0, 5, 0, 8, 0},
                {4, 0, 8, 0, 3},
                {0, 0, 0, 3, 0}
        };
        calcularCaminosMasCortos(grafoEjemplo, 0);
    }
}

