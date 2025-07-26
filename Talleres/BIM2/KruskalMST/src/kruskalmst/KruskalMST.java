package KruskalMST;
/**
 *
 * @author Alisson Condoy
 */
import java.util.*;

public class KruskalMST {

    static class Arista implements Comparable<Arista> {
        int origen, destino, peso;

        public Arista(int origen, int destino, int peso) {
            this.origen = origen;
            this.destino = destino;
            this.peso = peso;
        }

        public int compareTo(Arista otra) {
            return this.peso - otra.peso;
        }
    }

    // Encuentra el principal del nodo (para saber a qué grupo pertenece)
    static int encontrarPrincipal(int[] principal, int nodo) {
        if (principal[nodo] != nodo)
            principal[nodo] = encontrarPrincipal(principal, principal[nodo]);
        return principal[nodo];
    }

    // Une dos grupos diferentes
    static void unir(int[] principal, int nodo1, int nodo2) {
        int raizA = encontrarPrincipal(principal, nodo1);
        int raizB = encontrarPrincipal(principal, nodo2);
        principal[raizA] = raizB;
    }

    public static void main(String[] args) {

        int nodos = 6;  // Más nodos
        List<Arista> aristas = new ArrayList<>();

        // Definir aristas (origen, destino, peso)
        aristas.add(new Arista(0, 1, 7));
        aristas.add(new Arista(0, 2, 9));
        aristas.add(new Arista(0, 5, 14));
        aristas.add(new Arista(1, 2, 10));
        aristas.add(new Arista(1, 3, 15));
        aristas.add(new Arista(2, 3, 11));
        aristas.add(new Arista(2, 5, 2));
        aristas.add(new Arista(3, 4, 6));
        aristas.add(new Arista(4, 5, 9));

        // Ordenar aristas por peso (de menor a mayor)
        Collections.sort(aristas);

        int[] padre = new int[nodos];
        for (int i = 0; i < nodos; i++) {
            padre[i] = i;  // Cada nodo es su propio grupo al inicio
        }

        int totalMST = 0;
        System.out.println("Pasos del algoritmo Kruskal:");
        for (Arista arista : aristas) {
            int origenRaiz = encontrarPrincipal(padre, arista.origen);
            int destinoRaiz = encontrarPrincipal(padre, arista.destino);

            if (origenRaiz != destinoRaiz) {
                unir(padre, origenRaiz, destinoRaiz);
                totalMST += arista.peso;
                System.out.println("Agregada: (" + arista.origen + " - " + arista.destino + ") peso: " + arista.peso);
            } else {
                System.out.println("Descartada: (" + arista.origen + " - " + arista.destino + ") peso: " + arista.peso + " (forma ciclo)");
            }
        }

        System.out.println("\nPeso total del Árbol de Recubrimiento Mínimo: " + totalMST);
    }
}