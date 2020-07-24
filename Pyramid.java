import java.util.*;
class Pyramid
{
	public static void main(String args[])
	{
		int space=3,s=1;
		for(int i=0;i<4;i++)
		{
			for(j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<s;k++)
			{
				System.out.print("*");
			}
			s=s+2;
			space--;
			System.out.println();
		}
	}
}