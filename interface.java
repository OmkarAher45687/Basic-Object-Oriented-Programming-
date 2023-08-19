import java.util.Scanner;
interface Vehicles
{
	abstract void Gear();
	abstract void Speed();
	abstract void ApplyBreaks();
}

class Bike implements Vehicles
{
	public void Gear()
	{
		System.out.println("Bike have four gears.");
	}

	public void Speed()
	{
		System.out.println("My bike speed is 30 kmph.");
	}

	public void ApplyBreaks()
	{
		System.out.println("I have applied the break.\n");
	}
}

class Car implements Vehicles
{
	public void Gear()
	{
		System.out.println("Car have four gears.");
	}

	public void Speed()
	{
		System.out.println("My car speed is 90 kmph.");
	}

	public void ApplyBreaks()
	{
		System.out.println("I have applied the break.\n");
	}
}

class Bicycle implements Vehicles
{
	public void Gear()
	{
		System.out.println("Bicycle have no gear.");
	}

	public void Speed()
	{
		System.out.println("My Bicycle speed is 10 kmph");
	}

	public void ApplyBreaks()
	{
		System.out.println("I have applied the break.\n");
	}
}

public class Main
{
	public static void main(String[] args)
	{	
		Bike s = new Bike();
		s.Gear();
		s.Speed();
		s.ApplyBreaks();
		Car r = new Car();
		r.Gear();
		r.Speed();
		r.ApplyBreaks();
		Bicycle t = new Bicycle();
		t.Gear();
		t.Speed();
		t.ApplyBreaks();
	}
}

/*OUTPUT :

Bike have four gears.
My bike speed is 30 kmph.
I have applied the break.

Car have four gears.
My car speed is 90 kmph.
I have applied the break.

Bicycle have no gear.
My Bicycle speed is 10 kmph
I have applied the break.
*/
