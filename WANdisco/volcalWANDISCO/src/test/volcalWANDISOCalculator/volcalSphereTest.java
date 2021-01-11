package volcalWANDISOCalculator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class volcalSphereTest {
	@Parameter(0)
	public int testInput;
	@Parameter(1)
	public double testOutput;
	
	@Parameters
	public static Collection<Object[]>data(){
			Object[][] data = new Object [] [] {{1,4.19},{5,523.60}};
			
			return Arrays.asList(data);
	}
	
	@Test
	public void test() {
		volcalSphere test = new volcalSphere();
		assertEquals(testOutput,test.calculation(testInput), 0.01d);
		
		
	}

}
