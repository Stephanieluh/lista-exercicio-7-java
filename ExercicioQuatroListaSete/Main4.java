package ExercicioQuatroListaSete;

import java.util.Scanner;
public class Main4{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        NumeroPorExtenso extenso = new NumeroPorExtenso();
        
        System.out.print("Digite um número entre 0 e 99: ");
        extenso.setNumero(scanner.nextInt());
        
        String numeroConvertidoParaExtenso = extenso.converterParaExtenso(extenso.getNumero());
        
        System.out.println("Número por extenso: " + numeroConvertidoParaExtenso);
        
        scanner.close();
    }
}