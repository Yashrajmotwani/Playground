import java.util.Scanner;
class Main{
  static int countFreq(String pat, String txt) {         
        int M = pat.length();         
        int N = txt.length();         
        int res = 0;
        for (int i = 0; i <= N - M; i++) {
            int j;             
            for (j = 0; j < M; j++) { 
                if (txt.charAt(i + j) != pat.charAt(j)) { 
                    break; 
                } 
            } 
            if (j == M) {                 
                res++;                 
                j = 0;                 
            }             
        }         
        return res;         
    } 
  public static void main(String args[]) {
    // Type your code here
    Scanner sn = new Scanner(System.in);
    String txt = sn.nextLine(); 
    String pat = sn.nextLine();         
    System.out.println(countFreq(pat, txt));
  } 
}