# 🚀 Algoritmos de Ordenamiento con Estrategia Divide y Vencerás

---

## 🔍 ¿Qué es la Técnica de Divide y Vencerás?

La estrategia **Divide y Vencerás** se basa en:

1. **Separar** el problema en partes más pequeñas.  
2. **Resolver** cada parte de manera recursiva.  
3. **Unificar** las soluciones individuales en una final.  

Esta técnica es perfecta para problemas que se pueden descomponer en versiones más simples de sí mismos, como ocurre con los algoritmos de **ordenamiento**.

---

## 🧮 Algoritmos de Ordenamiento Basados en Divide y Vencerás

### 🌀 Merge Sort (Ordenamiento por Mezcla)

#### 📘 Explicación

El algoritmo `Merge Sort` fragmenta el arreglo en dos partes iguales, ordena cada mitad de forma recursiva y luego las combina para formar el arreglo ordenado.

**Lógica del algoritmo (basado en las páginas 12–13):**

1. Si el arreglo es pequeño, usar ordenamiento por inserción.  
2. Dividir el arreglo en dos mitades `U` y `V`.  
3. Ordenar `U` y `V` recursivamente.  
4. Fusionar las dos mitades en el arreglo original usando **valores centinela** como `∞`.

#### 💻 Ejemplo en Java

```java
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            arr[k] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }
    }
}
```

📈 **Complejidad Temporal:** `O(n log n)` (ver página 15)

---

## ✅ Beneficios de Merge Sort

- 🔒 Mantiene el orden de elementos duplicados (estable).
- 📦 Muy útil para ordenar archivos grandes o listas enlazadas.

## ⚠️ Inconvenientes

- 🧠 Requiere memoria extra proporcional al tamaño del arreglo (`O(n)`).

---

## ⚡ Quick Sort (Ordenamiento Rápido)

### 📘 Explicación

`Quick Sort` elige un pivote, divide el arreglo en dos secciones (menores y mayores al pivote), y aplica recursión en cada segmento.

**Pasos clave (según página 19):**

1. Para subarreglos pequeños, usar inserción.  
2. Elegir un pivote (por ejemplo, el último valor).  
3. Reorganizar los elementos menores a la izquierda y mayores a la derecha.  
4. Aplicar Quick Sort a ambas secciones.

---

#### 💻 Código Java

```java
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }
}
```

📊 **Complejidad de Quick Sort:**

- 📈 Promedio: `O(n log n)`
- 📉 Peor caso: `O(n²)` si el pivote no es óptimo

---

## 🟢 Pros de Quick Sort

- ⚡ Muy rápido en la mayoría de los casos.
- 🔁 No necesita mucha memoria adicional (`O(log n)`).

## 🔴 Contras

- 🚫 No conserva el orden de elementos iguales.
- 🎯 Depende mucho de una buena elección del pivote.

---

## 📌 Ejemplo Práctico (ver página 22)

Ordenar el siguiente arreglo:

```text
[6, 2, 3, 8, 11, 9, 1, 10, 5, 7, 5, 4, 12]
```

---

## 🧠 Términos Fundamentales

| 🧠 Concepto       | 📝 Explicación                                                  |
|------------------|-----------------------------------------------------------------|
| **División**     | Separar el problema en segmentos más pequeños.                 |
| **Resolución**   | Aplicar la recursión a cada segmento.                          |
| **Combinación**  | En Merge Sort: mezclar. En Quick Sort: reorganizar.            |
| **Rendimiento**  | Ambas técnicas tienen en promedio complejidad `O(n log n)`.    |

---

## 🌟 ¿Por qué usar Divide y Vencerás?

- 📊 **Eficiente:** Apto para grandes volúmenes de datos.  
- 🧬 **Recursivo:** Ideal para problemas naturalmente recursivos.  
- 🔧 **Flexible:** Se adapta a muchos tipos de problemas.  
- 🧼 **Organizado:** Mejora la estructura y claridad del código.

---

## 🧪 Código Interactivo de Prueba

```java
public class OrdenarEjemplo {
    public static void main(String[] args) {
        int[] arreglo = {6, 2, 3, 8, 11, 9, 1, 10, 5, 7, 5, 4, 12};

        System.out.println("Original:");
        for (int num : arreglo) System.out.print(num + " ");

        MergeSort.mergeSort(arreglo, 0, arreglo.length - 1);
        System.out.println("
Merge Sort:");
        for (int num : arreglo) System.out.print(num + " ");

        arreglo = new int[]{6, 2, 3, 8, 11, 9, 1, 10, 5, 7, 5, 4, 12};
        QuickSort.quickSort(arreglo, 0, arreglo.length - 1);
        System.out.println("
Quick Sort:");
        for (int num : arreglo) System.out.print(num + " ");
    }
}
```

🎯 **Sugerencia:** Ejecuta este código y analiza paso a paso cómo ambos algoritmos trabajan internamente.

---

## 🏁 Conclusión Final

Los algoritmos **Merge Sort** y **Quick Sort** son dos pilares fundamentales del ordenamiento eficiente y se apoyan en la técnica **Divide y Vencerás** para resolver el problema de manera estructurada y escalable.

| 🔢 Algoritmo    | 🔗 Estabilidad   | 🧠 Rendimiento Teórico                          | 📦 Memoria Adicional |
|----------------|------------------|------------------------------------------------|----------------------|
| Merge Sort     | ✅ Sí             | `O(n log n)` en todos los casos                | `O(n)`               |
| Quick Sort     | ❌ No             | `O(n log n)` promedio / `O(n²)` peor escenario | `O(log n)`           |

📝 **Resumen:**  
- **Merge Sort** es más predecible y seguro.  
- **Quick Sort** es más rápido en general, pero sensible al pivote.

---
