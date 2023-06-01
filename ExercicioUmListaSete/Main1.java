package ExercicioUmListaSete;

import java.util.Scanner;
public class Main1{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ComparacaoDeStrings comparacao = new ComparacaoDeStrings();

        System.out.println("Digite o primeiro texto");
        comparacao.setTexto1(scanner.nextLine());
        System.out.println("Digite o segundo texto");
        comparacao.setTexto2(scanner.nextLine());

        comparacao.comparar(comparacao.getTexto1(), comparacao.getTexto2());

        scanner.close();
    }

}