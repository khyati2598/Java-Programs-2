import java.util.*;
public class CharPattern3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print((char)('A'+i-1));
            }
           System.out.println();
        }
    }
}