package AT46;

public class basicmathsusingnonstatic {
	
	void addition()
	{
		int a=10;
		int b=20;
		int add=a+b;
		System.out.println(add);
		
	}
void sub()
{
	int c=20;
	int d=10;
	int sub=c-d;
	System.out.println(sub);
}
	public static void main(String[] args) {
		basicmathsusingnonstatic a1=new basicmathsusingnonstatic();
		a1.addition();
		basicmathsusingnonstatic s1= new basicmathsusingnonstatic();
		s1.sub();
	}

}
