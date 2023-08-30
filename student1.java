public class Student1 
{    
int id,passoutYear;  
String name,contactNo,collegeName;  
  
Student1(String contactNo, String collegeName, int passoutYear)
{  
this.contactNo = contactNo;  
this.collegeName = collegeName;  
this.passoutYear = passoutYear;  
}    
Student1(int id, String name)
{  
this("9899234455", "chennai", 2023);  
this.id = id;  
this.name = name;  
}  
  
public static void main(String[] args) 
{   
Student1 s = new Student1(114, "sumanth");  
System.out.println("Printing Student Information: \n");  
System.out.println("Name: "+s.name+"\nId: "+s.id+"\nContact No.: "+s.contactNo+"\nCollege Name: "+s.contactNo+"\nPassing Year: "+s.passoutYear);  
}  
} 
