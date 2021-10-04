import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, " + input.nextLine());
    }
}
