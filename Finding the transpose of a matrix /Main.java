import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    int i,j;
    Scanner sn = new Scanner(System.in);
    int m= sn.nextInt();
    int n= sn.nextInt();
    int a[][] = new int[10][10];
    int b[][] = new int[10][10];
    for(i=0;i<m;++i)
      for(j=0;j<n;++j)
        a[i][j] = sn.nextInt();
    for(i=0;i<m;++i) {
      for(j=0;j<n;++j) {
        b[j][i]=a[i][j];
      }
    }
    for(i=0;i<m;++i) {
      for(j=0;j<n;++j)
        System.out.print(b[i][j] + " ");
      System.out.println();
    }
  }
}