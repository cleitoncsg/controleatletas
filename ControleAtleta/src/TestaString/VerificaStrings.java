package TestaString;
import static org.junit.Assert.*;

import org.junit.Test;


public class VerificaStrings {

	@Test
	public void deveriaIndentarProximaLinhaWhileseNaoTiverChaves() throws Exception{
		String codigo = "while(false) System.out.println(\"Impossivel\")";
		String esperado = "while(false)\n System.out.println(\"Impossivel\")";
		
		assertEquals(esperado,codigo);
	}
	
	@Test
	public void TestePositivo() throws Exception{
		String codigo = "Teste passa";
		String esperado = "Teste passa";
		
		assertEquals(esperado, codigo);

}
}