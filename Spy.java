package Logical_Programimg;

public class Spy {
	public static void spy(int a)
	{
		int ln= 0, sum =0, pr=1;
		while(a>0) {
			ln = a%10;
			sum += ln;
			pr = pr*ln;
			a= a/10;
		}
		if(pr==sum)
		{
			System.out.println("It is spy Number");
		}else
			System.out.println("not");
	}
	public static void main(String[] args) {
		spy(1124);
	}
}
