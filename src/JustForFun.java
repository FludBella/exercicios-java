import java.util.Scanner;

public class JustForFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        String sobrenome = scanner.nextLine();

        System.out.println("Vai tomar no meio do seu cuzinho, " + nome + sobrenome + "!");
        System.out.println("Com carinho, do seu amorzinho! ;)");
        System.out.println("P.S.: Não esquece que é com muito carinho, viu?!");

        scanner.close();
    }
}
