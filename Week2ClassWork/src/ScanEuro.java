import java.util.Scanner;

public class ScanEuro {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("enter value in euro to konvert in funt");
            double euro = scan.nextInt();

            double funt = euro * 0.88;
            System.out.println("in funt thats = " + funt);

        }
}
