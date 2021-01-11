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
public class volcalDecmicalLimterTest {

	@Parameter(0)
	public double testInput;
	@Parameter(1)
	public double testOutput;
	
	@Parameters
	public static Collection<Object[]>data(){
			Object[][] data = new Object [] [] {{523.5987755982989,523.60},{14.731391274719739,14.73}};
			
			return Arrays.asList(data);
	}
	
	@Test
	public void test() {
		volcalTetrahedron test = new volcalTetrahedron();
		assertEquals(testOutput,test.decFormat(testInput), 0.01d);
		
		
	}

}
