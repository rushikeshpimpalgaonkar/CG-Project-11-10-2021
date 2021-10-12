import java.util.Scanner;
public class Money
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your income in this month:");
		int x=sc.nextInt();
		System.out.println(x);

		double m=0.55;
		m=m*x;
		
		double n=0.1;
		n=n*x;

		double o=0.1;
		o=o*x;

		double p=0.1;
		p=p*x;

		double q=0.1;
		q=q*x;

		double r=0.05;
		r=r*x;

		System.out.println("NEC:"+(int)m);
		System.out.println("FFA:"+(int)n);
		System.out.println("EDU:"+(int)o);
		System.out.println("LTSS:"+(int)p);
		System.out.println("PLAY:"+(int)q);
		System.out.println("GIVE:"+(int)r);
	}
}
					