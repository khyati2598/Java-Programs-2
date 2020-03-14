import java.util.*;
public class PatternStyle2{
	public static void main(String[] args) {
        int i,j,k;
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(i=1;i<=n;i++)
       {
           for(j=n;j>i;j--)
              {
                  System.out.print(" ");
               }
               for(k=1;k<=(i*2-1);k++)
               {
                   System.out.print("*");
               }    
           System.out.println(); 
      }
            
           for(i=n-1;i>=1;--i)
          {
            for( j=1;j<=n-i;++j)
            {
                System.out.print(" ");
            }
            for(j=i; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }
            for(j = 0; j < i - 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    
   }
}