import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		try {
			Torneo torneo = GestorArchivo.crearTorneo("sumo.in");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
