import java.util.Scanner;

public class parosesszeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Az intervallum also vegpontja: ");
        int bottom = scanner.nextInt();

        System.out.print("Az intervallum felso vegpontja: ");
        int top = scanner.nextInt();

        int sum = 0;
        for (int i = bottom; i < top; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }

        System.out.printf("A(z) [%d; %d] intervallumba eso paros szamok osszege: %d", bottom, top, sum);
    }
}
