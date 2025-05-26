
# DEMOSTRACIÓN UTILIZANDO INDUCCIÓN MATEMÁTICA  
* Sirve para validar propiedades relacionadas con la corrección y eficiencia de algoritmos.

#### **¿QUÉ ES EL PRINCIPIO DE INDUCCIÓN MATEMÁTICA?**  
* Es una herramienta lógica que se emplea para confirmar enunciados que son ciertos para todos los números naturales (o a partir de cierto valor inicial).

Consta de tres fases principales:
1. Verificación del caso inicial  
2. Planteamiento de la hipótesis inductiva  
3. Verificación del paso inductivo  

Ejemplo clásico:

$$\sum_{i=1}^{n} i = \frac{n(n+1)}{2}$$

Para n = 10:

$$\sum_{i=1}^{n} i = \frac{10(10+1)}{2} = 55$$

---

#### QUEREMOS DEMOSTRAR QUE:

$$1+2+3+\dots+n = \frac{n(n+1)}{2}$$

---

* #### **Paso 1: Verificación del caso base (n = 1):**

Comprobamos la fórmula para el valor más pequeño:

$$\sum_{i=1}^{n} i = \frac{n(n+1)}{2}$$

Sustituyendo:

$$1 = \frac{1(1+1)}{2}$$  
$$1 = \frac{2}{2} = 1 \quad \text{}$$

---

* #### **Paso 2: Suposición inductiva**

Asumimos que la fórmula es verdadera para un valor arbitrario \( n = k \):

$$1+2+3+\dots+k = \frac{k(k+1)}{2}$$

---

* #### **Paso 3: Comprobación para \( n = k + 1 \)**

Debemos verificar que también se cumple para el siguiente número:

$$1+2+3+\dots+k+(k+1) = \frac{k(k+1)}{2} + (k+1)$$

Agrupando y factorizando:

$$= \frac{k(k+1) + 2(k+1)}{2}$$  
$$= \frac{(k+1)(k+2)}{2}$$

Así, se cumple la fórmula para \( k+1 \), completando la prueba por inducción. 
