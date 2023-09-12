import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       //Todo: Conhecer e importar a classe scanner

       //Exibir as mensagens para o nosso usuário

       //Obter pela scanner os valores digitados no terminal

       //exibir a mensagem conta criada

       try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
        double saldo = 526.85;

        System.out.println("Por favor, digite o numero da Conta: ");
            int numero = scanner.nextInt(0);

        System.out.println("Por favor, digite o numero da Agencia: ");
            String agencia = scanner.next();

        System.out.println("Qual Seu nome completo?: ");
            String nomeCompleto = scanner.next();

            System.out.println("Aegncia: " + agencia);
            System.out.println("Conta: " + numero);
            System.out.println("Olá, " + nomeCompleto + "! O seu saldo atual é de: " + saldo);
    }


    }
}
