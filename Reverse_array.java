import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the length of array : ");
    	int len = sc.nextInt();
    	int [] myArray = new int[len];
    	System.out.print("Enter the array elements : ");
    	for(int i=0;i<len;i++)
    	{
    	   myArray[i] = sc.nextInt(); 
    	}
    	System.out.println("Original Array printed in reverse order:");
        for(int i=myArray.length-1;i>=0;i--)
        System.out.print(myArray[i] + "  ");
		
	}
}
