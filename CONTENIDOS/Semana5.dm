
# Semana 05 – Análisis de Complejidad

## Contenido Principal

- Definición y uso de la notación Θ (Theta)
- Introducción a la notación Ω (Omega)
- Concepto de notación O (Big O)
- Análisis asintótico bajo condiciones especiales
- Aplicación de límites para comparar funciones

---

## Theta (Θ): Cota Ajustada

La notación **Theta** indica que una función de complejidad crece dentro de **dos límites**, uno superior y uno inferior, definidos por otra función `g(n)`. En otras palabras, `f(n)` crece aproximadamente al mismo ritmo que `g(n)` para valores grandes de `n`.

**Usos frecuentes**: Ideal para describir algoritmos donde el **mejor y peor caso** tienen la **misma magnitud asintótica**.

### Ejemplos comunes:

- `Θ(1)`: Tiempo constante, como acceder a un valor específico en una lista.
- `Θ(n)`: Tiempo lineal, como iterar sobre todos los elementos de un arreglo.
- `Θ(n log n)`: Algoritmos eficientes de ordenamiento como Merge Sort.
- `Θ(n²)`: Ordenamientos menos eficientes como Bubble Sort.

---

## Omega (Ω): Cota Inferior

La notación **Omega** se usa para representar un **límite inferior** del tiempo de ejecución. Indica el **mínimo esfuerzo computacional** requerido por un algoritmo, usualmente asociado al **mejor caso posible**.

---

## O Grande: Cota Superior

La notación **O** (Big O) establece una **cota superior**, lo que significa que la función de complejidad no superará a `g(n)` por más que aumente `n`.

**Aplicación común**: Representar el **peor escenario** de desempeño de un algoritmo.

---

## Análisis Asintótico Bajo Condiciones

En ciertas situaciones, los algoritmos pueden **cambiar su complejidad** dependiendo de la naturaleza de los datos de entrada. Este análisis permite reflejar esas variaciones.

### Ejemplo práctico:

- Un algoritmo con **O(n²)** podría comportarse como **O(n)** si se ejecuta con datos **casi ordenados**.

Esto permite modelar casos reales donde el comportamiento promedio puede diferir del caso teórico peor.

---

## Comparación de Crecimientos con Límites

La relación entre funciones puede analizarse usando **límites**. Dependiendo del valor del límite entre `f(n)/g(n)`, se establecen las relaciones entre notaciones.

---

### Caso 1: Límite finito y positivo

Si:

```
lim (n → ∞) [f(n)/g(n)] = c,  donde c ∈ ℝ⁺
```

Entonces:

- `f(n) ∈ O(g(n))`
- `f(n) ∈ Ω(g(n))`
- `f(n) ∈ Θ(g(n))`
- `g(n) ∈ O(f(n))`
- `g(n) ∈ Ω(f(n))`
- `g(n) ∈ Θ(f(n))`

Ambas funciones crecen a una razón constante entre sí.

---

### Caso 2: Límite tiende a infinito

Si:

```
lim (n → ∞) [f(n)/g(n)] = ∞
```

Entonces:

- `f(n) ∉ O(g(n))`
- `f(n) ∈ Ω(g(n))`
- `f(n) ∉ Θ(g(n))`
- `g(n) ∈ O(f(n))`
- `g(n) ∉ Ω(f(n))`
- `g(n) ∉ Θ(f(n))`

La función `f(n)` domina completamente a `g(n)` en crecimiento.

---

### Caso 3: Límite tiende a cero

Si:

```
lim (n → ∞) [f(n)/g(n)] = 0
```

Entonces:

- `f(n) ∈ O(g(n))`
- `f(n) ∉ Ω(g(n))`
- `f(n) ∉ Θ(g(n))`
- `g(n) ∉ O(f(n))`
- `g(n) ∈ Ω(f(n))`
- `g(n) ∉ Θ(f(n))`

Aquí `g(n)` es más dominante; crece mucho más rápido que `f(n)`.

---
