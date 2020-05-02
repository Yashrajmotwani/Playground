import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sn = new Scanner(System.in);
      String str = sn.nextLine(); 
      int i=0,n,l=0,k;
      n=str.length();
      String s[] = str.split(" "); 
      String ans = ""; 
      for (i = s.length - 1; i >= 0; i--) { 
          ans += s[i] + " "; 
      } 
      System.out.println(ans.substring(0, ans.length() - 1)); 
    }
}