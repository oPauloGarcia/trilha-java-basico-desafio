import java.util.Locale;
import java.util.Scanner;


public class contaTerminal {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agência:");
        String agencia = scanner.next();

        System.out.println("Por gentileza, digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por gentileza, digite seu sobrenome:");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite o valor que deseja depositar:");
        Double depositar = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + depositar + " já está disponível para saque.");
        

    }
}
