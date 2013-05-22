package pkg_Random;

public class RandomTest {

	
	public void sorteiaAmigoSecretoAleatoriamente() throws Exception{
		
		SorteadordoAmigoSecreto sorteador = new SorteadordoAmigoSecreto();
		
		sorteador.add("Paulo");
		sorteador.add("Hugo");
		sorteador.add("Mari");
		sorteador.add("Dairton");
		
		sorteador.sorteia();
		
		assertEquals("Paulo", sorteador.amigoDo("Hugo"));
		assertEquals("Dairton", sorteador.amigoDo("Paulo"));
		assertEquals("Mari", sorteador.amigoDo("Dairton"));
		assertEquals("Hugo", sorteador.amigoDo("Mari"));
		
		sorteador.sorteia();
		
		assertEquals("Paulo", sorteador.amigoDo("Hugo"));
		assertEquals("Mari", sorteador.amigoDo("Paulo"));
		assertEquals("Dairton", sorteador.amigoDo("Mari"));
		assertEquals("Hugo", sorteador.amigoDo("Dairton"));
	}

}
