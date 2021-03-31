// package practices.exercises.02-megabytes-converter;

public class MegaBytesConverter {

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
		} else if (kiloBytes == 0) {
			System.out.println(kiloBytes + " KB = 0 MB and 0 KB");
		} else {
			// 1 MB = 1024 KB
			int megabytes = kiloBytes / 1024;
			int remainkilo = kiloBytes % (megabytes * 1024);
			System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainkilo + " KB");
		}
	}

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(0);
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(-1024);
		printMegaBytesAndKiloBytes(5000);
	}
	
}
