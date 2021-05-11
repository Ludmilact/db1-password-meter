package analise;

import validador.ValidaRequisitos;
import tipo.TipoEstado;
import tipo.TipoOperacao;

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

    private int contarNumeroDeSimbolosENumerosNoMeio(String senha){
        return ValidaRequisitos.obterQuantidadeDeSimbolosNoMeio(senha) +
                ValidaRequisitos.obterQuantidadeDeNumerosNoMeio(senha);
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
