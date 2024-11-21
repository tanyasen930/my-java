import java.util.*;
class Find
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
  int a,b,c;
System.out.println("enter three number");
 a=s.nextInt();
  b=s.nextInt();
  c=s.nextInt();
 if(a>=b&&a>=c)
{
System.out.println(" the greatest no is:"+a);
}
else if (b>=a&&b>=c)
{
System.out.println("the greatest no is :"+b);
}
else
{
System.out.println("the greatest no is :"+c);
}
}
}
