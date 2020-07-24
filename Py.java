import java.util.*;
public class Py
{
	public static void main(String args[])
	{
		int space=4;
		for(int i=0;i<5;i++)
		{
			for(j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			space--;
			System.out.println();
		}
	}
}