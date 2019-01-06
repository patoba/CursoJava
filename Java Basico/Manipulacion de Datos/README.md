## Manipulacion de Datos

### Indice

#### [1. Introducción]
>* Paquetes en Java
>* Encapsulamiento
>* Modificadores: final y static
>* Mutabilidad
>* Compilacion en java

#### [2. Clase Math]
>* Introducción
>* Constantes
>* Funciones trigonometricas
>* Funciones exponencial y logaritmica
>* Potencia y Raiz Cuadrada
>* Rendondeos de decimales
>* Numeros Aleatorios
>* Maximos y Minimos

#### [3. Clase String]
>* Introducción
>* Formato y Conversiones
>* Acciones sobre un String
>* Clase String Buffer

#### [4. Clases Envolventes]
>* Introducción
>* Autoboxing
>* Unboxing
>* Metodos Estaticos
>* Metodos de Instancia

#### [5. Enumeraciones]
>* Introducción
>* Creación

### Retornos
1. [Curso Java](https://github.com/patoba/Curso-Java 'Curso Java')
2. [Java Basico](https://github.com/patoba/Curso-Java/tree/master/Java%20Basico 'Java Basico')
- - - -


### 1. Introducción
#### 1.1 Paquetes en Java
Un paquete es un conjunto de clases, interfaces, enumeraciones, excepciones, errores, anotaciones y otros paquetes que cumplen un determinado objetivo. Asi como las clases siguen la notación UpperCammelCase, los paquetes siguen la siguiente notacion:

1. Todo el nombre va con minusculas
2. Para separar palabras se usa puntos.

Por ejemplo: `este.es.un.ejemplo`

Los paquetes mas importantes de java son:
* **java.lang:** Posee todas las clases necesarias para el funcionamiento de Java, no se requiere importar ninguna clase de este paquete puesto que todas las clases del paquete se importan por defecto. Contiene clases como String, Clases Envolventes, Clase Math, Object
* **java.util:** Posee clases con funciones utiles (aunque no indispensables) para el funcionamiento de Java. Como scaner, las ArrayList.
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

No es recomendable importar todas las clases de un paquete, porque hace al compilador un poco mas lento y genera errores si tenemos dos o mas clases con el mismo nombre. 

#### 1.2 Encapsulamiento
Encapsulamiento consiste en la ocultación de los atributos (campos) para que las demas clases (o determinadas) no puedan acceder directamente a ellos. En Java el encapsulamiento se representa con modificadores de acceso, en esta tabla se representa su valor:

| Visibilidad                                | public | protected | default | private |
|--------------------------------------------|--------|-----------|---------|---------|
| Desde la misma clase                       | Si     | Si        | Si      | Si      |
| Desde cualquier clase del mismo paquete    | Si     | Si        | Si      | No      |
| Desde una subclase del mismo paquete       | Si     | Si        | Si      | No      |
| Desde una subclase fuera del mismo paquete | Si     | Si        | No      | No      |
| Desde cualquier clase fuera del paquete    | Si     | No        | No      | NO      |

**Notas:**
* Subclase hace referencia a conceptos de herencia (se ve posteriormente).
* Los modificadores de acceso se pueden aplicar a metodos, atributos, clases, interfaces, enumeraciones y excepciones. 

#### 1.3 Modificadores: final y static
Un modificador permite realizar un cambio en una variable, metodo o clase.
##### 1.3.1 Final
Final esta realcionado con la incapacidad para modificar una variable, metodo o clase. Final aplicado a un atributo, permite establecer dicho atributo como constante. Por ejemplo:

```
public class Ejemplo{
  final float PI = 3.14;
...
}
```

Una constante debe poseer su nombre en mayuscula, y de preferencia poseer el modificador de acceso public.

Final aplicado a un metodo, establece que dicho metodo no peude ser sobreescrito en una clase hija

```
public class Ejemplo{

  public final void ejemploMetodo(){
    ...
  }
  ...
}
```

Final aplicado a una clase, establece que ninguna clase pueda heredar de ella. Por ejemplo:

```
public final class Ejemplo{
...
}
```

##### 1.3.2 Static
Static esta relacionado con la no instancia de las cosas. Static aplicado a un atributo, permite que esta sea igual para cualquier intancia de la clase y puede ser accedida (si los modificadores de acceso lo permiten) por otra clase sin la necesidad de crear una instancia. Ejemplo:

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

Static aplicado a un metodo hace que ese metodo se pueda usar sin instanciar la clase, por ejemplo:


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

* **Objetos Mutables:** Objetos que si se pasan como parametro de una funcion ó si se utiliza alguno de sus metodos pueden afectar su contenido. Por ejemplo: ArrayList
* **Objetos no Mutables**: Objetos que si se pasan como parametro de una funcion ó si se utiliza alguno de sus metodos no pueden afectar su contenido. Por ejemplo: String

Esto existe para conservar seguridad dentro de nuestro sistema.

#### 1.4 Compilacion en java


### 2. Clase Math
#### 2.1 Introducción
La clase Math es una clase de utilidad (clase que solo tiene metodos estaticos, posee el modificador final y su constructor es privado), que posee metodos y atributos relacionados con matematicas. Esta clase se encuentra en java.lang, asi que no hay que importala.

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


#### 2.5 Potencia y Raiz Cuadrada


#### 2.6 Rendondeos de decimales

#### 2.7 Numeros Aleatorios

#### 2.8 Maximos y Minimos

### 3. Clase String
#### 3.1 Introducción

#### 3.2 Formato y Conversiones

#### 3.3 Acciones sobre un String

#### 3.4 Clase String Buffer

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
* Pasado como parametro a un método que espera como parametro un objeto proveniente de una clase envolvente.
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

#### 5.2 Creación

