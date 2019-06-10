## Conceptos Básicos de Programación
### Indice

#### [1. Tipo de Dato]()
>* Tipo de Dato Primitivo
>* Clase

#### [2. Variable]()
>* Composición
>* Nombramiento

#### [3. Operadores]()
>* Operador Aritmético
>* Operador Lógico
>* Operador Relacional
>* Operador Asignación

#### [4. Conversión de Tipos de Datos]()

#### [5. Función]()
>* Concepto
>* Nombramiento
>* Composición
>* Funcionamiento
>* Alcance de una variable

#### [6. Estructuras de Control]()
>* Estructura Secuencial
>* Estructuras Condicionales
>* Estructuras Iterativas

#### Retornos
1. [Java Basico](https://github.com/patoba/CursoJava/tree/master/Java%20Basico)
- - - -

### 1. Tipo de Dato
Un tipo de dato permite representar distinto tipo de información en una computadora. Dependiendo del tipo de dato es la cantidad de memoria que usara. Particularmente en Java existen dos tipos de datos: Los datos primitivos y las clases.

#### 1.1 Tipo de Dato Primitivo
Un tipo de dato primitivo es aquel que Java posee por mantener caracteristicas de c++. Son los tipos de datos más basicos y no se pueden trabajar como clases. Estos son:

| Tipo de Dato | Tamaño (bytes) |                                  Descripción                                  | Valor por Defecto |
|:------------:|:--------------:|:-----------------------------------------------------------------------------:|:-----------------:|
|    boolean   |        -       |                        Valor lógico (Verdadero / Falso)                       |       false       |
|     char     |        2       |                       Un carácter proveniente de Unicode                      |       \u0000      |
|     byte     |        1       |                       Entero en el intervalo [-128, 127]                      |         0         |
|     short    |        2       |                     Entero en el intervalo [-32768, 32767]                    |         0         |
|      int     |        4       |                Entero en el intervalo [-2147483648, 2147483647]               |         0         |
|     long     |        8       | Entero en el intervalo [9,223,372,036,854,775,808, 9,223,372,036,854,775,807] |         0         |
|     float    |        4       |    Real en el intervalo [1.40129846432481707e-45, 3.40282346638528860e+38]    |        0.0        |
|    double    |        8       |   Real en el intervalo [4.94065645841246544e-324, 1.79769313486231570e+308]   |        0.0        |

Los nombres de los datos primitivo van con minúscula.

#### 1.2 Clase
Una clase es un tipo de dato creado a partir de los tipos de datos primitivos. El nombre de las clases usualmente usa la convención UpperCammelCase (Letras con las que empieza palabras en mayuscula). Por ejemplo:

* Math
* String
* StringBuilder
* NombreDeUnaClase

### 2. Variable
Una variable es un espacio de memoria reservado para almacenar un valor determinado que corresponde a un tipo de dato. 

#### 2.1 Composición 
Una variable se compone por su tipo de dato y por su identificador (nombre)

#### 2.2 Nombramiento de Variables en Java
* Las variables son sensibles a mayusculas y minusculas. 
* Se puede usar cualquier letra del alfabeto (ingles)
* Se pueden usar numeros (excepto en el primer caracter)
* Se puede usar el signo $ y el signo _

#### 2.3 Tipos de Variable en Java
* Variables de Instancia
* Variables de Clase
* Variables Locales
* Parametros

#### 2.4 Ejemplos
int a
double B3
String $pAis
char soy_una_variable

char 4a  <= No valido
String busco una mina  <= No valido

### 3. Operadores
Los operadores son símbolos que indican cómo se deben manipular los operandos. Los operadores se usan comunmente en datos primitivos.

#### 3.1 Operador Aritmético
Son aquellos de la forma (Numero, Numero) => Numero, por ejemplo:

| Operador |                Descripción               | Ejemplo | Salida |
|:--------:|:----------------------------------------:|:-------:|:------:|
|     +    |      Realiza la suma de dos números      |   3+5   |    8   |
|     -    |      Realiza la resta de dos números     |   4-5   |   -1   |
|     *    | Realiza la mutliplicación de dos números |   3*5   |   15   |
|     /    |    Realiza la división de dos números    |   10/3  |    3   |
|     %    |      Regresa el resto de dos números     |   10%3  |    2   |


#### 3.2 Operador Lógico
Son aquellos de la forma (Numero, Numero) => boolean, por ejemplo:

| Operador |                   Descripción                  | Ejemplo | Salida |
|:--------:|:----------------------------------------------:|:-------:|:------:|
|     >    |     Determina si un número es mayor a otro     |   3>5   |  false |
|     <    |     Determina si un número es menor a otro     |   3<5   |  true  |
|    >=    | Determina si un número es mayor o igual a otro |   4>=4  |  true  |
|    <=    | Determina si un número es menor o igual a otro |  5<=10  |  true  |
|    ==    |      Determina si dos números son iguales      |   5==3  |  false |
|    !=    |     Determina si dos números son diferentes    |   5!=3  |  true  |


#### 3.3 Operador Relacional
Son aquellos de la forma (boolean, boolean) => boolean, por ejemplo:

| Operador |                Descripción               |   Ejemplo   | Salida |
|:--------:|:----------------------------------------:|:-----------:|:------:|
|    &&    |      Regresa true si ambos son true      | true&&false |  false |
|    \|\|    | Regresa true si por lo menos uno es true | true\|\|false |  true  |
|     !    |           Regresa lo contrario           |    !true    |  false |

#### 3.4 Operador Asignación
Aquellos operadores binarios que modifican el valor de una variable, por ejemplo:

| Operador |                         Descripción                         | Ejemplo | Salida |
|:--------:|:-----------------------------------------------------------:|:-------:|:------:|
|     =    |            Asigna lo de la derecha a la izquierda           |   a=3   |  a==3  |
|    +=    |       Agrega el valor de la derecha al de la izquierda      |   a+=5  |  a==8  |
|    -=    |       Resta el valor de la derecha al de la izquierda       |   a-=3  |  a==5  |
|    *=    |     Multiplica el valor de la derecha al de la izquierda    |  a*=10  |  a==50 |
|    /=    |       Divide el valor de la derecha al de la izquierda      |   a/=5  |  a==10 |
|    %=    | Obtiene el resto del valor de la derecha al de la izquierda |   a%=9  |  a==1  |

#### 3.5 Operadores Unarios
Aquellos que afectan unicamente a un termino, o variable, por ejemplo:

| Operador |                 Descripción                | Ejemplo | Salida |
|:--------:|:------------------------------------------:|:-------:|:------:|
|     +    |       Valor positivo (Puede omitirse)      |    +3   |    3   |
|     -    |               Valor negativo               |    -5   |   -5   |
|    ++    | Incrementa en uno el valor de una variable |   a++   |  a+=1  |
|    --    | Decrementa en uno el valor de una variable |   a--   |  a-=1  |


#### 3.6 Jerarquia de Operaciones

1. ()
2. Operadores Unarios
3. *, /
4. +, - (Operadores Aritmeticos)
5. %
6. Operadores Logicos
7. !
8. &&
9. ||
10. Operadores de Asignación

### 4. Conversión de Tipos de Datos
En algunas ocaciones queremos convertir de un tipo de dato a otro para hacerlo escribimos en parentesis el tipo al que queremos convertir, por ejemplo:

```
double num = 4.13;
int numEntero = (int) num;
```

Por defecto los numeros reales, Java los toma como double, y los enteros como int.

### 5. Función

#### 5.1 Concepto
Una función es un conjunto de líneas de código que realizan una tarea específica y puede retornar un valor.
#### 5.2 Nombramiento
La convención para nombrar una función es lowerCammelCasel (Letras con las que empieza palabras en mayuscula, exceptuando la primera).

#### 5.3 Composición
La estructura de una función es la siguiente:

```
[modificador de acceso] [modificadores] valorDeRetorno idetificador(tipoParametro1 identificadorParametro1, tipoParametro2 idenficiadorParametro2){
	....
	return loQueRegresa; //Si es que regresa
}
```

donde:
* los elementos dentro de [] son opcionales
* Solo existe 1 modificador de acceso
* Pueden existir n modificadores (pero solo 1 de acceso)
* Si regresa algo debe de indicarse el tipo de dato que regresa (puede ser una Clase), si no regresa nada debe escribirse void
* Los parametros deben estar dentro de parentesis
* Los tipos de los parametros pueden ser una clase o un tipo primitivo
* Si regresa algo debe de indicarse con un return

#### 5.4 Funcionamiento
Sea la función:

```
int suma(int a, int b){
	return a + b;
}
```

la "llamamos" de esta forma:

```
int num1 = 2;
int num2 = 3;
int res = suma(num1, num2); // res vale 5
```

Notas:
* num1 y num2 son los argumentos de la función
* a y b son los parametros de la función
* a + b es el valor de retorno de la función

### 6. Estructuras

#### 6.1 Expresiones
Son construidas en base a variables, operaciones y llamadas a funciones.

#### 6.2 Sentencias
Las sentencias son equivalentes a las oraciones en un idioma, forma una unidad completa de ejecución, siempre terminan con un punto y coma. Ejemplo:

* Assignment expressions
* Any use of ++ or --
* Method invocations
* Object creation expressions

#### 6.3 Bloques
Conjunto de cero o más sentencias que se encuentran entre llaves. Ejemplo:

```
public class Clase{

}
```

### 6.4 Flujo
El flujo que sigue el programa es ir ejecutando las sentencias de arriba a abajo, y la primera función que se ejecuta es el main. 

#### 6.5 Estructuras Condicionales
Estructuras que se ejecutan dependiendo de una condición (booleano). Una de ellas es el if que posee la siguente estructura:

```
if(condicion1){
	.... sentencias si se comple condicion1, independientemente si se cumple condicion2 o no
}else if(otra condicion2){
	... sentencias si no se cumple condicion1 pero si condicion2
}else{
	... sentencias si no se cumple condicion1 ni condicion2
}
```

#### 6.6 Estructuras Iterativas
Estructura que se repite mientras se cumpla una condición (booleano). Una **iteración** consiste en ejecutar todas las sentencias contenidas en un bloque iterativo. Una de ellas es el while que posee la siguente estructura:

```
while(condicion){
	... acciones
}
```

Otra de ellas es el for que posee la siguiente estructura

```
for( inicializacion_de_variables ; condicion ; sentencias_que_se_ejecutan_al_final){
	...acciones
}
```

Cuando hablamos de estructuras iterativas existen dos variables que si se usan de una determinada manera reciben un nombre especial, estas son:
* **Contador:** Variable cuyo valor incrementamos manualmente de uno en uno.
* **Acumulador:** Variable cuyo valor incrementamos en cantidades variables, es decir se incrementa siempre n siendo n una variable.

Existen dos palabras reservadas que son utilizadas a la hora de trabajar con ciclos:

* **continue:** Brinca a la siguiente iteración
* **break:** Se sale del ciclo
