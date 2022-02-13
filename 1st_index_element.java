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
        System.out.println("First index element "+myArray[0]);  
		
	}
}
