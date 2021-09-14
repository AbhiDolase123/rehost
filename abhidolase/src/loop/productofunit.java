package loop;
import java.util.Scanner;

public class productofunit {

	

		public static void main(String[] args) {
			{
		        int n,mul=1,k;
		        System.out.println("Enter the Numbers :");
		        Scanner sc= new Scanner(System.in);
		        n=sc.nextInt();
		        for(mul=1; n >0;n = n / 10)
		        {
		            k = n%10;
		            mul = mul*k;
		        }
		        System.out.println("Product of Digits of Number : "+mul);
		    }

		}

	
}
