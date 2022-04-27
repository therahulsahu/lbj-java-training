public class ListDemo {
	public static void main(String[] args) {
		def list = [11, 12, 13, 14]
		def listofString = ["Angular", "Groovy", "Java"]
		def nestedList = [1, 2, [3, 4], 5]
		def mixedList = ["Groovy", 21, 2.11]
		
		
		println(list)
		println(listofString)
		println(nestedList)
		println(mixedList)
		
		list.pop()
		list.add(15)
		println(list)
		list.pop()
		println(list)
	}
}