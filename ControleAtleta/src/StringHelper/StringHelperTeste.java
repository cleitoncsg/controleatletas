package StringHelper;
import static org.junit.Assert.*;

import org.junit.Test;


public class StringHelperTeste extends  Exception{

	//@Before
	
	public void setup(){
		StringHelper testaStringHelper = new StringHelper();
	}
	
	
	@Test
	
	public void conutsLineOfStringLikeTestEditors() throws Exception{
		assertEquals(0, StringHelper.ContarNumerosDeLinhas(null));
		
		assertEquals(1, StringHelper.ContarNumerosDeLinhas(""));
		assertEquals(1, StringHelper.ContarNumerosDeLinhas("3jsdh"));
		
		assertEquals(2, StringHelper.ContarNumerosDeLinhas("\n"));
		assertEquals(2, StringHelper.ContarNumerosDeLinhas("bla\n"));
		
		/*bla\n4, bla\n\n\n
		4, bla\n\n\nble*/
				
	}
}
