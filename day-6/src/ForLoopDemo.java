

public class ForLoopDemo {
	public static void main(String[] args) {
		printTriangleUsingWhileLoop(5);
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
}
