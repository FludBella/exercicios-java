import java.util.Scanner;

public class StringNameSurname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        String nome = scanner.nextLine() ;
        String sobrenome = scanner.nextLine() ;

        System.out.println("Olá " + nome + sobrenome + "!") ;

        scanner.close();
    }
}
