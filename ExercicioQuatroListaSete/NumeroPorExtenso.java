package ExercicioQuatroListaSete;

public class NumeroPorExtenso {

    private int numero;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    private static final String[] unidades = {
        "", "um", "dois", "três", "quatro", "cinco",
        "seis", "sete", "oito", "nove"
    };
    private static final String[] especiais = {
        "dez", "onze", "doze", "treze", "quatorze", "quinze",
        "dezesseis", "dezessete", "dezoito", "dezenove"
    };
    private static final String[] dezenas = {
        "", "", "vinte", "trinta", "quarenta", "cinquenta",
        "sessenta", "setenta", "oitenta", "noventa"
    };
    public String converterParaExtenso(int numero) {
        if (numero < 0 || numero > 99) {
            return "Número inválido";
        } else if (numero < 10) {
            return unidades[numero];
        } else if (numero < 20) {
            return especiais[numero - 10];
        } else {
            int unidade = numero % 10;
            int dezena = numero / 10;
            
            if (unidade == 0) {
                return dezenas[dezena];
            } else {
                return dezenas[dezena] + " e " + unidades[unidade];
            }
        }
    }
    
}
