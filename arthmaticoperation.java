package AT46;

public class arthmaticoperation {
static  int a=20;
 static int b=453;
 static int c=234;


	static void addition()
	{
	int sum=a+b+c;
	System.out.println(sum);
	
}
static void sub()
{
	int sub=b-c;
	System.out.println(sub);
}

static void mul()
{
	int mul=b*c;
	System.out.println(mul);
}
static void div()
{
	double div=c/a;
	System.out.println(div);
}
static  void mud()
{
	int mud=c%a;
	System.out.println(mud);
}
	public static void main(String[] args) {

addition();
sub();
mul();
div();
mud();

	}

}
