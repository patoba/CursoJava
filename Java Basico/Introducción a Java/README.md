## Introducción a Java
### Indice

#### [1. Historia de Java]()

#### [2. Características de Java]()
>* Tipado
>* JVM
>* Recolector de Basura
>* JRE
>* JDK
>* Archivos .java, .class y .jar
>* Java Api

#### [3. Introducción a la terminal y línea de comandos]()

#### [4. Compilación y ejecución de programas]()

#### Retornos
1. [Java Basico](https://github.com/patoba/CursoJava/tree/master/Java%20Basico)
- - - -

### 1. Historia de Java
Java se creó como una herramienta de programación para ser usada en un proyecto de set-top-box en una pequeña operación denominada the Green Project en Sun Microsystems en el año 1991. El equipo (Green Team), compuesto por trece personas y dirigido por James Gosling, trabajó durante 18 meses en Sand Hill Road, en Menlo Park, en su desarrollo.


El lenguaje se denominó inicialmente Oak (por un roble que había fuera de la oficina de Gosling), luego pasó a denominarse Green tras descubrir que Oak era ya una marca comercial registrada para adaptadores de tarjetas gráficas, y finalmente se renombró como Java.


El lenguaje Java se creó con cinco objetivos principales:
1. Debería usar el paradigma de la programación orientada a objetos.
2. Debería permitir la ejecución de un mismo programa en múltiples sistemas operativos.
3. Debería incluir por defecto soporte para trabajo en red.
4. Debería diseñarse para ejecutar código en sistemas remotos de forma segura.
5. Debería ser fácil de usar y tomar lo mejor de otros lenguajes orientados a objetos, como C++.

**Curiosidades**
* Sigue la filosofia: "Write Once, Run Anywhere"
* Una de las teorias de su nombre viene de una cafetera que tenia el mismo nombre, otra de los acronimos: Just Another Vague Acronym, otra de sus fundadores: James Gosling, Arthur Van Hoff, y Andy Bechtolsheim

### 2. Características de Java
#### 2.1 Tipado
Un sistema de tipos define cómo un lenguaje de programación clasifica los valores y las expresiones en tipos, cómo se pueden manipular estos tipos y cómo interactúan.

Java es de tipado estatico, es decir, la comprobación de tipificación se realiza durante la compilación, y no durante la ejecución. 

Java es fuertemente tipado, es decir, dado el valor de una variable de un tipo concreto, no se puede usar como si fuera de otro tipo distinto a menos que se haga una conversión.

#### 2.2 JVM
Java Virtual Machine (JVM) ejecutable en una plataforma específica, capaz de interpretar y ejecutar instrucciones.

Encargado de administrar:
>* Carga y almacenamiento
>* Aritmética
>* Conversión de tipos
>* Creación y manipulación de objetos
>* Transferencias de control (branching)
>* Invocación y retorno a métodos

#### 2.3 Recolector de Basura
Garbage Collector es un proceso de JVM que administra la memoria automáticamente, en donde la desasignación de objetos es manejada por Java en lugar del programador.

#### 2.4 JRE
Programa que contiene lo suficiente para poder ejecutar programas de java, contiene a JVM. No permite compilar codigos unicamante ejecutarlos.

#### 2.5 JDK
Java Development Kit (JDK) programa que contiene herramientas para poder desarrollar programas de java. Este programa contiene al JRE.

#### 2.6 Archivos .java, .class y .jar
Java es un lenguaje compilado e interpretado. Cuando codificamos un programa de java lo hacemos en un archivo .java, ese archivo lo compilamos en un .class (o varios). Los archivos .class los podemos ejecutar con el JRE. Los .jar son un conjunto de archivos compresos mediante ZIP que en esencia es un programa final.

#### 2.7 Java Api
Conjunto de estructuras creadas por los creadores de java que da a los desarrolladores las herramientas para programar aplicaciones Java.

### 3. Introducción a la terminal y línea de comandos
Comandos basicos:
* cd "dir" - cambiarse al directorio dir
*	   . - Referencia al directorio actual
*	  .. - Referencia al directorio padre
* ls       - Muestra los archivos actuales
* mkdir    - Crea una carpeta
* rm       - Borra un archivo 
* cp       - Copia un archivo

### 4. Compilación y ejecución de programas

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
