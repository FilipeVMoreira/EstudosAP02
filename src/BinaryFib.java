/*
Filipe Valle Moreira - RA: 2401241
Guilherme Amorim Rocha Lima - RA: 2401694
Samuel Bertozzi Negrão - RA: 2400583

Função Fibonacci(n: inteiro) → inteiro
    Se n ≤ 1 então
        Retorne n
    Senão
        Retorne Fibonacci(n - 1) + Fibonacci(n - 2)
FimFunção
Início
    n ← 10  // posição desejada na sequência de Fibonacci
    resultado ← Fibonacci(n)  // calcula o valor na posição n da sequência
    binnum ← converter resultado para binário
    Exibir: "Fibonacci de [n] é: [binnum]"
Fim
 */

public class BinaryFib {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Caso base: fibonacci(0) = 0, fibonacci(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Chamada recursiva
    }
    public static void main(String[] args) {
        int n = 10; // posição desejada na sequênci
        String binnum = Integer.toBinaryString(fibonacci(n));
        System.out.println("Fibonacci de " + n + " é: " + binnum);
    }
}
