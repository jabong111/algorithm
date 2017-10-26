import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Test {	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int Data = scanner.nextInt();
		int[] arr = new int[50];
		int i=0;
		while(Data >= 16) {
			int hex = Data%16;
			Data = Data / 16;

			arr[i] = hex;
			i++;
		}
		arr[i] = Data;

		for(int j= i;j>=0;j--) {
			if(arr[j] == 10) {
				System.out.print('a');
			}else if(arr[j] == 11) {
				System.out.print('b');			
			}else if(arr[j] == 12) {
				System.out.print('c');			
			}else if(arr[j] == 13) {
				System.out.print('d');		
			}else if(arr[j] == 14) {
				System.out.print('e');
			}else if(arr[j] == 15){
				System.out.print('f');
			}else {
				System.out.print(arr[j]);
			}
			
		}
		
	}
}
