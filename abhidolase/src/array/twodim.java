package array;
 import java.util.Scanner;
public class twodim {



		
				public static void main(String[] args)
				{
					int m,n;
					try (Scanner A = new Scanner(System.in)) {
						m=A.nextInt();

						
						 n=A.nextInt();
						 
						int array[][]=new  int [m][n];
						for(int i=0;i<m;i++)
						{
							for(int j=0;j<n;j++)
							{
								array[i][j]=A.nextInt();
							}
						}
						for(int i=0;i<m;i++)
						{
							for(int j=0;j<n;j++)
							{
											
						System.out.println(array[i][j]);

}
						}
					}
				}
				
}


		




