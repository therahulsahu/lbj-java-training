
public class GravityCalculator {
	public static void main(String[] args) {
		double gravity = -9.81;
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		System.out.println("The Object's position after " + fallingTime + " second is " + finalPosition + "m.");
		
		
		// output : The Object's position after 10.0 second is 0.0m.
		
		finalPosition = 0.5 * gravity * fallingTime * fallingTime + (initialVelocity * fallingTime) + initialPosition;
		System.out.println("The Object's position after " + fallingTime + " second is " + String.format("%.2f", finalPosition) + "m.");
	}
}
