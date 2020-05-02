import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sn = new Scanner(System.in);
    char letter=sn.next().charAt(0);
      int shift = sn.nextInt();
      if(letter!='c') {
       if((letter - shift) < 'A')
         System.out.println((char)((letter - shift) + 26));
       else
          System.out.println((char)(letter - shift));
      }
      else
        System.out.println("z");
   }
}