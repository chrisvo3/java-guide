// package practices.exercises.05-decimal-comparator;

public class DecimalComparator {

	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
		return (int)(num1 * 1000) == (int)(num2 * 1000);
	}
	
	public static void main(String[] args) {
		System.out.println( areEqualByThreeDecimalPlaces(-3.1756, -3.175) ); // true
		System.out.println( areEqualByThreeDecimalPlaces(3.175, 3.176) ); // false
		System.out.println( areEqualByThreeDecimalPlaces(3.0, 3.0) ); // true
		System.out.println( areEqualByThreeDecimalPlaces(-3.123, 3.123) ); // false

	}
	
}
