package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Digite a largura do terreno: 10.0
		//Digite o comprimento do terreno: 30.0
		//Digite o valor do metro quadrado: 200.0
		//Area do terreno = 300.00
		//Preco do terreno = 60000.00
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valorMetroQuadrado, area, preco;
		
		System.out.println("Largura do terreno: ");
		largura = sc.nextDouble();
		
		System.out.println("Comprimento do terreno: ");
		comprimento = sc.nextDouble();
		
		System.out.println("Valor Metro Quadrado: ");
		valorMetroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;

		System.out.printf("Area do terreno = %.2f\n", area);
		
		preco = area * valorMetroQuadrado;
		
		System.out.printf("Valor do terreno = %.2f\n", + preco);
		
		
		
		
		
		
		
		
		sc.close();

	}

}
