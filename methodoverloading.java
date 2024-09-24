package AT46;

public class methodoverloading {
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
		addition(25+12,0);
		addition(12.00+14.12, 0);
	}

}