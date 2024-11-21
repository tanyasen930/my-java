import java.util.*;
class Swap
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int a,b,c;
System.out.println("enter two number");
a=s.nextInt();
b=s.nextInt();
System.out.println("befor swapping :"+a+" "+b);
c=a;
a=b;
b=c;
System.out.println("after swaping:"+a+" "+b);
}
}

