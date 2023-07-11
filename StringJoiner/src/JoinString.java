import java.util.Scanner;
public class JoinString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter str1");
		String str1=scan.next();
		System.out.println("Enter str2");
		String str2=scan.next();
		
		String result=joinString(str1,str2);
		System.out.println(result);
		
	}
	public static String joinString(String str1,String str2) {
		return str1+str2;
	}
	}


