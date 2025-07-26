# Semana 06

## Temas Abordados

- Evaluación de estructuras de control
- Notación Theta (Θ)
- Notación Asintótica Condicional
- Estudio del algoritmo Bubble Sort (pseudocódigo, análisis, código e implementación)

---

## Evaluación de las Estructuras de Control

El análisis de algoritmos comienza con la evaluación del tiempo de ejecución de instrucciones individuales, generalmente limitado por una constante. Este análisis se extiende a estructuras de control, algunas de las cuales son simples de evaluar (como secuencias), mientras que otras (como bucles y condiciones) requieren mayor detalle.

---

### Secuencias de Instrucciones

Cuando varias instrucciones se ejecutan de forma secuencial, el tiempo total se obtiene sumando el tiempo de cada una.

**Fórmula:**

Si una instrucción toma tiempo `T₁` y la siguiente `T₂`, entonces:

```
T = T₁ + T₂
```

---

### Bucle `Para` (For)

El tiempo de ejecución depende del número de repeticiones y del costo de cada una.

**Ejemplo:**

```pascal
para i ← 1 hasta m hacer
    p(i)
```

Si `p(i)` tarda un tiempo constante `C`, entonces el bucle tiene un tiempo de ejecución de:

```
T = m × C = Θ(m)
```

---

### Bucle `Mientras` (While)

Ejecuta un bloque de código mientras una condición sea verdadera. La condición se evalúa **antes** de cada iteración, por lo que si no se cumple al inicio, el cuerpo del bucle no se ejecuta.

**Ejemplo:**

```pascal
mientras i ≤ m hacer
    p(i)
    i ← i + 1
```

La complejidad dependerá de cuántas veces se cumpla la condición.

---

### Bucle `Repetir-Hasta` (Repeat-Until)

Este tipo de bucle asegura que el cuerpo se ejecutará al menos una vez, ya que la condición se evalúa **después** de la iteración.

**Ejemplo:**

```pascal
i ← 0
repetir
    escribir("Iteración ", i)
    i ← i + 1
hasta que (i ≥ 5)
```

En este caso, el bucle se ejecuta 5 veces (de `i = 0` a `i = 4`).

---

## Notaciones Asintóticas

- **Θ(f(n))**: Describe el comportamiento exacto del crecimiento de la función.
- **Notación Asintótica Condicional**: Se usa cuando la complejidad depende de ciertas condiciones que afectan el flujo del algoritmo.

---

## Bubble Sort

- Se analizó el algoritmo paso a paso.
- Se trabajó su pseudocódigo, su implementación y se realizaron pruebas.
- La complejidad en el peor de los casos es:

```
Θ(n²)
```
