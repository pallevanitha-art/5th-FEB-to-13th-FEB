import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
    	
    	int [] myArray = new int[10];
    	System.out.print("Enter the array elements : ");
    	for(int i=0;i<10;i++)
    	{
    	   myArray[i] = sc.nextInt(); 
    	   if(myArray[i] >= 0)
    	   System.out.println("Positive element in array"+myArray[i]);
    	}
		
	}
}
