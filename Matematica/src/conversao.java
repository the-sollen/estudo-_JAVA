import java.util.Scanner;

public class ConversorDolarReal {
    public static void main(String[] args) {
        // Defina a taxa de câmbio atual
        double taxaCambio = 5.30; // Substitua pelo valor atual

        // Crie um scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Peça ao usuário para inserir a quantidade em dólares
        System.out.print("Digite a quantidade em dólares: ");
        double dolares = scanner.nextDouble();

        // Feche o scanner para evitar vazamentos de recursos
        scanner.close();

        // Calcule o valor em reais
        double reais = dolares * taxaCambio;

        // Exiba o resultado
        System.out.println(dolares + " dólares é equivalente a " + reais + " reais.");
    }
}
