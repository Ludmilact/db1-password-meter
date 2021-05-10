package original;

public class ResultadoDeAnaliseNumerosConsecutivos extends ResultadoDeAnalise{

    private int bonus;
    private int contagem;
    private TipoEstado estado;


    public ResultadoDeAnaliseNumerosConsecutivos(String senha) {
        super(senha);
        calcularResultado(senha);
        calcularEstado();
    }

    private void calcularResultado(String senha) {
        int multiplicador = 2;
        int quantidadeDeNumerosConsecutivos =
                AnalisaRequisitos.obterQuantidadeDeNumerosConsecutivos(senha);

        contagem = quantidadeDeNumerosConsecutivos;
        bonus = contagem * multiplicador;
    }

    private void calcularEstado() {
        if(contagem > 0)
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
