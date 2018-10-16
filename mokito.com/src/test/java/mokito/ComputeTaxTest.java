package mokito;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ComputeTaxTest {
	ComputeImplementation obj;
	double va1,va2;
	iCompute mockobj;

	@Before
	public void setUp() throws Exception {
		
		obj=new ComputeImplementation();
		va1=2500;
		va2=va1/9;
		mockobj=Mockito.mock(iCompute.class);
		Mockito.when(mockobj.computeTax(va2)).thenReturn((int) (va1/9));
		obj.setObj(mockobj);
	}

	@After
	public void tearDown() throws Exception {
		obj=null;
		mockobj=null;
	}

	@Test
	public void computetax() {
			assertEquals((va1/9),obj.computeTax(va2),0);
	}

}
