package abril;

import ObjetosComplejos.Robot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class testRobot {
	
	@Test
	public void test1() throws CloneNotSupportedException {
		Robot r1 = new Robot(1,1,1);
		Robot r2 = new Robot(2,2,2);
		Robot r3 = new Robot(3,3,3);
		Robot r4 = r1;
		Robot r5 = (Robot) r2.clone();
		
		assertFalse(r1==r2);
		assertFalse(r2==r3);
		assertFalse(r1==r3);
		assertFalse(r4==r3);
		assertTrue(r1==r4);
		
		assertTrue(r1.equals(r4));
		assertTrue(r2.equals(r5));
		assertFalse(r1.equals(r2));
		assertFalse(r2.equals(r3));
		
		
		
	}
	
}
