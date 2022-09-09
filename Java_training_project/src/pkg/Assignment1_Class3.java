package pkg;

public class Assignment1_Class3 {
	
	public Assignment1_Class3()
	{
		this(1,2,3);
		System.out.println("Default Parametrized");
	}
	public Assignment1_Class3(int a)
	{
		this();
		System.out.println("One Parametrized");
	}
	public Assignment1_Class3(int a, int b)
	{
		this(2);
		System.out.println("Two Parametrized");
	}
	public Assignment1_Class3(int a, int b, int c)
	{
		System.out.println("Three Parametrized");
	}
	public Assignment1_Class3(int a, int b, int c, int d)
	{
		this(2,3);
		System.out.println("Four Parametrized");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Assignment1_Class3 ref = new Assignment1_Class3(1,2,3,4);
	}

}
