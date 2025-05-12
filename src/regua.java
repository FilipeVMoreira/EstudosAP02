/*
Filipe Valle Moreira - RA: 2401241
Guilherme Amorim Rocha Lima - RA: 2401694
Samuel Bertozzi Negrão - RA: 2400583

Início
    Criar lista vazia chamada lista
    Mostrar caixa de entrada: "Digite um número para criar uma régua:"
    Ler num como inteiro
    // Primeira linha: Marcas com traços
    Para i de 0 até num - 1 faça
        Adicionar (i * 10) à lista
        Exibir lista[i] seguido de "----" (na mesma linha)
    FimPara
    Exibir (num * 10) (final da linha com a última marca)
    // Segunda linha: Números da régua alinhados
    Para j de 0 até num faça
        Exibir j seguido de espaço (em largura fixa, como "     ")
    FimPara
Fim
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class regua {
    public static void main(String[] args){
        ArrayList <Integer> lista = new ArrayList();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para criar uma régua: "));
        for (int i = 0; i < num; i++){
            lista.add(i * 10);
            System.out.print(lista.get(i) + "----");
        }
        System.out.println(num*10);
        for (int j = 0; j <= num; j++){
            System.out.print(j);
            System.out.print("     ");
        }
    }
}


