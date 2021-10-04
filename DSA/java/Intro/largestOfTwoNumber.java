import java.util.Scanner;

public class largestOfTwoNumber {
    public static void main(String[] args) {
        System.out.println("Enter the values");
        Scanner inputa = new Scanner(System.in);
        Scanner inputb = new Scanner(System.in);

        int a = inputa.nextInt();
        int b = inputb.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(b + " & " + a + " are equal");
        }
    }
}
