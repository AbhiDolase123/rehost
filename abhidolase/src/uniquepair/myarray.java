package uniquepair;

public class myarray {

	public static void main(String args[])
	{ 
		int arr[]= {2,4,3,5,6,-2,4,7,8,9};
		
		int sum=7,temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				temp=arr[i]+arr[j];
				if(temp==sum)
				{
					System.out.println("["+arr[i]+","+arr[j]+"]");
				}
			}
		}
	}
}
