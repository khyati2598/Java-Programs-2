public class StringUse
{
    public static void main(String[] args) 
    {
       char c ='c';
        String str ="abcdefgh";
        System.out.println(str.charAt(1));
        System.out.println(str.length());
        // System.out.println(str.substring(1, 6));
        // System.out.println(str.substring(3));
        // System.out.println(str.substring(0));
        System.out.println(str.substring(str.length()));
    }
}