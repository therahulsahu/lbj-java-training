import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		
		writeFile("output.txt", "hello this is write line method");
		
		readFile("output.txt");
	}

	private static void readFile(String fileName) throws IOException {
		FileReader reader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(reader);
		
//		String line = bufferedReader.readLine();
		
		Stream<String> stream = bufferedReader.lines();
		
		stream.forEach((line) -> System.out.println(line));
	}
	
	private static void writeFile(String fileName, String data) throws IOException {
		
		FileWriter writer = new FileWriter(fileName);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		
		writer.write(data);
		bufferedWriter.close();
	}
}
