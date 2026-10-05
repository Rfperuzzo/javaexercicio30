
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String frase;
        int num, i;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase ");
        frase = scanner.nextLine();
        System.out.println("Digite um número ");
        num = scanner.nextInt();
        i = 0;
        do {
            System.out.println(frase);
            i = i + 1;

        } while (i < num);

    }
}
