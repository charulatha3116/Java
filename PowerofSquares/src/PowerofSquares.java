import java.util.Scanner;
public class PowerofSquares {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int res=SquareNumber(num);
		System.out.println(res);
		scan.close();
	}
		public static int SquareNumber(int num) {
			return num*num;
		} 
	}


