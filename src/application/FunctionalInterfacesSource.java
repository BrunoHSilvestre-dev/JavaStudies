package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import services.ProductService;

public class FunctionalInterfacesSource {

	public static int compareProducts(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
	
	public static void execute() {
		
//	Predicate is a functional interface that expects you to implement a function passing a type as a parameter which returns a boolean value
//	Consumer is a functional interface that expects you to implement a function passing a type as a parameter but with no return (via side-effect)
//	Function is a functional interface that expects you to implment a function passing two type, one for input and one for output
		
//		List<Product> list = new ArrayList<>();
//		
//		list.add(new Product("TV", 900.0));
//		list.add(new Product("Notebook", 1200.0));
//		list.add(new Product("Tablet", 450.0));
		
//		list.sort(new MyComparator());
		
//		Comparator<Product> comp = new Comparator<Product>() {
//			@Override
//			public int compare(Product p1, Product p2) {
//				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//			}
//		};
//		
		
//		Comparator<Product> comp = (p1, p2) -> {
//			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//		};

//		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//
//		list.sort(comp);

//		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
//		list.sort(ComparatorSource::compareProducts);
		
//		for (Product product : list) {
//			System.out.println(product);
//		}
		
//		list.forEach(System.out::println);
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 90.0));
		list.add(new Product("Tablet", 450.0));
		list.add(new Product("Mouse", 50.0));
		
//		list.removeIf(x -> x.getPrice() <= 100.0 && x.getPrice() > 500.0);
		
//		list.removeIf(new ProductPredicate());
		
//		list.removeIf(Product::staticProductPredicate);
		
//		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
//		
		list.forEach(System.out::println);
//		
		ProductService prodService = new ProductService();
		
		System.out.println(prodService.filteredSum(list, p -> p.getName().charAt(0) == 'T'));
		
//		//Map is a stream method, that's why i converted my list to a stream
//		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
//		
//		names.forEach(System.out::println);
	}
}
