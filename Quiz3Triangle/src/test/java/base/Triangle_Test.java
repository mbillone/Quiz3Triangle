package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test {
	
	static TriangleArea T1;
	static TriangleArea T2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		T1 = new TriangleArea();
		T2 = new TriangleArea(3,4,5);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Areatest() {
		assertTrue(T1.getArea() == .43330127);
		assertTrue(T2.getArea() == 6.0);
		assertFalse(T1.getArea() == 12.0);
		assertFalse(T2.getArea() == 10.0);
		
	}
	@Test
	public void PerimeterTest(){
		assertTrue(T1.getPerimeter() == 3.0);
		assertFalse(T1.getPerimeter() == 5.0);
		assertTrue(T2.getPerimeter() == 12.0);
		assertFalse(T2.getPerimeter() == 20.0);
		
	}

}
