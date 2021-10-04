import java.util.Scanner;

public class USDtoINR {
    public static void main(String[] args) {
        System.out.println("Enter INR value");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        System.out.println("USD equivalent of " + a + " is: " + (a/75));
    }
}
