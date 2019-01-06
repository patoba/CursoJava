## Excepciones

## Java Framework Collection

### Indice

#### 1. Definición de error y excepcion

#### 2. Interfaces base y sus métodos
>*  Palabras reservadas throw y throws

#### 3. Clases de implementación
>* Excepciones basicas
>* Palabras reservadas try, catch y finally

#### 4. Creacion de excepciones propias

### Retornos
1. [Curso Java](https://github.com/patoba/Curso-Java 'Curso Java')
2. [Java Intermedio](https://github.com/patoba/Curso-Java/tree/master/Java%20Intermedio 'Java Intermedio')
- - - -


### Definicion de error y excepción

En la documentación de Java se define excepción cómo *Un evento, el cual ocurre durante la ejecución de un programa, que interrumpe el flujo normal de las instrucciones del programa.* . 

Cuando un error ocurre dentro de un método, el método crea un objeto llamado excepción. El objeto excepción contiene información del error, incluyendo el tipo de error y el estado del programa cuando el error ocurrió. Después de ue un metodo arroja una excepción Java intenta encontrar un manejador de excepcion, a este proceso se le llama *call stack*.

![](img/img_01.gif)

Se dice que el sistema cacha la excepción si después de realizar una busqueda exhaustiva, no encuentra una manejador de excepción adecuado.

Exception y error son clases hijas de la clase Throwable. Un objeto Throwable contiene la información del hilo en el momento que fue creado.

Tanto exception como error son utilizadas para representar excepciones, situaciones que interrumpen el flujo del programa, pero son usadas para tratar excepciones distintas.

* **Error** : Situaciones que no pueden ser manejables. Por ejemplo: poca memoria RAM, error en el disco duro. 
* **Exception** : Situaciones que pueden ser manejables.  
![](img/img_00.gif)

Las excepciones más comunes están contenidas en dos clases hijas de Exception, IOException y RuntimeException. También llamadas comprobadas o no comprobadas. 

* **Comprobadas** : Situaciones provocadas por el programador. Ejemplo : Errores lógicos. 
* **No Comprobadas** : Situaciones aparte del código del programa. Ejemplo: Ausencia de un archivo o un input mal puesto.


### Interfaces base y sus métodos 





