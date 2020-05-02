import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner sn = new Scanner(System.in);
      String str = sn.nextLine();
      String rep = sn.nextLine();
      String wit = sn.nextLine();
      String new_str = str.replaceAll(rep, wit);
      System.out.println(new_str);
    }
}