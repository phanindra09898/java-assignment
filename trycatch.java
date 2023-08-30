public class trycatch2
{  
public static void main(String[] args) 
{  
try  
{  
int data=80/4; 
}  
catch(ArithmeticException e)  
{  
System.out.println(e);  
}  
System.out.println("ArithmeticException code");  
}        
} 
