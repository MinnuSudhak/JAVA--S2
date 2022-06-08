import java.util.*;
class Employee1
{
int empid;
String name;
double salary;
String address;
Employee1()
   {
    Scanner sc2=new Scanner(System.in);
    System.out.println("enter employee id : ");
    empid=sc2.nextInt();
    
    System.out.println("enter thr employee name: ");
    name=sc2.next();

    System.out.println("enter employee salary: ");
   salary=sc2.nextDouble();


   System.out.println("enter employee address: ");
   address=sc2.next();
  }
  }

class Teacher extends Employee1
  {
  String department;
  String subject;
  Teacher()
    {
      Scanner sc3=new Scanner(System.in);
     System.out.println("enter department: ");
     department=sc3.next();

    System.out.println("enter subject");
    subject=sc3.next();
   }
void display()
{
  System.out.println("-------------------------------------------------------");
  System.out.println("id: "+empid);
  System.out.println("name: "+name);
  System.out.println("salary: "+salary);
  System.out.println("address: "+address);
  System.out.println("department: "+department);
  System.out.println("subject: "+subject);
}
}

class Multilevelinheritance

{
public static void main(String args[])
 {
int n;
Scanner sc1=new Scanner(System.in);
System.out.println("enter number of employees: ");
n=sc1.nextInt();
Teacher t[]=new Teacher[n];

for(int i=0;i<n;i++)
{
t[i]=new Teacher();
}
System.out.println("-------------------------------------------------");
System.out.println("the details are............");
System.out.println("--------------------------------------------------");
for(int i=0;i<n;i++)
{

t[i].display();
}
}
}
