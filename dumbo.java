import java.util.Scanner;
import java.lang.String;
class PalindromeString
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter the String");
String str=s.next();
String org_str=str;
String rev="";
int len=str.length();
for(int i=len-1;i>=0;i--)
{
rev=rev+str.charAt(i);
}
System.out.println(rev);

if(org_str.equals(rev))
{
System.out.println("Palindrome number");
}
else
{
System.out.println(" Not a Palindrome number");
}
}
}