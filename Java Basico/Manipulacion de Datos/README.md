## Manipulacion de Datos

### Indice

#### [1. Introducción](https://github.com/patoba/Curso-Java/tree/master/Java%20Basico/Manipulacion%20de%20Datos#1-introducci%C3%B3n-1)
>* Paquetes en Java
>* Encapsulamiento
>* Modificadores: final y static
>* Mutabilidad
>* Compilacion en java

#### [2. Clase Math](https://github.com/patoba/Curso-Java/tree/master/Java%20Basico/Manipulacion%20de%20Datos#2-clase-math-1)
>* Introducción
>* Constantes
>* Funciones trigonometricas
>* Funciones exponencial y logaritmica
>* Potencia y Raiz Cuadrada
>* Rendondeos de decimales
>* Numeros Aleatorios
>* Maximos y Minimos

#### [3. Clase String](https://github.com/patoba/Curso-Java/tree/master/Java%20Basico/Manipulacion%20de%20Datos#3-clase-string-1)
>* Introducción
>* Formato y Conversiones
>* Acciones sobre un String
>* Clase String Buffer

#### [4. Clases Envolventes](https://github.com/patoba/Curso-Java/tree/master/Java%20Basico/Manipulacion%20de%20Datos#4-clases-envolventes-1)
>* Introducción
>* Autoboxing
>* Unboxing
>* Metodos Estaticos
>* Metodos de Instancia

#### [5. Enumeraciones](https://github.com/patoba/Curso-Java/tree/master/Java%20Basico/Manipulacion%20de%20Datos#5-enumeraciones-1)
>* Introducción
>* Creación

### Retornos
1. [Curso Java](https://github.com/patoba/Curso-Java 'Curso Java')
2. [Java Basico](https://github.com/patoba/Curso-Java/tree/master/Java%20Basico 'Java Basico')
- - - -


### 1. Introducción
#### 1.1 Paquetes en Java
Un paquete es un conjunto de clases, interfaces, enumeraciones, excepciones, errores, anotaciones y otros paquetes que cumplen un determinado objetivo. Así como las clases siguen la notación UpperCammelCase, los paquetes siguen la siguiente notación:

1. Todo el nombre va con minúsculas.
2. Para separar palabras se usa puntos.

Por ejemplo: `este.es.un.ejemplo`

Los paquetes mas importantes de java son:
* **java.lang:** Posee todas las clases necesarias para el funcionamiento de Java, no se requiere importar ninguna clase de este paquete puesto que todas las clases del paquete se importan por defecto. Contiene clases como String, Clases Envolventes, Clase Math, Object.
* **java.util:** Posee clases con funciones útiles (aunque no indispensables) para el funcionamiento de Java. Como Scanner, las ArrayList.
* **javax.swing:** Posee clases para realizar interfaces graficas.
* **java.math:**  Posee clases que permiten trabajar con cualquier entero y con cualquier decimal.
* **java.io:** Posee clases que continen funciones de entrada y salida.

Para importar una clase de un paquete se realiza de la siguiente forma (por ejem: importar la clase ArrayList de java.util):

`
import java.util.ArrayList;
`

Para importar todas las clases de un paquete se realiza de la siguiente forma (por ejem: importar todas las clases de java.util):

`
import java.util.*;
`

No es recomendable importar todas las clases de un paquete, porque hace al compilador un poco más lento y genera errores si tenemos dos o más clases con el mismo nombre. 
Podemos crear paquetes usando la palabra reservada `package nombre.del.paquete;` (esta línea debe ser la primera de nuestro código), de esta forma indicamos que estamos en un paquete llamado "nombre.del.paquete", todo lo que queramos usar (clases, interfaces, excepciones, etc.) que no se encuentre en nuestro paquete hay que importarlo. Si no definimos un paquete se crea un paquete llamado `default`.

#### 1.2 Encapsulamiento
Encapsulamiento consiste en la ocultación de los atributos (campos) para que las demas clases (o determinadas) no puedan acceder directamente a ellos. En Java el encapsulamiento se representa con modificadores de acceso, en esta tabla se representa su valor:

| Visibilidad                                | public | protected | default | private |
|--------------------------------------------|--------|-----------|---------|---------|
| Desde la misma clase                       | Si     | Si        | Si      | Si      |
| Desde cualquier clase del mismo paquete    | Si     | Si        | Si      | No      |
| Desde una subclase del mismo paquete       | Si     | Si        | Si      | No      |
| Desde una subclase fuera del mismo paquete | Si     | Si        | No      | No      |
| Desde cualquier clase fuera del paquete    | Si     | No        | No      | No      |

**Notas:**
* Subclase hace referencia a conceptos de herencia (se ve posteriormente).
* Los modificadores de acceso se pueden aplicar a métodos, atributos, clases, interfaces, enumeraciones y excepciones. 

#### 1.3 Modificadores: final y static
Un modificador permite realizar un cambio en una variable, método o clase.

##### 1.3.1 Final
Final está relacionado con la incapacidad para modificar una variable, método o clase.  Final aplicado a un atributo, permite establecer dicho atributo como constante. Por ejemplo:

```
public class Ejemplo{
  final float PI = 3.14;
...
}
```

Una constante debe poseer su nombre en mayúscula, y de preferencia poseer el modificador de acceso public.

Final aplicado a un método, establece que dicho método no puede ser sobreescrito en una clase hija.

```
public class Ejemplo{

  public final void ejemploMetodo(){
    ...
  }
  ...
}
```

Final aplicado a una clase, establece que ninguna clase puede heredar de ella. Por ejemplo:

```
public final class Ejemplo{
...
}
```

##### 1.3.2 Static
Static está relacionado con la no instancia de las cosas. Static aplicado a un atributo, permite que esta sea igual para cualquier instancia de la clase y puede ser accedida (si los modificadores de acceso lo permiten) por otra clase sin la necesidad de crear una instancia. Ejemplo:

```
public class Ejemplo{
  public static float a = 3;
  ...
}

public class Ejemplo2{
  void metodo(){
    System.out.println(Ejemplo.a);
  }
  ...
}
```

Static aplicado a un método hace que ese método se pueda usar sin instanciar la clase, por ejemplo:


```
public class Ejemplo{
  void metodo(){
    System.out.println("Este es un ejemplo");
  }
  ...
}

public class Ejemplo2{
  void metodo2(){
    Ejemplo.metodo();
  }
  ...
}
```

static se puede aplicar a una clase, pero tiene que ser una clase anidada.

**Notas:**
* Se pueden combinar ambos modificadores y se conserva el efecto de los dos.

#### 1.4 Mutabilidad
Mutabilidad hace referencia a el alteramiento de un objeto, es decir, poseemos objetos cuyo valor se puede modificar y otros cuyo valor no se puede modificar. Existen dos tipos de objetos en cuanto a su mutabilidad:

* **Objetos Mutables:** Objetos que si se pasan como parámetro de una función ó si se utiliza alguno de sus métodos pueden afectar su contenido.  Por ejemplo: ArrayList
* **Objetos no Mutables**: Objetos que si se pasan como parámetro de una función ó si se utiliza alguno de sus métodos no pueden afectan su contenido. Por ejemplo: String

Esto existe para conservar seguridad dentro de nuestro sistema.

#### 1.5 Compilación en java

En java para compilar usamos el mando javac, este posee opciones adicionales:

```
javac [opciones adicionales] [nombre de archivo .java]
las opciones adicionales mas importantes son:
-d [ubicacion]  esta opcion (bandera) nos permite establecer donde queremos guardar los .class
-cp [ubicacion] esta bandera nos permite establecer donde se encuentra algunos .class que necesitamos
```

Por ejemplo, si deseamos compilar la class Ejemplo.java y queremos guardar la clase en una carpeta superior:

```
javac -d .. Ejemplo.java
```

Si queremos compilar todos los .java de una carpeta podemos usar el asterisco:

```
javac *.java
```

El comando java que sirve para ejecutar un programa posee tambien las banderas -d y -cp.

### 2. Clase Math
#### 2.1 Introducción
La clase Math es una clase de utilidad (clase que solo tiene métodos estáticos, posee el modificador final y su constructor es privado), que posee métodos y atributos relacionados con matemáticas. Esta clase se encuentra en java.lang, así que no hay que importarla.

#### 2.2 Constantes
Posee dos constantes:
* **e:** La base del logaritmo natural
* **pi:** La relación entre la longitud de una circunferencia y su diámetro.

Ambas constantes son de tipo float y se pueden usar asi:

```
float resultado = Math.E * Math.PI; // Resultado de multiplicar e por pi
```
#### 2.3 Funciones trigonometricas
Posee las funciones trigonometricas:

```
double senoDeNoventaGrados = Math.sin(Math.PI / 2);
double anguloCuyoCosenoEsNoventa = Math.asin(senoDeNoventaGrados);
double senoHiperbolico = Math.sin(Math.PI / 2);
```

**Nota:**
* Se debe trabajar en radianes.
* Tambien existe la del coseno y tangente.

#### 2.4 Funciones exponencial y logaritmica
La funcion exponencial en Math eleva el numero e a cualqueir numero flotante. En math se encuentran dos funciones de logaritmos una base 10 y la otra base e. Se incluyen ejemplos de estas funciones en la carpeta "Matematicas en Java".

Una funcion que permite hallar el logaritmo de cualquier base es:

```
public static double logaritmoBaseA(double num, double a){
    return Math.log10(num) / Math.log10(a);
}
```
#### 2.5 Potencia y Raiz Cuadrada
La clase Math incluye funciones para cualquier potencia y para raiz cuadrada. Se incluyen ejemplos de estas funciones en la carpeta "Matematicas en Java". 

#### 2.6 Rendondeos de decimales
Existen 4 tipos de redondeos usados en Math, esta funcion ejemplifica todos:

```
public static void diferentesRedondeosDeMath(double valor){
        int porFloor = (int)Math.floor(valor); // Hacia abajo
        int porCeil = (int)Math.ceil(valor); // Hacia arriba
        int porRound = (int)Math.round(valor); // Entero mas cercano a valor
        int porCasting = (int)valor; 
}
```

Se incluyen ejemplos de estas funciones en la carpeta "Matematicas en Java". 

#### 2.7 Numeros Aleatorios
Math permite crear numeros aleatorios. Se incluyen ejemplos de estas funciones en la carpeta "Matematicas en Java". 

#### 2.8 Maximos y Minimos
Math permite determinar el mayor y el menor de dos numeros. Se incluyen ejemplos de estas funciones en la carpeta "Matematicas en Java". 

### 3. Clase String
#### 3.1 Introducción
La clase String pertenece a java.lang por lo que no hay que importarla, la clase String permite representar texto en un programa en Java, aunque no es la única clase que permite esto es la más intuitiva y más usada.  Cabe destacar que los objetos pertenecientes a String son inmutables, es decir, una vez establecidos su valor estos no cambian. Cualquier función que se le aplique a un objeto de tipo String crea un nuevo objeto como resultado de la acción.

La clase String es un poco compleja en el uso de constructores, dado el siguiente código:

```
String cadena = "Texto";
String cadena2 = "Texto";
String cadena3 = new String("Texto");
```

Si recordamos lo que el operador == hace, nos regresa true si a == b, a y b se encuentran en la misma direccion de memoria. El resultado de ese operador en las variables es:
* cadena == cadena2   -> True
* cadena2 == cadena3  -> False
* cadena == cadena3   -> False

Normalmente la máquina virtual de java hace que los objetos que tengan la misma cadena en su interior apunten a la misma dirección de memoria, pero al momento de usar el constructor se fuerza a apuntar a una nueva dirección de memoria a pesar que internamente posean la misma información, es una mala práctica.

En generar, para comparar objetos hay que utilizar el metodo .equals() en vez del operador == porque este genera fallas en algunas ocaciones.

#### 3.3 Acciones sobre un String
En la carpeta "Cadenas en Java" se incluyen ejemplos de los metodos de String.

#### 3.4 Clase StringBuffer
StringBuffer es una clase con la que se puede trabajar con cadenas, StringBuffer no es tan intuitivo como la clase String pero StringBuffer permite generar objetos de tipo mutable, en general, StringBuffer es más rápido que la clase String pero es menos intuitivo. En la carpeta "Cadenas en Java" se incluyen ejemplos de los métodos de StringBuffer.

### 4. Clases Envolventes
#### 4.1 Introducción
Las clases envolventes son clases que permiten funcionalidades extras a los tipos primitivos, estas funcionalidades son:
* Posibilidad de comportarse como un objeto en una determinada circunstancia (Autoboxing).
* Caster de un String a los tipos de datos primitivos.
* Contener métodos y atributos que dan una funcionalidad extra a los mismos.

La tabla de relación de los tipos de datos primitivos es:

| Tipo Primitivo | Clase Envolvente |
|----------------|------------------|
| boolean        | Boolean          |
| byte           | Byte             |
| char           | Character        |
| float          | Float            |
| int            | Integer          |
| long           | Long             |
| short          | Short            |
| double         | Double           |

#### 4.2 AutoBoxing
Convertir de un tipo primitivo a un objeto de su clase envolvente. Se realiza cuando:
* Pasado como parametro a un método que espera como parámetro un objeto proveniente de una clase envolvente.
* Asignado a una variable que corresponda a una clase envolvente

Por ejemplo:

```
Character c = 'c'
Integer i = 4;
```

```
public static void ejemplo(Integer i){
  ....
}

public static void main(String[] args){
  ejemplo(2);
}
```

#### 4.3 Unboxing
Convertir de un objeto de una clase envolvente a su respectivo tipo primitivo. Java lo realiza cuando:
* Cuando el objeto es pasado como parametro a un método que espera su correspondiente tipo primitivo.
* Cuando el objeto se asigna a una variable correspondiente a su tipo primitivo.

Por ejemplo:
```
char c = new Character('c');
int i = new Integer(4);
```

```
public static void ejemplo(int i){
  ....
}

public static void main(String[] args){
  ejemplo(new Integer(2));
}
```

#### 4.4 Metodos Estaticos
Revisar los codigos de la carpeta "Clase Envolvente" estan relacionado con esto.
#### 4.5 Metodos de Instancia
Revisar los codigos de la carpeta "Clase Envolvente" estan relacionado con esto.
### 5. Enumeraciones
#### 5.1 Introducción
Las enumeraciones son un tipo especial en java que se asemejan a una clase que establecen un conjunto predefinido de variables constantes, cada variable proveniente de una determinada enumeración debe valer un valor predefinido por esta.  Se debe usar enum **siempre** que se posea un conjunto fijo de constantes por su velocidad. Todos los enum heredan de java.lang.Enum por y poseen el método values() que regresa un arreglo de todas las constantes del enum.


A un valor del enum se le pueden aplicar los siguientes metodos:

| Tipo   | Metodo      | Descripcion                                       |
|--------|-------------|---------------------------------------------------|
| String | name()      | Regresa el nombre del valor del enum              |
| int    | ordinal()   | Posicion de la constante dentro del enum          |
| int    | compareTo() | Compara dos constantes del enum segun su posicion |

#### 5.2 Creación
Un enum se crea de forma similar a una clase:

```
public enum Ejemplo{
  VALOR1, VALOR2, VALOR3
}
```

**Notas:**
* Los nombres de los valores van con mayuscula porque son constantes
* A un enum solo se le puede aplicar los modificadores de acceso private y default
* Un enum puede tener metodos, atributos y constructor.
* Se incluyen ejemplos en la carpeta "Enumeraciones"
