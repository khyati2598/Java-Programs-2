import java.util.Scanner;

public class FahToCel{
    public static void main(String agrs[]){
        Scanner s = new Scanner(System.in);
        int f = s.nextInt();
       // int cel = (5/9)*(f-32);  wrong
        // int cel = (5*(f - 32))/9;

        int cel =(int) ((5.0/9)*(f-32));
        System.out.println(cel);
    }
}