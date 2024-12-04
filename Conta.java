public class Conta {
    int numero;
    String titular;
    double saldo;

    boolean saca(double quantidade) {
        if (this.saldo<quantidade) {
            return false;
        } else {
            double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
        return true;
}
}
 void deposita(double quantidade){
    this.saldo+=quantidade;
 }

}