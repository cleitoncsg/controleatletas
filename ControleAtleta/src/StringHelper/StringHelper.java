package StringHelper;

public class StringHelper {

	public static int ContarNumerosDeLinhas (String texto){
		int count=1;
		char palavras[];
		
		if(texto==null) return 0;
		
		palavras = texto.toCharArray();
		
		for(int i=0; i<texto.length();i++){
			if(palavras[i]=='\n')
				count++;
		}
		return count;
	}
	
}
