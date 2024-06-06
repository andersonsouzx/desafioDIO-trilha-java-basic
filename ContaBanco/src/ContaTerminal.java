import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("         Conta Bancária         ");
        System.out.println();
        System.out.printf("Digite o número de sua conta sem o dígito (ex: 1234): ");
        numeroConta = scan.nextInt();
        System.out.println();

        System.out.print("Digite o número da Agência com o dígito (ex: 123-4): ");
        agencia = scan.next();
        scan.nextLine(); // Consumir a nova linha deixada pelo nextInt() ou next()
        System.out.println();

        System.out.print("Digite o seu nome com sobrenome (ex: João Silva): ");
        nomeCliente = scan.nextLine();
        System.out.println();

        System.out.print("Informe o saldo (ex: 000,00): ");
        saldo = scan.nextDouble();

        System.out.println();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco."
                        + " Sua agência é %s, conta %d e seu saldo R$ %.2f,"
                        + " já está disponível para saque. Obrigado !"
                        + "", nomeCliente, agencia, numeroConta, saldo);

        scan.close();
    }
}
