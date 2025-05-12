/*
Filipe Valle Moreira - RA: 2401241
Guilherme Amorim Rocha Lima - RA: 2401694
Samuel Bertozzi Negrão - RA: 2400583

Função revArray(array: lista de reais, array_reverso: lista de reais) → lista de reais
    Se array estiver vazia então
        Retorne array_reverso         // Caso base: não há mais elementos a processar
    FimSe
    // Remove o último elemento de array e adiciona em array_reverso
    ultimo ← remover e retornar elemento de índice (tamanho de array – 1)
    adicionar ultimo em array_reverso
    // Chamada recursiva com o array encurtado
    Retorne revArray(array, array_reverso)
FimFunção
Início
    // Leitura do tamanho do array
    Mostrar caixa de entrada: "Insira o tamanho do array:"
    Ler tam como inteiro
    Criar lista vazia array
    Criar lista vazia array_reverso
    // Preenchimento da lista original
    Para i de 0 até tam – 1 faça
        Mostrar caixa de entrada: "Digite um valor para adicionar ao Array:"
        Ler num como real
        adicionar num em array
    FimPara
    // Chama a função recursiva
    resultado ← revArray(array, array_reverso)
    // Exibe o array invertido
    Mostrar mensagem: "O Array reverso é: [resultado]"
Fim
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class reverseArray {
    static ArrayList<Double> revArray(ArrayList<Double> array, ArrayList<Double> array_reverso) {
        if (array.isEmpty()) {
            return array_reverso; // Caso base para parar a recursão
        }
        double ultimo = array.remove(array.size() - 1);
        array_reverso.add(ultimo);
        return revArray(array, array_reverso);
    }
    public static void main(String[] args) {
        int tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o tamanho do array: "));
        ArrayList<Double> array = new ArrayList<>();
        ArrayList<Double> array_reverso = new ArrayList<>();
        for (int i = 0; i < tam; i++) {
            double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor para adicionar ao Array: "));
            array.add(num);
        }
        ArrayList<Double> resultado = revArray(array, array_reverso);
        JOptionPane.showMessageDialog(null, "O Array reverso é: " + resultado);
    }
}
