import java.util.Scanner;
public class JourneyCalculator {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter speed");
		double speed=scan.nextDouble();
		System.out.println("enter time");
		double time=scan.nextDouble();
		System.out.printf("%.2f\n",Journey.calculateDistance(speed,time));
		
	}

	
	}
		


