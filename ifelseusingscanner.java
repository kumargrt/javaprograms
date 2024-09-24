package AT46;
import java.util.Scanner;
public class ifelseusingscanner {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter age ");

		int age=s1.nextInt();
		
if (age>=18)
{
	System.out.println("you are eligible to vote");
}
else
{
	System.out.println("you are not eligible to vote");
}
	}

}