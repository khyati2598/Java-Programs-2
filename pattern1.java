import java.util.Scanner;
public class pattern1{
	public static void main(String[]args){	
        int i, j, k;
    
        Scanner s = new Scanner(System.in);
       
         int n = s.nextInt();
         
            for (i=1;i<=n;i++) {
                int a=i;
                for(j=1;j<=(n-i); j++) // inner loop for spaces 
                 {           
                    System.out.print(" "); // printing space
                } 
                for (k=1;k<=i;k++) {
                    System.out.print(a++);
                }
                System.out.println("");
            }
           }
        }
