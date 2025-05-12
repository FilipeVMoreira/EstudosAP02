/*
Filipe Valle Moreira - RA: 2401241
Guilherme Amorim Rocha Lima - RA: 2401694
Samuel Bertozzi Negrão - RA: 2400583

Função fatorial(n: inteiro) → inteiro
    Se n = 0 ou n = 1 então
        Retorne 1  // Caso base
    Senão
        Retorne n * fatorial(n - 1)  // Chamada recursiva
FimFunção
Início
    Mostrar caixa de entrada: "Digite um número para calcular o fatorial:"
    Ler num como inteiro
    resultado ← fatorial(num)
    Mostrar mensagem: "O resultado do fatorial de [num] é: [resultado]"
Fim
 */

import javax.swing.JOptionPane;
public class recursiveFatorial {
    static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Caso base
        } else {
            return n * fatorial(n - 1); // Chamada recursiva
        }
    }
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial: "));
        int resultado = fatorial(num);
        JOptionPane.showMessageDialog(null, "O resultado do fatorial de " + num + " é: " + resultado);
    }
}
