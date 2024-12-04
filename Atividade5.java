public class Atividade5 {
    public static void main(String[] args) {
        // Loop para imprimir os fatoriais de 1 até 40
        for (int i = 1; i <= 40; i++) {
            System.out.println("Fatorial de " + i + " é: " + calcularFatorial(i));
        }
    }

    // Método para calcular o fatorial de um número
    public static long calcularFatorial(int n) {
        long fatorial = 1;  // Mudando para 'long' para suportar números maiores
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
