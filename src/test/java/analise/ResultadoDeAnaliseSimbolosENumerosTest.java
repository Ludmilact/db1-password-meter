package analise;

import tipo.TipoEstado;
import tipo.TipoOperacao;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDeAnaliseSimbolosENumerosTest {

    @org.junit.jupiter.api.Test
    void senhaSemSimbolosNoMeio() {
        //setup/act
        var resultado = new ResultadoDeAnaliseSimbolosENumeros("SenhaSemSimbolos");

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
    void senhaComUmSimboloNoMeio() {
        //setup/act
        var resultado = new ResultadoDeAnaliseSimbolosENumeros("SenhaC@mSimbolo");

        var contagemEsperada = 1;
        var bonusEsperado = 2;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.SUFICIENTE;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void senhaSemNumerosNoMeio(){
        //setup/act
        var resultado = new ResultadoDeAnaliseSimbolosENumeros("testeSemNumeros" );

        var contagemEsperada = 0;
        var bonusEsperado = 0;
        var operacaoEsperada  = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.FALHA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());
    }

    @org.junit.jupiter.api.Test
    void senhaComUmNumeroNoMeio(){
        //setup/act
        var resultado = new ResultadoDeAnaliseSimbolosENumeros("SENH4COMNUMERO");

        var contagemEsperada = 1;
        var bonusEsperado = 2;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.SUFICIENTE;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());
    }

    @org.junit.jupiter.api.Test
    void senhaComNumerosNoMeio(){
        //setup/act
        var resultado = new ResultadoDeAnaliseSimbolosENumeros("S3NH4C0MNUM3R0S");

        var contagemEsperada = 5;
        var bonusEsperado = 10;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.EXCEPCIONAL;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());
    }

    @org.junit.jupiter.api.Test
    void senhaComSimbolosENumerosNoMeio() {

        //setup/act
        var resultado = new ResultadoDeAnaliseSimbolosENumeros("S3nh4C@m$imbolos3Num3ros");

        var contagemEsperada = 6;
        var bonusEsperado = 12;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.EXCEPCIONAL;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(estadoEsperado, resultado.obterEstado());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
    }
}