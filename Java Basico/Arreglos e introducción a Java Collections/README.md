## Arreglos e introducción a Java Collections

### Indice

#### [1. Arreglo]
>* ¿Qué es un arreglo?
>* Declaración de un arreglo
>* Inicialización de un arreglo
>* Acceso a los elementos de un arreglo
>* ¿Qué es el ciclo for mejorado?
>* Paso de arreglos a métodos
>* Argumentos de longitud variable
>* Arreglo bidimensional (matriz)
>* Acceso a los elementos de un arreglo bidimensional
>* Arreglo multidimensional

#### [2. Clase Arrays]
>* Clase Arrays y algunos de sus métodos

#### [3. Clase ArrayList]
>* Clase ArrayList y algunos de sus métodos

#### [4. Argumentos desde línea de comandos]

>* Cómo pasar argumentos desde línea de comandos
- - - -
### 1. Arreglo
#### 1.1 ¿Qué es un arreglo?
Un arreglo es un objeto que contiene un conjunto de variables del mismo tipo en su interior.
La cantidad de elementos que tiene un arreglo es estática, fija y se define en el momento de su declaración y no se puede modificar.
El índice del primer elemento es el cero y el indice del ultimo es la (cantidad de elementos -1).

#### 1.2 Declaración de un arreglo
Un arreglo se puede declarar de las siguientes formas:
	int a[];
	String []cadena;
	double[] ejemplo;
	int ejemplo[]=new int[10];

#### 1.3 Inicialización de un arreglo
Formas de inicializar un arreglo
* **Forma 1:** 		int c[]={12,3,27,16,4,51,8,40};
* **Forma 2:** 		int c2[]=new int[8];

#### 1.4 Acceso a los elementos de un arreglo
Se puede acceder a un elemento de un arreglo en específico indicando su índice dentro de unos corchetes, si se desea imprimir cada valor se puede utilizar un ciclo de iteración (while/for)

	int c[]={12,3,27,16,4,51,8,40};
	System.out.println(c[2]); //imprime 27
	//Ciclo para imprimir todos los valores
	for(int i=0;i<c.lenght;i++){
		System.out.println(c);
	}

#### 1.5 ¿Qué es el ciclo for mejorado?
En Java existe una versión mejorada del ciclo for, conocida como for-each en otros lenguajes, que permite una mayor accesibilidad a los elementos de un arreglo ó conjunto.

	String paises[]={“México”,”Canadá”,”Rusia”};
	for(String pais : paises){
		System.out.println(pais);
	}

#### 1.6 Paso de arreglos a métodos
Un arreglo se puede pasar a un método como un parámetro, al hacerlo cualquier cambio al parámetro afecta a la variable original.

	void funcion(int[] arreglo){
		for(int i = 0; i < arreglo.length; i++){
			arreglo[i] = 0;
		}
	}

Esta función inicializa el arreglo en cero.

#### 1.7 Argumentos de longitud variable
Existe una forma para que se le pueda pasar a una función una serie elementos (ilimitados) del mismo tipo. 

En la función hay que indicar que el argumento de longitud variable, se realiza de la siguiente forma:

	void funcion(String… ejemplo){
		…
	}

Para pasar varios elementos se realiza de la siguiente forma:

	funcion(“cadena1”, “cadena2”, “cadena3”);

El parámetro String… ejemplo podemos trabajarlo como un arreglo String ejemplo[]

#### 1.8 Arreglo bidimensional (matriz) 
Un arreglo bidimensional es un arreglo cuyo tipo de datos es otro arreglo.
La forma de declarar un arreglo de este tipo es:

	int arregloBi[][]=new int[filas][columnas];
	int arregloBi[][]={{1,2,3},{4,5,6}};

#### 1.9 Acceso a los elementos de un arreglo bidimensional

Para acceder a los elementos de un arreglo bidimensional hay que indicar el número de fila y columna al que queremos acceder.

	int arregloBi[][]={{1,2,3},{4,5,6}};
	System.out.println(arregloBi[1][2]);//imprime 6
	//para imprimir todos en pantalla
	for(int i=0;i<arregloBi.length;i++){//filas
		for(int j=0;j<arregloBi[i].length;j++){//columnas
			System.out.println(arregloBi[i][j]);
		}
	}

#### 1.10 Arreglo multidimensional

Un arreglo multidimensional está formado de más de dos dimensiones, se declara de una forma parecida al bidimensional:
	int arregloMulti[][][];
se inicializa, nuevamente, de una forma parecida al bidimensional:

	int arregloMulti[][][]=new int[num1][num2][num3];

### 2. Clase Arrays
#### 2.1 Clase Arrays y algunos de sus métodos

Existe una clase llamada Arrays que contiene métodos estáticos que permiten trabajar con arreglos de una forma más sencilla. Algunos de estos métodos son:

	static int binarySearch(tipo nombre[], tipo datoABuscar);
	static boolean equals(tipo arreglo1[], tipo arreglo2[]);
	static void fill(tipo arreglo[], tipo valor);
	static void sort(tipo arreglo[]);
	static tipo[] clone(tipo arreglo[]);

### 3. Clase ArrayList
#### 3.1 Clase ArrayList y algunos de sus métodos

La clase ArrayList permite mantener en memoria una colección dinámica de objetos. A diferencia de un arreglo normal, en un ArrayList puede cambiar la cantidad de elementos que posee en tiempo de ejecución.
Para poder usar la clase hay que importarla de:
	java.util.ArrayList
Se declara de la forma:
	ArrayList<Clase> nombre=new ArrayList<Clase>();

Métodos no estáticos importantes:
* boolean add(Tipo elemento);
* void add(int indice, Tipo elemento);
* void clear();
* boolean contains(Object objeto);
* tipo get(int indice);
* boolean isEmpty();
* int remove(Object objeto);
* boolean remove(int indice);
* int size();

[Documentación completa](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)