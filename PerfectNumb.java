package Logical_Programimg;
 
public class PerfectNumb {
	static void perNum(int a)
	 {
		int sum= 0;
		 for (int i=1; i< a; i++)
		 {
			 if(a%i==0)
			 {
				 sum =sum+i;
			 }
		 }
		 if(sum== a) 
		 {
			 System.out.println("Its perfect Mumber");
		 }
		 else
		 {
			 System.out.println("not perfect number");
		 }
	 }
	public static void main(String[] args) {
		PerfectNumb.perNum(7);
	}
}