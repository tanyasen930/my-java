import java.util.*;
class Fibonacci 
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println(" enter term");
int x=s.nextInt();
int a=0,b=1,c,i;
if(x==1){
System.out.println(a);
}
else if (x==2)
{
System.out.println(a+""+b);
}
else
{
System.out.println(a+""+b); 
}
for(i=1;i<=x-2;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}

