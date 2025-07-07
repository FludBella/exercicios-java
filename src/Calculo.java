import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número para calcular seu quadrado: ");
        Integer numero1 = scanner.nextInt();

        Integer quadradoNumero1 = numero1 * numero1;

        System.out.println("Resultado do Quadrado: " + quadradoNumero1);

        scanner.close();
    }
}
