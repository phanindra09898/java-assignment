public class Oddnum
{
public static void main(String[] args) 
{
int n = 20;
trynumber(n);
 n = 15;
trynumber(n);
}
public static void trynumber(int n) 
{
try 
{
checkEvenNumber(n);
System.out.println(n + " is even.");
} catch (IllegalArgumentException e) 
{
System.out.println("Error: " + e.getMessage());
}
}
public static void checkEvenNumber(int number) 
{
if (number % 2 != 0) 
{
throw new IllegalArgumentException(number + " is odd.");
}
}
}
