package AT46;

public class nonstatic {
void addition()
{
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
void sub()
{
	int d=200;
	int e=150;
	int sub=d-e;
	System.out.println(sub);
}
void mul()
{
	int f=12;
	int g=13;
	int mul=f*g;
	System.out.println(mul);
}
void div()
{
	int h=12;
	int i=2;
	int div=h/i;
	System.out.println(div);
}
	public static void main(String[] args) {
		nonstatic a1=new nonstatic();
		a1.addition();
        a1.sub();
        a1.mul();
        a1.div();
	}

}
