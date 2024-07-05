import java.util.Scanner;

//classe que identifica e realiza as operações da interface mostrada no promtp de comando,
//além de exibir um interface minimalista. Por causa dessa simplicidade, a interface não foi encapsulada
//em outra classe com essa função única como um dos princípios de SOLID dita (Single-Responsability)

public class TipoDeOperacao {

    private final Scanner read = new Scanner(System.in);
    private int operacao;


    public void imprimirOpcoesOperacao(){

        System.out.println("\nOperações:");
        System.out.println("1- Consultar saldo.");
        System.out.println("2- Depositar.");
        System.out.println("3- Transferir.");
        System.out.println("4- Sair");


    }

    public int getOperacao(){
        System.out.println("Digite a operação desejada (1, 2, 3 ou 4): ");
        this.operacao = read.nextInt();

        return this.operacao;
    }


    public void fazerOperacao(Cliente cliente) {
        double valor;

        switch (this.operacao) {

            case 1:
                System.out.println("\nSaldo atual do cliente: " + cliente.getSaldo());
                break;

            case 2:
                System.out.println("\nDigite o valor a ser depositado na conta:");
                valor = this.read.nextDouble();

                cliente.depositarNoSaldo(valor);
                break;

            case 3:
                System.out.println("\nDigite o valor a ser retirado da conta: ");
                valor = this.read.nextDouble();

                cliente.retirarDoSaldo(valor);
                break;

            case 4:

                break;
        }
    }


}
