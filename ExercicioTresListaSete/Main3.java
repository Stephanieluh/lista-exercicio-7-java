package ExercicioTresListaSete;

import java.util.Scanner;
public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidacaoDeCpf validar = new ValidacaoDeCpf();
        
        System.out.print("Digite o número de CPF no formato xxx.xxx.xxx-xx: ");
        validar.setCpf(scanner.nextLine());
        
        if (validar.validar()) {
            System.out.println("CPF válido.");
        } else {
            System.out.println("CPF inválido.");
        }
        
        scanner.close();
    } 
    
}
