package fr.gtm.syntaxe;

public class MainSyntaxe {
	
	public static void main(String[] args) {
		int a = 5;
		int b =10;
		swap(a,b);
		System.out.println("a : "+a+" et b : "+b);
		
	}

	private static void swap(int a, int b) {
		int c;
		c=a;
		a=b;
		b=c;	
	}
}
