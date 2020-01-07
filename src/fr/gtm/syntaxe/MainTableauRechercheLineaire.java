package fr.gtm.syntaxe;
 
import java.util.Arrays;
 
public class MainTableauRechercheLineaire {
 
    public static void main(String[] args) {
        int[] tab = {5,8,56,1,0,9,78,20};
        System.out.println(Arrays.toString(tab));
        System.out.println("Avant le tri à bulle : ");
        System.out.println(Arrays.toString(tab));
        triBull(tab);
        System.out.println("Après le tri à bulle : ");
        System.out.println(Arrays.toString(tab));
        int item = 2;
       /*
        * renvoie l'index dans le tableau de l'élément cherché
        * renvoie -1 si pas trouvé
        */
        int pos = rechercheLineaire(tab, item);
        if(pos==-1) {
            System.out.format("L'item %d n'a pas été trouvé\n",item);
        }
            else {
            System.out.format("L'item %d est à la position %d\n",item,pos);
            }
    }
 
     
     
    private static void triBull(int[] tab) {
		// TODO Auto-generated method stub
    		int n=0;
    		int i=0;
  
			while (n<tab.length-i) {
				for (i=0; i<tab.length-1; i++) {
					if (tab[i]>tab[i+1]) {
					int t=tab[i];
					tab[i]=tab[i+1];
					tab[i+1] = t;
				}
				
			}
		
		}
		
	}



	private static int rechercheLineaire(int[] tab, int item)
   {
   int n=0;
   for (int i=0; i<tab.length; i++) {
	   if (item==tab[i]) {
		  n=i;
		  break;
	   } 
	   else { n=-1;
	    }
   }
    	return n;
    }
 /*
  * ou if (item == tab[i]){
  * return i;}
  * }
  * return -1;
  */
    
}