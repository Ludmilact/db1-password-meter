package original;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDeAnaliseSimbolosTest {

    @org.junit.jupiter.api.Test
    void senhaSemSimbolos() {
        //setup/act
        var resultado = new ResultadoDeAnaliseSimbolos("SenhaSemSimbolos");

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
    void senhaComUmSimbolo() {

        //setup/act
        var resultado = new ResultadoDeAnaliseSimbolos("SenhaC@mSimbolo");

        var contagemEsperada = 1;
        var bonusEsperado = 6;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.SUFICIENTE;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void senhaComDoisSimbolos() {

        //setup/act
        var resultado = new ResultadoDeAnaliseSimbolos("SenhaC@m$imbolos");

        var contagemEsperada = 2;
        var bonusEsperado = 12;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.EXCEPCIONAL;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void senhaComSimboloseNumeros() {

        //setup/act
        var resultado = new ResultadoDeAnaliseSimbolos("$3nh4C@m$imbolos");

        var contagemEsperada = 3;
        var bonusEsperado = 18;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.EXCEPCIONAL;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }
}