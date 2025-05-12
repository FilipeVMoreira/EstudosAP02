/*
Filipe Valle Moreira - RA: 2401241
Guilherme Amorim Rocha Lima - RA: 2401694
Samuel Bertozzi Negrão - RA: 2400583

Início
    Mostrar uma caixa de entrada solicitando: "Digite o primeiro número:"
    Ler o valor digitado e armazenar em num1 (como inteiro)
    Mostrar uma caixa de entrada solicitando: "Digite o segundo número:"
    Ler o valor digitado e armazenar em num2 (como inteiro)
    Calcular a soma: soma ← num1 + num2
    Converter num1 para binário e armazenar em binnum1
    Converter num2 para binário e armazenar em binnum2
    Converter soma para binário e armazenar em binsoma
    Exibir mensagem: "O número [num1] em binário é: [binnum1]"
    Exibir mensagem: "O número [num2] em binário é: [binnum2]"
    Exibir mensagem: "A soma dos números é: [soma] em binário é: [binsoma]"
Fim
 */

import javax.swing.*;
public class BinarySum {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a soma de seus respectivos binários: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número:  "));
        int soma = num1 + num2;
        String binnum1 = Integer.toBinaryString(num1);
        String binnum2 = Integer.toBinaryString(num2);
        String binsoma = Integer.toBinaryString(soma);
        JOptionPane.showMessageDialog(null, "O número: " + " " + num1 + " " + " em binário é: " + binnum1);
        JOptionPane.showMessageDialog(null, "O número: " + " " + num2 + " " + " em binário é: " + binnum2);
        JOptionPane.showMessageDialog(null, "A soma dos números é: " + " " + soma + " " + " em binário é: " + binsoma);
    }
}
