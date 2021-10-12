import java.util.*;

class factorial
{
public static void main (String [] args)
{
int n,i,f=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter No");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
f =f*i;
}
System.out.print("Factorial Of a Number ="+f);
}
}