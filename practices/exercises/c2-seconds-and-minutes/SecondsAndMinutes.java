// package practices.exercises.c2-seconds-and-minutes;

public class SecondsAndMinutes {
    
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds <= 0 && seconds > 59) {
            return "Invalid value";
        } else { // calculate how many hours, minutes, and seconds = the minutes and seconds
            int hours = minutes / 60;
            String result = String.format("%02dhh %02dm %02ds", hours, minutes, seconds);
            return result;
        }
    }

    public static String getDurationString(Long seconds) {
        if (seconds <= 0) {
            return "Invalid value";
        } else { // calculate how many minutes are in the seconds value
            Long minutes = seconds / 60;
            Long remainSeconds = seconds % 60;
            return getDurationString(minutes.intValue(), remainSeconds.intValue());
        }
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41L));
        System.out.println(getDurationString(65, 9));
    }
}
