package mokito;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class FortnightSalaryTest {

	ComputeImplementation obj;
	int v1;
	int v2;
	iCompute mockobj;
	@Before
	public void setUp() throws Exception 
	{
		obj=new ComputeImplementation();
		v1=700;
		v2=(v1*10)/20;
		
		mockobj=Mockito.mock(iCompute.class);
		Mockito.when(mockobj.fortnightsalary(v2)).thenReturn((700*10)/20);
		obj.setObj(mockobj);
	}

	@After
	public void tearDown() throws Exception 
	{
		obj=null;
		mockobj=null;
	}

	@Test
	public void fortnightsalary() {
		assertEquals(((v1*10)/20),obj.fortnightsalary(v2));
	}

}
