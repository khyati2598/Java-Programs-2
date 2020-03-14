import java.util.Scanner;

public class CharacterCase{
    public static void main(String args[]){
        int b;
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        b  = (int)a;
        if(b >=97 && b<=123)
        {
            System.out.println("lower case");
        }
        else if(b>=65 && b<=96)
        {
            System.out.println("Upper Case");
        }
        else 
    {
        System.out.println("0");
    }
    }
}