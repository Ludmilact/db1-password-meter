package original;

public class ResultadoDeAnaliseCaracteresMinusculos extends ResultadoDeAnalise {
    private int bonus;
    private int contagem;
    private TipoEstado estado;

    public ResultadoDeAnaliseCaracteresMinusculos(String senha) {
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

    private void calcularResultado(String senha){
        //(len-n) * 2
        contagem = AnalisaRequisitos.obterQuantidadeDeLetrasMinusculas(senha);

        if (contagem > 0)
            bonus = (senha.length() - contagem) * 2;
        else
            bonus = 0;
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
