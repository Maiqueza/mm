public class Atividade6 {
    public static void main(String[] args) {
        int a = 0;  // Primeiro número da série de Fibonacci
        int b = 1;  // Segundo número da série de Fibonacci
        
        // Imprime os primeiros números da sequência de Fibonacci até passar de 100
        System.out.print("Série de Fibonacci: " + a + ", " + b);
        
        // Calcula e imprime os próximos números enquanto o valor for menor ou igual a 100
        while (true) {
            int c = a + b;  // Próximo número da sequência
            if (c > 100) {
                break;  // Se o número ultrapassar 100, para a execução
            }
            System.out.print(", " + c);  // Imprime o número na sequência
            a = b;  // Atualiza a para o próximo número
            b = c;  // Atualiza b para o próximo número
        }
    }
}
