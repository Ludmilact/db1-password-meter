package analise;

import analise.ResultadoDeAnalise;
import tipo.TipoOperacao;

import java.util.ArrayList;

public class Score {
    ArrayList<ResultadoDeAnalise> resultados = new ArrayList<>();

    public void adicionarResultado(ResultadoDeAnalise resultado) {
        resultados.add(resultado);
    }

    public int calcularScore() {
        int guardarScore = 0;
        for (int i = 0; i < resultados.size(); i++) {
            var resultadoAtual = resultados.get(i);

            if (resultadoAtual.obterTipoOperacao() == TipoOperacao.DECREMENTO)
                guardarScore = guardarScore - resultadoAtual.obterBonus();
            else
                guardarScore = guardarScore + resultadoAtual.obterBonus();
        }
        if (guardarScore > 100)
            guardarScore = 100;
        else if (guardarScore <= 0)
            guardarScore = 0;

        return guardarScore;
    }
}