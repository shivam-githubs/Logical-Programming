//Java Program to Check If a Number is Neon Number or Not
package Logical_Programimg;

public class NeonOrNot {
	public static void checkNeon(int num)
	{
		int sq= num*num;
		int sum=0;
		while(sq>0)
		{
			int ls = sq%10;
			sum  = sum + ls;
			sq = sq/10;
		}
		if (sum == num)
		{
			System.out.println("It's Neon Number");
		}
		else
			System.out.println("It's not Neon Number");
	}
	public static void main(String[] args) {
		checkNeon(10);
	}

}
