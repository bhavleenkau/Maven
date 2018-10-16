package mokito;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import mokito.ComputeImplementation;
import mokito.iCompute;

public class WeeklySalaryTest 
{

	ComputeImplementation obj;
	int v1;
	iCompute mockobj;
	@Before
	public void setUp() throws Exception 
	{
		obj=new ComputeImplementation();
		v1=500;
		
		mockobj=Mockito.mock(iCompute.class);
		Mockito.when(mockobj.weekelySalary(v1)).thenReturn((int) v1*7);
		obj.setObj(mockobj);
	}

	@After
	public void tearDown() throws Exception 
	{
		obj=null;
		mockobj=null;
	}

	@Test
	public void weekelysalary() {
		assertEquals((v1*7),obj.weekelySalary(v1));
	}

}
