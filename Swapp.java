package Logical_Programimg;
import java.util.Scanner;
public class Swapp {
	public static void swap(int a, int b)
	{
		int c = a;
		a=b;
		b=c;
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Swapp.swap(sc.nextInt(), sc.nextInt());	
	}

}

