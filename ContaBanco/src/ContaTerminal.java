import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        ServicosConta servico = new ServicosConta();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao banco JavaBank!");
        System.out.println("Vamos fazer o seu primeiro acesso.");

        System.out.println("Por favor, digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da sua agência (ex: 0587-7): ");
        String agenciaConta = scanner.nextLine();

        System.out.println("Agora digite o seu nome, por favor: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Você gostaria de fazer o seu primeiro depósito? Digite 1 para SIM ou 2 para NÃO.");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Qual valor você gostaria de depositar?");
            double depositoCliente = scanner.nextDouble();
            double saldo = servico.Depositar(depositoCliente);

            System.out.println("\nDepósito realizado com sucesso!");
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
            System.out.println("Sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo de" + saldo + " já está disponível para saque.");
        } else {
            System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
            System.out.println("Sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo é " + servico.getSaldo() + ".");
        }
    }
}