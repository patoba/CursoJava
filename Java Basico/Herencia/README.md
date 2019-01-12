## Herencia
### Indice

#### [1. Uso de la herencia]
>* ¿Qué es la herencia?
>* Herencia simple y múltiple
>* La clase Object
>* Superclase y subclase
>* Palabras reservadas: extends y super
>* Sobrecarga de métodos

#### [2. Referencias]

- - - -

### 1. Uso de la herencia
#### 1.1 ¿Qué es la herencia?
En programación orientada a objetos, la herencia es, un mecanismo utilizado para alcanzar algunos de los objetivos más preciados en el desarrollo de software como la reutilización. 
La herencia facilita la creación de objetos a partir de otros ya existentes e implica que una subclase obtiene todo el comportamiento (métodos) y eventualmente los atributos (variables) de su superclase. 
La herencia permite compartir automáticamente métodos y datos entre clases, subclases y objetos. 

#### 1.2 Herencia simple y múltiple
* Herencia Simple : Una clase sólo puede heredar de una clase base y de ninguna otra.
* Herencia Múltiple: Una clase puede heredar las características de varias clases base, es decir, puede tener varios padres.

Java únicamente admite herencia simple.

Algunos lenguajes que admiten herencia múltiple:  C++, Centura SQL Windows, CLOS, Eiffel, Object REXX, Perl y Python. 

#### 1.3 La clase Object
La clase Object es la clase raíz del árbol de la jerarquía de las clases en Java. Proporciona algunos métodos útiles que todos los objetos heredan, por ejemplo:

* Un método por el que un objeto se puede comparar con otro objeto (equals())

* Un método para convertir un objeto a una cadena (toString())
 
* Un método para devolver la clase de un objeto (getClass())

[Documentación completa de la clase Object](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)

#### 1.4 Superclase y subclase 
El concepto de herencia implica a una estructura jerárquica de clases.
* La clase padre de cualquier clase es conocida como su superclase. 
* La clase hija de una superclase es llamada una subclase. 
 
Una superclase puede tener cualquier número de subclases. Una subclase puede tener sólo una superclase. 

#### 1.5 Palabras reservadas: extends y super

Cuando una clase hereda de otra se usa la palabra reservada extends, al hacer esto se están "copiando"  los métodos y las variables de la clase padre, la palabra extends se usa después de declarar el nombre de la clase, por ejemplo:

	<tipo de clase> <nombre clase> extends <clase padre> {
	
	... resto de código ...
	
	} 

Así como utilizamos la palabra reservada this para referirnos a elementos del mismo ámbito del objeto, existe algo que nos puede ayudar a acceder a los atributos y métodos de las clases padre o superclases, y es la palabra reservada super, con ella podemos invocar ya sea desde una instancia o un método de la subclase algo que venga de la clase desde la que hereda.

Uno de los usos más frecuentes que le damos a la palabra super, es poder invocar al constructor de la superclase, con ello podemos reducir la cantidad de código que debemos escribir en nuestras clases hijas.

#### 1.6 Sobrecarga de métodos
Una subclase hereda todos los métodos de su superclase que son accesibles a dicha subclase a menos que la subclase sobreescriba los métodos.

Una subclase sobreescribe un método de su superclase cuando define un método con las mismas características ( nombre, número y tipo de argumentos) que el método de la superclase.

Las subclases emplean la sobreescritura de métodos la mayoría de las veces para agregar o modificar la funcionalidad del método heredado de la clase padre.  

### 2. Referencias
* Sobrecarga de métodos, tomado de: [http://profesores.fi-b.unam.mx/carlos/java/java_basico4_7.html](http://profesores.fi-b.unam.mx/carlos/java/java_basico4_7.html)
* Herencia, tomado de: [http://profesores.fi-b.unam.mx/carlos/java/java_basico3_4.html](http://profesores.fi-b.unam.mx/carlos/java/java_basico3_4.html)
* Herencia, palabras reservadas, tomado de: [http://analista1.foroactivo.com/t21-herencia-palabras-reservadas-super-extends-implements](http://analista1.foroactivo.com/t21-herencia-palabras-reservadas-super-extends-implements)