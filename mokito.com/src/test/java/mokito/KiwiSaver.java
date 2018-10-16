package mokito;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import mokito.ComputeImplementation;
import mokito.iCompute;

public class KiwiSaver 
{

	ComputeImplementation obj;
	int v1;
	double v2;
	iCompute mockobj;
	@Before
	public void setUp() throws Exception 
	{
		obj=new ComputeImplementation();
		v1=700;
		v2=(v1+30);
		
		mockobj=Mockito.mock(iCompute.class);
		Mockito.when(mockobj.computeKiwisaver(v2)).thenReturn((int) ((int) v1+30));
		obj.setObj(mockobj);
	}

	@After
	public void tearDown() throws Exception 
	{
		obj=null;
		mockobj=null;
	}

	@Test
	public void kiwisaver() {
		assertEquals((v1+30),obj.computeKiwisaver(v2),0);
	}

}
