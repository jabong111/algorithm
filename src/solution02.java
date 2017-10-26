import java.util.Scanner;

public class solution02 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int Y = scanner.nextInt();
		
		if(Y%4==0 && Y%400==0 || Y%100!=0){
			System.out.println("Leap Year");
		}else{
			System.out.println("Not Leap Year");
		}
	}
}
