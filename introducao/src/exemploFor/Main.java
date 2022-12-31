package exemploFor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de vezes do loop");
		
		int numero = sc.nextInt()	;
		int soma = 0;
		//inicio ; condição ; incremento
		for (int i=0; i<numero; i++) { //i=i+1
			int x = sc.nextInt();
			soma += x;
			
		}
		
		System.out.println(soma);
		sc.close();

	}

}
