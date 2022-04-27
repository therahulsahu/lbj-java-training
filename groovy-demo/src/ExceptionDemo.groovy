class ExceptionDemo {
	public static void main(String[] args) {
	   try {
		  def arr = new int[3];
		  arr[5] = 5;
	   } catch(Exception ex) {
		  println("Catching the exception");
	   }
		 
	   println("Let's move on after the exception");
	}
	
	static void example1() {
		try {
		   def arr = new int[3];
		   arr[5] = 5;
		}catch(ArrayIndexOutOfBoundsException ex) {
		   println("Catching the Array out of Bounds exception");
		}catch(Exception ex) {
		   println("Catching the exception");
		}
		  
		println("Let's move on after the exception");
	}
	
	static void example2() {
		try {
		   def arr = new int[3];
		   arr[5] = 5;
		} catch(ArrayIndexOutOfBoundsException ex) {
		   println("Catching the Array out of Bounds exception");
		}catch(Exception ex) {
		   println("Catching the exception");
		} finally {
		   println("The final block");
		}
		  
		println("Let's move on after the exception");
	}
 }