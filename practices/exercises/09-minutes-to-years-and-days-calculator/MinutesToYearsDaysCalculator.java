// package practices.exercises.09-minutes-to-years-and-days-calculator;

public class MinutesToYearsDaysCalculator {

	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		} else {
			long days = Math.toIntExact((minutes / 60) / 24);
			long years = Math.toIntExact((days / 365) % 365);
			String result = String.format("%d min = %d y and %d d", minutes, years, days);
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		printYearsAndDays(525600); // "525600 min = 1 y and 0 d"
		printYearsAndDays(1051200); // "1051200 min = 2 y and 0 d"
		printYearsAndDays(561600); // "561600 min = 1 y and 25 d"
	}
}
