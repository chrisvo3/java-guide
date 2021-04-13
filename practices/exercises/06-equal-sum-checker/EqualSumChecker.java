// package practices.exercises.06-equal-sum-checker;

public class EqualSumChecker {
	
	public static boolean hasEqualSum(int num1, int num2, int num3) {
		int sum = num1 + num2;
		return (sum == num3) ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(hasEqualSum(1, 1, 1));
		System.out.println(hasEqualSum(1, 1, 2));
		System.out.println(hasEqualSum(1, -1, 0));
	}
}
