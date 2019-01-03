## Java Framework Collection

### Indice

#### [1. Estructuras de datos](https://github.com/patoba/Curso-Java/tree/master/Java%20Intermedio/Java%20Framework%20Collection#1-estructuras-de-datos-1)
>* Introducción
>* Estructuras de Datos Lineales
>* Estructuras de Datos no Lineales

#### [2. Java Framework Collection](https://github.com/patoba/Curso-Java/tree/master/Java%20Intermedio/Java%20Framework%20Collection#2-java-framework-collection-1)
>* Introducción
>* Objetivo
>* Composicion
>* Ventajas

#### [3. Interfaces base y sus métodos](https://github.com/patoba/Curso-Java/tree/master/Java%20Intermedio/Java%20Framework%20Collection#3-interfaces-base-y-sus-m%C3%A9todos-1)
>* Interfaz Iterable
>* Interfaz Collection 
>* Interfaz Map
>* Interfaz List
>* Interfaz Queue
>* Interfaz Set

#### [4. Clases provenientes de List](https://github.com/patoba/Curso-Java/tree/master/Java%20Intermedio/Java%20Framework%20Collection#4-clases-provenientes-de-list-1)
>* Clase ArrayList
>* Clase LinkedList
>* Clase Vector
>* ArrayList vs Vector vs LinkedList

#### [5. Clases provenientes de Queue y Deque](https://github.com/patoba/Curso-Java/tree/master/Java%20Intermedio/Java%20Framework%20Collection#5-clases-provenientes-de-queue-y-deque-1)
>* Clase Priority Queue
>* Clase ArrayDeque
>* Clase LinkedList
>* Priority Queue vs ArrayDeque vs LinkedList

#### [6. Clases proveniente de Set](https://github.com/patoba/Curso-Java/tree/master/Java%20Intermedio/Java%20Framework%20Collection#6-clases-proveniente-de-set-1)
>* Clase HashSet
>* Clase LinkedHashSet
>* Clase TreeSet
>* HashSet vs LinkedHashSet vs TreeSet

#### [7. Clases provenientes de Map](https://github.com/patoba/Curso-Java/tree/master/Java%20Intermedio/Java%20Framework%20Collection#7-clases-provenientes-de-map-1)
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
* **Crear**: Acción que permite insertar un elemento en la estructura de datos (insercion).
* **Read**: Acción pque permite leer la información almacenada en la estructura de datos.
* **Update**: Acción que permite actualizar un dato que se encuentra almacenado en la estructura de datos.
* **Delete**: Accion que permite borrar un elemento de la estructura de datos.

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
* Arreglo: Los datos se almacenan contiguamente en memoria. Puede ser de dos formas:
  - Arreglo Estatico: Arreglo que nunca cambia la cantidad de elementos en tiempo de ejecución
  - Arreglo Dinamico: Arreglo que cambia la cantidad de elementos en tiempo de ejecución
* Conjunto: Coleccion de varios datos únicos.
* Pila: Sigue la filosofia FIFO (FIRST-IN FIRST-OUT), es decir el primer elemento (dato) que entra a la estructura es el primero que sale.
* Cola: Sigue la filosofia LIFO (LAST-IN FIRST-OUT), es decir el ultimo elemento (dato) que entra a la estructura es el primero que sale. Puede ser de varios tipos:
  - Cola Simple: Cola que sigue la filosofia lifo.
  - Cola Doble: Cola que permite añadir un elemento al principio y al final y permite eliminar un elemento del principio y el final
  - Cola Circular Simple: Cola simple en donde el sucesor del ultimo elemento es el primero, y posee un tamaño fijo.
  - Cola Circular Doble: Cola doble en donde el sucesor del ultimo elemento es el primero y el antecesor del primer elemento es el ultimo, y posee un tamaño fijo.

* Lista: Coleccion de varios elementos almacenados ligadamente en memoria, puede ser de los siguiente tipos:
  - Lista Simple: Coleccion de varios elementos almacenados ligadamente en memoria, donde solo se requiere la dirección de memoria del elemento posterior.
  - Lista Doble: oleccion de varios elementos almacenados ligadamente en memoria, donde solo se requiere la dirección de memoria del elemento posterior y el antecesor.
  - Lista Circular Simple: Lista simple donde el sucesor del ultimo elemento es el primero, y posee un tamaño fijo.
  - Lista Circular Doble: Lista doble en donde el sucesor del ultimo elemento es el primero y el antecesor del primer elemento es el ultimo, y posee un tamaño fijo.

**Notas:**

* El **maximo** hace referencia a que puede poseer cero sucesores (en este caso el dato es el ultimo) o cero antecesores (en este caso el dato es el primero).
* La cola y la pila son unicamente filosofias, estas requerien ya sea de una lista o un arreglo para poder implementarse
#### 1.3 Estructuras de Datos no Lineales
Las estructuras de datos no lienales son estructuras en las que se puede tener varios sucesores y varios antecesores. El ejemplo por excelencia de una estructura de datos es el grafo.

Un grafo G se compone de dos conjuntos, el conjunto de sus vertices V y el conjunto de sus aristas A. En otras palabras: G = {V, A}. Donde V es un conjunto no vacio donde se encuentran sus vertices, y A es un conjunto donde se encuentran las aristas.

Un árbol es una estructura de datos que cada elemento posee maximo un antecesor y puede poseer varios sucesores.

### 2. Java Framework Collection
#### 2.1 Introducción
Java Framework Collection (JFC) como su nombre lo indica es un framework que posee todas las estructuras de datos lineales, para facilitarnos la vida. En otros lenguajes (como C) si nosotros queremos usar alguna estructura de datos que no sea el arreglo, tendremos que programarla manualmente.
#### 2.2 Objetivo
JFC posee los siguientes objetivos:
* El uso de las estructuras de datos es sencillo, práctico y eficiente.
* 
* 
#### 2.3 Composicion
JFC consiste en:
*
*
*
*
#### 2.4 Ventajas

### 3. Interfaces base y sus métodos
#### 3.1 Interface Iterable
#### 3.2 Interface Collection
#### 3.3 Interfaz Map
#### 3.4 Interface List
#### 3.5 Interface Queue
#### 3.6 Interface Set

### 4. Clases provenientes de List
#### 4.1 Clase ArrayList
#### 4.2 Clase LinkedList
#### 4.3 Clase Vector
#### 4.4 ArrayList vs Vector vs LinkedList

### 5. Clases provenientes de Queue y Deque
#### 5.1 Clase Priority Queue
#### 5.2 Clase ArrayDeque
#### 5.3 Clase LinkedList
#### 5.4 Priority Queue vs ArrayDeque vs LinkedList

### 6. Clases proveniente de Set
#### 6.1 Clase HashSet
#### 6.2 Clase LinkedHashSet
#### 6.3 Clase TreeSet
#### 6.4 HashSet vs LinkedHashSet vs TreeSet

### 7. Clases provenientes de Map
#### 7.1 Clase TreeMap
