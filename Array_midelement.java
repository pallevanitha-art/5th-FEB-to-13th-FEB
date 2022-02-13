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
    	}
    	int startIndex = 0, lastIndex = myArray.length - 1;
        int midIndex = startIndex + (lastIndex-startIndex)/2;
		System.out.println("Mid elemennt is "+myArray[midIndex]);
	}
}
