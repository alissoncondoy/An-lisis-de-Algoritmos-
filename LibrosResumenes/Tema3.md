# Capítulo 2: Getting Started
*(Cormen et al., 2022)*

## 2.1 Insertion Sort

### Descripción del algoritmo:
- **ciona construyendo gradualmente una lista ordenada, insertando un elemento a la vez en la posición correcta.

### Funcionamiento básico:
1. Se toma el segundo elemento y se compara con el primero, insertándolo en el lugar adecuado.
2. Luego se toma el tercer elemento y se inserta en el lugar correcto entre los dos anteriores.
3. Este proceso se repite hasta que toda la lista está ordenada.

### Pseudocódigo:
```text
for j = 2 to A.length
    key = A[j]
    i = j - 1
    while i > 0 and A[i] > key
        A[i + 1] = A[i]
        i = i - 1
    A[i + 1] = key
```

## 2.2 Analyzing Algorithms

### ¿Por qué analizar algoritmos?
- Para entender su eficiencia en términos de recursos consumidos, principalmente **tiempo** y **espacio**.
- Para comparar algoritmos y seleccionar el más adecuado para una situación particular.

### Modelo de computación:
- Se asume una **máquina de acceso aleatorio** donde cada operación básica toma tiempo constante.

### Medida del rendimiento:
- Se mide el **número de operaciones básicas** que el algoritmo realiza en función del tamaño de entrada \( n \).

### Tipos de análisis:
- **Peor caso (Worst-case):**  
  Garantiza que el algoritmo no será más lento que un límite superior determinado.

- **Caso promedio (Average-case):**  
  Calcula el tiempo esperado de ejecución considerando todas las entradas posibles.

- **Mejor caso (Best-case):**  
  Describe el comportamiento del algoritmo en las situaciones más favorables.

### Notaciones utilizadas:
- **\( O \) (O-Grande):** Cota superior asintótica.
- **\( \Theta \) (Theta):** Cota ajustada (límites superior e inferior).
- **\( \Omega \) (Omega):** Cota inferior asintótica.

### Importancia de la notación \( O \)-Grande:
- Se enfoca en el comportamiento para entradas grandes, ignorando constantes y términos de menor grado.Insertion sort** es un algoritmo simple y natural, similar a cómo las personas ordenan cartas en la mano.
