package pack2;
 import java.io.*;
 import java.util.Scanner;
 public class Dollar {
  static int check(int n)
  {
	  int b= Integer.signum(n);
	  return b;
  }
  static int check2(int n)
  {  int a=n%10;
	  
	return a;
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d = new Scanner(System.in);
		System.out.println("enter the number");
	int	 n =d.nextInt(),a=0,b=0,f=0,rem=0,rem1=0,z=0;

		int c = check(n);
		int e =check2(n);
		if (c==0||c==-1)
		{
		throw new ArithmeticException("Invalid Amount");
		}
		if (e!=0)
		{
		throw new ArithmeticException("please enter the multiples of 10");
		}
		if (n>=50)
		{
		 a=n/50;
		  rem =n%50;
		 z=1;
		}
		 if (rem>=20||n<50&&n>=20)
		{   if (n<50&&n>=20)
		{  b=n/20;
		z=2;
		
		}
		else{b=rem/20;
			rem1=rem%20;
			z=2;}
		}
		 if(rem1>=10||n==10)
		{  if(n==10)
		{ f=n/10;}
		else {
			f=rem1/10;}
		}
		if (z==1)
		{
			System.out.println(a+"*50 "+b+"*20 "+f+"*10");
		}
		else if(z==2)
		{
			System.out.println(b+"*20 "+f+"*10");
		}
		else
		{
			System.out.println(f+"*10");
		}
	
		
	}

}