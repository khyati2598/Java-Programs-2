import java.util.*;
public class Solution2D{
	public static void main (String[] args) {
        int i,j,k;
       for(i=1;i<=((n+1)/2);i++)
       {
           for(j=n;j>i;j--)
              {
                  System.out.print(" ");
               }
               for(k=1;k<=(i*2-2);k++)
               {
                   System.out.print("*");
               }    
           System.out.println(); 
      }
            
           for(i=((n-1)/2);i>=1;--i)
          {
            for( j=1;j<=((n-i/2));++j)
            {
                System.out.print(" ");
            }
            for(j=i; j <= 2 * i - 1; ++j) 
            {
                System.out.print("*");
            }
            for(j = 0; j < i - 1; ++j) 
            {
                System.out.print("*");
            }
            System.out.println();
          }
     }
    }