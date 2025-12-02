import java.util.Scanner;

public class powerofnumber {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int x=sc.nextInt();
        
      System.out.println(  print(n,x));;//here n power to int x
        
    }
    public static int print(int n,int x) {
        if(x==1) return n;
        return n*print(n,x-1);
        
    }
    
}
