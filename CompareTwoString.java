import java.util.Scanner;
import java.io.*;
public class CompareTwoString 
{
		public static void main(String[] args) 
    {
			Scanner in=new Scanner(System.in);
			String s1=in.next();
			String s2=in.next();
			if(s1.length()>s2.length())
			{
				System.out.print(s1);
			}
      else if(s1.length()<s2.length())
			{
				System.out.println(s2);
			}
      else
			{
				System.out.print(s1);
			}
		}
	}
