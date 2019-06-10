## Encapsulamiento
### Indice

#### [1. Concepto de Encapsulamiento]()

#### [2. Paquetes]()
>* Convención de nombre
>* Creación
>* Paquetes más importantes de Java Api

#### [3. Modificadores de Acceso]()

#### [4. Métodos Especiales]()
>* Getters
>* Setters

#### [5. Mutabilidad]()
>* Concepto de mutabilidad en objetos
>* Clase String vs Clase StringBuilder

#### Retornos
1. [Java Basico](https://github.com/patoba/CursoJava/tree/master/Java%20Basico)
- - - -

### 1. Concepto de Encapsulamiento
El encapsulamiento busca controlar determinado acceso a información a una estructura de java, en el encapsulamiento se realiza la ocultación de los atributos (campos) y atributos para que de otras clases no puedan acceder directamente a ellos.

### 2. Paquetes
Un paquete es un conjunto de clases, interfaces, enumeraciones, excepciones, errores, anotaciones y otros paquetes que cumplen un determinado objetivo.

#### 2.1 Convención de nombre

Así como las clases siguen la notación UpperCammelCase, los paquetes siguen la siguiente notación:

1. Todo el nombre va con minúsculas.
2. Para separar palabras se usa puntos.

Por ejemplo: `este.es.un.ejemplo`

#### 2.2 Creación

Podemos crear paquetes usando la palabra reservada `package nombre.del.paquete;` (esta línea debe ser la primera de nuestro código), de esta forma indicamos que estamos en un paquete llamado "nombre.del.paquete", todo lo que queramos usar (clases, interfaces, excepciones, etc.) que no se encuentre en nuestro paquete hay que importarlo. Si no definimos un paquete se crea un paquete llamado `default`.

Para importar una clase de un paquete se realiza de la siguiente forma (por ejem: importar la clase ArrayList de java.util):

`
import java.util.ArrayList;
`

Para importar todas las clases de un paquete se realiza de la siguiente forma (por ejem: importar todas las clases de java.util):

`
import java.util.*;
`

No es recomendable importar todas las clases de un paquete, porque hace al compilador un poco más lento y genera errores si tenemos dos o más clases con el mismo nombre. 

#### 2.3 Paquetes más importantes de Java Api

Los paquetes mas importantes de java son:
* **java.lang:** Posee todas las clases necesarias para el funcionamiento de Java, no se requiere importar ninguna clase de este paquete puesto que todas las clases del paquete se importan por defecto. Contiene clases como String, Clases Envolventes, Clase Math, Object.
* **java.util:** Posee clases con funciones útiles (aunque no indispensables) para el funcionamiento de Java. Como Scanner, las ArrayList.
* **javax.swing:** Posee clases para realizar interfaces graficas.
* **java.math:**  Posee clases que permiten trabajar con cualquier entero y con cualquier decimal.
* **java.io:** Posee clases que continen funciones de entrada y salida.

### 3. Modificadores de Acceso

Un **modificador de acceso** es una palabra reservada permiten dar un nivel de seguridad mayor a nuestros programas restringiendo el acceso a diferentes elementos del mismo.

| Visibilidad                                | public | protected | default | private |
|--------------------------------------------|--------|-----------|---------|---------|
| Desde la misma clase                       | Si     | Si        | Si      | Si      |
| Desde cualquier clase del mismo paquete    | Si     | Si        | Si      | No      |
| Desde una subclase del mismo paquete       | Si     | Si        | Si      | No      |
| Desde una subclase fuera del mismo paquete | Si     | Si        | No      | No      |
| Desde cualquier clase fuera del paquete    | Si     | No        | No      | No      |

**Notas:**
* Subclase hace referencia a conceptos de herencia (se analiza posteriormente).
* Los modificadores de acceso se pueden aplicar a métodos, atributos, clases, interfaces, enumeraciones y excepciones. 

### 4. Métodos Especiales

#### 4.2 Getters
Un getter es un método especial que regresa el valor de un atributo, por convención lleva el nombre del método lleva la palabra get seguido del atributo escrito con upperCammelCase.

#### 4.2 Setters
Un setter es un método especial que establece un nuevo valor a un atributo, por convención lleva el nombre del método lleva la palabra set seguido del atributo escrito con upperCammelCase.

### 5. Mutabilidad

#### 5.1 Concepto de mutabilidad en objetos

Mutabilidad hace referencia al alteramiento de un objeto, es decir, poseemos objetos cuyo valor se puede modificar y otros cuyo valor no se puede modificar. Existen dos tipos de objetos en cuanto a su mutabilidad:


* **Objetos Mutables:** Objetos que pueden modificar su contenido una vez creado.  Por ejemplo: ArrayList
* **Objetos no Mutables**: Objetos que NO pueden modificar su contenido una vez creado. Por ejemplo: String

Esto existe para conservar seguridad dentro de nuestro sistema.

#### 5.2 Clase String vs Clase StringBuilder
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

StringBuffer es una clase con la que se puede trabajar con cadenas, StringBuffer no es tan intuitivo como la clase String pero StringBuffer permite generar objetos de tipo mutable, en general, StringBuffer es más rápido que la clase String pero es menos intuitivo. En la carpeta "Cadenas en Java" se incluyen ejemplos de los métodos de StringBuffer.
