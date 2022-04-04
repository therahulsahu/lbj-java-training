import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ForLoopDemo {
	public static void main(String[] args) throws IOException {
		
		
		System.out.print("Input the character to be in the pattern : ");
		Scanner sc = new Scanner(System.in);
		char character = sc.next().charAt(0);
		
		writeFile("output.txt", stringTriangle(5, character));
		
		sc.close();
		System.out.println("Done, Check the pattern in output.txt");
	}
	
	
	/**
	 * Prints a triangle pattern of "size" rows and "size" columns
	 * @param size
	 */
	private static void printTriangle(int size) {
		if(size <= 0) {
			throw new IllegalArgumentException("Size should be greater than 0");
		}
		for(int row = size; row > 0; row--) {
			for(int column = 0; column < row; column++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
	
	private static String stringTriangle(int size) {
		String pattern = "";
		if(size <= 0) {
			throw new IllegalArgumentException("Size should be greater than 0");
		}
		for(int row = size; row > 0; row--) {
			for(int column = 0; column < row; column++) {
				pattern += "* ";
			}
			pattern += "\n";
		}
		return pattern;
	}
	
	private static String stringTriangle(int size, char character) {
		String pattern = "";
		if(size <= 0) {
			throw new IllegalArgumentException("Size should be greater than 0");
		}
		for(int row = size; row > 0; row--) {
			for(int column = 0; column < row; column++) {
				pattern += character + " ";
			}
			pattern += "\n";
		}
		return pattern;
	}
	
	private static void printTriangleUsingWhileLoop(int size) {
		if(size <= 0) {
			throw new IllegalArgumentException("Size should be greater than 0");
		}
		int row = size;
		while(row > 0) {
			
			int column = 0;
			while(column < row) {
				System.out.print("* ");
				column++;
			}
			System.out.println("");
			
			row--;
		}
	}
	
	private static void writeFile(String fileName, String data) throws IOException {
		
		FileWriter writer = new FileWriter(fileName);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		
		writer.write(data);
		bufferedWriter.close();
	}
}
