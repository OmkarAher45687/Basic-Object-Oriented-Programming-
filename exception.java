import java.util.InputMismatchException;
import java.util.Scanner;
public class Main
{   
	public static void main(String[] args) 
	{
	    while(true)
	    	{
    	    		try 
    	    		{
        	    			int num1,num2;
        	    			Scanner sc=new Scanner(System.in);
        				System.out.println("Enter 1st no. :");
        				num1=sc.nextInt();
        				System.out.println("Enter 2nd no. :");
        				num2=sc.nextInt();
        				System.out.println("Division ="+(num1/num2));
    	    		}

    	   		 catch(ArithmeticException e)
    	    		{
    	        			System.out.println("EXCEPTION ="+e+"\n");
    	        			System.out.println("You have divided no. by zero ");
    	    		}

    	    		catch(InputMismatchException e)
    	    		{
    	        			System.out.println("EXCEPTION ="+e+"\n");
    	        			System.out.println("You have used floating no. ");
    	    		}

    	    		int op;
    	    		Scanner sc1=new Scanner(System.in);
        			System.out.println("1.continue 2.Exit");
        			op=sc1.nextInt();
        			if(op==2)
        			{
        	    			break;
        			}
	   	 }
	}
}



/*OUTPUT :

Enter 1st no. :
1
Enter 2nd no. :
0
EXCEPTION =java.lang.ArithmeticException: / by zero

You have divided no. by zero 
1.continue 2.Exit
1
Enter 1st no. :
2
Enter 2nd no. :
2.5
EXCEPTION =java.util.InputMismatchException

You have used floating no. 
1.continue 2.Exit
2
*/
