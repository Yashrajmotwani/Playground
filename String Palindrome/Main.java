import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here;
      Scanner sn = new Scanner(System.in);
      String str = sn.nextLine();
      int i=0,n,l,flag=0;
      n=str.length();
      for(i=0,l=n-1;i<=n/2;++i,--l) {
        if(str.charAt(i) != str.charAt(l)) {
          System.out.print("No");
          flag=1;
          break;
        }
      }
      if(flag==0)
        System.out.print("Yes");
    } 
}