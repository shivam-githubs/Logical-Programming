package Logical_Programimg;

public class ReverseNum {
	public static void reverseNum(int num)
	{
		int sum=0 ;
		while(num>0)
		{
			int ls= num%10;
			sum = sum*10 +ls;
			num= num/10;	
		}
		System.out.println("Reverse Num is "+sum);
	}
	public static void main(String[] args) {
		reverseNum(1234);
	}
}
