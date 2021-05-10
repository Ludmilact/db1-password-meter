package original;

public class ResultadoDeAnaliseSequenciaDeLetras extends ResultadoDeAnalise {

    private int bonus;
    private int contagem;
    private TipoEstado estado;

    public ResultadoDeAnaliseSequenciaDeLetras(String senha) {
        super(senha);
        calcularResultado(senha);
        calcularEstado(); 
    }

    private void calcularEstado() {
        if (contagem > 0)
            estado = TipoEstado.ALERTA;
        else
            estado = TipoEstado.SUFICIENTE;
    }

    private void calcularResultado(String senha) {
        int multiplicador = 3;
        int quantidadeSequenciaLetras=
                AnalisaRequisitos.obterQuantidadeDeLetrasSequenciais(senha);

        contagem = quantidadeSequenciaLetras;
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
        return TipoOperacao.DECREMENTO;
    }
}
