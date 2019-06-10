## Abstracción
### Indice

#### [1. Concepto de Abstracción]()

#### [2. Clases]()
>* Atributos
>* Métodos
>* Representación

#### [3. Objetos]()

#### [4. Modificadores]()
>* Modificador static
>* Modificador final


#### Retornos
1. [Java Basico](https://github.com/patoba/CursoJava/tree/master/Java%20Basico)
- - - -

### 1. Concepto de Abstracción
Si observamos los entes que se encuentran a nuestro alrededor, podemos visualizar que poseen una serie de caracteristicas/propiedades y una serie funcionalidades. Por ejemplo, una persona posee un color de pelo, una altura, peso, y también puede correr, caminar, comer. 

Abstracción consiste en representar entes de la realidad en forma de codigo, esto se hace a traves de clases, interfaces, y enumeraciones. 

### 2. Clases
Una clase es un molde de un ente de la realidad, es una estructura que esta compuesta de atributos (caracteristicas del ente) y métodos (funcionalidades del ente). La particulación de una clase se le conoce como **instancia**, en si la instancia consiste en asignarle valores especificos al molde llamado clase. 

#### 2.1 Atributos 
Los atributos son variables que describen caracteristicas del ente que estamos modelando. Estas variables pueden pertenecer a tipos primitivos o a clases.

#### 2.2 Métodos
Los metodos son funciones que describen la funcionalidad del ente que estamos modelando. En java es posible tener varios metodos con el mismo nombre siempre y cuando reciban distintos parametros a esta propiedad se le llama **sobrecarga**. 

Se usa la palabra reservada **this** para hacer referencia a la instancia actual. Con this podemos acceder a atributos, métodos, y a constructores de la clase asociada a la instancia actual.
* this.atributo   <= accedemos a un atributo
* this.metodo(parametros)  <= accedemos a un metodo
* this(parametros)  <= accedemos al constructor

Existe un método especial llamado **constructor** que permite asignar valores a los atributos de una forma sencilla y esteticamente correcta. El constructor se define como una función cuyo identificador es igual que el de la clase y que no indica un valor de retorno, el constructor siempre regresa una instancia de la clase.

#### 2.3 Representación
Las clases se representan mediante esquemas UML

### 3. Objetos
Un objeto es una variable cuyo tipo de dato es una clase. Un objeto nos permite nos permite guardar la instancia de una clase para poder usarla cuando la necesitemos.

```
Clase ejemplo = new Clase(); // Hacemos una instanca de la clase Clase y la almacenamos en el objeto ejemplo
```

### 4. Modificadores
Un modificador es una palabra reservada que permite realizar un cambio en una variable, método o clase.

#### 4.1 Modificador static
Static está relacionado con la no instancia de las cosas. Static aplicado a un atributo, permite que esta sea igual para cualquier instancia de la clase y puede ser accedida (si los modificadores de acceso lo permiten) por otra clase sin la necesidad de crear una instancia. Ejemplo:

```
public class Ejemplo{
  public static float a = 3;
  ...
}

public class Ejemplo2{
  void metodo(){
    System.out.println(Ejemplo.a);
  }
  ...
}
```

Static aplicado a un método hace que ese método se pueda usar sin instanciar la clase, por ejemplo:


```
public class Ejemplo{
  void metodo(){
    System.out.println("Este es un ejemplo");
  }
  ...
}

public class Ejemplo2{
  void metodo2(){
    Ejemplo.metodo();
  }
  ...
}
```

static se puede aplicar a una clase, pero tiene que ser una clase anidada.


#### 4.2 Modificador final
Final está relacionado con la incapacidad para modificar una variable, método o clase.  Final aplicado a un atributo, permite establecer dicho atributo como constante. Por ejemplo:

```
public class Ejemplo{
  final float PI = 3.14;
...
}
```

Una constante debe poseer su nombre en mayúscula, y de preferencia poseer el modificador de acceso public.

Final aplicado a un método, establece que dicho método no puede ser sobreescrito en una clase hija.

```
public class Ejemplo{

  public final void ejemploMetodo(){
    ...
  }
  ...
}
```

Final aplicado a una clase, establece que ninguna clase puede heredar de ella. Por ejemplo:

```
public final class Ejemplo{
...
}
```

**Notas:**
* Se pueden combinar ambos modificadores y se conserva el efecto de los dos.






