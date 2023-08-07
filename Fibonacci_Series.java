package Logical_Programimg;

public class Fibonacci_Series {
	public static void checkFiboSeries(int num)
	{
		int num2=1,num1=0; 
		System.out.println(num1);
		System.out.println(num2);
		int sum=0;
			for(int i=3; i<=num ; i++)
			{
				sum = num1+num2;
				num1=num2;
				num2 = sum;
				System.out.println(sum);
			}
	}
	public static void main(String[] args) {
		
		checkFiboSeries(20);
	}

}
