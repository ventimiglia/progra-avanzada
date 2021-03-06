import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculoTest {

	@Test
	void test_interseccion() {
		Circulo circle1 = new Circulo(new Punto(2, 2), 2);
		Circulo circle2 = new Circulo(new Punto(3, 5), 2);
		
		assertEquals(circle1.intersectaCon(circle2), true);
	}
	
	void test_sin_interseccion() {
		Circulo circle1 = new Circulo(new Punto(2, 2), 2);
		Circulo circle2 = new Circulo(new Punto(6, 4), 2);
		
		assertEquals(circle1.intersectaCon(circle2), true);
	}

}
//Test