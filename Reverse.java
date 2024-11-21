import java.util.*;
class Reverse
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int r;
while(n>0)
{
r=n%10;
System.out.println(r);
n=n/10;}
System.out.println(n);
}
}