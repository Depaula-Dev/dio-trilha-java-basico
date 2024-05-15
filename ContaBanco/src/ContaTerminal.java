import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da sua Agência Bancária: ");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Digite o número da sua Conta Corrente: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é " + numeroAgencia + ", Conta Corrente " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");    
    
    }
}
