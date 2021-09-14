package uniquepair;
import java.util.*;

public class outerel {

		public static void main(String[] args) {
			int[][] arr = new int[4][4];
			Scanner s = new Scanner(System.in);
			System.out.print("Enter elemts");

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					arr[i][j] = s.nextInt();
				}
			}

			
			  for(int i=0;i<4;i++) 
			  { 
				  for(int j=0;j<4;j++) 
				  {
					  if(i == 0 || j==0 || i==3 ||j==3)
						  System.out.print(arr[i][j]);
				  } 
			  } 
			 
		}
	}


