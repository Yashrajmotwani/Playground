import java.util.Scanner;
class Main {
    public static int recurSum(int n) { 
        if (n <= 1) 
            return n; 
        return n + recurSum(n - 1); 
    } 
    public static void main(String[] args) {
		// Type your code here
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      System.out.println(recurSum(n));
    }
}