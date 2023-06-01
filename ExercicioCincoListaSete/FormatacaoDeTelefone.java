package ExercicioCincoListaSete;

public class FormatacaoDeTelefone {
    
    private String telefone;

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String removerFormatacao(String telefone) {
        return telefone.replaceAll("[^0-9]", "");
    }
    
    public String adicionarDigitoNove(String telefone) {
        return "9" + telefone;
    }
    
    public String formatarTelefone(String telefone) {
        return "9" + telefone.substring(0, 4) + "-" + telefone.substring(4);
    }
}

