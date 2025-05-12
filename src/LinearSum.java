/*
Filipe Valle Moreira - RA: 2401241
Guilherme Amorim Rocha Lima - RA: 2401694
Samuel Bertozzi Negrão - RA: 2400583

Início
    Mostrar caixa de entrada: "Digite um número para realizar a soma de seus antecessores:"
    Ler num como inteiro
    soma ← 0
    Para i de 0 até num faça
        soma ← soma + i
    FimPara
    Mostrar mensagem: "O resultado da soma linear é: [soma]"
Fim
 */
import javax.swing.JOptionPane;
public class LinearSum {
    public static void main(String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para realizar a soma de seus antecessores: "));
        int soma = 0;
        for(int i = 0; i <= num; i++){
            soma += i;
        }
        JOptionPane.showMessageDialog(null, "O resultado da soma linear é: " + soma);
    }
}
