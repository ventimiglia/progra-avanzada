import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GestorArchivo {
	
	
	
	static Torneo crearTorneo(String path) throws FileNotFoundException {
		
		Scanner rarch = new Scanner(new File(path));
		
		Torneo torneo = new Torneo(rarch.nextInt());
		int idLuchador = 0;
		
		while(rarch.hasNext()) {
			Luchador luchador = new Luchador(rarch.nextInt(), rarch.nextInt());
			
			torneo.agregarLuchador(idLuchador, luchador);
			idLuchador++;
		}
		
		rarch.close();
		
		return torneo;
	}
	
	public void escribirArchivo(Torneo torneo) {
		
	}
}
