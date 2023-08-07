package Logical_Programimg;

public class Strong {
	public static void strNum(int a)
	{
		int lt=0, rv= 0, t= a; 
		while(a>0)
		{
			lt = a%10;
			int fact = 1;
			while(lt>0)
			{
				fact= fact*lt;
				lt--;
			}
			rv =rv +fact;
			
			a=a/10;
		}if(rv==t) {
			System.out.println("Its Strong Nuber");
		}else
			System.out.println("its not Strong");
	}
	public static void main(String[] args) {
		strNum(16);
	}
}
 