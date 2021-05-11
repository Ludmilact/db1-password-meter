package analise;

import tipo.TipoEstado;
import tipo.TipoOperacao;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDeAnaliseCaracteresRepetidosTest {

    @org.junit.jupiter.api.Test
    void senhaSemCaracteresRepetidos() {

        //setup/act
        var resultado = new ResultadoDeAnaliseCaracteresRepetidos("abcde");

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
    void senhaComUmCaracteresRepetidos() {

        //setup/act
        var resultado = new ResultadoDeAnaliseCaracteresRepetidos("Passarinho");

        var contagemEsperada = 4;
        var bonusEsperado = 1;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.ALERTA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void senhaSoComCaracteresRepetidos() {

        //setup/act
        var resultado = new ResultadoDeAnaliseCaracteresRepetidos("AASSBB");

        var contagemEsperada = 6;
        var bonusEsperado = 17;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.ALERTA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void senhaComMaiusculosEMinusculosRepetidos() {

        //setup/act
        var resultado = new ResultadoDeAnaliseCaracteresRepetidos("AAaaBBbb");

        var contagemEsperada = 8;
        var bonusEsperado = 22;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.ALERTA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }
}
