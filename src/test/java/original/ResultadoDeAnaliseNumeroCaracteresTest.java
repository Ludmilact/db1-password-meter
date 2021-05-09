package original;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDeAnaliseNumeroCaracteresTest {

    @org.junit.jupiter.api.Test
    void obterBonus() {

        //setup
        var resultado = new ResultadoDeAnaliseNumeroCaracteres("");

        assertEquals(0, resultado.obterContagem());
        assertEquals(0, resultado.obterBonus());
        assertEquals(TipoEstado.FALHA, resultado.obterEstado());
        assertEquals(TipoOperacao.INCREMENTO, resultado.obterTipoOperacao());
    }

    @org.junit.jupiter.api.Test
    void obterContagem() {
    }

    @org.junit.jupiter.api.Test
    void obterEstado() {
    }

    @org.junit.jupiter.api.Test
    void obterTipoOperacao() {
    }
}