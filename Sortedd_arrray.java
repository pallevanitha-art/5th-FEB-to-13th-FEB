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
    	
    	for (int i = 0; i < myArray.length; i++)   
        {  
            for (int j = i + 1; j < myArray.length; j++)   
            {  
                int tmp = 0;  
                if (myArray[i] > myArray[j])   
                {  
                    tmp = myArray[i];  
                    myArray[i] = myArray[j];  
                    myArray[j] = tmp;  
                }  
            }  
            System.out.println(myArray[i]);  
        } 
		
	}
}
