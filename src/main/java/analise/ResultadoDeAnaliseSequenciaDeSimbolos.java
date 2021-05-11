package analise;

import validador.ValidaRequisitos;
import tipo.TipoEstado;
import tipo.TipoOperacao;

public class ResultadoDeAnaliseSequenciaDeSimbolos extends ResultadoDeAnalise {

    private int contagem;
    private int bonus;
    private TipoEstado estado;

    public ResultadoDeAnaliseSequenciaDeSimbolos(String senha) {
        super(senha);
        calculoResultado(senha);
        calculaEstado();
    }

    private void calculaEstado() {
        if (contagem > 0)
            estado = TipoEstado.ALERTA;
        else
            estado = TipoEstado.SUFICIENTE;
    }

    private void calculoResultado(String senha) {
        int multiplicador = 3;
        int quantidadeSequenciaSimbolos=
                ValidaRequisitos.obterQuantidadeDeSimbolosSequenciais(senha);

        contagem = quantidadeSequenciaSimbolos;
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
