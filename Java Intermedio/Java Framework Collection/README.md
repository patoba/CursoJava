## Java Framework Collection

### Indice

#### 1. Estructuras de datos
>* Introducción
>* Estructuras de Datos Lineales
>* Estructuras de Datos no Lineales

#### 2. Java Framework Collection
>* Introducción
>* Objetivo
>* Composicion
>* Ventajas

#### 3. Interfaces base y sus métodos
>* Interface Iterable
>* Interface Collection y Map
>* Interface List
>* Interface Queue
>* Interface Set

#### 4. Clases provenientes de List
>* Clase ArrayList
>* Clase LinkedList
>* Clase Vector
>* ArrayList vs Vector vs LinkedList

#### 5. Clases provenientes de Queue y Deque
>* Clase Priority Queue
>* Clase ArrayDeque
>* Clase LinkedList
>* Priority Queue vs ArrayDeque vs LinkedList

#### 6. Clases proveniente de Set
>* Clase HashSet
>* Clase LinkedHashSet
>* Clase TreeSet
>* HashSet vs LinkedHashSet vs TreeSet

#### 7. Clases provenientes de Map
>* Clase TreeMap

### Retornos
1. [Curso Java](https://github.com/patoba/Curso-Java 'Curso Java')
2. [Java Intermedio](https://github.com/patoba/Curso-Java/tree/master/Java%20Intermedio 'Java Intermedio')
- - - -
### 0. Conceptos Importantes
* **Interface:** 
* **Framework:** 
* **Concurrencia:** 
* **Dato:**  

### 1. Estructuras de datos
#### 1.1 Introducción
Una estructura de datos es la forma en la cual una computadora organiza los datos para ser manejado de forma eficiente. Las estructuras de datos se pueden clasificar de varias formas, en cuanto a tamaño de la estructura:
* **Estructura de Datos Estatica:** Siempre posee un tamaño fijo. (Por ejemplo: Un arreglo estatico)
* **Estructura de Datos Dinamica:** Su tamaño varia en tiempo de ejecución. (Por ejemplo: Una lista)

En cuanto a la relacion de los datos se clasifican en dos grupos, estos grupos son:
* **Estructuras de datos lineales:** Todos los datos posen maximo un sucesor y minimo un antecesores.
* **Estructuras de datos no lineales:** Los datos pueden tener n sucesores y n antecesores. Siendo n un numero entero mayor o igual a cero.

Las estruturas de datos pueden determinar la complejidad de un algoritmo, en general la elección de estructuras de datos eficientes permite la creación de algoritmos eficientes. Algunos métodos de diseño de software destacan las estructuras de datos en lugar de los algoritmos para diseñar.

Cada estructura de datos debe poseer un conjunto minimo de acciones (métodos), a estos se les conoce como el abc, o CRUD (create-Read-Update-Delete), y consiste en las siguientes acciones:
* **Crear**: Acción que permite crear la estructura de datos (si se programa en orientado a objetos sera su constructor).
* **Read**: Acción pque permite leer la información almacenada en la estructura de datos.
* **Update**: Acción que permite actualizar un dato que se encuentra almacenado en la estructura de datos.
* **Delete**: Accion que permite borrar toda la estructura de datos, mejor dicho, permite liberar las celdas de memoria que almacenan la información de la estructura de datos.

#### 1.2 Estructuras de Datos Lineales
Las estructuras de datos lineales son aquellas en las que cada dato posee maximo un sucesor y maximo un antecesor. 
##### 1.2.1 Almacenamiento Contiguo vs Ligado
* **Almacenamiento Contiguo**: Cada dato se encuentra almacenado seguidamente de otro en memoria.
* **Almacenamiento Ligado**: Cada dato se encuentra almacenado en una posicion x de memoria, pero cada dato posee la direccion de memoria del dato sucesor (nulo si es el ultimo).

No existe un almacenamiento 100% mejor que el otro, sino que uno se acopla más a las circunstancias en las que nos encontremos. Asi que analizaremos cada uno en sus funciones basicas:
* Almacenamiento Contiguo: Este permite agregar o eliminar un dato en tiempo constante, aunque ocupa un poco mas de memoria porque requiere la direccion de memoria del dato sucesor, el acceso a un elemento depende de la cantidad de datos en la estructura.
* Almacenamiento Ligado: Para poder agregar o eliminar un dato, copia todos los demas en un conjunto de localidades donde puedan estar juntos, por lo que el tiempo depende de la cantidad de datos. El acceso a un elemento es constante, ya que se sabe la localidad de memoria a la que se desea accesar.

*En conclusion*: El almacenamiento contiguo es mejor cuando trabajamos con una cantidad de datos pequeña y el almacenamiento ligado es mejor cuando trabajamos con grandes cantidadades de información.


#### 1.2. Ejemplos
* Arreglos: Los datos se almacenan contiguamente en memoria.
* Conjuntos: Coleccion de varios datos únicos.
* Pilas: Sigue la filosofia FIFO (FIRST-IN FIRST-OUT), es decir el primer elemento (dato) que entra a la estructura es el primero que sale.
* Colas: Sigue la filosofia LIFO (LAST-IN FIRST-OUT), es decir el ultimo elemento (dato) que entra a la estructura es el primero que sale. Puede ser de varios tipos:
  - Cola Simple: Cola que sigue la filosofia lifo.
  - Cola Doble: Cola que permite añadir un elemento al principio y al final y permite eliminar un elemento del principio y el final
  - Cola Circular Simple: Cola simple en donde el sucesor del ultimo elemento es el primero, y posee un tamaño fijo.
  - Cola Circular Doble: Cola doble en donde el sucesor del ultimo elemento es el primero y el antecesor del primer elemento es el ultimo, y posee un tamaño fijo.

* Lista: Coleccion de varios elementos almacenados ligadamente en memoria, puede ser de los siguiente tipos:
  - Lista Simple: Coleccion de varios elementos almacenados ligadamente en memoria, donde solo se requiere la dirección de memoria del elemento posterior.
  - Lista Doble: oleccion de varios elementos almacenados ligadamente en memoria, donde solo se requiere la dirección de memoria del elemento posterior y el antecesor.
  - Lista Circular Simple: Lista simple donde el sucesor del ultimo elemento es el primero, y posee un tamaño fijo.
  - Lista Circular Doble: Lista doble en donde el sucesor del ultimo elemento es el primero y el antecesor del primer elemento es el ultimo, y posee un tamaño fijo.

El **maximo** hace referencia a que puede poseer cero sucesores (en este caso el dato es el ultimo) o cero antecesores (en este caso el dato es el primero).
#### 1.3 Estructuras de Datos no Lineales


### 2. Java Framework Collection

### 3. Interfaces base y sus métodos

### 4. Clases provenientes de List

### 5. Clases provenientes de Queue y Deque

### 6. Clases proveniente de Set

### 7. Clases provenientes de Map
