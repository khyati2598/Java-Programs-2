import java.util.Scanner;

public class SumOrProduct
{
    public static void main(String []args)
    {
        int sum=0,i,pro=1;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = s.nextInt();
        if(c==1)
        {
            for(i=1;i<=n;i++)
            {
                sum=sum+i;
            }
            System.out.println(sum);
        }
        else if(c==2)
        {
            for(i=1;i<=n;i++)
            {
                pro=pro*i;
            } 
            System.out.println(pro);
        }
        else{
            System.out.println(-1);
        }
    }
}