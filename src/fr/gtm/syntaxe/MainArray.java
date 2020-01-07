package fr.gtm.syntaxe;

import java.util.Arrays;
import java.util.Random;

public class MainArray {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] tab = random.ints(10,-100,1_000).toArray();
		//int[] tab = {2, 4, 11 , 97 , 1067};
		System.out.println(Arrays.toString(tab));

		int nbNegatifs = getNegatifs(tab);
		int nbPairs = getPairs(tab);
		int[] nbPremiers = getPremiers(tab);
		System.out.println("négatifs : "+nbNegatifs);
		System.out.println("pairs : "+nbPairs);
		System.out.println("nombres premiers : ");
		System.out.println(Arrays.toString(nbPremiers));
	}

	private static int[] getPremiers(int[] tab) {
		// TODO Auto-generated method stub
		int[] result = new int[0];
		for (int n : tab) {
			n = n<0 ? -n : n; // nb négatif devient nb positif (valeure absolue)
			boolean premier = true;
			for (int i=2; i<n; i++) {
				if (n%i==0) {
					premier = false;
					break;
					
				}
				
			}
			if (premier)
				result = add(n,result);
		}
				return result;
	}
	 private static int[] add(int n, int[] tab) {
	        int[] newTab = new int[tab.length+1];
	        for(int i=0 ; i<tab.length ; i++) {
	            newTab[i] = tab[i];
	        }
	        newTab[newTab.length - 1] = n;
	        return newTab;
	    }
	private static int getPairs(int[] tab) {
		// TODO Auto-generated method stub
		int nb =0;
		for (int n : tab) {
			if (n%2==0) {
				nb++;
			}
		}
		return nb;
	}

	public static int getNegatifs(int[] tab) {
		// TODO Auto-generated method stub
		int nb =0;
		for (int n : tab) {
			if (n<0) {
			nb++;
			}
		}
			return nb;

		}

}



