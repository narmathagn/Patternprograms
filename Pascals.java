import java.util.*;
public class Pascals{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			int num=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				val=val*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
}