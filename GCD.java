import java.util.*;
public class GCD
{
public static void main(String args[])
{
int num1,num2,i,gcd=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number1");
num1=sc.nextInt();
System.out.println("enter the number2");
num2=sc.nextInt();
for(i=1;i<=num1&&i<=num2;i++)
{
if(num1%i==0&&num2%i==0)
{
gcd=i;
}
}
System.out.printf("GCDof%dand%dis%d",num1,num2,gcd);

}
}