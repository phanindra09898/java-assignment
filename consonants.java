import java.util.Scanner;
class Consonents
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String str = sc.nextLine();
String vowels = "aeiouAEIOU";
StringBuilder sb = new StringBuilder();
for (int i = 0; i < str.length(); i++) 
{
char ch = str.charAt(i);
if (vowels.indexOf(ch) != -1) 
{
sb.append(ch);
}
}
System.out.println("The string after deleting consonants is: " + sb.toString());
}
}
