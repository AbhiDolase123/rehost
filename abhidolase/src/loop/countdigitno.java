package loop;
import java.util.*;

public class countdigitno {

		public static void main(String[] args) {

			int  Count=0;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\n Please Enter any Number: ");
			int Number = sc.nextInt();
			
			for (Count = 0; Number > 0; Number = Number/10) {
				Count = Count + 1; 
			}
			System.out.format("\n Number of Digits in a Given Number = %d", Count);
		}
	}







