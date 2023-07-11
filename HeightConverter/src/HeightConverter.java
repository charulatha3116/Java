import java.util.Scanner;

public class HeightConverter {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double inches=scan.nextDouble();
	HeightConvert converter=new HeightConvert();
	converter.convertInchesToFeet(inches);
	System.out.println(converter.convertInchesToFeet(inches));
	scan.close();	
}
}
