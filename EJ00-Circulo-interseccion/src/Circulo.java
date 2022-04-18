
public class Circulo {

	private Punto punto;
	private double radio;

	public Circulo(Punto _punto, double _radio) {
		this.punto = _punto;
		this.radio = _radio;
	}

	public boolean intersectaCon(Circulo circulo) {
		double coordenadaX1 = this.punto.getCordenadaX();
		double coordenadaY1 = this.punto.getCordenadaY();
		double radio1 = this.radio;

		double coordenadaX2 = circulo.punto.getCordenadaX();
		double coordenadaY2 = circulo.punto.getCordenadaY();
		double radio2 = circulo.radio;

		double distancia = (coordenadaX1 - coordenadaX2) * (coordenadaX1 - coordenadaX2)
				+ (coordenadaY1 - coordenadaY2) * (coordenadaY1 - coordenadaY2);

		double radioSumatoria = (radio1 + radio2) * (radio1 + radio2);

		if (distancia <= radioSumatoria)
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		Circulo circle1 = new Circulo(new Punto(0, 0), 1);
		Circulo circle2 = new Circulo(new Punto(1, 1), 1.5);

		System.out.println(circle1.intersectaCon(circle2));
	}

}
