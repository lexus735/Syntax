package fr.gtm.syntaxe;

public class LettreToChiffre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String lettre = lettreToChiffre("m");
		System.out.println(lettre);
		
	}

	public static String lettreToChiffre(String string) {
		// TODO Auto-generated method stub
	switch(string.toUpperCase()) {
	case "A": case "J" : return ("1");
	case "B" : case "K" : case "S" : return ("2");
	case "C" : case "L" : case "T" : return ("3");
	case "D" : case "M" : case "U" : return ("4");
	case "E" : case "N" : case "V" : return ("5");
	case "F" : case "O" : case "W" : return ("6");
	case "G" : case "P" : case "X" : return ("7");
	case "H" : case "Q" : case "Y" : return ("8");
	case "I" : case "R" : case "Z" : return ("9");

	
	
	}
		return null;
	}

}
