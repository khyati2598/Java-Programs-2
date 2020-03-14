import java.util.*;
public class CharPattern5{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=n;i>=1;i--)
        {
            char startingChar = (char)('A'+i-1);
            for(int j=i;j<=n;j++)
            {
                System.out.print(startingChar);
                startingChar = (char)(startingChar+1);
            }
            System.out.println();
        }
    }
}