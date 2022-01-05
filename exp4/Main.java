import java.util.Scanner;
public class Main{
    static int fib(int n){
        if(n<=1)return n;
        return fib(n-1)+fib(n-2);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner s1=new Scanner(System.in);
        int num=s1.nextInt();
        for(int i=0;i<num;i++){
            System.out.print(fib(i)+" ");
        }
    }
}
