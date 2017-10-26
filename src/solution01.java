import java.util.Scanner;

public class solution01 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int D = scanner.nextInt();
		
		for(int i=1;i<=D;i++){
			if(D%i == 0){
				System.out.print(i + " ");
			}
		}
	}	
}
