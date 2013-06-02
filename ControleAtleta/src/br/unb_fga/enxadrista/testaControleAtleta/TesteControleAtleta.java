package br.unb_fga.enxadrista.testaControleAtleta;

import br.unb_fga.enxadrista.control.ControleAtleta;
import br.unb_fga.enxadrista.exceptions.AtributoInvalidoException;
import br.unb_fga.enxadrista.model.Enxadrista;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;




public class TesteControleAtleta {

        private ControleAtleta controleAtleta;
	private Enxadrista enxadrista;
		
	
	@Test
	public void testarInstancia() {

		assertNotNull(controleAtleta);
	}
	


	@Test (expected= AtributoNuloException.class)
	public void testarDadosNome() throws Exception{
		
		
		enxadrista.setNome("");
	
		
	}
	
	

}
