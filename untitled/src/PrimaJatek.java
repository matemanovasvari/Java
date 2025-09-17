import java.util.Scanner;

public class PrimaJatek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a csoki gyartasi sorszamat:");
        int id = scanner.nextInt();

        boolean prim = true;
        for (int i = 2; i < Math.sqrt(id); i++) {
            if (id % i == 0){
                prim = false;
                break;
            }
        }

        if (prim){
            System.out.println("Gratulalok, nyertel!");
        }
        else {
            System.out.println("Sajnos nem nyert!");
        }
    }
}