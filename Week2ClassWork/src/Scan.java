import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number 1" );
        int num1 = scan.nextInt();
        System.out.println(" enter number 2");
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of this numbers is "+ sum);
    }
}
