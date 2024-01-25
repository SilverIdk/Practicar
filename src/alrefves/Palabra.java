package alrefves;

public class Palabra {

	
	public String Quitar (String palabra) {
		 String aux= "";
		for(int i = palabra.length()-1; i>= 0;i--) {
			if (palabra.charAt(i) != ' ') {
				aux += palabra.charAt(i);
			}
		}
		return aux;
	}
	
	public boolean Comparar (String palabra, String frace) {
		if (palabra.equals (frace)) {
			return true;
		}else {
			return false;
		}
	
	}
	
	
	
}
