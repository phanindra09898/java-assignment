public class Employee
{
String name;
int employeeId;
double salary;

public Employee(String name, int employeeId) 
{
this.name = name;
this.employeeId = employeeId;
salary = 0.0; 
}

public Employee(String name, int employeeId, double salary)
{
this.name = name;
this.employeeId = employeeId;
this.salary = salary;
}

public void displayInfo() 
{
System.out.println("Name: " + name);
System.out.println("Employee ID: " + employeeId);
System.out.println("Salary: " + salary);
}

public static void main(String[] args) 
{
Employee employee1 = new Employee("Ajay", 1001,35000);
Employee employee2 = new Employee("phani", 1002, 50000);

employee1.displayInfo();
System.out.println();
employee2.displayInfo();
}
}
