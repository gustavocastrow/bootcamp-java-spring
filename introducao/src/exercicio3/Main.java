package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, nf;
		
		System.out.println("Primeira Nota: ");
		n1 = sc.nextDouble();
		
		System.out.println("Segunda Nota: ");
		n2 = sc.nextDouble();
		
		nf = (n1 + n2) / 2;
		
		
		
		if (nf >= 6) {
			System.out.printf("Sua média foi: %.1f portanto APROVADO", nf);
		} 
		else if (nf >=4 && nf <= 6) {
			System.out.printf("Sua média foi: %.1f portanto EXAME", nf);	
		} 
		else {
			System.out.printf("Sua média foi: %.1f portanto REPROVADO", nf);
			
		}
		
		
		sc.close();
		
		
		
		
	}

}
