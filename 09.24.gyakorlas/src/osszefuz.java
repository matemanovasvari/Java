import java.util.Scanner;

public class osszefuz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Az egyik szoveg: ");
        String firstText = sc.next();

        System.out.print("A masik szoveg: ");
        String secondText = sc.next();

        System.out.print("A ket szoveg osszefuzve: " + firstText + secondText);
    }
}