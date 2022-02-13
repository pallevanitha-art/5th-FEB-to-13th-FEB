import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
    	//System.out.print("Enter the string : ");
    	//int[10] myArray;
    	int [] myArray = new int[10];
    	int sum=0;
    	System.out.print("Enter the array elements : ");
    	for(int i=0;i<10;i++)
    	{
    	   myArray[i] = sc.nextInt(); 
    	   sum = sum + myArray[i];
    	}
		System.out.println(sum);
	}
}
