
public class FooCorporation {

	static float calculateSalary(float basePay, int hoursWorked) {
		if (hoursWorked > 60) {
			throw new IllegalArgumentException(
					"Hours worked should not be more than 60 hours. Hours : " + hoursWorked + " hours.");
		}
		if (basePay < 8.0) {
			throw new IllegalArgumentException("Base pay should not be less than $8.00. Base Pay : $" + basePay);
		}

		float salary = 0.0f;

		if (hoursWorked > 40) {
			salary = basePay * 40;
			salary += basePay * 1.5 * (hoursWorked - 40);
		} else {
			salary = basePay * hoursWorked;
		}

		return salary;
	}

	public static void main(String[] args) {

//		Employee 1 $7.50 35
//		Employee 2 $8.20 47
//		Employee 3 $10.00 73
		System.out.println(calculateSalary(7.50f, 35));
		System.out.println(calculateSalary(8.20f, 47));
		System.out.println(calculateSalary(10, 73));
	}
}
