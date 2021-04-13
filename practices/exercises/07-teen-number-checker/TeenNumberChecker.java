// package practices.exercises.07-teen-number-checker;

public class TeenNumberChecker {

	public static boolean hasTeen(int a1, int a2, int a3) {
		return (isTeen(a1) || isTeen(a2) || isTeen(a3));
	}

	public static boolean isTeen(int age) {
		return (age >= 13 && age <= 19);
	}

	public static void main(String[] args) {
		System.out.println("Using hasTeen: ");
		System.out.println("hasTeen(9, 99, 19) : " + hasTeen(9, 99, 19));
		System.out.println("hasTeen(23, 15, 42) : " + hasTeen(23, 15, 42));
		System.out.println("hasTeen(22, 23, 34) : " + hasTeen(22, 23, 34));

		System.out.println("\nUsing isTeen: ");
		System.out.println("isTeen(9) : " + isTeen(9));
		System.out.println("isTeen(13) : " + isTeen(13));
	}
}
