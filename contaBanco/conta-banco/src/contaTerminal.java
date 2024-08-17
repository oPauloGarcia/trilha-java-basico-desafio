import java.util.Locale;
import java.util.Scanner;


public class contaTerminal {
    public static void main(String[] args)  {

        Double saldoAtual = 25.0;

        

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
            saldoAtual = saldoAtual + depositar;

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldoAtual + " já está disponível para saque.");
        
        Double saldoTotal = saldoAtual + depositar;

        System.out.println( "Qual valor deseja sacar?");
        Double valorSaque = scanner.nextDouble();


        if (valorSaque < saldoAtual + depositar){
            saldoAtual = saldoAtual - valorSaque;
            System.out.println( "Saque realizado com sucesso, seu novo saldo é de: " + saldoAtual);

        }else if (valorSaque > saldoAtual + depositar) {
            System.out.println("Saldo insuficiente, seu saldo é de R$" + saldoTotal);
        
         } else 
                System.out.println("Saque realizado com sucesso!");

        

        

    }
}
