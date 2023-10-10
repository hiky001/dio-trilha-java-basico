import java.util.Scanner;

public class ContaTerminal {
    public static void main (String [] ars){
        //TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para nosso usuário
        // Obter pela classe Scanner os valores do terminal
        // Exibir a mensagem da conta criada

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta");
        numero = leitor.nextInt();

        System.out.println("Por favor, digite o número da agencia");
        agencia = leitor.next();

        System.out.println("Por favor, digite o seu nome");
        nomeCliente = leitor.nextLine();
        nomeCliente += leitor.nextLine();

        System.out.println("Por favor, digite o seu saldo");
        saldo = leitor.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo "
        + saldo + " já está disponível para saque.");

    }
}
