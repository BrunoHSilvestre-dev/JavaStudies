package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.UserLog;

public class SetSource {

	public static void execute() {
		Set<String> set = new LinkedHashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

//		set.remove("Tablet");
//		set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');

//		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}
	}

	public static void treeSet() {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		// union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}
	
	public static void setExercise() {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Bruno\\eclipse-workspace\\Files\\in.txt"))) {
			
			Set<UserLog> set = new HashSet<>();
			
			String actualLine = br.readLine();
			while (actualLine != null) {
				String[] splittedActualLine = actualLine.split(" ");
				
				set.add(new UserLog(splittedActualLine[0], Instant.parse(splittedActualLine[1])));
				
				actualLine = br.readLine();
			}
			
			System.out.println(set.size());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
