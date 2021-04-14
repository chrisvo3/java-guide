// package practices.exercises.08-area-calculator;

public class AreaCalculator {

	public static double area(double radius) {
		// Math.PI
		if (radius < 0.0) {
			return -1;
		} else {
			return Math.PI * radius * radius;
		}
	}

	public static double area(double x, double y) {
		if (x < 0 || y < 0) {
			return -1;
		} else {
			return x * y;
		}
	}

	public static void main(String[] args) {
		System.out.println("area(5.0) : " + area(5.0)); // return 78.53975
		System.out.println("area(-1) : " + area(-1)); // return -1
		System.out.println("area(5.0, 4.0) : " + area(5.0, 4.0)); // return 20.0
		System.out.println("area(-1.0, 4.0) : " + area(-1.0, 4.0)); // return -1
	}
	
}
