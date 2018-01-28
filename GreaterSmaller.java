import java.util.Scanner;
public class GreaterSmaller {  
    public static void main(String[] args){       
        int i;
        int n=0;
        {   
        System.out.println("Input the 5 numbers : ");  
	}
    for (i=0;i<5;i++){
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    if(n>=100){
        System.out.println("Greater then 100");
    }else if(n<=100){
        System.out.println("Smaller then 100");
    }
}
}   
}