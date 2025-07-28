
# 🧮 Unidad 5: Algoritmos "Divide y Vencerás"

## ✨ Concepto General

La estrategia **Divide y Vencerás** consiste en dividir un problema complejo en partes más pequeñas, resolverlas de manera recursiva y luego combinar dichas soluciones para obtener el resultado final.

---

## 🔎 1. Búsqueda Binaria

Técnica eficiente para localizar un elemento en un **arreglo ordenado**.

### 🧠 Lógica del Algoritmo

1. Comparar el valor buscado con el elemento central del arreglo.
2. Si coinciden, retornar la posición.
3. Si el valor es menor, buscar en la mitad izquierda.
4. Si el valor es mayor, buscar en la mitad derecha.

📉 **Complejidad:** `O(log n)`

---

### 💻 Código Java

```java
public class BusquedaBinaria {
    public static int buscar(int[] arreglo, int objetivo) {
        int inicio = 0, fin = arreglo.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (arreglo[medio] == objetivo) {
                return medio;
            } else if (arreglo[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1; // No encontrado
    }
}
```

---

### 🔢 Ejemplo de Ejecución

Supongamos el arreglo:

```java
int[] datos = {2, 4, 6, 8, 10, 12, 14, 16, 18};
int objetivo = 10;
```

Llamada:

```java
int posicion = BusquedaBinaria.buscar(datos, 10);
System.out.println("Posición: " + posicion);
```

**Salida esperada:**

```
Posición: 4
```

---

## 🔄 2. Métodos de Ordenación

### 🧬 Merge Sort (Ordenamiento por Mezcla)

Divide el arreglo en dos partes, las ordena de forma recursiva y luego las fusiona.

#### 🧠 Lógica del Algoritmo

1. Si el arreglo es pequeño, ordenar directamente.
2. Separar en dos subarreglos (`izquierda`, `derecha`).
3. Ordenar recursivamente ambos.
4. Unir los resultados en un solo arreglo ordenado.

📊 **Eficiencia promedio:** `O(n log n)`

#### 🔧 Etapa de Fusión

- Se comparan los elementos más pequeños de cada subarreglo.
- Se puede usar un valor **centinela** (por ejemplo, ∞) para facilitar la comparación y fusión.

---

### ⚙️ QuickSort (Ordenamiento Rápido)

Reorganiza los datos usando un **pivote**, posicionando los valores menores a la izquierda y los mayores a la derecha.

#### 🧠 Lógica del Algoritmo

1. Para arreglos pequeños, aplicar ordenamiento directo (ej. inserción).
2. Elegir un **pivote**.
3. Reorganizar:
   - Menores al pivote ➡️ a la izquierda.
   - Mayores al pivote ➡️ a la derecha.
4. Aplicar **recursivamente** QuickSort sobre los subconjuntos.

📈 **Complejidad Promedio:** `O(n log n)`  
🚨 **Peor Caso:** `O(n²)` si el pivote no es el adecuado (por ejemplo, el mayor o menor elemento).

#### 🔢 Ejemplo

Ordenar el siguiente arreglo:  
`[6, 2, 3, 8, 11, 9, 1, 10, 5, 7, 5, 4, 12]`

---

## 🎯 3. Cálculo de la Mediana

La **mediana** de un conjunto se puede encontrar eficientemente mediante una versión modificada del algoritmo de **QuickSort**.

### 🧩 Proceso para Hallar la Mediana

1. Elegir un **pivote** cercano al valor medio.
2. Realizar la **partición** del arreglo.
3. Evaluar si la **posición del pivote** coincide con la de la mediana:
   - Si sí, se ha encontrado.
   - Si no, repetir el proceso en la mitad correspondiente.

📘 Referencia sugerida: **Página 24 del material base**

---

## ✖️ 4. Multiplicación de Matrices

Cálculo clásico de la multiplicación entre dos matrices cuadradas de tamaño `n x n`.

### 💻 Código Java

```java
public static void multiplicar(int[][] a, int[][] b, int[][] c) {
    int n = a.length;
    // Inicialización de la matriz resultado en 0
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            c[i][j] = 0;
        }
    }
    // Realizar la multiplicación
    for (int k = 0; k < n; k++) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] += a[i][k] * b[k][j];
            }
        }
    }
}
```

---

## 📊 Resumen Comparativo

| Tema                  | Técnica Principal    | Complejidad       | Aplicación típica           |
|-----------------------|----------------------|-------------------|-----------------------------|
| Búsqueda Binaria      | División en mitades  | O(log n)          | Arreglos ordenados          |
| Merge Sort            | Recursión + Fusión   | O(n log n)        | Ordenamiento estable        |
| QuickSort             | Pivote + Partición   | O(n log n) promedio / O(n²) peor caso | Ordenamiento rápido |
| Mediana               | Selección por pivote | O(n)              | Estadística de datos        |
| Multiplicación Matriz | Producto anidado     | O(n³)             | Matemática computacional    |

---

> 📌 *La técnica Divide y Vencerás permite enfrentar problemas grandes de forma eficiente, dividiendo y resolviendo por partes. Es esencial en algoritmos de búsqueda, ordenamiento y operaciones numéricas.*
