public class StrongNumber 
{
static int factorial(int num) 
{
return (num == 0 || num == 1) ? 1 : num * factorial(num - 1); 
}
static boolean isStrong(int num)
{
int originalNum = num, sumOfFactorials = 0;
        
while (num > 0) 
{
sumOfFactorials += factorial(num % 10);
num /= 10;
}
        
return sumOfFactorials == originalNum;
}

public static void main(String[] args) 
{ 
int number = 145;
System.out.println(number + " is" + (isStrong(number) ? "" : " not") + " a strong number.");
}
}
