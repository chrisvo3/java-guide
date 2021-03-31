// package practices.exercises.01-speed-converter;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            //  1 mile per hour is 1.609 kilometers per hour
            double calculation = Math.round(kilometersPerHour / 1.609);
            return Double.valueOf(calculation).longValue();
            // return Double.valueOf(kilometersPerHour).longValue() * fixedNumb;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
    
}
