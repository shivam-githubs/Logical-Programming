package Logical_Programimg;

public class PalindromeOrNot {
	public static void sumOfDigit(int n)
	{
		int sum = 0, temp =n;
		while(n>0)
		{
			int ls= n%10;
			sum = sum*10+ls;
			n = n/10;
		}if (temp == sum)
			System.out.println("Palindrome Nuber");
		else 
			System.out.println("not");
	}
	public static void main(String[] args) {
		sumOfDigit(16461);
	}
}
