/*
Filipe Valle Moreira - RA: 2401241
Guilherme Amorim Rocha Lima - RA: 2401694
Samuel Bertozzi Negrão - RA: 2400583

Início
    Mostrar uma caixa de entrada: "Insira o tamanho do array:"
    Ler tam como inteiro
    Criar lista num_array vazia
    Criar lista array_reverso vazia
    Para i de 0 até tam - 1 faça
        Mostrar caixa de entrada: "Digite um valor para adicionar ao Array:"
        Ler valor como número decimal
        Adicionar valor à lista num_array
    FimPara
    Para j de (tam - 1) até 0, decrementando 1
        Adicionar num_array[j] à lista array_reverso
    FimPara
    Mostrar mensagem: "O Array reverso é: [array_reverso]"
Fim
 */


import javax.swing.JOptionPane;
import java.util.ArrayList;
public class IterativeReverseArray {
    public static void main(String[] args){
        int tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o tamanho do array: "));
        ArrayList<Double> num_array = new ArrayList<>();
        ArrayList<Double> array_reverso = new ArrayList<>();
        for (int i = 0; i < tam; i++){
            double num = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um valor para adicionar ao Array: "));
            num_array.add(num);
        }
        for (int j = (tam - 1); j > -1; j--){
            array_reverso.add(num_array.get(j));
        }
        JOptionPane.showMessageDialog(null, "O Array reverso é: " + array_reverso);
    }
}

