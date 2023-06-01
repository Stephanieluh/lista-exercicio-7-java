package ExercicioUmListaSete;
public class ComparacaoDeStrings {

    private String texto1 = "";
    private String texto2 = "";
    public String getTexto1() {
        return texto1;
    }
    public void setTexto1(String texto1) {
        this.texto1 = texto1;
    }
    public String getTexto2() {
        return texto2;
    }
    public void setTexto2(String texto2) {
        this.texto2 = texto2;
    }

    public void comparar(String texto1, String texto2){
        System.out.println("O tamanho de " + texto1 + " é: " + texto1.length());
        System.out.println("O tamanho de " + texto2 + " é: " + texto2.length());
        if (texto1.length() != texto2.length()){
            System.out.println("As duas strings são de tamanhos diferentes.");
        }else if(texto1.length() == texto2.length()){
            System.out.println("As duas strings possuem conteúdo diferente.");
        }else;
    }

    
}
