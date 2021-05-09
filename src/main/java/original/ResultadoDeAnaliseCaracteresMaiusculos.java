package original;

public class ResultadoDeAnaliseCaracteresMaiusculos extends ResultadoDeAnalise {
    private int contagem;
    private int bonus;
    private TipoEstado estado;

    public ResultadoDeAnaliseCaracteresMaiusculos(String senha) {
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


    private void calcularResultado(String senha) {
        //(len-n) * 2
        contagem = AnalisaRequisitos.obterQuantidadeDeLetrasMaisculas(senha);

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
