/*
Filipe Valle Moreira - RA: 2401241
Guilherme Amorim Rocha Lima - RA: 2401694
Samuel Bertozzi Negrão - RA: 2400583

Função linearFibonacci(k: inteiro) → inteiro
    Se k ≤ 1 então
        Retorne k
    FimSe
    anterior ← 0
    atual ← 1
    Para i de 2 até k faça
        proximo ← anterior + atual
        anterior ← atual
        atual ← proximo
    FimPara
    Retorne atual
FimFunção
Início
    k ← 11  // posição desejada na sequência
    resultado ← linearFibonacci(k)
    Exibir: "Fibonacci de [k] é: [resultado]"
Fim
 */

public class LinearFibonacci {
    static int linearFibonacci(int k) {
        if (k <= 1) {
            return k;
        }
        int anterior = 0;
        int atual = 1;
        for (int i = 2; i <= k; i++) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual;
    }
    public static void main(String[] args) {
        int k = 11;
        int resultado = linearFibonacci(k);
        System.out.println("Fibonacci de " + k + " é: " + resultado);
    }
}
