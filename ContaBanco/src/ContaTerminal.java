import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("| Bem vindo ao login da sua conta bancária. |");

        System.out.println("Digite o número da sua conta: ");
        Integer numero = scanner.nextInt();
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
        
        scanner.close();

        System.out.println("Olá " +nome+ ", obrigado por usar nosso banco, sua agência é "+agencia+", conta "+numero+", e seu saldo de R$"+saldo+ " já está disponível para saque.");


    }
}
