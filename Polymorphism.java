import java.util.Scanner;
abstract class Shape 
{
	double val1,val2;
	
	abstract void compute_area();
	
	public void get_data()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the first value :");
		val1=sc.nextDouble();
		System.out.println("Enter the second value :");
		val2=sc.nextDouble();
	}
}

class Rectangle extends Shape
{
	void compute_area()
	{
		double area=(val1)*(val2);
		System.out.println("Area of the Rectangle is : "+area);
	}
}

class Triangle extends Shape
{
	void compute_area()
	{
		double area=0.5*(val1)*(val2);
		System.out.println("Area of the Triangle is : "+area);
	}
}

class Circle extends Shape
{
    double radius;
    public void get_data()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the radius value :");
		radius=sc.nextDouble();
	}
	void compute_area()
	{
		double area=3.14*(radius)*(radius);
		System.out.println("Area of the Circle is : "+area);
	}
}

public class Main
{
	public static void main(String[] args)
	{
		Rectangle obj1=new Rectangle();
		obj1.get_data();
		obj1.compute_area();
		
		Triangle obj2=new Triangle();
		obj2.get_data();
		obj2.compute_area();
		
		Circle obj3=new Circle();
		obj3.get_data();
		obj3.compute_area();
	}
}


/*OUTPUT :


Enter the first value :
5
Enter the second value :
3
Area of the Rectangle is : 15.0

Enter the first value :
12
Enter the second value :
4
Area of the Triangle is : 24.0

Enter the radius value :
6
Area of the Circle is : 113.03999999999999
*/
