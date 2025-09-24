import java.util.Scanner;

public class feherje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a testsúlyodat (kg): ");
        double kg = scanner.nextDouble();

        System.out.print("Milyen az aktivitási szinted? (1 - átlagos, 2 - magas, 3 - extrém): ");
        int activity =  scanner.nextInt();

        double protein = 0;
        if (activity == 1) {
            protein = kg * 0.8;
        }
        else if (activity == 2) {
            protein = kg * 1.2;
        }
        else{
            protein = kg * 2.0;
        }

        System.out.printf("A napi fehérje szükségleted: %.1f gramm", protein);
    }
}
