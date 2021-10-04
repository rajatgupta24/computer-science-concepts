import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        System.out.println("Please enter the principle amount(P)");
        Scanner inputP = new Scanner(System.in);
        int P = inputP.nextInt();
        System.out.println("Please enter the time in year(T)");
        Scanner inputT = new Scanner(System.in);
        int T = inputT.nextInt();
        System.out.println("Please enter the Rate (annually) (R)");
        Scanner inputR = new Scanner(System.in);
        int R = inputR.nextInt();

        int SI = (P*R*T)/100;
        System.out.println("Total Simple Interest: "+ SI);
        int A = P + SI;
        System.out.println("Total Amount: " + A);
    }
}
