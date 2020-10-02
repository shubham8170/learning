import java.util.*;
class sumdig
{
public static void main(String args[])
{
int m,n,sum=0;
//int number=123;
Scanner s=new Scanner(System.in);
System.out.println("enter the number which you want to reverse");
n=s.nextInt();
while(n>0)
{
m=n%10;
//number=number/10;
sum=sum+m;
n=n/10;
}
System.out.println("sum f digit is"+sum);
}
}