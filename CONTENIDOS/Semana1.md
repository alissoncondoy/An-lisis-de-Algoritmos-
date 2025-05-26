# Algorítmica Elemental

La **algorítmica elemental** se ocupa del desarrollo de algoritmos sencillos que permiten resolver problemas básicos. Su finalidad es construir secuencias lógicas de instrucciones usando herramientas fundamentales, lo cual forma parte esencial del pensamiento computacional.

---

## Componentes Fundamentales de la Algorítmica Elemental

### Tipos de datos fundamentales:
- **Números**: enteros, reales
- **Caracteres**: letras, símbolos
- **Booleanos**: verdadero o falso

### Operaciones esenciales:
- **Aritméticas**: suma, resta, multiplicación, división
- **Comparaciones**: mayor que, menor que, igual
- **Asignación**: asignación de valores a variables

### Estructuras de control:
- **Secuencia**: instrucciones ejecutadas en orden lineal
- **Condicionales**: decisiones mediante `if`, `else`
- **Repeticiones**: ciclos como `for`, `while`

### Manejo de entrada y salida:
- Capturar datos del usuario o desde archivos
- Mostrar información o resultados al usuario

### Técnicas de diseño de algoritmos:
- Uso de **pseudocódigo** para representar soluciones
- **Diagramas de flujo** para visualizar procesos

---

## Algoritmos de Multiplicación

### 1. Método Tradicional o Americano
Conocido como el algoritmo común de la escuela, sigue el procedimiento de multiplicar cada cifra del número inferior por cada cifra del número superior y sumar los resultados parciales.

```
   123
 ×  45
 ------
   615     ← 123 × 5
+ 4920     ← 123 × 40
 ------
  5535
```

---

### 2. Método Inglés o por Descomposición
Esta técnica se basa en descomponer los factores en unidades, decenas, etc., y multiplicar cada combinación, facilitando la comprensión del proceso.

```
23 × 14 = (20 + 3) × (10 + 4)

= (20×10) + (20×4) + (3×10) + (3×4)
= 200 + 80 + 30 + 12
= 322
```

---

### 3. Multiplicación Rusa (Método del Campesino Ruso)
Antiguo método basado en dividir el primer número entre 2 (descartando pares) y duplicar el segundo, sumando los valores correspondientes a líneas impares.

```
   18   25
    9   50     ← impar → se suma
    4  100     ← par → se descarta
    2  200     ← par → se descarta
    1  400     ← impar → se suma
--------------------
Total = 50 + 400 = 450
```
