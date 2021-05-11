package analise;

import tipo.TipoEstado;
import tipo.TipoOperacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDeAnaliseCaracteresMinusculosTest {

    @Test
    void testeSemCaracteresMinusculos() {
        var resultado = new ResultadoDeAnaliseCaracteresMinusculos("TESTE");

        var bonusAtual = resultado.obterBonus();
        var bonusEsperado = 0;

        var contagemAtual = resultado.obterContagem();
        var contagemEsperada = 0;

        var estadoAtual = resultado.obterEstado();
        var estadoEsperado = TipoEstado.FALHA;

        var operacaoAtual = resultado.obterTipoOperacao();
        var tipoOperacaoEsperada = TipoOperacao.INCREMENTO;

        assertEquals(bonusEsperado, bonusAtual);
        assertEquals(contagemEsperada, contagemAtual);
        assertEquals(estadoEsperado, estadoAtual);
        assertEquals(tipoOperacaoEsperada, operacaoAtual);
    }

    @Test
    void testeUmCaractereMinusculo() {
        var resultado = new ResultadoDeAnaliseCaracteresMinusculos("TESTe");

        var bonusAtual = resultado.obterBonus();
        var bonusEsperado = 8;

        var contagemAtual = resultado.obterContagem();
        var contagemEsperada = 1;

        var estadoAtual = resultado.obterEstado();
        var estadoEsperado = TipoEstado.SUFICIENTE;

        var operacaoAtual = resultado.obterTipoOperacao();
        var tipoOperacaoEsperada = TipoOperacao.INCREMENTO;

        assertEquals(bonusEsperado, bonusAtual);
        assertEquals(contagemEsperada, contagemAtual);
        assertEquals(estadoEsperado, estadoAtual);
        assertEquals(tipoOperacaoEsperada, operacaoAtual);
    }

    @Test
    void testeVariosCaracteresMinusculos() {
        var resultado = new ResultadoDeAnaliseCaracteresMinusculos("testE");

        var bonusAtual = resultado.obterBonus();
        var bonusEsperado = 2;

        var contagemAtual = resultado.obterContagem();
        var contagemEsperada = 4;

        var estadoAtual = resultado.obterEstado();
        var estadoEsperado = TipoEstado.EXCEPCIONAL;

        var operacaoAtual = resultado.obterTipoOperacao();
        var tipoOperacaoEsperada = TipoOperacao.INCREMENTO;

        assertEquals(bonusEsperado, bonusAtual);
        assertEquals(contagemEsperada, contagemAtual);
        assertEquals(estadoEsperado, estadoAtual);
        assertEquals(tipoOperacaoEsperada, operacaoAtual);
    }

    @Test
    void testeTodosCaracteresMinusculos() {
        var resultado = new ResultadoDeAnaliseCaracteresMinusculos("teste");

        var bonusAtual = resultado.obterBonus();
        var bonusEsperado = 0;

        var contagemAtual = resultado.obterContagem();
        var contagemEsperada = 5;

        var estadoAtual = resultado.obterEstado();
        var estadoEsperado = TipoEstado.EXCEPCIONAL;

        var operacaoAtual = resultado.obterTipoOperacao();
        var tipoOperacaoEsperada = TipoOperacao.INCREMENTO;

        assertEquals(bonusEsperado, bonusAtual);
        assertEquals(contagemEsperada, contagemAtual);
        assertEquals(estadoEsperado, estadoAtual);
        assertEquals(tipoOperacaoEsperada, operacaoAtual);
    }
}

