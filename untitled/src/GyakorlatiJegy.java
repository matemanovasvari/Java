import java.util.Scanner;

public class GyakorlatiJegy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("A pontszamod:");
        int points = scn.nextInt();

        if(points < 0 || points > 100){
            System.out.print("Ervenytelen ertek!");
        } else if (points >= 85 && points < 100) {
            System.out.print("Az erdemjegyed: Jeles (5)");
        } else if (points >= 70 && points < 85) {
            System.out.print("Az erdemjegyed: Jó (4)");
        } else if (points >= 55 && points < 70) {
            System.out.print("Az erdemjegyed: Közepes (3)");
        } else if (points >= 40 && points < 55) {
            System.out.print("Az erdemjegyed: Elégséges (2)");
        }
        else{
            System.out.print("Az erdemjegyed: Elégtelen (1)");
        }
    }
}
