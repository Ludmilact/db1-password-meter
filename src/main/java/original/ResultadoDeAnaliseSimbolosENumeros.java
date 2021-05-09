package original;

public class ResultadoDeAnaliseSimbolosENumeros extends ResultadoDeAnalise {

    private int bonus;
    private TipoEstado estado;
    private int contagem;

    public ResultadoDeAnaliseSimbolosENumeros(String senha) {
        super(senha);
        calcularResultado(senha);
        calcularEstado();
    }

    private void calcularEstado() {
        if (contagem < 1)
            estado = TipoEstado.FALHA;
        else if (contagem == 1)
            estado = TipoEstado.SUFICIENTE;
        else
            estado = TipoEstado.EXCEPCIONAL;
    }

    private int contarNumeroDeSimbolosNoMeio(String senha){
        var validador = new ValidaCaractere();
        int count = 0;
        for (int i = 1; i < senha.length() - 1; i++){
            char caractere = senha.charAt(i);

            if (validador.isSimbolo(caractere))
                count++;
        }
        return count;
    }

    private int contarNumerosNoMeio(String senha){
        int count = 0;
        for (int i = 1; i < senha.length()-1; i++){
            if (Character.isDigit(senha.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    private int contarNumeroDeSimbolosENumerosNoMeio(String senha){
        return contarNumerosNoMeio(senha) + contarNumeroDeSimbolosNoMeio(senha);
    }

    private void calcularResultado(String senha){
        //+(n*2)
        int multiplicador = 2;
        contagem = contarNumeroDeSimbolosENumerosNoMeio(senha);
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
