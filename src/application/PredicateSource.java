package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class PredicateSource {
	public static void execute() {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 90.0));
		list.add(new Product("Tablet", 450.0));
		list.add(new Product("Mouse", 50.0));
		
		//Predicate is a functional interface that expects you to implement a function which returns a boolean value
		list.removeIf(x -> x.getPrice() <= 100.0 && x.getPrice() > 500.0);
		
//		list.removeIf(new ProductPredicate());
		
//		list.removeIf(Product::staticProductPredicate);
		
		list.forEach(System.out::println);
		
	}
}
