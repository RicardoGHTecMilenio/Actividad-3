package PaquetePoker;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Crear un objeto Scanner para entrada de usuario
		
		Mazo mazo = new Mazo(); // Crear un objeto de la clase Mazo
		mazo.shuffle(); // Barajea el mazo de cartas
		System.out.println("Primer Carta");
		mazo.head(); // Muestra la primera carta en el mazo 
		System.out.println("Carta al azar");
		mazo.pick(); // Muestra una carta al azar del mazo
		System.out.println("Mano");
		mazo.mano(); // Muestra una mano de 5 cartas
		
		while (!mazo.cartas.isEmpty()) { // un bucle que se ejecuta mientras el mazo tenga cartas
		System.out.println("1- Sacar una carta al azar");
		System.out.println("2- Jugar una nueva mano");
		int opcion = input.nextInt(); // Lee la opción del usuario.
		
		switch (opcion) { // Utilizar un switch para manejar la opción del usuario
		case 1: mazo.pick();
		break;
		case 2: mazo.mano();
		break;
		   }
		
		}
		
	}
	
}
