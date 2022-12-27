package exemploFor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de vezes do loop");
		int N = sc.nextInt()	;
		
		int soma = 0;
		for (int i=0; i<N; i++) { //i=i+1
			int x = sc.nextInt();
			soma += x;
			
		}
		
		System.out.println(soma);
		sc.close();

	}

}
