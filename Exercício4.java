public class Exercício4 {
    public static void main(String[] args) {
        // Loop de 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Fatorial de " + i + " é: " + calcularFatorial(i));
        }
    }

    // Método para calcular o fatorial de um número
    public static int calcularFatorial(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
