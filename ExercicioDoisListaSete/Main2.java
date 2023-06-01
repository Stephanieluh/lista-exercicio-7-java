package ExercicioDoisListaSete;

import java.util.Scanner;
public class Main2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        StringInvertida inverso = new StringInvertida();

        System.out.println("Digite o seu nome: ");
        inverso.setNome(scanner.nextLine());
        
        StringBuilder nomeInvertido = new StringBuilder(inverso.getNome().toUpperCase()).reverse();
        String nomeInvertidoMaiusculo = nomeInvertido.toString();
        
        System.out.println("Seu nome invertido em maiúsculas é: " + nomeInvertidoMaiusculo);
        
        scanner.close();
    }
}
