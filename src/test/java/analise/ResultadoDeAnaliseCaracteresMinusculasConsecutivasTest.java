package analise;

import tipo.TipoEstado;
import tipo.TipoOperacao;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDeAnaliseCaracteresMinusculasConsecutivasTest {

    @org.junit.jupiter.api.Test
    void testeSemMinusculasConsecutivas() {

        //setup/act
        var resultado = new ResultadoDeAnaliseCaracteresMinusculasConsecutivas("REPEAt");

        var contagemEsperada = 0;
        var bonusEsperado = 0;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.SUFICIENTE;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void testeComCaracteresMinusculosConsecutivos() {
        //setup/act
        var resultado = new ResultadoDeAnaliseCaracteresMinusculasConsecutivas("CONSEcutivos");

        var contagemEsperada = 6;
        var bonusEsperado = 12;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.ALERTA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void testeComMinusculasConsecutivas() {
        //setup/act
        var resultado = new ResultadoDeAnaliseCaracteresMinusculasConsecutivas("llmmnn");

        var contagemEsperada = 5;
        var bonusEsperado = 10;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.ALERTA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void testeComNumerosMinusculasConsecutivasESimbolos() {
        //setup/act
        var resultado = new ResultadoDeAnaliseCaracteresMinusculasConsecutivas("123oo..");

        var contagemEsperada = 1;
        var bonusEsperado = 2;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.ALERTA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }
}