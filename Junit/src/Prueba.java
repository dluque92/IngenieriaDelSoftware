import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Prueba {

	private BinaryString bitset1, bitset2, 
							bitset3, bitset4;
	private String pruebaString1 = "1010",
					pruebaString2 = "101010",
					pruebaString3 = "11111";
	
	@Before
	public void beforeTest(){
		bitset1 = new BinaryString(pruebaString1);
		bitset2 = new BinaryString(pruebaString2);
		bitset3 = new BinaryString(pruebaString3);
		bitset4 = new BinaryString(10000);
	}
	
	@Test
	public void testLongitud(){
		assertEquals(4, bitset1.length());
		assertEquals(10000, bitset4.length());
	}
	
	@Test
	public void testSetBit(){
		bitset2.set(1, '1');
		assertEquals('1', bitset2.get(1));
		
	}
}
