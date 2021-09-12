package ifelse;
import java.util.*;
public class sumofud {
	
	
	   public static void main(String args[])
	   {

		int num;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The Number:");
		
		num=sc.nextInt();
		
		if(num>99 && num<1000)
		{
			System.out.println("Three Digit Number.");
			
			int lastdigit = num%10;
			
			int firstdigit=num;
			
			while(firstdigit>=10)
			{
				firstdigit=firstdigit/10;
			}
			System.out.println("firstdigit="+firstdigit);
			System.out.println("lastdigit="+lastdigit);
			System.out.println("Sum="+(firstdigit+lastdigit));
		}
		else
			System.out.println("Not a 3 Digit Number");
		
		

	   }
	}

