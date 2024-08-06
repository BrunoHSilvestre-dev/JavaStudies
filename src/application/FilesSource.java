package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilesSource {
	public static void execute() {
		
		File file = new File("D:\\ProgramFiles\\Java\\EclipseWorkspace\\Files\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
