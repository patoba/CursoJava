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
>* Boxing
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
Final aplicado a un atributo, permite establecer dicho atributo como constante. Por ejemplo:

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
Static esta relacionado c

#### 1.4 Mutabilidad


#### 1.4 Compilacion en java


### 2. Clase Math
#### 2.1 Introducción
#### 2.2 Constantes
#### 2.3 Funciones trigonometricas
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
#### 4.2 Boxing
#### 4.3 Unboxing
#### 4.4 Metodos Estaticos
#### 4.5 Metodos de Instancia

### 5. Enumeraciones
#### 5.1 Introducción
#### 5.2 Creación
