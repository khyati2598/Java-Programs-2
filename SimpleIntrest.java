import java.util.Scanner;

public class SimpleIntrest{
    public static void main(String args[]){
        int p ,r,t;
        Scanner s = new Scanner(System.in);
        p = s.nextInt();
        r = s.nextInt();
        t = s.nextInt(); 
        int si = (p*r*t)/100;
        System.out.println(si);
    }
}