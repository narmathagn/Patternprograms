import java.util.*;
public class Pyr
{
	public static void main(String args[])
	{
		int s=0;
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int k=0;k<=s;k++)
			{
				System.out.print(" ");
			}
			s++;
		}
	}
}