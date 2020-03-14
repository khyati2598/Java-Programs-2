import java.util.Scanner;
public class ReverseOfNum
{
    public static void main(String []args)
    {
        int n,rev=0;
      Scanner s = new Scanner(System.in);
      n = s.nextInt();
      while(n>0)
      {
         rev = rev*10 + n%10;
          n = n/10;
      }
      System.out.println(rev);
    }
}