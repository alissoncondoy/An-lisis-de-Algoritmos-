# 📗 Algoritmos Voraces y Estructuras de Grafos

Este repositorio ofrece una guía detallada y comprensible sobre los **algoritmos voraces** y su aplicación práctica en **estructuras de grafos**, con enfoque en el **algoritmo de Kruskal**, **árboles de expansión mínima**, **rutas óptimas**, entre otros temas relevantes.

---

## 🧠 ¿Qué son los Algoritmos Voraces?

Los **algoritmos greedy** resuelven problemas mediante decisiones locales óptimas en cada paso, sin analizar exhaustivamente el efecto de esas elecciones en el futuro.

### 🧭 Estrategia General

1. Se inicia con una solución vacía o parcial.  
2. En cada iteración, se elige la alternativa que parece más prometedora en ese momento.  
3. No se retrocede ni se reconsideran elecciones pasadas.

### ✅ Fortalezas

- **Código sencillo y claro.**
- **Velocidad de ejecución**: suelen ser más rápidos que técnicas como programación dinámica o búsqueda exhaustiva.
- Ideales en situaciones donde se busca una **solución eficiente y aproximada**.

### ❌ Limitaciones

- No siempre encuentran la mejor solución global.
- Sufren de **visión de corto plazo** (no anticipan consecuencias).
- Son adecuados **solo si** el problema cumple:
  - **Principio de subestructura óptima**.
  - **Elección local óptima produce solución global óptima.**

### 💡 Casos típicos

- Construcción de árboles mínimos: **Kruskal**, **Prim**.  
- Búsqueda de caminos más cortos: **Dijkstra**.  
- Problemas como el **cambio de monedas** (cuando las denominaciones son favorables).

---

## 🌿 Árboles de Expansión Mínima (Minimum Spanning Tree)

Un **árbol de expansión mínima (MST)** es un subconjunto de aristas que une todos los vértices de un grafo conectado sin formar ciclos, con el menor costo total posible.

### 🔍 Características

- Une todos los nodos del grafo con **la menor suma de pesos posibles**.
- Contiene exactamente _n - 1_ conexiones si el grafo tiene _n_ vértices.
- Puede haber múltiples MSTs si hay aristas de igual peso.

---

## 🌐 ¿Qué es un Grafo?

Un **grafo** es una estructura matemática compuesta por:

- Un conjunto de **nodos o vértices (V)**.
- Un conjunto de **conexiones o aristas (E)** que unen pares de vértices.

### 🔄 Clasificación

- **Conectado**: todos los vértices están enlazados directa o indirectamente.  
- **Desconectado**: algunos vértices quedan aislados.  
- **Dirigido**: las conexiones tienen dirección (→).  
- **No dirigido**: las conexiones son bidireccionales (—).

### 🧭 Usos comunes

- Rutas en mapas y GPS.  
- Redes sociales y de telecomunicaciones.  
- Representación de circuitos y flujos de datos.

---

## 🛤️ Rutas y Caminos

Un **camino** en un grafo es una secuencia de nodos enlazados por aristas.

- **Camino simple**: sin nodos repetidos.  
- **Caminos con ciclos**: pueden repetir vértices.  
- La **distancia** puede medirse en número de aristas o suma de pesos (si está ponderado).

### 🔧 Aplicaciones

- Navegación y logística.  
- Juegos con laberintos o mapas.  
- Inteligencia artificial (búsqueda de soluciones óptimas).

---

## 🌳 Estructura de Árbol

Un **árbol** es un tipo especial de grafo **sin ciclos** y **conectado**.

### 🛠 Propiedades esenciales

- Hay exactamente **un único camino** entre cualquier par de nodos.
- Un árbol con _n_ nodos siempre tiene _n - 1_ aristas.
- Si se elimina una arista, el árbol se divide en dos componentes desconectados.

### 🌱 Tipos

- **Árbol con raíz**: tiene un nodo base principal.  
- **Árbol binario**, **AVL**, entre otros (dependiendo de su forma y balance).

---

## ⚖️ Grafos con Pesos (Grafos Ponderados)

Los **grafos ponderados** asignan un valor o costo a cada conexión (arista), lo cual representa distancia, tiempo, costo, etc.

### 🧾 Representación típica: Matriz de Costos

|     | A | B | C |
|-----|---|---|---|
| A   | 0 | 5 | ∞ |
| B   | 5 | 0 | 2 |
| C   | ∞ | 2 | 0 |

- El símbolo `∞` indica que **no existe conexión directa**.
- Las posiciones indican el **costo de ir de un nodo a otro**.

---

## 🚦 Caminos Más Cortos

El objetivo es determinar la ruta de **menor coste total** entre dos vértices de un grafo ponderado.

### 📌 Métodos más conocidos

- **Dijkstra**: ideal cuando todos los pesos son positivos.  
- **Bellman-Ford**: soporta pesos negativos.  
- **A\***: combina búsqueda voraz con heurística estimativa.

---

## 🧮 Algoritmo de Kruskal (para MST)

### 📝 Idea General

El algoritmo de **Kruskal** es una técnica **voraz** para encontrar el **árbol de expansión mínima** de un grafo **no dirigido y con pesos**.

### 🔄 Pasos del proceso

1. Inicializar cada vértice como un conjunto independiente.  
2. Ordenar las aristas del grafo por peso (de menor a mayor).  
3. Recorrer las aristas ordenadas:  
   - Si los vértices unidos por una arista están en **conjuntos diferentes**, se añade la arista al MST y se **fusionan** los conjuntos.  
4. Se detiene al conectar todos los vértices (_n - 1_ aristas).

### 🧾 Pseudocódigo

```plaintext
KRUSKAL(Grafo G):
    MST ← ∅
    Para cada nodo v en G:
        Crear conjunto {v}
    Ordenar aristas por peso ascendente
    Para cada arista (u, v) en el orden:
        Si u y v están en conjuntos distintos:
            Agregar (u, v) a MST
            Unir conjuntos de u y v
    Retornar MST
