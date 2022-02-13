import java.util.Scanner;
public class Main
{
    static String mobilenum(long Num){
        String s_num = String.valueOf(Num);
        String num  = "+91-";
    	String out = num + s_num;
    	return out;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the number : ");
    	long number = sc.nextLong();
    	String out1 = mobilenum(number);
		System.out.println(out1);
	}
}
