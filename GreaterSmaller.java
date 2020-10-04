import java.util.Scanner;
public class GreaterSmaller 
{  
    	public static void main(String[] args)
    	{       
		Scanner in=new Scanner(System.in);
		System.out.println("Enter First No. :");
		int FirstNo=in.nextInt();
		System.out.println("Enter Second No. :");
		int SecondNo=in.nextInt();
		String result=FirstNo>SecondNo?FirstNo+" is greater than "+SecondNo:SecondNo+" is greater than "+FirstNo;
		System.out.println(result);
	}   
}
