public class Cliente{
    private String nome;
    private String tipoDeconta;
    private double saldo;

    Cliente(){
        this.saldo = 0.0;
    }

  public void setNome(String nome1){
       this.nome = nome1;
   }

   public void setTipoConta(String tipoConta){
       this.tipoDeconta = tipoConta;
    }

    public void retirarDoSaldo(double valor){
        if(saldo >= valor){
        saldo = saldo - valor;
        }
        else
            System.out.println("Saldo insuficiente.");
    }

    public void depositarNoSaldo(double valor){
        if(valor <= 0){
            System.out.println("Operação inválida.");
        }

            saldo = saldo + valor;
    }

    //getters da classe:

    double getSaldo(){
        return this.saldo;
    }

    String obterNome(){
       return this.nome;
    }
    String obterTipoConta(){
       return this.tipoDeconta;
    }


}
