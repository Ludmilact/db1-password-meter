package original;

public class ResultadoDeAnaliseCaracteresRepetidos extends ResultadoDeAnalise{
    
    private int contagem;
    private int bonus;
    private TipoEstado estado;

    public ResultadoDeAnaliseCaracteresRepetidos(String senha) {
        super(senha);
        calcularResultado(senha);
        calcularEstado();
    }

    private void calcularResultado(String senha) {
        double incrementDeductionOfRepeatedChars = 0;
        String[] arrPwd = senha.replaceAll("\\s+", "").split("\\s*");

        for (int i = 0; i < arrPwd.length; i++) {
            var bCharExists = false;
            for (int j = 0; j < arrPwd.length; j++) {
                if (arrPwd[i].equals(arrPwd[j]) && i != j) {
                    bCharExists = true;
                    incrementDeductionOfRepeatedChars += Math.abs(arrPwd.length / (j - i));
                }
            }
            if (bCharExists) {
                contagem++;
                int countUniqueCharacters = arrPwd.length - contagem;
                incrementDeductionOfRepeatedChars = countUniqueCharacters != 0 ?
                        Math.ceil(incrementDeductionOfRepeatedChars / countUniqueCharacters) :
                        Math.ceil(incrementDeductionOfRepeatedChars);
            }
        }

        if (contagem > 0) {
            bonus = (int) incrementDeductionOfRepeatedChars;
        }
    }

    private void calcularEstado() {
        if(contagem > 1)
            estado = TipoEstado.ALERTA;
        else
            estado = TipoEstado.SUFICIENTE;
    }

    @Override
    int obterBonus() {
        return bonus;
    }

    @Override
    TipoEstado obterEstado() {
        return estado;
    }

    @Override
    int obterContagem() {
        return contagem;
    }

    @Override
    TipoOperacao obterTipoOperacao() {
        return TipoOperacao.DECREMENTO;
    }
}
