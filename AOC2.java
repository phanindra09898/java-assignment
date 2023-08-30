import java.util.Scanner;

public class AOC2 
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle (in units):");
        double radius = scanner.nextDouble();

        
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area of the circle: " + area + " square units");
        System.out.println("Perimeter of the circle: " + perimeter + " units");
    }
}
