## Manejo de flujos en Java

### Indice

#### 1. Concepto de flujo y buffer

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
#### java.io
Provee al sistema de entrada y salid a través de flujos de datos, serialización y los archivos del sistema. Dentro de este paquete están contenidad las clases necesarias para el flujo de datos. 

#### java.lang.System


### 3. Flujo de Bytes

### 4. Flujo de Caracteres

### 5. Manejo de archivos y directorios
