import java.util.*;
import java.lang.Math; 
public class total{
	
	public static void main(String[] args) {
		// Write your code here
        double basic,hra,da,pf,total,allow;
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary :- ");
        basic = sc.nextDouble();
        System.out.println("Enter grade in Capital letters :- ");
        grade = sc.next().charAt(0);
         if(grade == 'A')
        {
            allow = 1700;
        }
        else if(grade == 'B')
          {
            allow = 1500;
          }
        else
         {
             allow = 1300;   
         }
       
       total = ((basic+(0.20*basic)+(0.50*basic)+allow)-(0.11*basic));
        double p=Math.round(total);
		int h=(int)(p);
		System.out.println(h);
	}
}
