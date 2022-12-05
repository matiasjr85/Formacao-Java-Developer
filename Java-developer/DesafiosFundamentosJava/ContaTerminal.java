package ContaTerminal;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        // Exemplo de cliente:

        //numero 1021
        //agencia 067-8
        //nome do cliente MARIO ANDRADE
        //saldo 237.48

        System.out.println("Bem vindo ao Banco JCP \n");

        System.out.println("Por favor digite o numero da conta: ");
        int conta = scanner1.nextInt();

        System.out.println("Por favor, digite o numero da agencia: ");
        String agencia = scanner2.nextLine();


        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner2.nextLine();

        System.out.println("Por favor, digite o Saldo: ");
        double saldo = scanner2.nextDouble();

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia +
                ", conta " + conta +
                " e seu saldo é " + saldo + " reais para saque. " );
    }
}
