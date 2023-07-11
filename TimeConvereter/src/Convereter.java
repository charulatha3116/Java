import java.util.Scanner;
public class Convereter {
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int minutes=scan.nextInt();
	System.out.println(TimeConverter.convertToHour(minutes));
	scan.close();
	}

}
