package pkg;

public class Assignment2
{

		
		public Assignment2()
		{
			this(1,2,3);
			System.out.println("Default Parametrized");
		}
		public Assignment2(int a)
		{
			this(1,2,3,4);
			System.out.println("One Parametrized");
		}
		public Assignment2(int a, int b)
		{
			this();
			System.out.println("Two Parametrized");
		}
		public Assignment2(int a, int b, int c)
		{
			System.out.println("Three Parametrized");
		}
		public Assignment2(int a, int b, int c, int d)
		{
			this(2,3);
			System.out.println("Four Parametrized");
		}
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Assignment2 ref = new Assignment2(1);
		}

}
