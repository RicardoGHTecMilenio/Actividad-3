package PaquetePoker;


public class Carta {
	private String Valor;
	private String Color;
	private String Palo;
	
	//crea un constructor para un nuevo objeto carta e inicializar sus variables de instancia con valores proporcionados
	public Carta (String valor, String color, String palo) {
		this.Valor = valor;
		this.Color = color;
		this.Palo = palo;
	}
	
	//se cobreescribe el metodo toString para devolver los valores
	@Override
	public String toString() {
		return Valor + " " + Color + " " + Palo; 
	}
	
}
