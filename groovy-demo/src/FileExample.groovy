import java.io.File;

class FileExample {
   static void main(String[] args) {
      rangeExample()
	  println("done")
   } 
   
   static void rangeExample() {
	   def rint = 1..10 ;
	   for (num in rint) {
		   print("$num ")
	   }
	   println(rint)
   }
   
   static void readFile() {
	   new File("Example.txt").eachLine {
		   line -> println "line : $line";
		}
   }
   
   static void writeFile() {
	   new File('Example.txt').withWriter('utf-8') {
		  writer -> writer.writeLine 'Hello World'
	   }
	}
	
	static void sizeOfFile() {
		File file = new File("Example.txt")
		println "The file ${file.absolutePath} has ${file.length()} bytes"
	}
	 
	static void fileOrDirectory() {
		 def file = new File('Example.txt')
		 println "File? ${file.isFile()}"
		 println "Directory? ${file.isDirectory()}"
	}
	  
	static void createADirectory() {
	     def file = new File('Directory')
	     file.mkdir()
	}
	
	static void deletingAFile() {
		def file = new File('Example1.txt')
		file.delete()
	 }
	 
	 static void copyFile(String[] args) {
		 def src = new File("Example.txt")
		 def dst = new File("Example1.txt")
		 dst << src.text
	  }
}