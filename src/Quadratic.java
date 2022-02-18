import java.util.Scanner;
//Created Class
class SqrRoot
{
	//Defined Variables
	static int a;
	static int b;
	int c;
	//Method for getting sq. root of Delta 
	public double values()
	{
		double sqroot=0;
		//Getting the value from users
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a = scanner.nextInt();
		System.out.println("Enter the value of b :");
		b = scanner.nextInt();
		System.out.println("Enter the value of c :");
		c = scanner.nextInt();
		//calculating Delta value
		double delta = ((b*b)-(4*(a*c)));
		System.out.println("delta = " + delta);
		sqroot =Math.sqrt(delta);
		//calculating Sq. root of Delta
		System.out.println("SquareRoot of delta = "+ sqroot);
		return sqroot;
	}
	//Method for getting roots of the equation
	public static void roots(double sqroot)
	{
		//Calculating the roots of Equation
		double Root1 = ((-b+sqroot)/(2*a));
		double Root2 = ((-b-sqroot)/(2*a));
		System.out.println("The Root 1 of X = " + Root1);
		System.out.println("The Root 2 of X = " + Root2);
	}
}

public class Quadratic {

	public static void main(String[] args) {
		System.out.println("To find the roots of the given equation :");
		System.out.println("Given Equation is : (a*(x^2))+((b*x)+c)");
		//created objects for calling methods
		SqrRoot Sqrt = new SqrRoot();
		Sqrt.values();
		SqrRoot Root = new SqrRoot();
		Root.roots(0);
		
	}

}
