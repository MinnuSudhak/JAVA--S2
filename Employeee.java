import java.util.*;


class Employeee
{
	int Rid;
	String Name;
   	long Phone;
	String Des;
	String Dep;
	
           Employeee(int r_id,String N_ame, long Pno, String desi, String dept)
               {
		Rid=r_id;
		Name=N_ame;
		Phone=Pno;
		Des=desi;
		Dep=dept;
               }
	void Dis()
                {
		System.out.println("\nRecord id : "+Rid);
   		System.out.println("Name : "+Name);
		System.out.println("Phone Number : "+Phone);
		System.out.println("Designation : "+Des);
		System.out.println("Department: "+Dep);
	}

	public static void main(String [] args)
              {
	Employeee e1= new Employeee(101,"minnu ",9847911,"CEO","COMPANY");
	e1.Dis();
              }
}