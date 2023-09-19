import java.util.Scanner;

public class ContaBancariaVirtual {
    public static void main(String[] args) {
       String nome = "Gabriel";
       String tipoConta = "Corrente";
       double saldo = 4300.67;
       int opcao = 0;

        System.out.println("****************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("****************************");

        String menu = """
                Digite sua opcao:
                
                1- Consultar saldo
                2- Transferir
                3- Receber
                4- Sair
                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja transferir: ");
                double transferir = leitura.nextDouble();
                if (transferir > saldo) {
                    System.out.println("Nao ha saldo suficiente para realizar a transferencia");
                } else if (transferir <= 0) {
                    System.out.println("Digite um valor de transferencia positivo e maior que 0.");
                } else {
                    saldo -= transferir;
                    System.out.println("Seu novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser recebido: ");
                double valor = leitura.nextDouble();
                if (valor <= 0) {
                    System.out.println("Digite um valor positivo e maior que 0.");
                } else {
                    saldo += valor;
                    System.out.println("Seu novo saldo: " + saldo);
                }
            } else if (opcao != 4) {
                System.out.println("Opcao invalida!");
            }
        }
    }
}
