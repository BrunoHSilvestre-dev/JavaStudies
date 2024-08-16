package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

	public Double filteredSum(List<Product> list, Predicate<Product> filter) {
		Double sum = 0.0;
		
		for (Product product : list) {
//			if (product.getName().charAt(0) == 'T') {
//				sum += product.getPrice();
//			}
			
			if (filter.test(product)) {
				sum += product.getPrice();
			}
		}
		
		return sum;
	}
	
}
