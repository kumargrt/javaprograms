package AT46;

public class Nonstaticmethodoverloading {

	void addition (double a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
		
	}
	void addition(int a ,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	void sub(double a,double b)
	{
		double  sub=b-a;
		System.out.println(sub);
	
	}
	void sub(int a,int b)
	{
		 int sub=b-a;
		System.out.println(sub);
	}
	public static void main(String[] args) {
Nonstaticmethodoverloading a1=new Nonstaticmethodoverloading();
a1.addition(20.12,34.21);
a1.addition(12,56);
a1.sub(12,45);
a1.sub(10,20);
	}

}
