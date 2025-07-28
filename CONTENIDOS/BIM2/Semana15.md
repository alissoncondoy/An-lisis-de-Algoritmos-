
# 🎯 ¿Qué es un Algoritmo de Monte Carlo?

Un algoritmo **Monte Carlo** es un procedimiento **probabilístico** que utiliza **simulaciones estocásticas** para obtener **estimaciones aproximadas** en problemas complicados. Permite aceptar un pequeño margen de error (Págs. 9, 12).

## 🧩 Principios fundamentales

1. Generar valores mediante números **pseudoaleatorios**.  
2. Ejecutar múltiples **iteraciones** o simulaciones.  
3. Calcular una **estimación** a partir de los resultados acumulados.

---

## 🎲 Ejemplo Clásico: Estimar π

Una forma clásica de aplicar Monte Carlo para estimar π consiste en:
- Generar puntos uniformemente dentro de un cuadrado.
- Contar cuántos caen dentro del círculo inscrito.
- Usar la proporción para estimar π multiplicando por 4.

### 📄 Código de ejemplo (Java)

```java
public class MonteCarloPi {
    public static void main(String[] args) {
        int dentro = 0, total = 100000;
        for (int i = 0; i < total; i++) {
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y <= 1) dentro++;
        }
        double pi = 4.0 * dentro / total;
        System.out.println("PI estimado: " + pi);
    }
}
```

### 📝 Descripción

Se generan `total` puntos dentro de un cuadrado de 1×1. La proporción que cae dentro del círculo de radio 1 se multiplica por 4 para aproximar π. A mayor número de puntos, mejor precisión.

---

## 🌍 Aplicaciones Comunes

Los algoritmos Monte Carlo son útiles en varios dominios:

- 💼 **Finanzas**: evaluación de riesgos y precios de derivados.  
- 📐 **Integración numérica**: cálculo de áreas bajo curvas difíciles.  
- 🔬 **Física computacional**: simulación de sistemas con muchas partículas.  
- 🎮 **Simulaciones**: modelado de escenarios aleatorios en juegos.  
- 🧬 **Biología**: análisis de poblaciones y procesos genéticos.  
- 📊 **Probabilidades**: estimación en sistemas complejos.

---

## ⚖️ Ventajas vs Desventajas

| ✅ Ventajas                                  | ❌ Desventajas                                |
|---------------------------------------------|----------------------------------------------|
| Fácil de implementar y entender.             | No garantiza exactitud (Pág. 9).             |
| Escalable a alta dimensionalidad.            | Requiere muchas iteraciones para precisión.  |
| Útil sin soluciones analíticas directas.     | Depende de buena calidad en pseudoaleatoriedad (Pág. 14). |
| Rápido para aproximaciones iniciales.        |                                              |

---

## 🔢 Generación de Números Pseudoaleatorios

Monte Carlo depende de números generados por métodos **determinísticos**, como el **método congruencial lineal** (Págs. 14, 17–18).

### 🧪 Taller sugerido (Págs. 17–18)

- Parámetros: `α = 1664525`, `c = 1013804223`, `m = 2^32`, con semilla fija.  
- Generar 100 números en [0,1) y analizar su frecuencia en intervalos:  
  - [0,0.2), [0.2,0.4), [0.4,0.6), [0.6,0.8), [0.8,1.0)

### 💻 Código de ejemplo (Java)

```java
public class GeneradorPseudoaleatorio {
    public static void main(String[] args) {
        long semilla = 12345;
        int cantidad = 100;
        double[] numeros = generarPseudoaleatorios(semilla, cantidad);
        System.out.println("Primeros 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
        int[] intervalos = new int[5];
        for (double num : numeros) {
            if (num < 0.2) intervalos[0]++;
            else if (num < 0.4) intervalos[1]++;
            else if (num < 0.6) intervalos[2]++;
            else if (num < 0.8) intervalos[3]++;
            else intervalos[4]++;
        }
        System.out.println("Distribución en intervalos:");
        for (int i = 0; i < 5; i++) {
            System.out.println("[" + (i*0.2) + ", " + ((i+1)*0.2) + "): " + intervalos[i]);
        }
    }

    public static double[] generarPseudoaleatorios(long semilla, int cantidad) {
        long a = 1664525;
        long c = 1013804223;
        long m = (1L << 32);
        double[] resultados = new double[cantidad];
        long x = semilla;
        for (int i = 0; i < cantidad; i++) {
            x = (a * x + c) % m;
            resultados[i] = (double) x / m;
        }
        return resultados;
    }
}
```

---

## 🧠 Conclusión

Los algoritmos **Monte Carlo** ofrecen una forma **rápida, intuitiva y versátil** de resolver o aproximar problemas difíciles, en especial cuando no existen soluciones directas. Son ampliamente utilizados en disciplinas como ciencia de datos, física, finanzas y estadística. La **calidad de los números aleatorios** es clave para su eficacia (Págs. 9, 12, 14, 17–18).
