import java.util.*;
public class Invertpy
{
	public static void main(String args[])
	{
		int s=5;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<s;j++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			s--;
		}
	}
}