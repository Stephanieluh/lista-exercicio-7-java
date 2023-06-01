package ExercicioCincoListaSete;

import java.util.Scanner;
public class Main5 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FormatacaoDeTelefone formatar = new FormatacaoDeTelefone();
        
        System.out.print("Digite um número de telefone celular: ");
        formatar.setTelefone(scanner.nextLine());
        
        
        
        if (formatar.getTelefone().length() == 8) {
           
            System.out.println("Telefone: " + formatar.removerFormatacao(formatar.getTelefone()));
            System.out.println("Telefone possui 8 dígitos.");
            System.out.println("Telefone corrigido sem formatação: " + formatar.adicionarDigitoNove(formatar.getTelefone()));
            System.out.println("Telefone corrigido com formatação: " + formatar.formatarTelefone(formatar.getTelefone()));
        } else {
            System.out.println("Telefone não precisa de correção.");
        }
        
        scanner.close();
    }
}
