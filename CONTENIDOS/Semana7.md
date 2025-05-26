# Semana 07

## Temas Abordados

- Recurrencias
- Suposiciones Inteligentes (Método de Sustitución)

---

## Recurrencias

Una **recurrencia** es una expresión que define una función usando versiones más pequeñas de sí misma. Son especialmente útiles para describir el tiempo de ejecución de algoritmos recursivos.

Por ejemplo, el factorial de `n` se puede representar así:

```math
n! = n \cdot (n - 1)!
```

Las **ecuaciones de recurrencia** son esenciales para determinar la **complejidad asintótica** de algoritmos que usan recursión.

---

## Resolución de Recurrencias

Resolver una recurrencia implica encontrar una versión cerrada (no recursiva) de la función original.

### Técnicas más comunes:

---

### Método de Sustitución (Suposiciones Inteligentes)

Este método sigue los pasos:

1. Calcular manualmente los primeros casos.
2. Observar patrones o tendencias.
3. Proponer una solución tentativa (hipótesis).
4. Validar la hipótesis usando **inducción matemática**.

---

### Ecuación Característica

- Aplicable a recurrencias lineales homogéneas con coeficientes constantes.
- Se transforma la recurrencia en una ecuación polinómica.
- Las **raíces** del polinomio proporcionan la forma general de la solución.

---

### Método del Árbol de Recursión

- Se representa la ejecución como un árbol de llamadas recursivas.
- Se calcula el costo total sumando los costos por nivel.

---

### Teorema Maestro

Este teorema permite resolver recurrencias de la forma:

```math
T(n) = a \cdot T(n/b) + f(n)
```

Es especialmente útil en algoritmos de tipo **Divide y Vencerás**, como Merge Sort y QuickSort.
