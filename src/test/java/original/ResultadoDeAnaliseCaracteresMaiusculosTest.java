package original;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDeAnaliseCaracteresMaiusculosTest {

    @Test
    void testeSemMaiusculas() {
        var resultado = new ResultadoDeAnaliseCaracteresMaiusculos("asd");

        var bonusAtual = resultado.obterBonus();
        var bonusEsperado = 0;

        var contagemAtual = resultado.obterContagem();
        var contagemEsperada = 0;

        var estadoAtual = resultado.obterEstado();
        var estadoEsperado = TipoEstado.FALHA;

        assertEquals(bonusEsperado, bonusAtual);
        assertEquals(contagemEsperada, contagemAtual);
        assertEquals(estadoEsperado, estadoAtual);
    }

    @Test
    void testeUmaMaiuscula() {
        var resultado = new ResultadoDeAnaliseCaracteresMaiusculos("Asd");

        var bonusAtual = resultado.obterBonus();
        var bonusEsperado = 4;

        var contagemAtual = resultado.obterContagem();
        var contagemEsperada = 1;

        var estadoAtual = resultado.obterEstado();
        var estadoEsperado = TipoEstado.SUFICIENTE;

        assertEquals(bonusEsperado, bonusAtual);
        assertEquals(contagemEsperada, contagemAtual);
        assertEquals(estadoEsperado, estadoAtual);
    }
}