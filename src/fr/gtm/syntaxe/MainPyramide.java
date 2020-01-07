package fr.gtm.syntaxe;

public class MainPyramide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			showPyramide(5);
			System.out.println();
			showPyramideCorrecte(5);
	}

	private static void showPyramide(int nbEtages) {
		// TODO Auto-generated method stub
		for (int i=0; i<=nbEtages; i++) {
			for (int j=0; j<nbEtages-i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<i; k++) {
				System.out.print("x ");
			}
			System.out.println();
		}
	}
	private static void showPyramideCorrecte(int nbEtages) {
		// TODO Auto-generated method stub
		for (int i=1; i<=nbEtages; i++) {
			for (int j=0; j<nbEtages-i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<2*i-1; k++) {
				System.out.print("x");
			}
			System.out.println();
		}
	}
}
