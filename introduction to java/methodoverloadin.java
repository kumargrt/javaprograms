package AT46;

public class methodoverloadin {

	static void addition(double a,double b)
	{
	double sum=a+b;
	
	System.out.println(sum);
	}
		static void addition(int a,int b)
		{
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
addition(23.23,45.67);
addition(10,20);
	}

}
