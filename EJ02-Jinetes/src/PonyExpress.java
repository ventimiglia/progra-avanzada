
public class PonyExpress {
	public static int jinetes(int[] distancias) {
		int distanciaRestante = 100;
		int cantidadJinetes = 1;
		if(distancias.length == 0) {
			return 0;
		}
		for (int distancia : distancias) {
			if(distanciaRestante < distancia) {
				cantidadJinetes++;				
				distanciaRestante = 100 - distancia;
			} else {
				distanciaRestante = distanciaRestante - distancia;	
			}
		}
		return cantidadJinetes;
	}
}
