import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "dada";
        String tipoConta = "corrente";
        double saldo = 200.102;
        int opcao = 0;

        System.out.println("******************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n******************");

        String menu = """
                **Digite sua opção**
                1- Consultar Saldo
                2- Transferir Valor
                3- Receber Valor
                4- Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é " + saldo);

            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir ");
                double valor = leitura.nextDouble();

                if (valor > saldo) {
                    System.out.println("Sem saldo suficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }

            } else if (opcao == 3) {
                System.out.println("Valor a tranferir: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);

            } else if (opcao != 4) {
                System.out.println("Opção inválida");

            }
        }
    }
}
