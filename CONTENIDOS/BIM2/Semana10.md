# 🧩 Unidad 4: Algoritmos Voraces

## 🎯 Propósito

Analizar el uso de **estrategias voraces** en la resolución de problemas de optimización, particularmente en estructuras como **grafos dirigidos y no dirigidos**. La meta es comprender cómo estos algoritmos construyen soluciones eficientes, aunque no siempre perfectas.

---

## ⚙️ ¿En qué consisten los algoritmos voraces?

Los **algoritmos greedy** abordan los problemas de forma secuencial, eligiendo en cada paso la opción que parece más prometedora en ese instante, sin retroceder ni revisar decisiones anteriores.

### ✨ Principales características

- Son rápidos de ejecutar y relativamente simples de desarrollar.
- Adecuados para problemas donde se busca minimizar o maximizar recursos.
- No siempre encuentran la mejor solución global.
- Basan sus decisiones en **criterios locales óptimos**.

---

## 👍 Puntos fuertes y 👎 limitaciones

| Ventajas 🟢                        | Desventajas 🔴                                                               |
|-----------------------------------|------------------------------------------------------------------------------|
| Simples de implementar            | No siempre conducen a la mejor solución global                              |
| Generan respuestas rápidamente    | No todos los problemas se prestan a este enfoque                            |
| En algunos casos sí son óptimos  | Requieren definir una función de selección adecuada                         |

---

## 💰 Ejemplo ilustrativo: Problema del vuelto

Consiste en devolver una cantidad usando la **menor cantidad de monedas** posible.  
🔄 En cada paso, se selecciona la moneda de mayor valor que no sobrepase el saldo restante.

Este enfoque funciona bien con monedas de **denominaciones compatibles** (por ejemplo, 1, 5, 10, 25), pero puede fallar en otros sistemas.

---

## 🌐 Grafos y árboles generadores mínimos

### 🌲 ¿Qué es un MST?

Un **árbol generador mínimo** (MST por sus siglas en inglés) es una subestructura de un grafo no dirigido que:

- Conecta todos los vértices.
- Minimiza el costo total de las conexiones (suma de pesos).
- No contiene ciclos.

#### 🧰 Aplicaciones prácticas

- Diseño de redes eléctricas o de internet.
- Infraestructura de transporte.
- Optimización de rutas de distribución.

---

## 🔧 Algoritmos tradicionales para encontrar MST

### 🧵 Método de Kruskal

Pasos:

1. Ordenar las aristas del grafo por peso de menor a mayor.
2. Ir agregando las aristas más baratas que **no formen ciclos**.
3. Detenerse cuando se conecten todos los nodos.

🧩 Requiere una estructura tipo **Union-Find** para manejar conjuntos de nodos conectados.

---

### 🪢 Método de Prim

Pasos:

1. Comenzar desde cualquier nodo del grafo.
2. En cada paso, añadir la arista más económica que conecte el árbol con un nodo externo.
3. Repetir hasta abarcar todos los vértices.

📌 Este algoritmo utiliza una **estructura de prioridad mínima** (min-heap) para seleccionar eficientemente las aristas más baratas.

---

## 🧭 Grafos dirigidos: Definición y estructura

Un **grafo dirigido** \( G = (V, A) \) está compuesto por:

- **V**: conjunto de nodos o vértices.
- **A**: conjunto de arcos con dirección definida.

Cada arco \((u, v)\) conecta un nodo origen `u` con un nodo destino `v`.  
🔁 **Importante**: Si hay un arco de `u → v`, no implica que exista también `v → u`.

Este tipo de grafo se usa, por ejemplo, en redes de flujo, diagramas de dependencias, o mapas de navegación.

---

## 🚦 Caminos más cortos en grafos dirigidos

### 🎯 Meta del problema

Determinar la ruta de **menor coste** desde un nodo inicial (fuente) hacia todos los demás nodos del grafo.

### ⚡ Algoritmo de Dijkstra

Aplicable únicamente si **todos los pesos son positivos**.

Pasos generales:

1. Establecer la distancia inicial de todos los nodos como ∞, excepto el nodo fuente (0).
2. Usar una **cola de prioridad** para organizar los nodos por su distancia mínima conocida.
3. Mientras la cola tenga elementos:
   - Extraer el nodo con la distancia más baja.
   - Para cada nodo vecino aún no procesado:
     - Si la distancia al vecino puede reducirse pasando por el nodo actual:
       - Actualizar la distancia.
       - Insertar el vecino en la cola de prioridad.

#### 🔣 Pseudocódigo 

```python
distancia[] = infinito para todos los nodos
distancia[origen] = 0
cola = prioridad (origen)

mientras cola no esté vacía:
    nodo_actual = extraer mínimo de cola
    para cada vecino de nodo_actual:
        si distancia[nodo_actual] + peso < distancia[vecino]:
            distancia[vecino] = distancia[nodo_actual] + peso
            agregar vecino a la cola
