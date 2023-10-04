package PaquetePoker;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Mazo {
	List<Carta> cartas; // Lista para almacenar las cartas en el mazo

	
	public Mazo() {
		cartas = new ArrayList <>(); // Inicializa la lista de cartas
		CrearMazo(); // Llama al método para crear un mazo completo
	}
	
	public void CrearMazo() {
		String [] Valores = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String [] Colores = {"Negro", "Rojo"};
		String [] Palos = {"Diamantes","Picas","Corazones","Treboles"};
		
		// Crea un mazo completo combinando valores, colores y palos
		for (String Palo : Palos) {
			String Color = "";
			if (Palo.equals("Picas") || Palo.equals("Treboles")) {
				Color = Colores[0];
			} else {
				Color = Colores[1];
			}
			
			for (String Valor : Valores) {
				Carta carta = new Carta(Valor, Color, Palo);
				cartas.add(carta); // Agrega la carta al mazo
			}
		}
	}
	
	public void shuffle() { 
		Collections.shuffle(cartas); // Mezcla las cartas en el mazo
		System.out.println("Se mezclo el Mazo");
	}
	
	public void head() {
		if (!cartas.isEmpty()) {
			Carta carta = cartas.get(0); // Obtiene la primera carta del mazo
			cartas.remove(0); // Quita la carta del mazo.
			System.out.println(carta.toString());
			System.out.println("Quedan " + cartas.size() + " cartas en el Mazo.");
		} else {
			System.out.println("No quedan cartas en el mazo");
			System.exit(0); } // Sale del programa si no quedan cartas.
		}
	
	public void pick() {
		if (!cartas.isEmpty()) {
			int index = (int) (Math.random() * cartas.size()); // Obtiene un índice aleatorio.
			Carta carta = cartas.get(index); // Obtiene la carta en el índice aleatorio.
			cartas.remove(index); // Quita la carta del mazo.
			System.out.println(carta.toString());
			System.out.println("Quedan " + cartas.size() + " cartas en el Mazo.");
		} else { 
			System.out.println("No quedan cartas en el mazo");
			System.exit(0);
		}
	}
	
	public void mano() {
		if (cartas.size() >= 5) {
			for( int x = 0; x < 5; x++) {
				Carta carta = cartas.get(x); // Obtiene las primeras 5 cartas del mazo.
				System.out.println(carta.toString());
			}
			cartas.subList(0, 5).clear();
			System.out.println("Quedan " + cartas.size() + " cartas en el Mazo.");
		} else {
			System.out.println("No quedan suficientes cartas en el mazo para repartir una mano");
		}
	}

}
