class T1 {
	public static void main(String[] args)
	{
	try {
		int a[]=new int[6];
		a[7]=1/10;
	}
catch(ArithmeticException ae)
	{
		System.out.println(ae);
	}
	catch(ArrayIndexOutOfBoundsException ae)
{
System.out.println(ae);
	}
	}
}