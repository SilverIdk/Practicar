package alrefves;

import java.util.Scanner;

public class appl {

	public static void main(String[] args) {
		
		Scanner Leer = new Scanner (System.in);
		String palabra;
		
		Palabra uno = new Palabra();
		
		System.out.println("Escribe");
		
		palabra = Leer.nextLine();
	
		String frace = (uno.Quitar(palabra));
		
		System.out.println(uno.Comparar(palabra, frace));
	

	}

}
