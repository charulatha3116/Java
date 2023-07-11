import java.util.Scanner;
public class FinanceCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter principal,rate and time");
		double principal=scan.nextDouble();
		double rate=scan.nextDouble();
		double time=scan.nextDouble();
		CalculationofFinance finance=new CalculationofFinance();
		finance.calculateSimpleInterest(principal,rate,time);
		System.out.printf("%.2f\n",finance.calculateSimpleInterest(principal,rate,time));
		scan.close();
		
		
	}

}
