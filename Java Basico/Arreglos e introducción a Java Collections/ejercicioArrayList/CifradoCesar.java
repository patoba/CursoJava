import java.util.ArrayList;
import java.util.Scanner;
/**
* @author Casillas, Diego
* @author Solana, Amairany
*Esta clase "CifradoCesar"  permite mediante dos arraylist  cifrar o decifran una palabra.
*El cifrado consiste en recorrer tres letras a la derecha la letra requerida.
*/

public class CifradoCesar{
	public static void main(String[] args) {

		ArrayList<String>abcnormal = new ArrayList(); //lista que contiene como elementos las letras del alfabeto
			abcnormal.add("a");
			abcnormal.add("b");
			abcnormal.add("c");
			abcnormal.add("d");
			abcnormal.add("e");
			abcnormal.add("f");
			abcnormal.add("g");
			abcnormal.add("h");
			abcnormal.add("i");
			abcnormal.add("j");
			abcnormal.add("k");
			abcnormal.add("l");
			abcnormal.add("m");
			abcnormal.add("n");
			abcnormal.add("ñ");
			abcnormal.add("o");
			abcnormal.add("p");
			abcnormal.add("q");
			abcnormal.add("r");
			abcnormal.add("s");
			abcnormal.add("t");
			abcnormal.add("u");
			abcnormal.add("v");
			abcnormal.add("w");
			abcnormal.add("x");
			abcnormal.add("y");
			abcnormal.add("z");


		ArrayList<String>abcifrada = new ArrayList(); //lista que contiene los elementos del alfabeto recorridos 3 lugares para realizar el cifrado César
			abcifrada.add("d");
			abcifrada.add("e");
			abcifrada.add("f");
			abcifrada.add("g");
			abcifrada.add("h");
			abcifrada.add("i");
			abcifrada.add("j");
			abcifrada.add("k");
			abcifrada.add("l");
			abcifrada.add("m");
			abcifrada.add("n");
			abcifrada.add("ñ");
			abcifrada.add("o");
			abcifrada.add("p");
			abcifrada.add("q");
			abcifrada.add("r");
			abcifrada.add("s");
			abcifrada.add("t");
			abcifrada.add("u");
			abcifrada.add("v");
			abcifrada.add("w");
			abcifrada.add("x");
			abcifrada.add("y");
			abcifrada.add("z");
			abcifrada.add("a");
			abcifrada.add("b");
			abcifrada.add("c");

		String textingresado = ""; //textingresado es la cadena que ingresa el usuario
		int opcion; //si elige cifrar o descifrar
		Scanner sc = new Scanner(System.in); //instancia de tipo scanner

		System.out.println("Este programa te permitirá realizar un cifrado César."); 
		System.out.println("Ingresa la palabra a usar, ya sea que quieras cifrarla o descifrarla: ");	
		textingresado = sc.nextLine();	
		System.out.println("Palabra ingresada: " + textingresado); //imprime en pantalla la palabra ingresada
		int longitud = textingresado.length();
		int cont = 0; //cont nos ayudará a recorrer la cadena ingresada por el usuario
		StringBuffer textrespuesta = new StringBuffer("Texto cifrado: ");

		System.out.println("¿Qué quieres hacer?\n1.- Cifrar \n0.-Descifrar"); //Pregunta al usuario si quiere cifrar o descifrar
		opcion = sc.nextInt();


		 switch (opcion){
		 	case 1: //permite cifrar
			
		 		while(cont < longitud){ //este ciclo se repite hasta que el contador sea menor a la longitud del texto ingresado, para recorrerlo completamente
		 			for(int i = 0; i<abcnormal.size();i++){ //el for compara letra a letra entre la palabra ingresada y el abecedario normal, cuando  son iguales
		 				if(abcnormal.get(i).charAt(0) == textingresado.charAt(cont)){ //se le agrega al String textrespuesta la letra correspondiente recorrida 3 lugares
		 					textrespuesta.append(abcifrada.get(i).charAt(0));// append nos permite ir agregando estos caracteres nuevos sin reescribirse
		 				}

		 			}
		 		cont ++;
		 		}
		 		System.out.println(textrespuesta); //imprime la nueva cadena cifrada
		 		break;
		 	case 0: //permite descifarr

		 		while(cont < longitud){
		 			for(int i = 0; i<abcifrada.size();i++){ //se realiza lo mismo que en el case anterior pero se intercambian las listas, es decir:
		 				if(abcifrada.get(i).charAt(0) == textingresado.charAt(cont)){ //se compara con abcifrada para encontrar igualdad en las letras, para después intercambiar las letras
		 					textrespuesta.append(abcnormal.get(i).charAt(0)); // por la lista del abecedarionormal
		 				}

		 			}
		 		cont ++;
		 		}
		 		System.out.println(textrespuesta);
		 		break;
		 }
		


		



	}

}