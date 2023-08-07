//Program to check Xylem and Phloem Number In JavaPost
package Logical_Programimg;

public class XylemOrPhloem {
	public static void checkXylemOrPhloem(int num)
	{
		int num1 = num;
		int count1=0, count2=0, sum1=0, sum2=0;
		while(num>0)
		{
			num=num/10;
			count1++;
		}
		while(num1>0)
		{
			int ls = num1%10;
			count2++;
			if(count2 == 1 && count1 ==count2)
			{
				sum1 = sum1 + ls;
			}
			else
				sum2 =sum2 +ls;
			num1= num1/10;
		}
			if(sum1 == sum2)
			{
				System.out.println("It's Xylem Number");
			}
			else
				System.out.println("It's Phloem Number");
		
	}
	public static void main(String[] args) {
		checkXylemOrPhloem(3423);
	}
}
