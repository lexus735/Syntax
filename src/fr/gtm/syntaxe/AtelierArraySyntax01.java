package fr.gtm.syntaxe;

public class AtelierArraySyntax01 {
	public static void main(String[] args) {
		double[][] array1 = {
				{1.1,5.6},
				{2.6,6.9},
				{5.6,9.6,8.7},
				{1.2}
		};
// TODO : initialiser le tableau pour qu'il ait la taille de la dimension de array1
// ATTENTION : pas de nombre magique		
	double[] resultats = new double[array1.length];
	
	
// TODO : chaque élément de resultat doit contenir la somme du tableau élément de array1
	// cad resultats[0] vaut 1.1 + 5.6
	
calcul(array1,resultats);

show(resultats);



	}

	private static void show(double[] tab) {
		for (double d : tab) {
			System.out.print(d+" ");
		}
		System.out.println();
	}

	private static void calcul(double[][] array1, double[] resultats) {
		// TODO Auto-generated method stub

		
		for (int ligne=0; ligne<array1.length; ligne++) {
			double r = 0;
			for (int colonne=0; colonne<array1[ligne].length; colonne++) {
				r = r + array1[ligne][colonne];
		resultats[ligne] = r; 		
			}
			
		}
	
	}
	
	
}
