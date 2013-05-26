package br.unb.sece.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;



public class TestarControleNota {

	private Enxadrista enxadrista;
	

	@Test
	public void testarInstancia(){
		assertNotNull(Enxadrista);
	}

	
	@Test
	public void testarSelectTurmaCerto()
	{
		try
		{
			CNota.getModelTurma().setSelectedItem("1 - turma");
			CNota.selectTurma("1 - turma");
		}
		catch(Exception e)
		{
			fail("Ocorreu um erro");
			//e.printStackTrace();
		}
	}
	

	


}
