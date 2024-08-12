package application;

import java.util.ArrayList;
import java.util.List;
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
	
	public static void wildCardExample() {
		
//		List<Object> myObjs = new ArrayList<Object>();
//		List<Integer> myNumbers = new ArrayList<Integer>();
//		myObjs = myNumbers; // Integer is an Object, but List<Integer> is not a List<Object>
		
		Object obs;
		Integer x = 10;
		obs = x;
	
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers; 
	}

}
