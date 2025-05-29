# Capítulo 2: Algoritmia elemental
*Fundamentos de algoritmia – G. Brassard & P. Bratley*

## Introducción
Este capítulo introduce los conceptos fundamentales de la algoritmia, proporcionando las herramientas necesarias para el diseño y análisis de algoritmos eficientes. Se enfoca en la comprensión de los principios básicos que subyacen en la construcción de algoritmos y su aplicación en la resolución de problemas computacionales.

## Contenido principal

### 1. Definición de algoritmo
Un **algoritmo** es un conjunto finito de instrucciones bien definidas que, dadas unas entradas, producen una salida mediante un proceso determinístico. Son esenciales para resolver problemas computacionales de manera sistemática y sin ambigüedades.

### 2. Representación de algoritmos
Se presentan diversas formas de describir algoritmos, incluyendo:
- **Lenguaje natural**: Descripciones en lenguaje humano, útiles para una comprensión general.
- **Pseudocódigo**: Representación estructurada que combina elementos de lenguajes de programación y lenguaje natural, facilitando la transición a una implementación concreta.
- **Diagramas de flujo**: Representaciones gráficas que muestran el flujo de control entre las diferentes operaciones del algoritmo.

### 3. Técnicas básicas de diseño de algoritmos
Se introducen las técnicas fundamentales para el diseño de algoritmos:
- **Divide y vencerás**: Dividir el problema en subproblemas más pequeños, resolverlos de forma recursiva y combinar sus soluciones.
- **Algoritmos voraces (greedy)**: Tomar decisiones óptimas locales con la esperanza de encontrar una solución global óptima.
- **Programación dinámica**: Resolver subproblemas y almacenar sus soluciones para evitar cálculos redundantes.
- **Backtracking y ramificación y poda**: Explorar todas las posibles soluciones de manera sistemática, descartando aquellas que no cumplen con los criterios del problema.

### 4. Análisis de algoritmos
Se enfatiza la importancia de evaluar la eficiencia de los algoritmos en términos de:
- **Complejidad temporal**: Tiempo requerido para ejecutar el algoritmo en función del tamaño de la entrada.
- **Complejidad espacial**: Cantidad de memoria adicional necesaria durante la ejecución del algoritmo.

Se introducen las notaciones asintóticas para describir el comportamiento de los algoritmos:
- **O (O-grande)**: Cota superior del crecimiento del tiempo o espacio.
- **Ω (Omega)**: Cota inferior del crecimiento.
- **Θ (Theta)**: Cota ajustada que indica un crecimiento exacto.

### 5. Ejemplos ilustrativos
El capítulo proporciona ejemplos prácticos para ilustrar los conceptos presentados, como:
- **Multiplicación de enteros**: Comparación entre el método clásico y el algoritmo de multiplicación "a la rusa", destacando diferencias en eficiencia y enfoque.
- **Ordenamiento de listas**: Implementación de algoritmos de ordenamiento simples para demostrar técnicas de diseño y análisis.

---

# 2.3 Designing Algorithms

## Introducción
Diseñar algoritmos implica desarrollar procedimientos eficientes para resolver problemas computacionales. Esta sección introduce técnicas fundamentales para la creación de algoritmos efectivos.

## Métodos de diseño de algoritmos

### 1. Diseño incremental
- **Descripción**: Construye la solución paso a paso, añadiendo elementos y manteniendo la propiedad deseada en cada paso.
- **Ejemplo**: *Insertion Sort*, donde se inserta cada elemento en su posición correcta dentro de una lista ya ordenada.

### 2. Divide y vencerás
- **Descripción**: Divide el problema en subproblemas más pequeños, resuélvelos de forma recursiva y combina sus soluciones para obtener la solución del problema original.
- **Ejemplo**: *Merge Sort*, que divide una lista en mitades, ordena cada mitad y luego las combina.

## Consideraciones clave en el diseño de algoritmos
- **Correctitud**: El algoritmo debe producir resultados correctos para todas las entradas válidas.
- **Eficiencia**: El algoritmo debe hacer un uso óptimo de los recursos computacionales, como tiempo y espacio.
- **Simplicidad**: Un diseño claro y comprensible facilita la implementación y el mantenimiento.
- **Escalabilidad**: El algoritmo debe mantener un rendimiento aceptable a medida que aumenta el tamaño de la entrada.
