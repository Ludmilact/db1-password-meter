package analise;

import tipo.TipoEstado;
import tipo.TipoOperacao;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDeAnaliseCaracteresMaiusculosConsecutivosTest {

    @org.junit.jupiter.api.Test
    void testeSemMaiusculasConsecutivas() {

        //setup/act
        var resultado = new ResultadoDeAnaliseCaracteresMaiusculosConsecutivos("Repeat");

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
    void testeComCaracteresMaiusculosConsecutivos() {
        //setup/act
        var resultado = new ResultadoDeAnaliseCaracteresMaiusculosConsecutivos("CONSEcutivos");

        var contagemEsperada = 4;
        var bonusEsperado = 8;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.ALERTA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void testeComMaiusculasConsecutivas() {
        //setup/act
        var resultado = new ResultadoDeAnaliseCaracteresMaiusculosConsecutivos("LLMMNN");

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
    void testeComNumerosMaiusculasConsecutivasESimbolos() {
        //setup/act
        var resultado = new ResultadoDeAnaliseCaracteresMaiusculosConsecutivos("123OO..");

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