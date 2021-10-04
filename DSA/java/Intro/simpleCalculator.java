import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the operation");
        System.out.println("To add press 1");
        System.out.println("To subtract press 2");
        System.out.println("To multiply press 3");
        System.out.println("To divide press 4");
        Scanner inputO = new Scanner(System.in);
        int opeartor = inputO.nextInt();

        System.out.println("Enter the values");
        Scanner inputa = new Scanner(System.in);
        Scanner inputb = new Scanner(System.in);

        int a = inputa.nextInt();
        int b = inputb.nextInt();

        switch (opeartor) {
            case 1: {
                System.out.println("Output: " + (a+b));
                break;
            }
            case 2: {
                System.out.println("Output: " + (a-b));
                break;
            }
            case 3: {
                System.out.println("Output: " + (a*b));
                break;
            }
            case 4: {
                System.out.println("Output: " + (a/b));
                break;
            }
        }
    }
}
