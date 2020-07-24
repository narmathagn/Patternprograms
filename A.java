import java.util.*:
public class A
{
	public static void main(String args[])
	{
			System.out.print(" ");
			System.out.print("*");
			System.out.print(" ");
			System.out.println();
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(i==1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("*");
						System.out.print(" ");
						System.out.print("*");	
						break;
					}
				}
				System.out.println();
			}
	}
}
			