package original;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDeAnaliseRequerimentosTest {
    @org.junit.jupiter.api.Test
    void testeSeteCaracteresEDoisRequisitos() {
        //setup/act
        var resultado = new ResultadoDeAnaliseRequerimentos("12345AA");

        var contagemEsperada = 2;
        var bonusEsperado = 0;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.FALHA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void testeSeteCaracteresETresRequisitos() {
        //setup/act
        var resultado = new ResultadoDeAnaliseRequerimentos("12345Aa");

        var contagemEsperada = 3;
        var bonusEsperado = 0;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.FALHA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void testeSeteCaracteresEQuatroRequisitos() {
        //setup/act
        var resultado = new ResultadoDeAnaliseRequerimentos("1234Aa.");

        var contagemEsperada = 4;
        var bonusEsperado = 0;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.FALHA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void testeOitoCaracteresEQuatroRequisitos() {
        //setup/act
        var resultado = new ResultadoDeAnaliseRequerimentos("12345Aa.");

        var contagemEsperada = 5;
        var bonusEsperado = 10;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.EXCEPCIONAL;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void testeOitoCaracteresETresRequisitos() {
        //setup/act
        var resultado = new ResultadoDeAnaliseRequerimentos("123456Aa");

        var contagemEsperada = 4;
        var bonusEsperado = 8;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.SUFICIENTE;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void testeOitoCaracteresEDoisRequisitos() {
        //setup/act
        var resultado = new ResultadoDeAnaliseRequerimentos("1234567A");

        var contagemEsperada = 3;
        var bonusEsperado = 0;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.FALHA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void testeNoveCaracteresEDoisRequisitos() {
        //setup/act
        var resultado = new ResultadoDeAnaliseRequerimentos("1234567AA");

        var contagemEsperada = 3;
        var bonusEsperado = 0;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.FALHA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void testeNoveCaracteresETresRequisitos() {
        //setup/act
        var resultado = new ResultadoDeAnaliseRequerimentos("1234567A.");

        var contagemEsperada = 4;
        var bonusEsperado = 8;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.SUFICIENTE;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void testeNoveCaracteresEQuatroRequisitos() {
        //setup/act
        var resultado = new ResultadoDeAnaliseRequerimentos("123456Aa.");

        var contagemEsperada = 5;
        var bonusEsperado = 10;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.EXCEPCIONAL;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }
}