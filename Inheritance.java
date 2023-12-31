import java.util.Scanner;
class Employee
{
	Scanner sc= new Scanner (System.in);
    	String Emp_name,Address,Mail_id;
   	long Mobile_no,Emp_id;
    
    void get_data()
    {
    	System.out.print("Enter  Employee Name : ");
    	Emp_name=sc.next();
    	
    	System.out.print("Enter Employee Address(City) : ");
    	Address = sc.next();
    	
    	System.out.print("Enter Employee Mail ID : ");
    	Mail_id=sc.next();
    	
    	System.out.print("Enter Employee Mobile Number : ");
    	Mobile_no=sc.nextLong();
    	
    	System.out.print("Enter  Employee ID :");
    	Emp_id=sc.nextLong();

	System.out.print("\n");
    }
    
    void display()
    {
    	System.out.print("Employee Data is as follows :\n");
    	System.out.print("Name of the Employee : "+Emp_name+"\n");
    	System.out.print("Address of the Employee : "+Address+"\n");
    	System.out.print("Mail Id is : "+Mail_id+"\n");
    	System.out.print("Mobile no. is : "+Mobile_no+"\n");
    	System.out.print("Employee ID : "+Emp_id+"\n\n");
    }
    
    void pay_slip(double BP)
    {
        double DA=(0.97)*BP;
        double HRA=(0.1)*BP;
        double PF=(0.12)*BP;     
        double SCF=(0.001)*BP;
        double gross_salary=BP+DA+HRA+PF+SCF;
        double net_salary=gross_salary-PF-SCF;
        System.out.println("Payment alip is as follows :\n");
        System.out.println("DA :"+DA+"\n"+"HRA :"+HRA+"\n"+"PF :"+PF+"\n"+"Staff_club_fund :"+SCF+"\n"+"Gross Salary :"+gross_salary+"\n"+"Net Salary :"+net_salary+"\n");
    }
}

class Programmer extends Employee
{
	float BP = 80000;
}
	
class Assistant_professor extends Employee
{
	float BP = 10000;
}

class Associate_professor extends Employee
{
    	float BP = 50000;
}

class Professor extends Employee
{
   	float BP = 30000;
}

public class Main
{
	public static void main(String[] args)
	{
	    	Scanner sc = new Scanner(System.in);
    	    	int data;
      		do
        		{
    			System.out.println("\n1.programmer \n2.associate professor \n3.assistant professor \n4.professor \n5.exit \nEnter your choice: ");
    			System.out.println("Choose from above for payment slip :\n");
        			data = sc.nextInt();
        		switch(data) 
        		{
    			case 1:
    				Programmer obj1 = new Programmer();
        				obj1.get_data();
        				obj1.display();
        				obj1.pay_slip(obj1.BP);
        				break;
    			case 2:
    				Assistant_professor obj2 = new Assistant_professor();
        				obj2.get_data();
        				obj2.display();
        				obj2.pay_slip(obj2.BP);
        				break;
    			case 3:	
    				Associate_professor obj3 = new Associate_professor();
        				obj3.get_data();
        				obj3.display();
        				obj3.pay_slip(obj3.BP);
        				break;
    			case 4:
    				Professor obj4 = new Professor();
        				obj4.get_data();
        				obj4.display();
        				obj4.pay_slip(obj4.BP);
        				break;
        		}
         	}while(data!= 5);
	}
}



/*OUTPUT:


1.programmer 
2.associate professor 
3.assistant professor 
4.professor 
5.exit 
Enter your choice: 
Choose from above for payment slip :

1
Enter  Employee Name : Rajesg h
Enter Employee Address(City) : Nashik
Enter Employee Mail ID : raju@gmail.com
Enter Employee Mobile Number : 8695748596
Enter  Employee ID :100

Employee Data is as follows :
Name of the Employee : Rajesh
Address of the Employee : Nashik
Mail Id is : raju@gmail.com
Mobile no. is : 8695748596
Employee ID : 100

Payment alip is as follows :

DA :77600.0
HRA :8000.0
PF :9600.0
Staff_club_fund :80.0
Gross Salary :175280.0
Net Salary :165600.0


1.programmer 
2.associate professor 
3.assistant professor 
4.professor 
5.exit 
Enter your choice: 
Choose from above for payment slip :

2
Enter  Employee Name : John
Enter Employee Address(City) : Delhi
Enter Employee Mail ID : johnr234@gmail.com
Enter Employee Mobile Number : 7869458769
Enter  Employee ID :200

Employee Data is as follows :
Name of the Employee : John
Address of the Employee : Delhi
Mail Id is : johnr234@gmail.com
Mobile no. is : 7869458769
Employee ID : 200

Payment alip is as follows :

DA :9700.0
HRA :1000.0
PF :1200.0
Staff_club_fund :10.0
Gross Salary :21910.0
Net Salary :20700.0


1.programmer 
2.associate professor 
3.assistant professor 
4.professor 
5.exit 
Enter your choice: 
Choose from above for payment slip :

3
Enter  Employee Name : Isha
Enter Employee Address(City) : Banglore
Enter Employee Mail ID : isha123@gmail.com
Enter Employee Mobile Number : 9685748597
Enter  Employee ID :300

Employee Data is as follows :
Name of the Employee : Isha
Address of the Employee : Banglore
Mail Id is : isha123@gmail.com
Mobile no. is : 9685748597
Employee ID : 300

Payment alip is as follows :

DA :48500.0
HRA :5000.0
PF :6000.0
Staff_club_fund :50.0
Gross Salary :109550.0
Net Salary :103500.0


1.programmer 
2.associate professor 
3.assistant professor 
4.professor 
5.exit 
Enter your choice: 
Choose from above for payment slip :

4
Enter  Employee Name : Farukh
Enter Employee Address(City) : Mumbai
Enter Employee Mail ID : farukht212@gmail.com
Enter Employee Mobile Number : 8596747895
Enter  Employee ID :400

Employee Data is as follows :
Name of the Employee : Farukh
Address of the Employee : Mumbai
Mail Id is : farukht212@gmail.com
Mobile no. is : 8596747895
Employee ID : 400

Payment alip is as follows :

DA :29100.0
HRA :3000.0
PF :3600.0
Staff_club_fund :30.0
Gross Salary :65730.0
Net Salary :62100.0


1.programmer 
2.associate professor 
3.assistant professor 
4.professor 
5.exit 
Enter your choice: 
Choose from above for payment slip :

5
*/
