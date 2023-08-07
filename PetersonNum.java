package Logical_Programimg;

public class PetersonNum {
	public static void checkPetersonNum(int num)
	{     
		int sum=0,numa =num;
		while(num >0 )
		{
			int ls = num %10;
			
			int pro=1;
			while(ls>0)
			{
				 pro = pro *ls;
				 ls--;
			}
			sum = sum +pro;
			num = num/10;
		}
		
		if (numa == sum)
		{
			System.out.println("It's Peterson Number");
		}
		else
			System.out.println("It's not Peterson Number");
	}
	public static void main(String[] args) {
		checkPetersonNum(145);
	}
}
