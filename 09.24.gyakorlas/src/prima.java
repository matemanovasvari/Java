import java.util.Scanner;

public class prima {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a csoki gyartasi sorszamat: ");
        int input = scanner.nextInt();

        for (int i = 2; i < Math.sqrt(input); i++){
            if (input % i == 0){
                System.out.print("Sajnos nem nyert!");
                break;
            }
            System.out.print("Gratulalok, nyertel!");
            break;
        }
    }
}
