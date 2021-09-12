package ifelse;
import java.util.Scanner;


public class maximumof3 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			 
			System.out.println("Enter  1 Number:");
			int num1=sc.nextInt();
			
			System.out.println("Enter  2 Number:");
			int num2=sc.nextInt();
			
			System.out.println("Enter  3 Number:");
			int num3=sc.nextInt();
			
			if(num1>num2 && num1>num3)
				System.out.println(num1+"is the maximum");
			
			else if(num2 > num1 && num2 > num3)
				System.out.println(num2+"is the maximum");
			
			else
				System.out.println(num3+"is the maximum");

		}

	}


