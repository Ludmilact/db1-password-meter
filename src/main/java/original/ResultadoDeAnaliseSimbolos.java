package original;

public class ResultadoDeAnaliseSimbolos extends ResultadoDeAnalise {
    private int bonus;
    private TipoEstado estado;
    private int contagem;

    public ResultadoDeAnaliseSimbolos(String senha) {
        super(senha);
        calcularResultado(senha);
        calcularEstado();
    }

    private void calcularEstado(){
        if (contagem < 1)
            estado = TipoEstado.FALHA;
        else if (contagem == 1)
            estado = TipoEstado.SUFICIENTE;
        else
            estado = TipoEstado.EXCEPCIONAL;
    }

    private boolean isMaisculo(char caractere){
        return (caractere >= 'A' && caractere <= 'Z');
    }

    private boolean isMinusculo(char caractere){
        return (caractere >= 'a' && caractere <= 'z');
    }

    private boolean isNumero(char caractere){
        return (caractere >= '0' && caractere <= '9');
    }

    private boolean isEspaco(char caractere){
        return (caractere == ' ');
    }

    private int contarNumeroDeSimbolos(String senha){
        int count = 0;
        for (int i = 0; i < senha.length(); i++){
            char caractere = senha.charAt(i);
            if (! (isMinusculo(caractere) || isMaisculo(caractere) || isNumero(caractere) || isEspaco(caractere) ))
                count++;
        }
        return count;
    }

    private void calcularResultado(String senha){
        //(n*6)
        int multiplicador = 6;
        contagem = contarNumeroDeSimbolos(senha);
        bonus = contagem * multiplicador;
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
        return TipoOperacao.INCREMENTO;
    }
}
