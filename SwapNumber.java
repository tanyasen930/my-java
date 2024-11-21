import java.util.*;
class SwapNumber
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int a,b;
System.out.println("enter two numbers");
a=s.nextInt();
b=s.nextInt();
System.out.println("before swapping:"+a+" "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swapping:"+a+" "+b);
}
}