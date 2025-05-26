
# Semana 04 - Análisis de Algoritmos

## Contenidos Abordados
- Análisis Asintótico
- Comportamiento de Crecimiento de Algoritmos
- Clasificación de Complejidades con Ejemplos en Java

---

## Análisis Asintótico

El **análisis asintótico** se utiliza para expresar el rendimiento de un algoritmo en función del tamaño de la entrada. Este enfoque permite evaluar la eficiencia ignorando detalles específicos del entorno de ejecución, como el hardware o el lenguaje utilizado.

Por ejemplo, si una función requiere `3n + 5` pasos para completarse, se dice que tiene una complejidad **O(n)**, enfocándose solo en el término dominante.

---

## Comportamiento de Crecimiento

La **tasa de crecimiento** indica cómo aumenta la demanda de recursos (tiempo o espacio) a medida que se incrementa el tamaño de la entrada `n`. Esta medida permite:

- Prever el rendimiento con grandes cantidades de datos.
- Comparar algoritmos de manera objetiva.
- Elegir soluciones eficientes para diferentes contextos.

---

## Comparación de Crecimientos

| Tamaño n | O(log n) | O(n)   | O(n²)      |
|----------|----------|--------|------------|
| 10       | 3        | 10     | 100        |
| 100      | 7        | 100    | 10,000     |
| 1000     | 10       | 1000   | 1,000,000  |

Cuanto menor es el crecimiento, mejor se comporta el algoritmo con entradas grandes.

---

## Complejidades Más Frecuentes

| Tipo de Complejidad   | Notación  | Ejemplo Típico                    |
|-----------------------|-----------|-----------------------------------|
| Constante             | O(1)      | Acceso directo a una posición     |
| Logarítmica           | O(log n)  | Búsqueda binaria                  |
| Lineal                | O(n)      | Iteración simple sobre una lista  |
| Lineal-logarítmica    | O(n log n)| Algoritmos de ordenamiento rápido |
| Cuadrática            | O(n²)     | Ordenamiento burbuja              |
| Cúbica                | O(n³)     | Multiplicación de matrices        |
| Exponencial           | O(2ⁿ)     | Soluciones de problemas complejos |
| Factorial             | O(n!)     | Generación de permutaciones       |

---

## Código en Java: Ejemplo de Complejidad

### Recorrido Lineal – O(n)

```java
public boolean contieneElemento(int[] datos, int valor) {
    for (int item : datos) {
        if (item == valor) {
            return true;
        }
    }
    return false;
}
```
