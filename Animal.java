class Animal 
{
void makeSound() 
{
System.out.println("Animal makes a sound");
}
}
class Dog extends Animal 
{
@Override
void makeSound() 
{
System.out.println("Dog barks");
}
}
public class Main
{
public static void main(String[] args) 
{
Animal animal = new Animal();
Animal dog = new Dog();

animal.makeSound(); 
dog.makeSound(); 
}
}
