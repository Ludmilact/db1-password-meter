package analise;

import tipo.TipoEstado;
import tipo.TipoOperacao;

public class ResultadoDeAnaliseNumeroCaracteres extends ResultadoDeAnalise {
    //atributos da classe
    private int contagem;
    private int bonus;
    private TipoEstado estado;

    public ResultadoDeAnaliseNumeroCaracteres(String senha) {
        super(senha); //quando eu escrevo a palavra SUPER estou chamando o construtor da c. pai
        calcularResultado(senha);
        calcularEstado();
    }

    private void calcularEstado() {
        if (contagem < 8)
            estado = TipoEstado.FALHA;
        else if (contagem == 8)
            estado = TipoEstado.SUFICIENTE;
        else
            estado = TipoEstado.EXCEPCIONAL;
    }

    private void calcularResultado(String senha) {
        //(n*4)
        int multiplicador = 4;
        contagem = senha.length();
        bonus = contagem * multiplicador;
    }

    @Override
    int obterBonus() {
        return bonus;
    }

    @Override
    int obterContagem() {
        return contagem;
    }

    @Override
    TipoEstado obterEstado() {
        return estado;
    }

    @Override
    TipoOperacao obterTipoOperacao() {
        return TipoOperacao.INCREMENTO;
    }
}
