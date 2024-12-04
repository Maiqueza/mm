public class Programa {
    public static void main(String[] args){
        Conta minhaConta=new Conta();
        minhaConta.numero=123;
        minhaConta.titular="Duke";
        minhaConta.saldo=1000.0;

        System.out.println("O número da conta é: "+ minhaConta.numero);
        System.out.println("titular da conta é: "+ minhaConta.titular);
        System.out.println("Saldo atual: "+ minhaConta.saldo);

        minhaConta.deposita(500.0);
        
        if(minhaConta.saca(1600.0)){
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}