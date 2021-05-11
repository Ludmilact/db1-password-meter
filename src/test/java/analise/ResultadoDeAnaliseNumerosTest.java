package analise;

import tipo.TipoEstado;
import tipo.TipoOperacao;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDeAnaliseNumerosTest {

    @org.junit.jupiter.api.Test
    void senhaSemNumeros(){

        //setup/act
        var resultado = new ResultadoDeAnaliseNumeros("testeSemNumeros" );

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
    void senhaComNumeros(){
    //setup/act
        var resultado = new ResultadoDeAnaliseNumeros("S3NH4C0MNUM3R0S");

        var contagemEsperada = 5;
        var bonusEsperado = 20;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.EXCEPCIONAL;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());
    }

    @org.junit.jupiter.api.Test
    void senhaComUmNumero(){
        //setup/act
        var resultado = new ResultadoDeAnaliseNumeros("S3nha");

        var contagemEsperada = 1;
        var bonusEsperado = 4;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
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
        var resultado = new ResultadoDeAnaliseNumeros("S3nh4");

        var contagemEsperada = 2;
        var bonusEsperado = 8;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.EXCEPCIONAL;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());

    }
    @org.junit.jupiter.api.Test
    void senhaApenasComNumeros(){
        //setup/act
        var resultado = new ResultadoDeAnaliseNumeros("012345");

        var contagemEsperada = 6;
        var bonusEsperado = 0;
        var operacaoEsperada = TipoOperacao.INCREMENTO;
        var estadoEsperado = TipoEstado.EXCEPCIONAL;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());

    }
}
