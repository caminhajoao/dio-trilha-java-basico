import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número da agência
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        // Solicitar número da conta
        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt

        // Solicitar nome do cliente
        System.out.println("Por favor, digite o seu Nome !");
        String nomeCliente = scanner.nextLine();

        // Solicitar saldo
        System.out.println("Por favor, digite o seu Saldo !");
        double saldo = scanner.nextDouble();

        // Exibir mensagem formatada
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
                                         nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}