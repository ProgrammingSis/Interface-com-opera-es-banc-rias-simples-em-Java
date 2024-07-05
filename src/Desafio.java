import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(); //nova instância de cliente

        //colocando dados iniciais do cliente dentro do objeto, que encapsula as informações dele(a)
        cliente1.setNome("Clark Kent");
        cliente1.setTipoConta("Corrente");

        TipoDeOperacao tipoOperacao = new TipoDeOperacao();

        int operacao = 0;

        while(operacao != 4){
            tipoOperacao.imprimirOpcoesOperacao();

            operacao = tipoOperacao.getOperacao();

            tipoOperacao.fazerOperacao(cliente1);

            System.out.println("/n");

        }
    }


}