package pkg;

public class Assignment1_Class2 
{

	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Result of sum is "+c);
		return c;
	}
	
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("Result of sub is "+z);
		return z;
	}
	public int multi(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Result of multi is "+c);
		return c;
	}
	public void div(int a, int b)
	{
		int c;
		c= a/b;
		System.out.println("Result of div is "+c);
	}
	
	public static void main(String[] args) 
	{
		Assignment1_Class2 ref = new Assignment1_Class2();
		int SumResult = ref.sum(10, 2);
		int SumResult1 = ref.sum(SumResult, 2);
		int MultiResult = ref.multi(SumResult1, 2);
		int SubResult = ref.sub(MultiResult, 2); 
		ref.div(SubResult, 2);
		
	}
}
