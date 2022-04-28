import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PonyExpressTest {

	@Test
	void testEjemplo() {
		assertEquals(0, PonyExpress.jinetes(new int[] {}));
		assertEquals(1, PonyExpress.jinetes(new int[] {18, 15}));
		assertEquals(2, PonyExpress.jinetes(new int[] {43, 23, 40, 13}));
		assertEquals(3, PonyExpress.jinetes(new int[] {33, 8, 16, 47, 30, 30, 46}));
		assertEquals(3, PonyExpress.jinetes(new int[] {51, 51, 51}));
		assertEquals(4, PonyExpress.jinetes(new int[] {6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49}));
	}
	
	void test_solo_un_ginete()	{
		assertEquals(1, PonyExpress.jinetes(new int[] {99, 1}));
	}
}
