import java.util.Scanner;
public class Main
{
    static String Countv_and_con(String Num){
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        for (int i = 0; i < Num.length(); ++i) 
        {
         char ch = Num.charAt(i);
         if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
         {
         ++vowels;
         }
         else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
         {
          ++consonants;
         }
      
        }
        String ret1 = String.format("%d:",vowels);
        String ret2 = String.format("%d",consonants);
        String ret = ret1 + ret2;
    	return ret;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the string : ");
    	String sentence = sc.nextLine();
    	String out = Countv_and_con(sentence);
    	
		System.out.println(out);
	}
}
