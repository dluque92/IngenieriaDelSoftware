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
	
	@Test(expected = BinaryStringException.class)
	public void testGetOutOfLimitBit(){
		bitset3.get(56);
	}
	
	@Test(expected = BinaryStringException.class)
	public void testSetOutOfLimitBit(){
		bitset3.set(56, '0');
	}
	
	@Test
	public void testSetOutOfLimitBitV2(){
		try{
			bitset3.set(56, '0');
			fail("Se espera excepcion BinaryStringException");
		}catch(RuntimeException e){
			
		}
	}
	
	@Test(expected = BinaryStringException.class)
	public void testInvalidBitValue(){
		bitset2.set(2,'2');
	}
	
	@Test
	public void testToString(){
		assertEquals(" 1010", bitset1.toString());
	}
}
