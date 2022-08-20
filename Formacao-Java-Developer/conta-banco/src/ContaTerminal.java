import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Por favor, insira as informacoes solicitadas para visualizar os dados da sua conta.");

        System.out.println("Numero da conta: ");
        numero = sc.nextInt();
        System.out.println("Agencia: ");
        agencia = sc.next();
        System.out.println("Titular da conta: ");
        nome = sc.next();
        System.out.println("Saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + numero + " e seu saldo de R$ " + String.format("%.2f", saldo) + " ja esta disponivel para saque.");

        sc.close();
    }
}
