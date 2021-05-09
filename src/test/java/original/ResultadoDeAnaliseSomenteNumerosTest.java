package original;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDeAnaliseSomenteNumerosTest {

    @org.junit.jupiter.api.Test
    void senhaSemNumeros(){

        //setup/act
        var resultado = new ResultadoDeAnaliseSomenteNumeros("testeSemNumeros" );

        var contagemEsperada = 0;
        var bonusEsperado = 0;
        var operacaoEsperada  = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.SUFICIENTE;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());
    }

    @org.junit.jupiter.api.Test
    void senhaComNumeros(){

        //setup/act
        var resultado = new ResultadoDeAnaliseSomenteNumeros("S3NH4C0MNUM3R0S");

        var contagemEsperada = 0;
        var bonusEsperado = 0;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.SUFICIENTE;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());
    }

    @org.junit.jupiter.api.Test
    void senhaComUmNumero(){

        //setup/act
        var resultado = new ResultadoDeAnaliseSomenteNumeros("S3nha");

        var contagemEsperada = 0;
        var bonusEsperado = 0;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.SUFICIENTE;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());

    }

    @org.junit.jupiter.api.Test
    void senhaComDoisNumeros(){

        //setup/act
        var resultado = new ResultadoDeAnaliseSomenteNumeros("S3nh4");

        var contagemEsperada = 0;
        var bonusEsperado = 0;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.SUFICIENTE;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());

    }

    @org.junit.jupiter.api.Test
    void senhaApenasComNumeros(){

        //setup/act
        var resultado = new ResultadoDeAnaliseSomenteNumeros("012345");

        var contagemEsperada = 6;
        var bonusEsperado = 6;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.ALERTA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());

    }
}