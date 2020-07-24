import java.util.*;
public class Diamondpy
{
	public static void main(Stringargs[])
	{
		int space=4;s=1,e=7;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.prin(" ");
			}
			for(int k=0;k<s;k++)
			{
				System.out.print("*");
			}
			s=s+2;
			space--;
			System.out.println();
		}
		for(int l=0;l<4;l++)
		{
			for(int m=0;m<=l;m++)
			{
				System.out.print(" ");
			}
			for(int n=0;n<e;n++)
			{
				System.out.print("*");
			}
			System.out.println();
			e=e-2;
		}
	}
}