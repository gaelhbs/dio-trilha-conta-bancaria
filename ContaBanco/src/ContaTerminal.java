
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int agencia = 0;
        String conta;
        String nomeCliente;
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, insira o numero da Agencia:");
        agencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Agora insira o numero da conta ex:(067-8)");
        conta = scanner.nextLine();

        System.out.println("Insira seu nome completo:");
        nomeCliente = scanner.nextLine();

        System.out.println("Ola," + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é "
                + agencia + ",conta " + conta + " e seu saldo atual é: " + saldo + " .");

        scanner.close();
    }
}
