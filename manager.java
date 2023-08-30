class team 
{
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    public void printSalary() 
{
        System.out.println("Salary: " + salary);
    }
}

class Employee 
{
    String specialization;
}

class Manager {
    String department;
}
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "sumanth";
        employee.age = 20;
        employee.phoneNumber = "123-456-7890";
        employee.address = "123 Main St, City";
        employee.salary = 50000.0;
        employee.specialization = "Software Development";

        Manager manager = new Manager();
        manager.name = "harif";
        manager.age = 21;
        manager.phoneNumber = "987-654-3210";
        manager.address = "456 Park Ave, Town";
        manager.salary = 80000.0;
        manager.department = "Human Resources";

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
}
