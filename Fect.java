 import java.util.*;
class Fect
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
int f=1,i;
for(i=n;i>=1;i--)
{
f=f*i;
}
System.out.println(f);
}
}
