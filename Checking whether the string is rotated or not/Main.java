import java.util.Scanner;
class Main{
    static boolean areRotations(String str1, String str2) {
      return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1); 
    }
    public static void main (String[] args) {
      Scanner sn = new Scanner(System.in);
      String str1 = sn.nextLine();
      String str2 = sn.nextLine();
      if (areRotations(str1, str2)) 
        System.out.println("Yes"); 
      else
        System.out.printf("No"); 
    } 
}