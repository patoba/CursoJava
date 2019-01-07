## Manejo de flujos en Java

### Indice

#### [1. Concepto de flujo y buffer](https://github.com/patoba/Curso-Java/blob/master/Java%20Intermedio/Manejo%20de%20Flujos/README.md#1-concepto-de-flujo-y-buffer-1)

#### 2. Entrada y salida de flujos en Java
>* java.lang.System
>* java.io

#### 3. Flujo de bytes
>* Clases abstractas InputStream y OutputStream

#### 4. Flujo de caracteres
>* Clases abstractas Reader y Writer
>* Clase InputStreamReader
>* Clase BufferedReader

#### 5. Manejor de archivos y directorios
>* Clase File
>* Clases FileOutputStrem y FileInputStream
>* Copia de archivos a nivel de bytes

### Retornos
1. [Curso Java](https://github.com/patoba/Curso-Java 'Curso Java')
2. [Java Intermedio](https://github.com/patoba/Curso-Java/tree/master/Java%20Intermedio 'Java Intermedio')


### 1. Concepto de flujo y buffer
#### Flujo

Un flujo es una secuencia de datos entre una fuente de entrada y un destino de salida. Un flujo de puede representar diferentes tipos de fuentes y destinos, incluyendo discos, dispositivios y otros programas.

En Java existe diferentes datos que pueden ser utilizados en un flujo, bytes, primitivas, y objetos. Algunos flujos solo pasan datos, otros manipulan y transforman los datos en maneras utiles

Todos los flujos utilizan un flujo de entrada para leer datos desde una fuente , un elemento a la vez.

![](img/img_00.gif)

Y utilizan un flujo de salida para escrbir datos a un destino. 

![](img/img_00.gif)

#### Buffer

El buffer es una area de memoria donde el flujo de entrada lee los datos. Java puede convertir un flujo de datos sin buffer, a un flujo con buffer. 

```
inputStream = new BufferedReader(new FileReader("xanadu.txt"));
outputStream = new BufferedWriter(new FileWriter("characteroutput.txt"));
```

### 2. Entrada y salida de flujos en Java
#### 2.1 java.io
Provee al sistema de entrada y salida a través de flujos de datos, serialización y los archivos del sistema. Dentro de este paquete están contenidad las clases necesarias para el flujo de datos. 

##### PrintStream 

La clase PrintStream agrega funcionalidad a la salidad de otro flujo de salido, la habilidad de imprimir varios tipos de datos en la linea de comandos.

#### 2.2 java.lang.System
Es una clase que contiene varios métodos y atributos utiles. Entre ellos estan los atributos **in, out y err**. 

>* static PrintStream *err*:  Error estandar del flujo de salida.
>* static InputStream *in*: Flujo de entrada estandar, linea de comandos. 
>* static PrintStream *out*: Flujo de salida estandar, linea de comandos.

Existe una clase que nos permite leer a partir de System.in llamada Scanner. La clase Scanner nos perimite leer y parsear tipos de datos primitivos y cadenas usando expresiones regulares. Su constructor toma como argumento el flujo de entrada que se quiere escanear. En el caso de la linea de comandos, se usa el flujo de entrada Systema.in.

```
  Scanner sc = new Scanner(System.in);
  int i = sc.nextInt();
```
Esta leyendo el flujo de entrada y lo castea a entero.

### 3. Flujo de Bytes
#### 3.1 Introducción 
Los programas utilizan flujos de bytes para realizar una entrada y una salida de 8 bits. Todas las clases de flujo de bytes son hijas de las clases InputStream y OutputStream. La gran mayoria de las clases de flujo de bytes funcionan de la misma manera, unicamente difieren en el constructor. 

#### 3.2 Clase InputStream
Es una clase abstracta, padre de todas las clases que utilizan flujos de datos de entrada.  Las aplicaciones que necesiten definir una subclase de InputStream siempre deben tener un metodo que retorne el siguiente byte de entrada. 

Principales métodos de InputStream

| Nombre         | Tipo de dato | Descripción                                                       |
|----------------|--------------|-------------------------------------------------------------------|
| available()    | int          | Retorna un estimado de la cantidad de bytes que pueden ser leidos |
| close()        | void         | Cierra el flujo de entrada.                                       |
| read()         | abstract int | Lee el siguiente byte de datos de la fuente de entrada            |
| read(byte[] b) | int          | Lee algunos bytes de entrada y los almacena en el buffer b.       |
| skip(long n)   | long         | Salta n cantidad de bytes                                         |

#### 3.3 Clase OutputStream 
Es una clase abstracta, padre de todas las clases que utilizan flujos de datos de salida. Las aplicaciones que necesiten definir una subclase de InputStream siempre deben tener un metodo que retorne el siguiente byte de salida.

Principales métodos de OutputStream

| Nombre          | Tipo de dato  | Descripción                                                   |
|-----------------|---------------|---------------------------------------------------------------|
| flush()         | void          | Vacía los buffers de salida.                                  |
| close()         | void          | Cierra el flujo de salida.                                    |
| write(int b)    | abstract void | Escribe el byte específico en el flujo de salida.             |
| write(byte[] b) | void          | Escribe b.length bytes de un arreglo b en el flujo de salida. |

### 4. Flujo de Caracteres
#### 4.1 Introducción
La plataforma de Java almacena los caracteres usando la convención Unicode. El flujo de caracteres 

#### Clases Abstractas Reader y Writer 
### 5. Manejo de archivos y directorios
