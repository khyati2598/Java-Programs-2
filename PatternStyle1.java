import java.util.Scanner;
public class PatternStyle1 {
	public static void main(String[] args) {
   
int i,j,k;
Scanner s = new Scanner(System.in);
 int n = s.nextInt();
	for (i=1;i<=n;i++) {
		k=i;
        for(j=1;j<=n;j++) 
        {
			System.out.println();
        }
        for(j=1;j<=i;j++,k++)
        { 
        System.out.print(k);
        }
        System.out.println();
	}
   }
}