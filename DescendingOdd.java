import java.util.*;
public class DescendingOdd
{
  public static void main(String org[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the Limit :");
    int oddNoUpto=in.nextInt();
    for(int i=oddNoUpto;i>=0;i--)
    {
      if(i%2!=0)
      System.out.println(i);
    }
  }
}
