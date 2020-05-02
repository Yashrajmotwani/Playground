import java.util.Scanner;
class Main
{
  public static int fact(int n)
   {
       int output;
       if(n==1){
         return 1;
       }
       output = fact(n-1)* n;
       return output;
   }
  public static void main(String args[])
  {
    // your code here
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.println(fact(num));
  }
}