import java.util.EventListener;
import java.util.Scanner;

public class LargestOfThree{
    public static void main(String args[]){
        int a,b,c;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if(a>=b && a>=c)
        {
            System.out.println(a +" is the largest among Three");
        }else if(b>=a && b>=c)
        {
            System.out.println(b +" is the largest among Three");
        }
        else
        {
           System.out.println(c +" is the Largest among Three");
        }

    }
}