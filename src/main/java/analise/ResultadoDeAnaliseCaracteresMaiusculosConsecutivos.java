package analise;

import validador.ValidaRequisitos;
import tipo.TipoEstado;
import tipo.TipoOperacao;

public class ResultadoDeAnaliseCaracteresMaiusculosConsecutivos extends ResultadoDeAnalise {
    
    private int contagem;
    private int bonus;
    private TipoEstado estado;

    public ResultadoDeAnaliseCaracteresMaiusculosConsecutivos(String senha) {
        super(senha);
        calcularResultado(senha);
        calcularEstado();
    }

    private void calcularResultado(String senha) {
        int multiplicador = 2;
        int quantidadeDeLetrasMaiusculasConsecutivas =
                ValidaRequisitos.obterQuantidadeDeLetrasMaisculasConsecutivas(senha);

        contagem = quantidadeDeLetrasMaiusculasConsecutivas;
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
