public class DataType{
    public static void main(String[] args){
      char c = 'a';
     // System.out.println(c +3);

      int i = c+10;
     // System.out.println(i);

      i = c;
      // this is not possible bcz integer value have 4 bytes and char value have 2 bytes and 4 byte can't copy in 2 bytes
    //   char abc = i;
    char abc = (char)i; //can do like this 

      long l = i;
      l = 12345654321L;
      i = (int)l;
       // not possible 
    //   i =l;
      System.out.println(l);
      System.out.println(i);

      double d = i;
      // this is not possible
      //i = d;

      float f = 1.23f;
      //f = d; not possible float to double
      d = f;

      int j = 100;

    }
}