import java.util.*;
import java.lang.Math; 
public class totalsalary{
	
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
       
        hra = basic * 0.2;
        da =  basic * 0.5;
        pf =  basic *0.11;
       
       total = basic + hra + da + allow - pf;
        double p=Math.round(total);
		int h=(int)(p);
		System.out.println(h);
	}
}
