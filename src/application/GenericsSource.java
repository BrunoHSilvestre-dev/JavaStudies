package application;

import java.util.Scanner;
import model.services.PrintService;

public class GenericsSource {
	
	public static void execute() {
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<Integer>();
		
		System.out.println("How many items?");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			ps.addValue(sc.nextInt());
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}
	
}
