import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Az intervallum also vegpontja:");
        int number = scanner.nextInt();

        System.out.print("Az intervallum felso vegpontja:");
        int number2 = scanner.nextInt();

        int sum = 0;
        for (int i = number; i <= number2; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.printf("A(z) [%d; %d] intervallumba eso paros szamok osszege:%d", number, number2, sum);
    }
}