import java.util.Scanner;

public class AverageMarks{
    public static void main(String args[]){
        char c ;
        int marks1,marks2,marks3,avg;
        Scanner s = new Scanner(System.in);
        c = s.next().charAt(0);
        marks1 = s.nextInt();
        marks2 = s.nextInt();
        marks3 = s.nextInt();
        avg = (marks1+marks2+marks3)/3;
        System.out.println(c);
        System.out.println(avg);
    }
}