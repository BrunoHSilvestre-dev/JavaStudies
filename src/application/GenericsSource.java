package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import entities.shapes.Circle;
import entities.shapes.Rectangle;
import entities.shapes.Shape;
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
	
		List<?> myObjs = new ArrayList<Object>(); // List<?> is the supertype of any List
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers; 
	}

	public void printList(List<?> list) {
	    //using a wildcard type to print any type of list
		for (Object elem : list) {
	        System.out.println(elem);
	    }
	}
	
	public static void shapeBoundedWildCard(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		System.out.println("Total area: " + totalArea(myShapes));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
	}
	
	public static double totalArea(List<? extends Shape> list) {
		//the wildcard with extends Shape allows to enter only shape extended classes as a parameter
		
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
	
	public static void getPutPrinciple() {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		
//		list.add(20); compilation error
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
//		Number y = myNums.get(0); compilation error
	}

	public static void copyList() {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		copy(myDoubles, myObjs);
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number : source) {
			destiny.add(number);
		}
	}
}
