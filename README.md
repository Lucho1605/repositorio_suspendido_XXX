# Taller 1 _ Operadores con incrementos y condicionales en Java

## Introducción

En esta actividad se trabajan conceptos básicos de programación en Java relacionados con los operadores de incremento y las estructuras condicionales. Estos elementos permiten modificar valores de variables y tomar decisiones dentro de un programa dependiendo de diferentes condiciones.

Durante el desarrollo del taller se practican el **preincremento**, el **posincremento** y las estructuras `if`, `else if` y `else`, con el propósito de comprender su funcionamiento y aplicación en diferentes situaciones.

---

## I. Información 

- **autor:** Luis Alejandro Acuña Aldana
- **Programa académico:** Tecnología en Desarrollo de Software
- **Fecha de entrega:** 27 de agosto de 2026

---

## II. Objetivo de la actividad

El objetivo de esta actividad es comprender y aplicar los operadores de incremento y las estructuras condicionales en el lenguaje de programación Java.

### Preincremento y posincremento

El **preincremento** se representa como:

    ++variable;

La variable se incrementa **antes de utilizar su valor** dentro de una expresión.

**Ejemplo:**

    int x = 5;
    int y = ++x;

**Resultado:**

    x = 6
    y = 6

El **posincremento** se representa como:

    variable++;

En este caso, primero se utiliza el valor actual de la variable y después se realiza el incremento.

**Ejemplo:**

    int x = 5;
    int y = x++;

**Resultado:**

    x = 6
    y = 5


| Característica | Preincremento | Postincremento |
|---|---|---|
| **Operador** | `++variable` | `variable++` |
| **Funcionamiento** | Incrementa la variable antes de utilizar su valor | Utiliza el valor actal y después incrementa la variable |
| **Momento del incremento** | Primero incrementa | Primero utiliza el valor |
| **Ejemplo** | `int y = ++x;` | `int y = x++;` |
| **Valor inicial de `x`** | `5` | `5` |
| **Valor de `x` después** | `6` | `6` |
| **Valor de `y`** | `6` | `5` |

# En que situación se producen resultados distintos? 

| Concepto / Escenario | Preincremento (`++i`) | Postincremento (`i++`) |
| :--- | :--- | :--- |
| **Definición general** | Incrementa el valor **antes** de evaluarlo/usarlo. Devuelve el **nuevo** valor. | Evalúa/usa el valor **antes** de incrementarlo. Devuelve el **valor original**. |
| **1. Asignaciones directas** | `int b = ++a;`<br> `a` pasa a 6 y a `b` se le asigna 6. | `int b = a++;`<br> A `b` se le asigna 5 y luego `a` pasa a 6. |
| **2. Evaluaciones (`if` / `while`)** | `if (++i == 1)`<br> **Verdadero:** Incrementa `i` a 1 y luego compara `1 == 1`. | `if (i++ == 1)`<br> **Falso:** Compara `0 == 1` y luego incrementa `i` a 1. |
| **3. Argumentos en funciones** | `imprimir(++x);`<br> Incrementa `x` a 11 y pasa 11 a la función. | `imprimir(x++);`<br> Pasa 10 a la función y luego incrementa `x` a 11. |
| **4. Acceso a Arreglos** | `val = arr[++i];`<br> Incrementa `i` a 1 y lee `arr[1]`. | `val = arr[i++];`<br> Lee `arr[0]` y luego i<ncrementa `i` a 1. |
| **Sentencias aisladas** | `++i;`<br> Resultado final idéntico en la variable. | `i++;`<br> Resultado final idéntico en la variable. |
| **Bucles `for` simples** | `for (int i = 0; i < 5; ++i)`<br> Mismo número de iteraciones y comportamiento. | `for (int i = 0; i < 5; i++)`<br> Mismo número de iteraciones y comportamiento. |
| **Rendimiento (C++)** |  **Más eficiente** en iteradores de objetos (evita guardar copias). |  Puede generar una copia temporal del objeto en iteradores. |

# Analisis de codigo propuesto 
el codigo: 
<img width="477" height="483" alt="image" src="https://github.com/user-attachments/assets/3df2c985-b126-4aec-9ed5-4f19def7fc33" />

# Análisis de Código: Preincremento vs Postincremento en Java

A continuación se presenta el desglose y análisis del comportamiento de la ejecución del código:

##  Cuadro Comparativo de Variables

| Variable | Valor Final | Operación Evaluada | Explicación del Comportamiento |
| :--- | :--- | :--- | :--- |
| **`a`** | `6` | `++a` (Preincremento) | Se incrementa de 5 a 6 **antes** de evaluarse en la asignación. |
| **`b`** | `6` | `int b = ++a` | Recibe el valor de `a` ya incrementado. |
| **`c`** | `6` | `c++` (Postincremento) | Devuelve su valor actual (5) para la asignación y **luego** se incrementa a 6. |
| **`d`** | `5` | `int d = c++` | Recibe el valor original de `c` (5) **antes** de que este cambie. |

# Comparación: Preincremento (`++i`) vs Postincremento (`i++`)

| Contexto / Operación | Preincremento (`++i`) | Postincremento (`i++`) | ¿Producen resultado distinto? |
| :--- | :--- | :--- | :---: |
| **1. En un ciclo `for`** | `for (int i = 0; i < 5; ++i)`<br> Se incrementa en cada paso. | `for (int i = 0; i < 5; i++)`<br> Se incrementa en cada paso. |  **No** *(Comportamiento idéntico)* |
| **2. En una Asignación** | `int b = ++a;` *(si `a=5`)*<br> `a` pasa a 6 y **`b` recibe 6**. | `int b = a++;` *(si `a=5`)*<br> **`b` recibe 5** y luego `a` pasa a 6. | Sí |
| **3. En Operaciones Matemáticas** | `int res = 10 + ++x;` *(si `x=2`)*<br> `x` pasa a 3 primero. `10 + 3 = 13`. | `int res = 10 + x++;` *(si `x=2`)*<br> Usa `x=2`. `10 + 2 = 12`. Luego `x` pasa a 3. | Sí |
---

##  Salida en Consola
### Estructuras condicionales

Las estructuras condicionales permiten que un programa tome diferentes decisiones dependiendo de si una condición se cumple o no.

La estructura básica es:

    if (condicion) {
        // Instrucciones si la condición es verdadera
    }

También se pueden utilizar `else if` y `else`:

    if (condicion1) {
        // Primera condición
    }
    else if (condicion2) {
        // Segunda condición
    }
    else {
        // Si ninguna condición se cumple
    }

---
## III. Solución ejercicios
# Ejercicio 1 _ Sistema de ventas al por mayor en Java

## Introducción

Este proyecto consiste en el desarrollo de un programa en lenguaje **Java**, utilizando **NetBeans**, diseñado para simular el funcionamiento de una registradora en un establecimiento de **ventas al por mayor**.

El programa permite registrar una sola referencia de producto por compra. Esto significa que el cliente puede llevar varias unidades de un mismo producto, pero todas pertenecen a la misma referencia y, por lo tanto, tienen el mismo precio unitario. ademas tambien, permite calcular el descuento que se le aplica a la compra, despues de pasara siertos rangos de precios.

Por ejemplo, si un cliente compra 50 tablets de la misma referencia, el programa recibe el precio de una tablet y la cantidad total de tablets que desea comprar. A partir de estos datos, calcula el subtotal, determina el descuento correspondiente y finalmente muestra el total que debe pagar el cliente.

---

- **Lenguaje utilizado:** Java
- **Entorno de desarrollo:** NetBeans

---

## 2. Objetivo

Desarrollar un programa en Java que permita calcular el valor total (con o sin descuentos dependiendo de la situación) de una compra al por mayor de una sola referencia de producto, utilizando variables, entrada de datos, operadores matemáticos y estructuras condicionales.

El programa busca aplicar los conocimientos adquiridos sobre:

- Variables.
- Tipos de datos.
- Entrada de datos mediante `Scanner`.
- Operadores aritméticos.
- Operadores de comparación.
- Operadores lógicos.
- Estructuras condicionales `if` y `else if`.
- Cálculo de porcentajes.
- Operaciones de incremento y decremento.

---

## 3. Funcionamiento del programa

El programa solicita al usuario dos datos:

1. **Cantidad de productos:** número de unidades de la misma referencia que el cliente desea comprar.
2. **Precio unitario:** valor de una unidad del producto.

Con estos datos se calcula el subtotal:

    subtotal = cantidad × precio unitario

Después, el programa analiza el subtotal mediante diferentes condiciones para determinar qué descuento debe aplicarse.

Finalmente, calcula el total:

    total = subtotal - descuento

---

## 4. Código utilizado

El código desarrollado para el ejercicio es el siguiente:

    public class Ejercicio_1 {

        /**
         * Luis Alejandro Acuña Aldana
         * 20261244210
         */
        public static void main(String[] args) {

            int cant, prec, subt;
            double des = 0, tot;

            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese la cantidad de productos a comprar: ");
            cant = sc.nextInt();

            System.out.println("Ingrese el valor de unidad del producto: ");
            prec = (int) sc.nextLong();

            subt = (int) (cant * prec);

            System.out.println("El valor a pagar sin descuento: " + subt);

            if (subt < 100000) {
                des = subt * 0;
            }
            else if (subt > 100000 && subt < 300000) {
                des = subt * 0.1;
            }
            else if (subt > 300000 && subt < 500000) {
                des = subt * 0.15;
            }
            if (subt > 500000) {
                des = subt * 0.2;

            tot = subt - des;

            System.out.println("El total de su compra es de: " + tot);
        }
    }

---

# 5. Explicación del código

## 5.1 Clase principal

    public class Ejercicio_1 {

Esta línea crea la clase principal del programa.

`public` indica que la clase puede ser utilizada desde otras partes del programa.

`class` indica que se está creando una clase en Java.

`Ejercicio_1` es el nombre que se le asignó a la clase.

---

## 5.2 Método principal `main`

    public static void main(String[] args) {

Este es el método principal del programa. Java comienza la ejecución del programa desde el método `main`.

### `public`

Indica que el método puede ser accedido desde cualquier lugar.

### `static`

Permite ejecutar el método sin necesidad de crear primero un objeto de la clase.

### `void`

Indica que el método no devuelve ningún valor.

### `main`

Es el método que Java utiliza como punto de inicio de la ejecución.

### `String[] args`

Es un arreglo que permite recibir argumentos desde la línea de comandos.

En este programa no se utilizan argumentos externos, pero `String[] args` forma parte de la estructura estándar del método `main`.

---

# 6. Declaración de variables

    int cant, prec, subt;
    double des = 0, tot;

En esta parte se crean las variables que utilizará el programa.

### `int`

El tipo `int` se utiliza para almacenar números enteros.

En este programa se utiliza para:

- `cant` → cantidad de productos.
- `prec` → precio unitario.
- `subt` → subtotal de la compra.

Por ejemplo:

    cant = 50;

significa que el cliente está comprando 50 unidades de la misma referencia.

### `double`

El tipo `double` permite almacenar números que pueden tener decimales.

Se utiliza para:

- `des` → valor del descuento.
- `tot` → total de la compra.

La variable `des` comienza con un valor de `0`:

    double des = 0;

Esto significa que inicialmente no se ha calculado ningún descuento.

---

# 7. Creación del Scanner

    Scanner sc = new Scanner(System.in);

Esta línea crea un objeto de tipo `Scanner`.

`Scanner` permite que el programa reciba información ingresada por el usuario mediante el teclado.

### `sc`

Es el nombre que se le asignó al objeto `Scanner`.

### `System.in`

Indica que la información será recibida desde la entrada estándar, que normalmente es el teclado.

Para utilizar `Scanner` es necesario importar la clase:

    import java.util.Scanner;

---

# 8. Solicitud de la cantidad

    System.out.println("Ingrese la cantidad de productos a comprar: ");

Esta instrucción muestra un mensaje en pantalla para indicarle al usuario qué información debe ingresar.

Después:

    cant = sc.nextInt();

`nextInt()` permite recibir un número entero ingresado por el usuario.

Por ejemplo, si el usuario escribe:

    50

el programa guarda ese valor en la variable `cant`.

Por lo tanto:

    cant = 50;

---

# 9. Solicitud del precio unitario

    System.out.println("Ingrese el valor de unidad del producto: ");

Esta instrucción solicita al usuario el precio de una unidad del producto.

Después:

    prec = (int) sc.nextLong();

`nextLong()` permite recibir un número entero de tipo `long`.

En este caso se utiliza `(int)` para convertir el valor recibido a un número entero de tipo `int`, porque la variable `prec` fue declarada como `int`.

Por ejemplo, si el usuario introduce:

    250000

el valor termina almacenándose como:

    prec = 250000;

### Conversión `(int)`

La expresión:

    (int)

es un **casting** o conversión de tipo.

Se utiliza para convertir un dato a otro tipo compatible.

En este caso:

    (int) sc.nextLong();

convierte el valor recibido como `long` a `int`.

---

# 10. Cálculo del subtotal

    subt = (int) (cant * prec);

Esta línea calcula el valor total de los productos antes de aplicar el descuento.

La operación utilizada es:

    cantidad × precio unitario

Por ejemplo, si:

    cant = 50
    prec = 250000

entonces:

    subt = 50 × 250000

    subt = 12500000

El resultado se almacena en la variable `subt`.

### Operador `*`

El símbolo `*` representa la **multiplicación**.

Por lo tanto:

    cant * prec

significa:

    cantidad × precio

---

# 11. Mostrar el subtotal

    System.out.println("El valor a pagar sin descuento: " + subt);

Esta línea muestra en pantalla el subtotal calculado.

El símbolo `+` se utiliza aquí para **concatenar texto con una variable**.

Por ejemplo:

    "Subtotal: " + subt

Si `subt` vale `12500000`, se mostrará:

    Subtotal: 12500000

---

# 12. Primera condición

    if (subt < 100000) {
        des = subt * 0;
    }

`if` permite tomar una decisión.

La condición:

    subt < 100000

significa:

> Si el subtotal es menor que $100.000.

### Operador `<`

El símbolo `<` significa:

> menor que

Por lo tanto:

    subt < 100000

comprueba si el subtotal es menor a 100.000.

Si la condición se cumple:

    des = subt * 0;

El descuento será cero.

### Operador `*`

En este caso se multiplica el subtotal por `0`, por lo que no se aplica ningún descuento.

---

# 13. Segunda condición

    else if (subt > 100000 && subt < 300000) {
        des = subt * 0.1;
    }

`else if` permite comprobar otra condición cuando la condición anterior no se cumplió.

En este caso se utilizan dos condiciones:

    subt > 100000

y

    subt < 300000

El operador `&&` significa **Y**.

Por lo tanto:

    subt > 100000 && subt < 300000

significa:

> El subtotal debe ser mayor que $100.000 Y menor que $300.000.

Si se cumple la condición, se aplica un descuento del 10%.

    des = subt * 0.1;

### `0.1`

El valor `0.1` representa el 10%.

Por ejemplo:

    50000 × 0.1 = 5000

Por lo tanto, para una compra de $50.000 el descuento sería de $5.000.

---

# 14. Tercera condición

    else if (subt > 300000 && subt < 500000) {
        des = subt * 0.15;
    }

Esta condición comprueba si el subtotal es mayor a $300.000, y menor que $500.000.

El operador:

    >

significa **mayor que**.
El operador:

    <

significa **menor que**.

Por lo tanto:

    subt > 300000

significa:

> El subtotal debe ser mayor que $300.000.

Por lo tanto:

    subt <  500000

significa:

> El subtotal debe ser menor que $500.000.

Si se cumple, se aplica un descuento del 15%.

    des = subt * 0.15;

El valor `0.15` representa el 15%.

Por ejemplo:

    100000 × 0.15 = 15000

En una compra de $100.000, el descuento sería de $15.000.

---

# 15. Cálculo del total

    tot = subt - des;

Esta línea calcula el valor final que debe pagar el cliente.

La operación es:

    Total = Subtotal - Descuento

Por ejemplo:

    Subtotal = 100000
    Descuento = 30000

Entonces:

    Total = 100000 - 30000

    Total = 70000

### Operador `-`

El símbolo `-` representa la **resta**.

En este caso se utiliza para quitar el descuento del subtotal.

---

# 16. Mostrar el total

    System.out.println("El total de su compra es de: " + tot);

Esta instrucción muestra el valor final de la compra.

El operador `+` concatena el mensaje con el contenido de la variable `tot`.

Por ejemplo:

    El total de su compra es de: 70000.0

---

# 17. Operadores utilizados

Durante el desarrollo del programa se utilizan diferentes operadores.

| Operador | Significado | Ejemplo |
|---|---|---|
| `*` | Multiplicación | `cant * prec` |
| `-` | Resta | `subt - des` |
| `<` | Menor que | `subt < 100000` |
| `>` | Mayor que | `subt > 500000` |
| `&&` | Y lógico | `subt > 100000 && subt < 300000` |
| `=` | Asignación | `cant = sc.nextInt()` |
| `+` | Concatenación | `"Total: " + tot` |

---

# 18. Estructuras condicionales utilizadas

El programa utiliza las estructuras:

- `if`
- `else if`

Estas permiten que el programa tome una decisión dependiendo del valor del subtotal.

La estructura utilizada puede representarse de la siguiente manera:

    if (condición 1) {
        // Acción 1
    }
    else if (condición 2) {
        // Acción 2
    }
    else if (condición 3) {
        // Acción 3
    }

Java revisa las condiciones en orden y ejecuta el bloque correspondiente a la primera condición que resulte verdadera.

---

# 19. Ejemplo de funcionamiento

Supongamos que el cliente compra:

    Cantidad: 50 tablets
    Precio unitario: $250.000

El programa realiza:

    Subtotal = 50 × 250000

    Subtotal = $12.500.000

Como el subtotal es mayor que $500.000, se aplica un descuento del 20%:

    Descuento = 12.500.000 × 0.2

    Descuento = $2.500.000

Finalmente:

    Total = 12.500.000 - 2.500.000

    Total = $10.000.000

El programa mostraría:

    El valor a pagar sin descuento: 12500000
    El total de su compra es de: 10000000.0

---

# 20. Conceptos aprendidos

Con el desarrollo de este ejercicio se reforzaron los conocimientos relacionados con:

- Declaración y utilización de variables.
- Tipos de datos `int` y `double`.
- Entrada de información mediante `Scanner`.
- Uso de `nextInt()` y `nextLong()`.
- Conversión de tipos mediante casting.
- Operaciones matemáticas.
- Cálculo de porcentajes.
- Uso de operadores de comparación.
- Uso del operador lógico `&&`.
- Estructuras condicionales `if` y `else if`.
- Salida de información mediante `System.out.println()`.

---

# 21. Evidencia de la ejecución del programa

<img width="1354" height="717" alt="image" src="https://github.com/user-attachments/assets/f1e2f996-4005-473a-b02a-269e47c68629" />


---


# Ejercicio 2 - Control de acceso a un conjunto residencial

## Introducción

Este proyecto consiste en el desarrollo de un programa en lenguaje **Java** que simula un sistema básico de control de acceso a un conjunto residencial.

El programa permite identificar si la persona que desea ingresar es un **residente** o un **visitante**. Si se trata de un residente, el acceso es permitido directamente. Si se trata de un visitante, el programa solicita verificar si el propietario o residente le ha autorizado el ingreso.

Este ejercicio permite aplicar conceptos básicos de programación como variables, entrada de datos mediante `Scanner`, estructuras condicionales `if` y `else if`, operadores de comparación y condicionales anidados.


---

## 2. Objetivo

Desarrollar un programa que permita controlar de manera básica el acceso a un conjunto residencial, diferenciando entre residentes y visitantes.

El programa busca aplicar los conocimientos relacionados con:

- Declaración de variables.
- Tipo de dato `int`.
- Uso de `Scanner`.
- Entrada de datos mediante `nextInt()`.
- Operadores de comparación.
- Estructuras `if` y `else if`.
- Condicionales anidados.
- Salida de información mediante `System.out.println()`.

---

## 3. Funcionamiento del programa

El programa comienza solicitando al usuario que indique qué tipo de persona desea ingresar al conjunto.

Se manejan dos opciones:

- `1` → Residente.
- `2` → Visitante.

Si la persona es residente, el programa muestra un mensaje de bienvenida y permite el ingreso.

Si la persona es visitante, el programa solicita verificar si el propietario o residente le ha permitido el ingreso.

Para la autorización se manejan las siguientes opciones:

- `1` → El propietario sí permitió el ingreso.
- `2` → El propietario no permitió el ingreso.

De acuerdo con la respuesta, el programa permite o niega el acceso.

---

## 4. Código utilizado

```java
public class Ejercicio_2 { 

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 

        int res, aut;  

        System.out.println("para el contról de acceso relacione las preguntas: "); 

        System.out.println("ingrese el tipo de persona: "); 
        res = sc.nextInt(); 

        if (res == 1) { 
            System.out.println("Bienvenido señor residente"); 
        } 

        else if (res == 2) { 

            System.out.println("por favor contacte al residente para que le permita el ingreso... "); 

            System.out.println("el propietario le ha permitido el ingreso? "); 
            aut = sc.nextInt();  

            if (aut == 1) { 
                System.out.println("bienvenido señor visitante..."); 
            } 

            else if (aut == 2) { 
                System.out.println("no se le ha permitido el ingreso"); 
            } 
        } 
    } 
}
```

---

## 5. Explicación del código

### 5.1 Declaración de la clase

```java
public class Ejercicio_2 {
```

Esta línea crea la clase principal del programa.

- `public` indica que la clase puede ser accedida desde otras partes del programa.
- `class` indica que se está creando una clase.

---

### 5.2 Método principal `main`

```java
public static void main(String[] args) {
```

El método `main` es el punto de inicio de la ejecución del programa.

- `public` permite que el método sea accesible.
- `static` permite ejecutar el método sin crear un objeto de la clase.
- `void` indica que no devuelve ningún valor.
- `main` es el método principal de Java.
- `String[] args` es un arreglo que puede recibir argumentos desde la línea de comandos.

---

## 6. Creación del Scanner

```java
Scanner sc = new Scanner(System.in);
```

Esta línea crea un objeto de la clase `Scanner`, que permite recibir datos introducidos por el usuario mediante el teclado.

- `Scanner` es la clase utilizada para recibir datos.
- `sc` es el nombre que se le asignó al objeto.
- `System.in` indica que los datos serán recibidos desde el teclado.

Para utilizar `Scanner`, se debe importar:

```java
import java.util.Scanner;
```

---

## 7. Declaración de variables

```java
int res, aut;
```

Aquí se crean dos variables de tipo `int`.

El tipo `int` permite almacenar números enteros.

### Variable `res`

La variable `res` almacena la respuesta relacionada con el tipo de persona.

```text
1 = Residente
2 = Visitante
```

### Variable `aut`

La variable `aut` almacena la respuesta relacionada con la autorización del residente.

```text
1 = Autorizado
2 = No autorizado
```

---

## 8. Solicitud del tipo de persona

```java
System.out.println("ingrese el tipo de persona: ");
```

Esta instrucción muestra un mensaje en pantalla para solicitar al usuario que indique qué tipo de persona desea ingresar.

Después:

```java
res = sc.nextInt();
```

`nextInt()` permite recibir un número entero ingresado por el usuario y almacenarlo en la variable `res`.

Por ejemplo, si el usuario escribe:

```text
1
```

el programa guarda:

```text
res = 1
```

Si escribe:

```text
2
```

el programa guarda:

```text
res = 2
```

---

## 9. Primera condición `if`

```java
if (res == 1) {
    System.out.println("Bienvenido señor residente");
}
```

Esta condición verifica si la persona es un residente.

La expresión:

```java
res == 1
```

significa:

> ¿El valor de `res` es igual a 1?

Si la condición es verdadera, el programa muestra:

```text
Bienvenido señor residente
```

---

## 10. Operador `==`

El operador `==` sirve para **comparar dos valores** y determinar si son iguales.

Por ejemplo:

```java
res == 1
```

significa:

> Comprobar si `res` es igual a `1`.

Es importante diferenciarlo del operador `=`.

### Operador `=`

Sirve para asignar un valor:

```java
res = 1;
```

### Operador `==`

Sirve para comparar:

```java
res == 1
```

Por lo tanto, `=` asigna y `==` compara.

---

## 11. Condición `else if`

```java
else if (res == 2) {
```

Esta condición se ejecuta cuando la primera condición no se cumple.

Aquí se comprueba:

```java
res == 2
```

Esto significa:

> ¿La persona es un visitante?

Si la respuesta es verdadera, el programa continúa y solicita la autorización del residente.

---

## 12. Solicitud de autorización

Cuando la persona es visitante, el programa muestra:

```java
System.out.println("por favor contacte al residente para que le permita el ingreso...");
```

Después pregunta:

```java
System.out.println("el propietario le ha permitido el ingreso?");
```

Luego recibe la respuesta:

```java
aut = sc.nextInt();
```

El número ingresado por el usuario se almacena en la variable `aut`.

---

## 13. Condicional anidado

Una de las partes importantes del programa es:

```java
if (aut == 1) {
    System.out.println("bienvenido señor visitante...");
}
```

Este `if` se encuentra dentro del `else if` que verifica si la persona es visitante.

Esto se conoce como un **condicional anidado**.

Primero el programa pregunta:

> ¿La persona es visitante?

Si la respuesta es sí, entonces realiza una segunda pregunta:

> ¿El propietario le permitió el ingreso?

De esta manera, una condición depende de otra.

---

## 14. Visitante autorizado

```java
if (aut == 1) {
    System.out.println("bienvenido señor visitante...");
}
```

Si `aut` tiene el valor `1`, significa que el propietario autorizó el ingreso.

Por lo tanto, el programa muestra:

```text
bienvenido señor visitante...
```

---

## 15. Visitante no autorizado

```java
else if (aut == 2) {
    System.out.println("no se le ha permitido el ingreso");
}
```

Si `aut` tiene el valor `2`, significa que el propietario no autorizó el ingreso.

Por lo tanto, el programa muestra:

```text
no se le ha permitido el ingreso
```

---

## 16. Estructuras condicionales utilizadas

### `if`

Permite comprobar si una condición es verdadera.

```java
if (condicion) {
    // Instrucciones
}
```

### `else if`

Permite comprobar otra condición cuando la anterior no se cumple.

```java
else if (otraCondicion) {
    // Instrucciones
}
```

En este ejercicio se utiliza para diferenciar entre residente y visitante.

### Condicional anidado

Es un `if` que se encuentra dentro de otro bloque condicional.

En este ejercicio se utiliza para verificar la autorización del visitante.

---


---

## 17. Ejemplo de funcionamiento: residente

Si el usuario ingresa:

```text
Ingrese el tipo de persona:
1
```

El programa comprueba:

```java
if (res == 1)
```

Como la condición es verdadera, muestra:

```text
Bienvenido señor residente
```

En este caso el programa no necesita realizar ninguna otra pregunta.

---

## 18. Ejemplo de funcionamiento: visitante autorizado

Si el usuario ingresa:

```text
Ingrese el tipo de persona:
2
```

El programa identifica que se trata de un visitante.

Después pregunta:

```text
el propietario le ha permitido el ingreso?
```

Si el usuario responde:

```text
1
```

se cumple:

```java
if (aut == 1)
```

Y el programa muestra:

```text
bienvenido señor visitante...
```

---

## 19. Ejemplo de funcionamiento: visitante no autorizado

Si el usuario selecciona:

```text
2
```

para indicar que es visitante y posteriormente selecciona:

```text
2
```

cuando se pregunta si tiene autorización, se cumple:

```java
else if (aut == 2)
```

Por lo tanto, el programa muestra:

```text
no se le ha permitido el ingreso
```

---

## 20. Conceptos aprendidos

Con el desarrollo de este ejercicio se reforzaron los siguientes conceptos:

- Creación de una clase en Java.
- Método principal `main`.
- Declaración de variables.
- Tipo de dato `int`.
- Uso de `Scanner`.
- Uso de `nextInt()`.
- Entrada de datos por teclado.
- Operador de asignación `=`.
- Operador de comparación `==`.
- Estructura condicional `if`.
- Estructura `else if`.
- Condicionales anidados.
- Uso de `System.out.println()`.
- Toma de decisiones dentro de un programa.

---

## 21. Evidencia de la ejecución del programa 
<img width="1365" height="718" alt="image" src="https://github.com/user-attachments/assets/2e585331-7d6c-4178-9e0a-cda0db58c732" />

---

# Ejercicio 3 

## Introducción

En este ejercicio se desarrolla un programa en Java para una plataforma de transporte compartido.

El programa permite evaluar a un conductor teniendo en cuenta tres condiciones:

- La calificación del conductor.
- La cantidad de viajes realizados.
- La disponibilidad del conductor.

Dependiendo de las condiciones que cumpla, el programa determina si el conductor puede ser asignado como **Premium**, **Estándar** o si **no puede ser asignado**.

---

## Objetivo

Aplicar el uso de condiciones compuestas y estructuras condicionales en Java para resolver una situación de la vida real.

El programa debe analizar las tres condiciones establecidas y determinar el tipo de asignación correspondiente.

---

## Condiciones del ejercicio

Para que un conductor sea considerado **Conductor Premium**, debe cumplir las tres condiciones:

- Tener una calificación mayor o igual a `4.8`.
- Haber realizado más de `500` viajes.
- Encontrarse disponible.

Si el conductor cumple **dos de las tres condiciones**, será asignado como **Conductor Estándar**.

Si cumple una o ninguna de las condiciones, **no podrá ser asignado**.

---

## Proceso del programa

### 1. Inicio del programa

El programa comienza importando la clase `Scanner`, que permite recibir información ingresada por el usuario.

Después se crea un objeto llamado `teclado`, que será utilizado para leer los datos.

### 2. Declaración de variables

Se crean las variables necesarias para almacenar la información:

- `calificacion`: almacena la calificación del conductor.
- `viajes`: almacena la cantidad de viajes realizados.
- `disponible`: almacena si el conductor está disponible.
- `condiciones`: funciona como contador de las condiciones cumplidas.

El contador `condiciones` comienza en `0`.

### 3. Solicitud de información

El programa solicita al usuario tres datos:

1. La calificación del conductor.
2. La cantidad de viajes realizados.
3. Si el conductor está disponible.

Por ejemplo:

**Calificación:** `4.9`

**Viajes realizados:** `600`

**Disponibilidad:** `si`

### 4. Evaluación de la primera condición

El programa verifica si la calificación del conductor es mayor o igual a `4.8`.

Si esta condición se cumple, el contador aumenta en uno.

### 5. Evaluación de la segunda condición

Después se verifica si el conductor ha realizado más de `500` viajes.

Si cumple esta condición, el contador aumenta nuevamente en uno.

### 6. Evaluación de la tercera condición

Finalmente se verifica si el conductor está disponible.

Si la respuesta es `si`, el contador aumenta en uno.

Para realizar la comparación se utiliza `equalsIgnoreCase()`, permitiendo aceptar respuestas como `si`, `SI`, `Si` o `sI`.

---

## Contador de condiciones

El contador es importante porque permite determinar cuántas condiciones cumple el conductor.

La lógica utilizada es:

| Condiciones cumplidas | Resultado |
|---:|---|
| 3 | Conductor Premium |
| 2 | Conductor Estándar |
| 1 | No puede ser asignado |
| 0 | No puede ser asignado |

De esta manera, el programa no necesita realizar una gran cantidad de condiciones diferentes, sino que cuenta las condiciones que se cumplen y posteriormente analiza el resultado.

---

## 7. Estructura condicional utilizada

Para determinar la asignación final se utiliza una estructura:

`if - else if - else`

El funcionamiento es el siguiente:

- Si `condiciones` es igual a `3`, se muestra **Conductor Premium**.
- Si `condiciones` es igual a `2`, se muestra **Conductor Estándar**.
- En cualquier otro caso, se muestra **No puede ser asignado**.

Esta estructura permite controlar los diferentes resultados posibles del programa.

---

## Ejemplo 1 - Conductor Premium

Datos ingresados:

| Dato | Valor |
|---|---:|
| Calificación | 4.9 |
| Viajes | 600 |
| Disponible | Si |

Evaluación:

- Calificación mayor o igual a `4.8`: **Cumple**.
- Más de `500` viajes: **Cumple**.
- Disponible: **Cumple**.

Total de condiciones cumplidas: **3**

Resultado:

**Conductor Premium**

---

## Ejemplo 2 - Conductor Estándar

Datos ingresados:

| Dato | Valor |
|---|---:|
| Calificación | 4.9 |
| Viajes | 600 |
| Disponible | No |

Evaluación:

- Calificación mayor o igual a `4.8`: **Cumple**.
- Más de `500` viajes: **Cumple**.
- Disponible: **No cumple**.

Total de condiciones cumplidas: **2**

Resultado:

**Conductor Estándar**

---

## Ejemplo 3 - No puede ser asignado

Datos ingresados:

| Dato | Valor |
|---|---:|
| Calificación | 4.5 |
| Viajes | 300 |
| Disponible | No |

Evaluación:

- Calificación mayor o igual a `4.8`: **No cumple**.
- Más de `500` viajes: **No cumple**.
- Disponible: **No cumple**.

Total de condiciones cumplidas: **0**

Resultado:

**No puede ser asignado**

---

## Flujo del programa

El proceso que sigue el programa puede resumirse de la siguiente manera:

**Inicio**

↓

**Ingresar calificación**

↓

**Ingresar cantidad de viajes**

↓

**Ingresar disponibilidad**

↓

**Evaluar calificación**

↓

**Evaluar cantidad de viajes**

↓

**Evaluar disponibilidad**

↓

**Contar condiciones cumplidas**

↓

**¿Cumple 3 condiciones?**

→ Sí: **Conductor Premium**

→ No: continuar

↓

**¿Cumple 2 condiciones?**

→ Sí: **Conductor Estándar**

→ No: **No puede ser asignado**

↓

**Fin**

---

## Conceptos de Java utilizados

### Scanner

Se utiliza `Scanner` para recibir los datos ingresados por el usuario.

### Variables

Se utilizan variables de diferentes tipos:

- `double` para la calificación.
- `int` para la cantidad de viajes.
- `String` para la disponibilidad.
- `int` para contar las condiciones cumplidas.

### if

Permite comprobar si una condición se cumple.

### else if

Permite comprobar una segunda condición cuando la anterior no se cumple.

### else

Permite establecer el resultado cuando ninguna de las condiciones anteriores se cumple.

### Operadores de comparación

Se utilizan operadores como:

- `>=` para comprobar si la calificación es mayor o igual a `4.8`.
- `>` para comprobar si los viajes son mayores a `500`.
- `==` para comprobar la cantidad de condiciones cumplidas.

### Operador de incremento

Se utiliza `++` para aumentar el contador cuando una condición se cumple.

Por ejemplo, cada vez que una condición es verdadera, `condiciones` aumenta en uno.

---

## Resultado esperado

El programa permite clasificar correctamente a los conductores según las condiciones establecidas.

La clasificación final es:

- **3 condiciones cumplidas:** Conductor Premium.
- **2 condiciones cumplidas:** Conductor Estándar.
- **1 o 0 condiciones cumplidas:** No puede ser asignado.

---

## Evidencia de la ejecución del programa 

<img width="1365" height="717" alt="image" src="https://github.com/user-attachments/assets/7ddf12a6-6393-49f1-a967-5b453b6f9773" />

---

# Ejercicio 4 

## Introducción

En este ejercicio se desarrolla un programa en Java que permite evaluar una solicitud de crédito.

El programa solicita al usuario tres datos:

- Sus ingresos mensuales.
- Su puntaje crediticio.
- Su antigüedad laboral en años.

Después de recibir estos datos, el programa evalúa cada uno de los criterios y determina si el crédito es aprobado, condicionado o rechazado.

---

## Objetivo

Aplicar estructuras condicionales en Java para evaluar diferentes criterios y tomar una decisión dependiendo de la cantidad de condiciones que cumple el usuario.

---

## Variables utilizadas

El programa utiliza cuatro variables principales:

| Variable | Tipo | Función |
|---|---|---|
| `ingr` | `double` | Almacena los ingresos mensuales |
| `punt` | `int` | Almacena el puntaje crediticio |
| `antig` | `double` | Almacena la antigüedad laboral en años |
| `crit` | `int` | Cuenta la cantidad de criterios cumplidos |

La variable `crit` comienza con el valor `0`:

~~~java
int crit = 0;
~~~

Esta variable funciona como un contador. Cada vez que se cumple uno de los criterios, su valor aumenta en uno mediante el operador `++`.

---

## Proceso del programa

### 1. Crear el Scanner

El programa utiliza `Scanner` para recibir los datos que ingresa el usuario.

~~~java
Scanner sc = new Scanner(System.in);
~~~

El objeto utilizado para ingresar los datos se llama `sc`.

---

### 2. Declaración de variables

Se declaran las variables que serán utilizadas durante el programa:

~~~java
double ingr;
int punt;
double antig;
int crit = 0;
~~~

- `ingr` almacena los ingresos mensuales.
- `punt` almacena el puntaje crediticio.
- `antig` almacena la antigüedad laboral en años.
- `crit` cuenta la cantidad de criterios cumplidos.

---

### 3. Ingresar los ingresos mensuales

El programa solicita al usuario sus ingresos mensuales:

~~~java
System.out.print("Ingrese sus ingresos mensuales: ");
ingr = sc.nextDouble();
~~~

El valor ingresado se guarda en la variable `ingr`.

El criterio se cumple cuando los ingresos son mayores a `5000000`.

~~~java
if (ingr > 5000000) {
    crit++;
}
~~~

Si la condición se cumple, el contador `crit` aumenta en uno.

---

### 4. Ingresar el puntaje crediticio

Después se solicita el puntaje crediticio:

~~~java
System.out.print("Ingrese su puntaje crediticio: ");
punt = sc.nextInt();
~~~

El valor ingresado se almacena en la variable `punt`.

El criterio se cumple cuando el puntaje es mayor a `750`.

~~~java
if (punt > 750) {
    crit++;
}
~~~

Si la condición se cumple, el contador `crit` aumenta en uno.

---

### 5. Ingresar la antigüedad laboral

Finalmente, el programa solicita la antigüedad laboral en años:

~~~java
System.out.print("Ingrese su antigüedad laboral en años: ");
antig = sc.nextDouble();
~~~

El valor ingresado se almacena en la variable `antig`.

El criterio se cumple cuando la antigüedad laboral es mayor a `2` años.

~~~java
if (antig > 2) {
    crit++;
}
~~~

Si la condición se cumple, el contador `crit` aumenta en uno.

---

## Evaluación de los criterios

El programa evalúa tres criterios:

| Criterio | Condición |
|---|---|
| Ingresos mensuales | `ingr > 5000000` |
| Puntaje crediticio | `punt > 750` |
| Antigüedad laboral | `antig > 2` |

Cada vez que una condición se cumple se ejecuta:

~~~java
crit++;
~~~

Esto permite llevar un conteo de los criterios que cumple el usuario.

Por ejemplo, si se cumplen los tres criterios:

~~~text
crit = 0
crit = 1
crit = 2
crit = 3
~~~

Al final, `crit` tendrá el valor `3`.

---

## Determinación del resultado

Después de evaluar los tres criterios, el programa utiliza una estructura `if - else if - else` para determinar el resultado final.

~~~java
if (crit == 3) {
    System.out.println("Crédito Aprobado.");
} else if (crit >= 2) {
    System.out.println("Crédito Condicionado.");
} else {
    System.out.println("Crédito Rechazado.");
}
~~~

### Crédito Aprobado

Si `crit` es igual a `3`, significa que se cumplieron los tres criterios.

El programa muestra:

~~~text
Crédito Aprobado.
~~~

### Crédito Condicionado

Si `crit` es mayor o igual a `2`, significa que se cumplieron al menos dos criterios.

El programa muestra:

~~~text
Crédito Condicionado.
~~~

### Crédito Rechazado

Si `crit` es menor que `2`, significa que se cumplió uno o ningún criterio.

El programa muestra:

~~~text
Crédito Rechazado.
~~~

---

## Tabla de resultados

| Valor de `crit` | Resultado |
|---:|---|
| `3` | Crédito Aprobado |
| `2` | Crédito Condicionado |
| `1` | Crédito Rechazado |
| `0` | Crédito Rechazado |

---

## Ejemplo de ejecución

### Ejemplo 1 - Crédito Aprobado

Datos ingresados:

~~~text
Ingrese sus ingresos mensuales: 6000000
Ingrese su puntaje crediticio: 800
Ingrese su antigüedad laboral en años: 3
~~~

Evaluación:

- `ingr > 5000000` → Cumple.
- `punt > 750` → Cumple.
- `antig > 2` → Cumple.

Por lo tanto:

~~~text
crit = 3
~~~

Resultado:

~~~text
Crédito Aprobado.
~~~

---

### Ejemplo 2 - Crédito Condicionado

Datos ingresados:

~~~text
Ingrese sus ingresos mensuales: 6000000
Ingrese su puntaje crediticio: 800
Ingrese su antigüedad laboral en años: 1
~~~

Evaluación:

- `ingr > 5000000` → Cumple.
- `punt > 750` → Cumple.
- `antig > 2` → No cumple.

Por lo tanto:

~~~text
crit = 2
~~~

Resultado:

~~~text
Crédito Condicionado.
~~~

---

### Ejemplo 3 - Crédito Rechazado

Datos ingresados:

~~~text
Ingrese sus ingresos mensuales: 3000000
Ingrese su puntaje crediticio: 700
Ingrese su antigüedad laboral en años: 1
~~~

Evaluación:

- `ingr > 5000000` → No cumple.
- `punt > 750` → No cumple.
- `antig > 2` → No cumple.

Por lo tanto:

~~~text
crit = 0
~~~

Resultado:

~~~text
Crédito Rechazado.
~~~

---

## Código completo

~~~java
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double ingr;
    int punt;
    double antig;
    int crit = 0;

    System.out.print("Ingrese sus ingresos mensuales: ");
    ingr = sc.nextDouble();

    System.out.print("Ingrese su puntaje crediticio: ");
    punt = sc.nextInt();

    System.out.print("Ingrese su antigüedad laboral en años: ");
    antig = sc.nextDouble();

    if (ingr > 5000000) {
        crit++;
    }

    if (punt > 750) {
        crit++;
    }

    if (antig > 2) {
        crit++;
    }


    if (crit == 3) {
        System.out.println("Crédito Aprobado.");
    } else if (crit >= 2) {
        System.out.println("Crédito Condicionado.");
    } else {
        System.out.println("Crédito Rechazado.");
    }

}
~~~

---

## Conceptos de Java utilizados

### Scanner

Se utiliza `Scanner` para recibir la información ingresada por el usuario.

~~~java
Scanner sc = new Scanner(System.in);
~~~

### Variables

El programa utiliza variables de diferentes tipos:

~~~java
double ingr;
int punt;
double antig;
int crit = 0;
~~~

### Estructura `if`

Se utiliza `if` para comprobar cada uno de los criterios.

~~~java
if (ingr > 5000000) {
    crit++;
}
~~~

### Estructura `else if`

Se utiliza `else if` para comprobar si se cumplen al menos dos criterios.

~~~java
else if (crit >= 2) {
    System.out.println("Crédito Condicionado.");
}
~~~

### Estructura `else`

Se utiliza `else` cuando no se cumplen las condiciones anteriores.

~~~java
else {
    System.out.println("Crédito Rechazado.");
}
~~~

### Operadores de comparación

En el programa se utilizan los siguientes operadores:

- `>` para comprobar si un valor es mayor que otro.
- `==` para comprobar si un valor es igual a otro.
- `>=` para comprobar si un valor es mayor o igual a otro.

### Operador de incremento

Se utiliza `++` para aumentar el contador `crit`.

~~~java
crit++;
~~~

Cada vez que se cumple un criterio, el valor de `crit` aumenta en uno.

---

## Flujo del programa

~~~text
Inicio
   |
   v
Ingresar ingresos mensuales
   |
   v
Ingresar puntaje crediticio
   |
   v
Ingresar antigüedad laboral
   |
   v
Evaluar ingresos > 5000000
   |
   +---- Se cumple ----> crit++
   |
   v
Evaluar puntaje > 750
   |
   +---- Se cumple ----> crit++
   |
   v
Evaluar antigüedad > 2
   |
   +---- Se cumple ----> crit++
   |
   v
Evaluar valor de crit
   |
   +---- crit == 3 ----> Crédito Aprobado
   |
   +---- crit >= 2 ----> Crédito Condicionado
   |
   +---- En otro caso -> Crédito Rechazado
   |
   v
Fin
~~~

---

## Evidencia de la ejecución del programa 

<img width="1361" height="717" alt="image" src="https://github.com/user-attachments/assets/faebed81-8965-4521-9ad8-689cc3087e90" />

---

# Ejercicio 5
## Introducción

En este ejercicio se desarrolla un programa en Java para clasificar a los pasajeros de una aerolínea de acuerdo con la cantidad de vuelos realizados durante el año y si cuentan con una membresía activa.

El programa permite obtener una de las siguientes categorías:

- **Categoría Oro**
- **Categoría Plata**
- **Categoría Básica**

Además, el programa determina si el pasajero tiene **acceso VIP**.

---

## Objetivo

Aplicar el uso de estructuras condicionales `if` anidados y condiciones múltiples en Java para clasificar a un pasajero según los datos ingresados.

El programa debe mostrar:

- La categoría obtenida.
- Si el pasajero tiene acceso VIP.

---

## Condiciones del ejercicio

### Categoría Oro

El pasajero obtiene la categoría **Oro** cuando:

- Tiene más de `50` vuelos en el año.
- Tiene una membresía activa.

### Categoría Plata

El pasajero obtiene la categoría **Plata** cuando:

- Tiene entre `20` y `50` vuelos.
- Tiene una membresía activa.

### Categoría Básica

El pasajero obtiene la categoría **Básica** cuando:

- Tiene menos de `20` vuelos.
- O no posee una membresía activa.

### Acceso VIP

El pasajero recibe **acceso VIP** cuando:

- Pertenece a la categoría **Oro**.
- Tiene más de `70` vuelos.

---

## Proceso del programa

### 1. Crear el Scanner

El programa utiliza la clase `Scanner` para recibir los datos ingresados por el usuario.

~~~java
Scanner sc = new Scanner(System.in);
~~~

El objeto utilizado para leer los datos se llama `sc`.

---

### 2. Declaración de variables

Se utilizan las siguientes variables:

~~~java
int vuelos;
String membresia;
String categoria;
boolean vip = false;
~~~

### `vuelos`

La variable `vuelos` almacena la cantidad de vuelos realizados por el pasajero durante el año.

Es de tipo `int` porque representa una cantidad de vuelos.

### `membresia`

La variable `membresia` almacena la respuesta del usuario sobre si tiene una membresía activa.

Es de tipo `String` porque almacena texto.

### `categoria`

La variable `categoria` almacena la categoría obtenida por el pasajero.

Puede recibir los valores:

- `Oro`
- `Plata`
- `Básica`

### `vip`

La variable `vip` es de tipo `boolean` y permite determinar si el pasajero tiene acceso VIP.

Inicialmente se establece en:

~~~java
boolean vip = false;
~~~

Esto significa que al comenzar el programa el pasajero no tiene acceso VIP.

---

## 3. Solicitar la cantidad de vuelos

El programa solicita al usuario la cantidad de vuelos realizados durante el año:

~~~java
System.out.print("Ingrese la cantidad de vuelos realizados en el año: ");
vuelos = sc.nextInt();
~~~

El valor ingresado queda almacenado en la variable `vuelos`.

---

## 4. Solicitar la membresía

Después de ingresar la cantidad de vuelos, el programa solicita si el pasajero tiene una membresía activa:

~~~java
sc.nextLine();

System.out.print("¿Tiene membresía activa? (si/no): ");
membresia = sc.nextLine();
~~~

Se utiliza `nextLine()` después de `nextInt()` para poder leer correctamente la respuesta de texto.

---

## 5. Evaluar la categoría Oro

El programa primero verifica si el pasajero tiene más de `50` vuelos:

~~~java
if (vuelos > 50) {
~~~

Si tiene más de `50` vuelos, se realiza otra comprobación para verificar si tiene una membresía activa:

~~~java
if (membresia.equalsIgnoreCase("si")) {
    categoria = "Oro";
}
~~~

Para obtener la categoría Oro se deben cumplir las dos condiciones:

- Tener más de `50` vuelos.
- Tener una membresía activa.

---

## 6. Evaluar el acceso VIP

Una vez que el pasajero obtiene la categoría Oro, el programa verifica si tiene más de `70` vuelos:

~~~java
if (vuelos > 70) {
    vip = true;
}
~~~

Si se cumple esta condición, la variable `vip` cambia de `false` a `true`.

Por lo tanto, el pasajero tendrá acceso VIP.

---

## 7. Categoría Básica por falta de membresía

Si el pasajero tiene más de `50` vuelos pero no posee una membresía activa, el programa asigna la categoría Básica:

~~~java
else {
    categoria = "Básica";
}
~~~

Esto significa que tener más de `50` vuelos no es suficiente para obtener la categoría Oro, ya que también se necesita una membresía activa.

---

## 8. Evaluar la categoría Plata

Si el pasajero no tiene más de `50` vuelos, el programa evalúa si tiene entre `20` y `50` vuelos:

~~~java
else if (vuelos >= 20 && vuelos <= 50) {
~~~

Aquí se utiliza el operador lógico `&&`.

Las dos condiciones deben cumplirse:

- `vuelos >= 20`
- `vuelos <= 50`

Después se verifica si tiene una membresía activa:

~~~java
if (membresia.equalsIgnoreCase("si")) {
    categoria = "Plata";
}
~~~

Para obtener Plata se deben cumplir:

- Tener entre `20` y `50` vuelos.
- Tener una membresía activa.

---

## 9. Categoría Básica

Si el pasajero tiene entre `20` y `50` vuelos pero no posee membresía activa, obtiene la categoría Básica.

También obtiene la categoría Básica cuando tiene menos de `20` vuelos.

---

## Tabla de clasificación

| Cantidad de vuelos | Membresía activa | Categoría |
|---:|---|---|
| Más de 50 | Sí | Oro |
| Más de 50 | No | Básica |
| Entre 20 y 50 | Sí | Plata |
| Entre 20 y 50 | No | Básica |
| Menos de 20 | Sí | Básica |
| Menos de 20 | No | Básica |

---

## Tabla de acceso VIP

| Categoría | Cantidad de vuelos | Acceso VIP |
|---|---:|---|
| Oro | Más de 70 | Sí |
| Oro | Entre 51 y 70 | No |
| Plata | Entre 20 y 50 | No |
| Básica | Menos de 20 | No |
| Básica | Más de 50 sin membresía | No |

El acceso VIP solamente se activa cuando el pasajero pertenece a la categoría Oro y tiene más de `70` vuelos.

---

## Ejemplos de ejecución

### Ejemplo 1 - Categoría Oro con acceso VIP

Datos ingresados:

~~~text
Ingrese la cantidad de vuelos realizados en el año: 80
¿Tiene membresía activa? (si/no): si
~~~

Evaluación:

- Tiene más de `50` vuelos: cumple.
- Tiene membresía activa: cumple.
- Tiene más de `70` vuelos: cumple.

Resultado:

~~~text
Categoría obtenida: Oro
Acceso VIP: Sí
~~~

---

### Ejemplo 2 - Categoría Oro sin acceso VIP

Datos ingresados:

~~~text
Ingrese la cantidad de vuelos realizados en el año: 60
¿Tiene membresía activa? (si/no): si
~~~

Evaluación:

- Tiene más de `50` vuelos: cumple.
- Tiene membresía activa: cumple.
- Tiene más de `70` vuelos: no cumple.

Resultado:

~~~text
Categoría obtenida: Oro
Acceso VIP: No
~~~

---

### Ejemplo 3 - Categoría Plata

Datos ingresados:

~~~text
Ingrese la cantidad de vuelos realizados en el año: 30
¿Tiene membresía activa? (si/no): si
~~~

Evaluación:

- Tiene entre `20` y `50` vuelos: cumple.
- Tiene membresía activa: cumple.
- No pertenece a Oro, por lo tanto no tiene acceso VIP.

Resultado:

~~~text
Categoría obtenida: Plata
Acceso VIP: No
~~~

---

### Ejemplo 4 - Categoría Básica

Datos ingresados:

~~~text
Ingrese la cantidad de vuelos realizados en el año: 15
¿Tiene membresía activa? (si/no): si
~~~

Evaluación:

- Tiene menos de `20` vuelos.
- No cumple las condiciones para Oro ni Plata.

Resultado:

~~~text
Categoría obtenida: Básica
Acceso VIP: No
~~~

---

## Código completo

~~~java
import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vue;
        String memb;
        String cat;
        boolean vip = false;

        System.out.print("Ingrese la cantidad de vuelos realizados en el año: ");
        vue = sc.nextInt();

        sc.nextLine();

        System.out.print("¿Tiene membresía activa? (si/no): ");
        memb = sc.nextLine();

        if (vue > 50) {

            if (memb.equalsIgnoreCase("si")) {
                cat = "Oro";

                if (vue > 70) {
                    vip = true;
                }

            } else {
                cat = "Básica";
            }

        } else if (vue >= 20 && vue <= 50) {

            if (memb.equalsIgnoreCase("si")) {
                categoria = "Plata";
            } else {
                categoria = "Básica";
            }

        } else {
            categoria = "Básica";
        }

        System.out.println("Categoría obtenida: " + cat);

        if (vip) {
            System.out.println("Acceso VIP: Sí");
        } else {
            System.out.println("Acceso VIP: No");
        }
    }
}
~~~

---

## Conceptos de Java utilizados

### Scanner

Se utiliza `Scanner` para recibir información desde el teclado.

~~~java
Scanner sc = new Scanner(System.in);
~~~

### Variables

Se utilizan variables de diferentes tipos:

~~~java
int vue;
String memb;
String cat;
boolean vip = false;
~~~

### If anidados

Los `if` anidados permiten realizar una comprobación dentro de otra condición.

Por ejemplo:

~~~java
if (vue > 50) {

    if (memb.equalsIgnoreCase("si")) {
        cat = "Oro";
    }

}
~~~

Primero se verifica si el pasajero tiene más de `50` vuelos y después se verifica si tiene una membresía activa.

### Else if

Se utiliza `else if` para evaluar el rango correspondiente a la categoría Plata:

~~~java
else if (vue >= 20 && vue <= 50) {
~~~

### Else

Se utiliza `else` para asignar la categoría Básica cuando no se cumplen las condiciones anteriores.

### Operador lógico `&&`

El operador `&&` permite comprobar dos condiciones al mismo tiempo:

~~~java
vue >= 20 && vue <= 50
~~~

Para que esta condición sea verdadera, ambas comparaciones deben cumplirse.

### Boolean

La variable `vip` utiliza el tipo `boolean`:

~~~java
boolean vip = false;
~~~

Puede tener dos valores:

- `true` → Tiene acceso VIP.
- `false` → No tiene acceso VIP.

---

## Evidencia ejecución programa

<img width="1355" height="717" alt="image" src="https://github.com/user-attachments/assets/bc41ac19-da5d-42a0-81eb-0ed002bcccd4" />



## IV. Preguntas

### ¿Cuál es la principal diferencia entre `++variable` y `variable++`?

La principal diferencia es el momento en que se realiza el incremento.

- `++variable` es **preincremento**: primero aumenta el valor de la variable y después utiliza ese nuevo valor.
- `variable++` es **posincremento**: primero utiliza el valor actual y después aumenta la variable.

---

### ¿Qué estructura `if` considera más adecuada para situaciones complejas y por qué?

Para situaciones complejas considero que la estructura **`if - else if - else`** es una de las más adecuadas, porque permite evaluar diferentes condiciones de manera ordenada y ejecutar una acción dependiendo de cuál condición se cumpla.

Por ejemplo:

    if (nota >= 90) {
        System.out.println("Excelente");
    }
    else if (nota >= 70) {
        System.out.println("Aprobado");
    }
    else {
        System.out.println("No aprobado");
    }

Esta estructura permite organizar diferentes posibilidades sin tener que utilizar varios `if` independientes.

---

### ¿Qué dificultades encontró durante el desarrollo?

verdaderamente, durante el desarrollo de la actividad habian terminos y identificadores que no tenia muy claros. por lo que hizo que en la creación del codigo me hizo gastar mas tiempo del que pensé que usaria para la finalización del taller.

También fue necesario prestar atención al orden de las condiciones en las estructuras `if` y `else if`, ya que una condición colocada incorrectamente puede hacer que otra condición nunca llegue a ejecutarse.

Otra dificultad fue comprender el y saber organizar las terminaciones de las llaves, momentos que me votaba error constantemente hizo que se hiciera estresante la creación; para resultar siendo solo la falta de una llave de cierre.

---

### ¿Qué aprendizajes obtuvo durante la actividad?

Durante esta actividad aprendí a diferenciar correctamente el **preincremento (`++variable`)** del **posincremento (`variable++`)** y a comprender cómo cambia el resultado dependiendo del momento en que se realiza el incremento.

También aprendí y mejoré las formas de utilizar las estructuras **`if`, `else if` y `else`** para tomar decisiones dentro de un programa y a combinar condiciones utilizando operadores de comparación y operadores lógicos.

Además, comprendí la importancia de organizar correctamente las condiciones para que el programa funcione de acuerdo con lo esperado.

---

## V. Conclusión

La actividad permitió reforzar conocimientos fundamentales de programación en Java. El uso de operadores de incremento y estructuras condicionales es importante para desarrollar programas capaces de realizar operaciones y tomar decisiones de acuerdo con diferentes situaciones.

Comprender estos conceptos facilita el desarrollo de programas más organizados y permite avanzar hacia estructuras de programación más complejas.
