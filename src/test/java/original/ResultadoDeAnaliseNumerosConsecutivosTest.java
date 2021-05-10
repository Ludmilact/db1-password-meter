package original;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDeAnaliseNumerosConsecutivosTest {

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
        var resultado = new ResultadoDeAnaliseNumerosConsecutivos("S3NH4C0MNUM3R0S");

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
    void senhaComNumerosConsecutivos(){

        //setup/act
        var resultado = new ResultadoDeAnaliseNumerosConsecutivos("Senha123");

        var contagemEsperada = 2;
        var bonusEsperado = 4;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.ALERTA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());

    }

    @org.junit.jupiter.api.Test
    void senhaComDoisNumeros(){

        //setup/act
        var resultado = new ResultadoDeAnaliseNumerosConsecutivos("S3nh4");

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
        var resultado = new ResultadoDeAnaliseNumerosConsecutivos("012345");

        var contagemEsperada = 5;
        var bonusEsperado = 10;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.ALERTA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());
    }
}