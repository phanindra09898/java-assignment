import java.util.*;

public class commonarray
{
public static void main(String[] args) 
{
int[] array1 = {1, 2, 4, 5, 7};
int[] array2 = {2, 3, 5, 6, 7};
        
ArrayList<Integer> commonElements = new ArrayList<>();
        
for (int num1 : array1) 
{
for (int num2 : array2) 
{
if (num1 == num2) 
{
commonElements.add(num1);
break;  
}
}
}        
System.out.println("Common elements: " + commonElements);
}
}
