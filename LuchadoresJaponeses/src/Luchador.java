
public class Luchador {
	double peso;
	double altura;
	int cantidadDominados;
	
	public Luchador(double _peso, double _altura) {
		this.peso = _peso;
		this.altura = _altura;
	}
	
	public boolean domina(Luchador luchador) {
		if((this.peso > luchador.peso && this.altura > luchador.altura)) {
			return true;
		} else if(this.peso == luchador.peso && this.altura > luchador.altura) {
			return true;
		} else if(this.altura == luchador.altura && this.peso > luchador.peso ) {
			return true;
		} else {
			return false;
		}
	}
	
	public void obtenerCantidadDominados(Luchador[] luchadores) {
		for(Luchador l : luchadores) {
			if(this.domina(l))
				this.cantidadDominados++;
		}
	}
	
}
