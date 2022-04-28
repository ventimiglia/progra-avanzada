
public class Torneo {
	private int[] dominados;
	private Luchador[] luchadores;
	
	public Torneo(int cantidad) {
		luchadores = new Luchador[cantidad];
	} 
	
	public void agregarLuchador(int idLuchador, Luchador luchador){
		luchadores[idLuchador] = luchador;
	}
	
	public void luchar() {
		
	}
}
