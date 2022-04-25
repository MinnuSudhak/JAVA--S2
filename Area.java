import java.util.Scanner;
class Area
{
public static void main(String a[])
     {
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter the radius:");
        int r=obj.nextInt();
         System.out.print(3.14*r*r);
       }
}


/*import java.util.Scanner;
class Area
{
	double ans;
	area(){	
		ans=(22*1*1)/7;
	}
	area(double r){	
		ans= (22*r*r)/7;
	}
}
class Area_of_circle
{
   public static void main(String args[]) 	//main method
    {   
		area  a = new area();
		System.out.println("\nArea of Circle is with default Constructor: " + a.ans);  
		Scanner k= new Scanner(System.in);
		System.out.print("\nEnter the radius: ");
		double r = k.nextDouble(); 
		area  a1 = new area(r);
		System.out.println("Area of Circle is witht parametrized Constructor: " + a1.ans);      
   }
 }*/