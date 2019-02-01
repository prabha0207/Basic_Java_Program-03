import java.util.Scanner;
class Range
{
public static void main(String args[])
{
int n,c=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<11;i++)
{
if(n==i)
c++;}
if(c==0)
System.out.println("no");
else
System.out.print("yes");
}
}
