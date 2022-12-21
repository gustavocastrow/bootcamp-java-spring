package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//largura: 12.0
		//comprimento: 20.0
		//valor metro quadrado: 150.00
		//area: 300.00
		//preco 36000.00
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valorMetroQuadrado, area, preco;
		
		System.out.println("----- EXERCICIO 02 ----- ");
		
		System.out.println("Largura do terreno: ");
		largura = sc.nextDouble();
		
		System.out.println("Comprimento do terreno: ");
		comprimento = sc.nextDouble();
		
		System.out.println("Valor metro quadrado: ");
		valorMetroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		
		System.out.printf("Área do terreno = %.2f\n", area);
		
		preco = area * valorMetroQuadrado;
		
		System.out.printf("Valor terreno = %.2f\n", preco);
		
		sc.close();
		
		
		

	}

}
