package application;

import java.util.Locale;
import java.util.Scanner;

public class BasicsSource {
	public void execute() {
		byte ByteInteiro = 127;
		short ShortInteiro = 32000;
		int Inteiro = 1;
		long LongInteiro = 100000000;
		float DecimalNormal = 1;
		double DecimalComMaiorPrecisao = 1.11111;
		char Caractere = 'a'; // caractere é com aspas simples 
		String Palavra = "palavra"; // string é com aspas duplas / String sempre começa com letra maiuscula pois não é um tipo primitivo
		int camelCase = 1;
		System.out.println(Inteiro);
		System.out.printf("%.2f\n", DecimalComMaiorPrecisao);
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			String Palavra2 = sc.next();
			System.out.println(Palavra2);
			int ValorLeitura = sc.nextInt();
		} finally {
			sc.close();
		}
		
		int Matematica = (int) Math.pow(Math.sqrt(4), 2) ;
		
		int Ternaria = (1 == 1) ? 1 : 2;
	}
}
