import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sn = new Scanner(System.in);
      String str = sn.nextLine();
      int[] freq = new int[str.length()];  
        int i, j;
        char string[] = str.toCharArray();  
          
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++;  
                    string[j] = '0';  
                }  
            }  
        }  
        for(i = 0; i <freq.length; i++) { 
         if(string[0] == 'A') {
          	string[0]='a';
          }
          if(string[i] != ' ' && string[i] != '0') 
             System.out.print(string[i]+""+freq[i]+" ");  
        }  
    }
}