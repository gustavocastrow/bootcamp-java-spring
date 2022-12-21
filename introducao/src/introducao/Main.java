package introducao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Word");
		
		int y = 32;
		System.out.println(y);
		
		double x = 10.323543;
		System.out.println(x);
		
		double z = 21.435;
		System.out.printf("%.2f%n", z);
		
		double w = 32.5424;
		System.out.printf("%.4f%n", w);
		
		//Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", w);
		
		System.out.println("Resultado" + x + " Metros");
		System.out.printf("Resultado = %2f metros%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		System.out.println("Products: ");
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		//Computer, which price is $ 2100,00
		System.out.printf("%s, which price is $ %.2f %n", product1, price1);
		
		//Office Desk, which price is $ 650,50
		System.out.printf("%s, which price is $ %.2f %n", product2, price2);
		
		//Record: 30 years old, code 5290 and gender "F"
		System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
		
		//Measure with eight decimal places: 53,23456700
		System.out.printf("Measure with eight places: %.8f %n", measure);
		
		//Rounded (three decimal places): 53,234
		System.out.printf("With three decimal places: %.3f %n", measure);
		
		// US Decimal point
		Locale.setDefault(Locale.US);
		System.out.printf("US Decimal point: %.3f", measure);
		
		Scanner sc = new Scanner(System.in);
		
		String xx;
		xx = sc.next();
		System.out.println("Você digitou: " + xx);
		
		int yy;
		yy = sc.nextInt();
		System.out.println("Você digitou o número: " + yy);
		
		double zz;
		zz = sc.nextDouble();
		System.out.println("Você digitou o double: " + zz);
		
		char ww;
		ww = sc.next().charAt(0);
		System.out.println("Você digitou: " + ww);
		
		sc.close();
		
		
	
		
		
		
		
		
		

	}

}
