import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double a = sc.nextDouble();
        double pi = (72.7 * a) - 58;

        System.out.printf("Seu peso ideal é %.2f kg", pi);

        sc.close();

    }

}
