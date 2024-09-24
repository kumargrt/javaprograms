package AT46;

public class nonstaticinmain {
	static void addition()
	{
		System.out.println("Addition");
	}
	void subtraction()
	{
		System.out.println("Subtraction");
	}

	public static void main(String[] args) {
		addition();
		nonstaticinmain c1=new nonstaticinmain();
		c1.subtraction();

	}

}
