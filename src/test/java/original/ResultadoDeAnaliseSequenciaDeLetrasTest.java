package original;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDeAnaliseSequenciaDeLetrasTest {
    @org.junit.jupiter.api.Test
    void senhaSemCaracteres(){

        //setup/act
        var resultado = new ResultadoDeAnaliseSequenciaDeLetras("");

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
    void senhaComSequenciaDeLetras() {

        //setup/act
        var resultado = new ResultadoDeAnaliseSequenciaDeLetras("ABCDE");

        var contagemEsperada = 3;
        var bonusEsperado = 9;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.ALERTA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());
    }

    @org.junit.jupiter.api.Test
    void senhaComSequenciaDeLetrasAoContrario() {

        //setup/act
        var resultado = new ResultadoDeAnaliseSequenciaDeLetras("EDCBA");

        var contagemEsperada = 3;
        var bonusEsperado = 9;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.ALERTA;

        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());
    }

    @org.junit.jupiter.api.Test
    void senhaComLetrasESimbolos(){

        //setup/act
        var resultado = new ResultadoDeAnaliseSequenciaDeLetras("A.B.C.D.E");

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
    void testeComLetrasConsecutivasMaiusculasEMinusculas(){

        //setup/act
        var resultado = new ResultadoDeAnaliseSequenciaDeLetras("AbCd");

        var contagemEsperada = 2;
        var bonusEsperado = 6;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.ALERTA;
        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());
    }

    @org.junit.jupiter.api.Test
    void testeComLetrasConsecutivasENumeros(){

        //setup/act
        var resultado = new ResultadoDeAnaliseSequenciaDeLetras("AB1CD2EF3GHI");

        var contagemEsperada = 1;
        var bonusEsperado = 3;
        var operacaoEsperada = TipoOperacao.DECREMENTO;
        var estadoEsperado = TipoEstado.ALERTA;
        //assert
        assertEquals(contagemEsperada, resultado.obterContagem());
        assertEquals(bonusEsperado, resultado.obterBonus());
        assertEquals(operacaoEsperada, resultado.obterTipoOperacao());
        assertEquals(estadoEsperado, resultado.obterEstado());
    }
}