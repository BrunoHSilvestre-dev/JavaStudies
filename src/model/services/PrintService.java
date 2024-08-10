package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	List<T> list = new ArrayList<T>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		
		return max;
		
	}
	
	public void print() {
		System.out.println(list);
	}
}
