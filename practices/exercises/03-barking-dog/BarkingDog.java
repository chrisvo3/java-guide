// package practices.exercises.03-barking-dog;

public class BarkingDog {
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if (hourOfDay < 0 || hourOfDay > 23 || !barking) {
			return false;
		} else if ( (hourOfDay < 8 || hourOfDay > 22) && barking) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(shouldWakeUp(true, 1)); // true
		System.out.println(shouldWakeUp(false, 2)); // false
		System.out.println(shouldWakeUp(true, 8)); // false
		System.out.println(shouldWakeUp(true, -1)); // false
		System.out.println(shouldWakeUp(true, 23)); // true
	}
}
