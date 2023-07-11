import java.util.Scanner;
public class PlanetExplorer {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double radius=scan.nextDouble();
	PlanetExplore explore=new PlanetExplore();
	explore.calculateSurfaceArea(radius);
	System.out.println(explore.calculateSurfaceArea(radius));
	scan.close();
}
}
