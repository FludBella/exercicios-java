import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso do paciente: ");
        Double pesoPaciente = scanner.nextDouble();

        System.out.print("Digite a altura do paciente: ");
        Double alturaPaciente = scanner.nextDouble();

        Double resultadoMultiplicacao = alturaPaciente * alturaPaciente;

        Double resultado = pesoPaciente / resultadoMultiplicacao;

        System.out.println("IMC: " + resultado  );

        scanner.close();
    }
}