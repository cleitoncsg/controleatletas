package br.unb_fga.enxadrista.testaControleAtleta;
import br.unb_fga.enxadrista.model.Enxadrista;
import static org.junit.Assert.assertNotNull;

public class TestarControleEnxadrista{

	private Enxadrista enxadrista;

	@Test
	public void testarInstancia(){
		assertNotNull(Enxadrista);
	}	
}
