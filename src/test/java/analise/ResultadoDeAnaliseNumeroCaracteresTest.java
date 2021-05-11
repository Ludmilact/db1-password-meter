package analise;

import tipo.TipoEstado;
import tipo.TipoOperacao;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDeAnaliseNumeroCaracteresTest {

    @org.junit.jupiter.api.Test
    void senhaSemCaracteres() {

        //setup/act
        var resultado = new ResultadoDeAnaliseNumeroCaracteres("");

        var contagemEsperada = 0;
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
    void senhaComUmCaractere() {
        //setup/act
        var resultado = new ResultadoDeAnaliseNumeroCaracteres("A");

        var contagemEsperada = 1;
        var bonusEsperado = 4;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.FALHA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void senhaComSeteCaracteres() {
        //setup/act
        var resultado = new ResultadoDeAnaliseNumeroCaracteres("Setedig");

        var contagemEsperada = 7;
        var bonusEsperado = 28;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.FALHA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void senhaComOitoCaracteres() {
        //setup/act
        var resultado = new ResultadoDeAnaliseNumeroCaracteres("Oitodigi");

        var contagemEsperada = 8;
        var bonusEsperado = 32;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.SUFICIENTE;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void senhaComNoveCaracteres() {
        //setup/act
        var resultado = new ResultadoDeAnaliseNumeroCaracteres("Novedigit");

        var contagemEsperada = 9;
        var bonusEsperado = 36;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.EXCEPCIONAL;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }
}