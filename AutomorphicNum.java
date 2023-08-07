package Logical_Programimg;

public class AutomorphicNum {
	public static void checkAutomorphicNum(int num)
	{
		int sq = num* num; int count=0,count1=0, sum1=0, sum =0, num2 = num;
		while (num >0) {
			int ls = num %10 ;
			sum1 = sum1+ls;
			num = num/10;
			count++;
		}
		while(sq>0)
		{
			int ls = sq%10;
			count1++ ;
			if(count>= count1) 
			{
				sum = ls+ sum;
				
			}
		sq= sq/10;
		}
		
		if(sum1 == sum)
		{
			System.out.println("It's Automorphic Number");
		}
		else
			System.out.println("It's not Automorphic Number");
	}
	public static  void main(String[] args) {
		checkAutomorphicNum(25);
	}
	
}
