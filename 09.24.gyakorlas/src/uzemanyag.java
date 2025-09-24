import java.util.Scanner;

public class uzemanyag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem a megtett távolságot (km): ");
        int km = scanner.nextInt();

        System.out.print("Kérem a felhasznált üzemanyag mennyiségét (liter): ");
        double liter = scanner.nextDouble();

        System.out.printf("Az átlagos üzemanyag fogyasztás: %.2f liter/100km",  (liter/km)*100);
    }
}
