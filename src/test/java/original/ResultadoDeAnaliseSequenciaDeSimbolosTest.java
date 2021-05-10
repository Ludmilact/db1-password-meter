package original;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDeAnaliseSequenciaDeSimbolosTest {

        @org.junit.jupiter.api.Test
        void senhaComSimbolosEEspacos(){

            //setup/act
            var resultado = new ResultadoDeAnaliseSequenciaDeSimbolos(". . .");

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
        void senhaComSequenciaDeSimbolos() {

            //setup/act
            var resultado = new ResultadoDeAnaliseSequenciaDeSimbolos("!@#$%ˆˆ");

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
        void senhaComSequenciaDeLetrasESimbolos() {

            //setup/act
            var resultado = new ResultadoDeAnaliseSequenciaDeSimbolos("A...B...C...D");

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
        void senhaComLetrasESimbolos(){

            //setup/act
            var resultado = new ResultadoDeAnaliseSequenciaDeSimbolos("A.B.C.D.E");

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
        void testeComLetrasConsecutivasMaiusculasMinusculasSimbolosENumeros(){

            //setup/act
            var resultado = new ResultadoDeAnaliseSequenciaDeSimbolos("a1.B2,c3;");

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
        void testeComLetrasConsecutivasENumeros(){

            //setup/act
            var resultado = new ResultadoDeAnaliseSequenciaDeSimbolos("!@#1!@#2!@#3!@#4");

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