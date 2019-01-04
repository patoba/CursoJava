## Java Framework Collection

### Indice

#### [1. Estructuras de datos](https://github.com/patoba/Curso-Java/tree/master/Java%20Intermedio/Java%20Framework%20Collection#1-estructuras-de-datos-1)
>* Introducción
>* Estructuras de Datos Lineales
>* Estructuras de Datos no Lineales

#### [2. Java Framework Collection](https://github.com/patoba/Curso-Java/tree/master/Java%20Intermedio/Java%20Framework%20Collection#2-java-framework-collection-1)
>* Introducción
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
Java Collection Framework  (JCF) como su nombre lo indica es un framework que posee todas las estructuras de datos lineales, para facilitarnos la vida. En otros lenguajes (como C) si nosotros queremos usar alguna estructura de datos que no sea el arreglo, tendremos que programarla manualmente.
#### 2.2 Composicion
JCF consiste en:
* **Coleccion de Interfaces:** La base del framework son estas interfaces, que implementan los distintos tipos de colección (estructuras de datos lineales) como pilas, colas, listas, conjuntos.
* **Clases Principales:** Son clases que implementan una o una serie de coleccion de interfaces y son las que usamos comunmente.
* **Implementaciones Abstractas:** Existen implementacion abstractas de las clases principales, que mediante estas, podemos dar una configuracion especifica para su uso.
* **Algoritmos:** Metódos estaticos que permiten realizar acciones muy comunes sobre cualquier objeto creado a partir de una colección del jfc, por ejemplo ordenar una lista.
* **Implementación en Concurrencia:** Existen clases que estan hechas para trabajar con hilos, por ejemplo java.util.Vector

Un diagrama que reprensenta el JCF es:


**Cosas importantes del diagrama:**
* Las principales interfaces usadas son Collection y Map. Mas adelante hablaremos de ellas.
* LinkedList implementa dos interfaces List y Queue

#### 2.3 Ventajas
* Reduce el tiempo de programar
* Reduce el tiempo de aprender api's sobre estructuras de datos, puesto que es suficiente aprender una.

### 3. Interfaces base y sus métodos
  
#### 3.1 Interfaz Iterator
La interfaz Iterator`<E>` permite que un objeto que implementa esta clase posea una serie de elementos, uno en a la vez. Donde `<E>` es una clase cualquiera con la que deseamos trabajar. Esta interfaz posee la misma funcionalidad que Enumeration`<E>`.
  
Esta interfaz es una mejora de la interfaz Enumeration`<E>`, se diferencia en que posee metodos con nombres mas cortos, y posee un metodo para eliminar un elemento de la serie de elementos.
  
Para checar todos los metodos [presiona aqui](https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html)

#### 3.2 Interfaz Iterable
La interfaz Iterable permite que el objeto instanciado de una clase que implemente esta interfaz pueda ser puesto en un for-each. La interfaz Iterable se llama realmente Iterable`<T>` donde `<T>` puede ser cualquier clase ya sea de la Java Api o creada por un programador.

Para ver todos los metodos [presiona aqui](https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html)

#### 3.3 Interface Collection
La interfaz Collection`<E>` hereda de Iterable`<E>` y es la raíz de todas las colecciones del JCF, existen colecciones que estan ordenadas otras que no, existen colecciones que son elementos único otras que no. Collection es el padre de 3 interfaces que cumplen con este objetivo: Set, List, Queue. 

Todas las clases que implementen en algun momento Collection poseen por lo menos 2 constructores: 
* *Con parametros nulos:* Permite la creación de una estructura vacia.
* *Como parametro un objecto Collection:* Realiza una copia del objeto pasado como parametro en el objeto a crear.

Los metodos mas importantes de la interfaz Collection`<E>` son:

| Dato de Retorno | Cabecera             | Descripción                                                                                                           |
|-----------------|----------------------|-----------------------------------------------------------------------------------------------------------------------|
| boolean         | add(E ejemplo)       | Agrega un elemento a la colección. Regresa true si pudo hacerlo.                                                      |
| void            | clear()              | Borra todos los elementos de la colección                                                                             |
| boolean         | contains(E ejemplo)  | Regresa true si se encuentra el objeto ejemplo en la colección                                                        |
| boolean         | isEmpty()            | Regresa true si la coleccion esta vacia.                                                                              |
| boolean         | remove(Tipo ejemplo) | Borra el objeto ejemplo de la colección, regresa true si lo pudo hacer y false si no existe el objeto en la colección |
| int             | size()               | Determina el tamaño de la colección                                                                                   |
| E[]             | toArray()            | Regresa un arreglo estático de la colección                                                                           |

Para checar el resto de metodos [haz click aqui](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html)

#### 3.4 Interfaz Map
La interfaz Map no esta relacionada con Collection, porque su filosofia es almacenar elementos que posean una llave unica, es decir, almacena de la forma clave-valor. Cabe resaltar que cada clave es unica, y dos o mas claves pueden estar asociadas a un mismo valor. Esta interfaz es implementada por varias clases que hablaremos de ellas mas adelante.

En una interfaz Map<K,V> K es la clase a las que pertenece el conjunto de llaves y V es la clase a las que pertenece el conjutno de valores. Hay que tener cuidado con el conjunto de claves, puesto que no se pueden repetir, y con usar objetos mutables como llaves.

Algunos métodos importantes de Map son:

| Dato de Retorno | Cabecera                  | Descripción                                                                                                                |
|-----------------|---------------------------|----------------------------------------------------------------------------------------------------------------------------|
| void            | clear()                   | Borra todas las claves-valor del mapa                                                                                      |
| boolean         | containsKey(K clave)      | Determina si la clave está en el mapa                                                                                      |
| boolean         | containsValue(V valor)    | Determina si existe el valor asociado al mapa                                                                              |
| V               | get(K clave)              | Regresa el valor asociado a la clave pasada como parámetro                                                                 |
| boolean         | isEmpty()                 | Regresa true si el mapa está vacío y false en caso contrario                                                               |
| Set`<K>`         | keySet()                  | Regresa un set con todas las claves del mapa                                                                               |
| K               | remove(K clave)           | Elimina la clave (y su valor asociado) del mapa, y regresa el valor asociado                                               |
| V               | put(K clave, V valor)     | Inserta la clave-valor en el mapa y regresa el valor pasado por parámetro                                                  |
| K               | replace(K clave, V valor) | Reemplaza el valor de la clave (pasada por parámetro), con el nuevo valor pasada por parámetro, y regresa el antiguo valor |
| int             | size()                    | Regresa la cantidad almacenada de clave-valor en el mapa                                                                   |
| Collection`<V>`   | values()                  | Regresa una colección con los valores del mapa                                                                             |
  
Para ver el resto de métodos [haz click aqui](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)

#### 3.5 Interface List
La interfaz List`<E>` hereda de la interfaz Collection, por lo que posee todos sus métodos. Un objeto que proviene de List posee una colección de objetos donde se pueden repetir. Aunque se llame List no necesariamente es un estructura de datos lista. En una interfaz List el usuario puede insertar elementos, eliminar elementos y buscar elementos a su antojo.

Algunos métodos nuevos de List son:

| Dato de Retorno | Cabecera                  | Descripción                                                                                                       |
|-----------------|---------------------------|-------------------------------------------------------------------------------------------------------------------|
| E               | remove(int indice)        | Elimina el objeto ubicado en el índice y lo regresa.                                                              |
| E               | set(int indice, E objeto) | Sobreescribe el objeto que se encuentra en el índice con el recibido como parámetro y regresa el anterior objeto. |
| int             | lastIndexOf(Tipo objeto)  | Regresa el índice de la última ocurrencia del objeto dado.                                                                                                           |
| int             | indexOf(Tipo objeto)      | Regresa el índice de la primera ocurrencia del objeto dado.                                                       |
| E               | get(int indice)           | Regresa el objeto ubicado en el índice dado.                                                                      |

Para ver el resto de métodos [haz click aqui](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)

#### 3.6 Interface Queue
La interfaz Queue`<E>` hereda de la interfaz Collection, por lo que posee todos sus métodos. Puede almacenar elementos repetidos, ademas se incluyen metodos para una organización de la información de la forma LIFO.

Hay 6 metodos nuevos, estos se agrupan por parajeas puesto que realizan la misma funcionalidad con diferencia de que es lo que ocurre en caso de un fallo, los metodos nuevos son:

| Funcionalidad | Arroja Excepcion | Regresa Booleano  |
|---------------|------------------|-------------------|
| Insertar      | add(E elemento)  | offer(E elemento) |
| Eliminar      | remove()         | poll()            |
| Ver           | element()        | peek()            |

Para ver mas información [presiona aqui](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html)

#### 3.7 Interface Dequeue
La interfaz Dequeue`<E>` hereda de la interfaz Queue, y abstrae el concepto de una cola doble. Al ser una cola doble es posible añadir al principio y al final, esto genera nuevos metodos. Los metodos se clasifican de la misma forma que en la interfaz Queue, los que aplican sobre el primer elemento son:

| Acción   | Arroja Excepción     | Regresa Booleano       |
|----------|----------------------|------------------------|
| Insertar | addFirst(E elemento) | offerFirst(E elemento) |
| Eliminar | removeFirst()        | pollFirst()            |
| Ver      | getFirst()           | peekFirst()            |

los que aplican sobre el ultimo elemento son:

| Acción   | Arroja Excepción    | Regresa Booleano      |
|----------|---------------------|-----------------------|
| Insertar | addLast(E elemento) | offerLast(E elemento) |
| Eliminar | removeLast()        | pollLast()            |
| Ver      | getLast()           | peekLast()            |

Para ver mas información [presiona aqui](https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html)

#### 3.8 Interface Set
La interfaz Queue`<E>` hereda de la interfaz Collection, por lo que posee todos sus métodos. Se caracteriza porque almacena elementos unicos. 

Para ver mas información [presiona aqui](https://docs.oracle.com/javase/8/docs/api/java/util/Set.html)

### 4. Clases provenientes de List
#### 4.1 Clase ArrayList
La clase ArrayList`<E>` implementa List por lo que posee todos sus metodos. Un ArrayList es la implementación de un arreglo dinamico, las funciones size, isEmpty, get, set, iterator, and listIterator se ejecutan en tiempo constante, pero los metodos add, y remove tardan de acuerdo al tamaño de elementos de la estructura.

Para crear un ArrayList hay que importarlo:
`
import java.util.ArrayList;
`
para crear un objeto ArrayList:
`
ArrayList<E> arreglo = new ArrayList();
`

Para ver mas información [presiona aqui](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

#### 4.2 Clase LinkedList
La clase LinkedList`<E>`  implementa List por lo que posee todos sus metodos. LinkedList es la implementación de una lista ligada doble. 
Para crear un LinkedList hay que importarlo:
`
import java.util.LinkedList;
`
para crear un objeto LinkedList:
`
LinkedList<E> arreglo = new LinkedList();
`

Para ver mas información [presiona aqui](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)

#### 4.3 Clase Vector
La clase Vector implementa List por lo que posee todos sus metodos. Vector esta hecho para trabajar en un ambiente de hilos, posee 3 atributos:
Para crear un Vector hay que importarlo:
`
import java.util.Vector;
`
para crear un objeto Vector:
`
LinkedList<E> arreglo = new Vector();
`

| Modificador | Identificador     | Descripcion                                                                                                                |
|-------------|-------------------|----------------------------------------------------------------------------------------------------------------------------|
| protected   | capacityIncrement | Entero que indica la capacidad que aumentará cuando supere el tamaño, si es menor a uno incrementara el doble de su tamaño |
| protected   | elementCount      | Número que indica la cantidad de elementos del vector                                                                      |
| protected   | elementData       | Arreglo donde estan contenidos todos los elementos del vector                                                              |

Posee metodos relacionados con el trabajo concurrente:

| Tipo |                     | Descripcion                                                         |
|------|---------------------|---------------------------------------------------------------------|
| void | setSize(int tamano) | Establece el tamaño del vector                                      |
| E    | firstElement()      | Regresa el primer elemento del vector                               |
| int  | capacity()          | Regresa la capacidad del vector (cantidad máxima que puede guardar) |
| int  | size()              | Regresa la cantidad de elementos que tiene guardado                 |


Para ver mas información [presiona aqui](https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html)

#### 4.4 ArrayList vs Vector vs LinkedList

En general la elección de uno u otro depende con lo que se este trabajando:
* Si se trabaja con hilos, lo mejor es ocupar Vector.
* Si no se trabaja con hilos, y se trabaja con poca cantidad de datos, lo mejor es usar ArrayList.
* Si no se trabaja con hilos, y se trabaja con gran cantidad de datos, lo mejor es un LinkedList.

***Nota:**

Es posible hacer que un ArrayList ó un LinkedList puedan trabajar de forma correcta en un ambiente de hilos, de la siguiente forma:
`
import java.util.Collections;
ArrayList lista = Collections.synchronizedList(new ArrayList(...));
`

### 5. Clases provenientes de Queue y Deque
#### 5.1 Clase PriorityQueue
PriorityQueue implementa la interfaz Queue asi que posee todos sus metodos, la filosofia que sigue a la hora de añadir y sacar elementos es la de insertar en donde corresponda (comparando) y sacar el primero (el que sea menor a todos). Esta clase no permite la insercion de elementos nulos ni tampoco permite la insercion de objetos que provengan de una clase que no haya implementado Comparator.

Se llama PriorityQueue porque siempre saca primero el mas importante (el que sea el menor a todos).

Para ver mas información [presiona aqui](https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html)

#### 5.2 Clase ArrayDeque
ArrayDeque implementa la interfaz Deque por lo que posee todos sus metodos. ArrayDeque abstrae el concepto de cola doble, esta clase es mas rapida que la clase Stack cuando se trabaja como una pila, y mas rapida que LinkedList cuando se trabaja como una Cola.

Para ver mas información [presiona aqui](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html)

#### 5.3 Clase LinkedList
LinkedList ademas de implementar List implementa Deque, por lo que posee metodos tanto de List como los de Deque. Al implementar ambas interfaces permite al programador usarlo de diversas formas por la variedad de metodos. Aunque si se desea usar solamente como cola ArrayDeque es una mejor opción.

Para ver mas información [presiona aqui](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)

#### 5.4 PriorityQueue vs ArrayDeque vs LinkedList
En general la elección de uno u otro depende del uso que se quiera dar.
* Si se desea trabajar con objetos que posean una prioridad mayor a otros los mejor es usar PriorityQueue.
* Si se desea trabajar con una cola ya sea simple o doble lo mejor es usar ArrayDuque.
* Si se desea trabajar con objetos que posean metodos tanto de listas como de colas lo mejor es usar LinkedList.

### 6. Clases proveniente de Set
#### 6.1 Clase HashSet
#### 6.2 Clase LinkedHashSet
#### 6.3 Clase TreeSet
#### 6.4 HashSet vs LinkedHashSet vs TreeSet

### 7. Clases provenientes de Map
#### 7.1 Clase TreeMap
