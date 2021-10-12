import java.util.*;
public class fibo
{
    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the value of n");
        
        int n = s1.nextInt();
        int a = 1,b=1,c;
        c=a+b;
       
        System.out.println(a+" ");
        System.out.println(b+" ");

         
        while(c<=n)
        {
         


        
            System.out.println(c+" ");
            a = b;
            b = c;
             c=a+b;
	    
        }
    }
}