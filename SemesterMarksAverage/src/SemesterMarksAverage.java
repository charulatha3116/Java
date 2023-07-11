import java.util.Scanner;
public class SemesterMarksAverage {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter sem1,sem2,sem3,sem4,sem5,sem6,sem7 and sem8");
		double sem1=scan.nextDouble();
		double sem2=scan.nextDouble();
		double sem3=scan.nextDouble();
		double sem4=scan.nextDouble();
		double sem5=scan.nextDouble();
		double sem6=scan.nextDouble();
		double sem7=scan.nextDouble();
		double sem8=scan.nextDouble();
		
		double res=calculateAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
		System.out.println(res);
		scan.close();
	}
		public static double calculateAverage(double sem1, double sem2, double sem3, double sem4, double sem5, double sem6, double sem7, double sem8) {
			return (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
		}
		
		
}
