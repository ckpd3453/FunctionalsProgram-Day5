import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
			//Initializing User Input
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter command line arrgument x  ::");
			int x = scanner.nextInt();
			
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Enter command line arrgument y ::");
			int y = scanner1.nextInt();
			//Logics
			double distance =Math.sqrt(x*x + y*y);
			System.out.println(distance);

	}

}
