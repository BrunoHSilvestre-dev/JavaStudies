package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
	
	public static void fileReader() {
		String path = "D:\\ProgramFiles\\Java\\EclipseWorkspace\\Files\\in.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void fileReaderTryWithResources() {
		String path = "D:\\ProgramFiles\\Java\\EclipseWorkspace\\Files\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void fileWriter() {
		String[] lines = new String[] {"Good Morning!", "Good Afternoon!", "Good Night!"};
		
		String path = "D:\\ProgramFiles\\Java\\EclipseWorkspace\\Files\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void manipulatingFolders() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Folders: ");
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("Files: ");
		
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created: " + success);
		
		sc.close();
	}
	
	public static void exercise() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the csv path: ");
		String csvFilePath = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
			String actualLine = br.readLine();
			List<String[]> matrix = new ArrayList<>();
			
			while (actualLine != null) {
				matrix.add(actualLine.split(","));
				actualLine = br.readLine();
			}
			
			String outputPath = "D:\\ProgramFiles\\Java\\EclipseWorkspace\\Files\\out.csv";
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {
				for (String[] line : matrix) {
					double totalValue = Double.parseDouble(line[1]) * Double.parseDouble(line[2]); 
					
					bw.write(line[0] + ',' + totalValue);
					bw.newLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
