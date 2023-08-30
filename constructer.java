class constructor
{    
String name;
int age;  
constructor(String n,int i)
{   
name = n;
age = i;   

}  
void display(){System.out.println(name+" "+age);}  
   
public static void main(String args[])
{    
constructor s1 = new constructor("sumanth",20);  
constructor s2 = new constructor("sunil",18);  

s1.display();  
s2.display();  
}  
}
