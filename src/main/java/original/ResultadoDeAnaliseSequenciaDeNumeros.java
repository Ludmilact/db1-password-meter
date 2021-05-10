package original;

public class ResultadoDeAnaliseSequenciaDeNumeros extends ResultadoDeAnalise{

    private int bonus;
    private int contagem;
    private TipoEstado estado;

    public ResultadoDeAnaliseSequenciaDeNumeros(String senha) {
        super(senha);
        calculaResultado(senha);
        calculaEstado();
    }

    private void calculaResultado(String senha) {
        int multiplicador = 3;
        int quantidadeSequenciaNumeros=
                AnalisaRequisitos.obterQuantidadeDeNumerosSequenciais(senha);

        contagem = quantidadeSequenciaNumeros;
        bonus = contagem * multiplicador;
    }

    private void calculaEstado() {
        if (contagem > 0)
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
