import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        /**
         * TODO: Conhecer e importar a classe Scanner
         * Exibir as mensagens para o nosso usuário
         * Obter pela scanner os valores digitados no terminal
         * Exibir a mensagem conta criada
         */

        // Atributos
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        agencia = input.nextLine();

        System.out.println("Por favor, digite o número do banco: ");
        numero = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = input.nextLine();
        //numero = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, digite seu saldo: ");
        saldo = Double.parseDouble(input.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }



}
