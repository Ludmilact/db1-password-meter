package analise;

import tipo.TipoEstado;
import tipo.TipoOperacao;

import static org.junit.jupiter.api.Assertions.*;

class VerificadorDeForcaDeSenhaTest {

//TODO: Ajustar teste pois preciso corrigir regra de senha curta

    @org.junit.jupiter.api.Test
    void senhaSemCaracteres() {
        //setup/act
        var resultado = new VerificadorDeForcaDeSenha("");

        var complexidadeEsperada = "";
        var scoreEsperado = 0;

        //assert
        assertEquals(complexidadeEsperada, resultado.obterComplexidade());
        assertEquals(scoreEsperado, resultado.obterScore());
    }

    @org.junit.jupiter.api.Test
    void senhaApenasComMaiusculas() {
        //setup/act
        var resultado = new VerificadorDeForcaDeSenha("MAIUSCULAS");

        var complexidadeEsperada = "Muito fraca";
        var scoreEsperado = 11;

        //assert
        assertEquals(complexidadeEsperada, resultado.obterComplexidade());
        assertEquals(scoreEsperado, resultado.obterScore());
    }

    @org.junit.jupiter.api.Test
    void senhaApenasComMinusculas() {
        //setup/act
        var resultado = new VerificadorDeForcaDeSenha("minusculas");

        var complexidadeEsperada = "Muito fraca";
        var scoreEsperado = 11;

        //assert
        assertEquals(complexidadeEsperada, resultado.obterComplexidade());
        assertEquals(scoreEsperado, resultado.obterScore());
    }

    @org.junit.jupiter.api.Test
    void senhaApenasComMinusculasEMaiusculas() {
        //setup/act
        var resultado = new VerificadorDeForcaDeSenha("MinusculaS");

        var complexidadeEsperada = "Fraca";
        var scoreEsperado = 35;

        //assert
        assertEquals(complexidadeEsperada, resultado.obterComplexidade());
        assertEquals(scoreEsperado, resultado.obterScore());
    }

    @org.junit.jupiter.api.Test
    void senhaApenasComNumeros() {
        //setup/act
        var resultado = new VerificadorDeForcaDeSenha("12345");

        var complexidadeEsperada = "Muito fraca";
        var scoreEsperado = 4;

        //assert
        assertEquals(complexidadeEsperada, resultado.obterComplexidade());
        assertEquals(scoreEsperado, resultado.obterScore());
    }

    @org.junit.jupiter.api.Test
    void senhaComNumerosELetras() {
        //setup/act
        var resultado = new VerificadorDeForcaDeSenha("NUM3R0S");

        var complexidadeEsperada = "Boa";
        var scoreEsperado = 40;

        //assert
        assertEquals(complexidadeEsperada, resultado.obterComplexidade());
        assertEquals(scoreEsperado, resultado.obterScore());
    }

    @org.junit.jupiter.api.Test
    void senhaComNumerosESimbolos() {
        //setup/act
        var resultado = new VerificadorDeForcaDeSenha("12345!@#$");

        var complexidadeEsperada = "Forte";
        var scoreEsperado = 71;

        //assert
        assertEquals(complexidadeEsperada, resultado.obterComplexidade());
        assertEquals(scoreEsperado, resultado.obterScore());
    }

    @org.junit.jupiter.api.Test
    void senhaComNumerosESimbolosELetras() {
        //setup/act
        var resultado = new VerificadorDeForcaDeSenha("NUM3R0$");

        var complexidadeEsperada = "Boa";
        var scoreEsperado = 48;

        //assert
        assertEquals(complexidadeEsperada, resultado.obterComplexidade());
        assertEquals(scoreEsperado, resultado.obterScore());
    }

    @org.junit.jupiter.api.Test
    void senhaComNumerosEEspacos() {
        //setup/act
        var resultado = new VerificadorDeForcaDeSenha("1 2 3 4 5");

        var complexidadeEsperada = "Boa";
        var scoreEsperado = 45;

        //assert
        assertEquals(complexidadeEsperada, resultado.obterComplexidade());
        assertEquals(scoreEsperado, resultado.obterScore());
    }

    @org.junit.jupiter.api.Test
    void senhaComSimbolos() {
        //setup/act
        var resultado = new VerificadorDeForcaDeSenha("!@#$");

        var complexidadeEsperada = "Fraca";
        var scoreEsperado = 38;

        //assert
        assertEquals(complexidadeEsperada, resultado.obterComplexidade());
        assertEquals(scoreEsperado, resultado.obterScore());
    }

    @org.junit.jupiter.api.Test
    void senhaComTodosOsRequerimentos() {
        //setup/act
        var resultado = new VerificadorDeForcaDeSenha("$enh4R3qu3rim3ent0$");

        var complexidadeEsperada = "Muito forte";
        var scoreEsperado = 100;

        //assert
        assertEquals(complexidadeEsperada, resultado.obterComplexidade());
        assertEquals(scoreEsperado, resultado.obterScore());
    }

    @org.junit.jupiter.api.Test
    void senhaComRepetiçãoDeCaracteres() {
        //setup/act
        var resultado = new VerificadorDeForcaDeSenha("LLLMMMNN");

        var complexidadeEsperada = "Muito fraca";
        var scoreEsperado = 0;

        //assert
        assertEquals(complexidadeEsperada, resultado.obterComplexidade());
        assertEquals(scoreEsperado, resultado.obterScore());
    }

    @org.junit.jupiter.api.Test
    void senhaComConsecutivasMinusculas() {
        //setup/act
        var resultado = new VerificadorDeForcaDeSenha("aabbcccddee");

        var complexidadeEsperada = "Muito fraca";
        var scoreEsperado = 0;

        //assert
        assertEquals(complexidadeEsperada, resultado.obterComplexidade());
        assertEquals(scoreEsperado, resultado.obterScore());
    }

    @org.junit.jupiter.api.Test
    void senhaComSequenciaDeNumeros() {
        //setup/act
        var resultado = new VerificadorDeForcaDeSenha("54321");

        var complexidadeEsperada = "Muito fraca";
        var scoreEsperado = 4;

        //assert
        assertEquals(complexidadeEsperada, resultado.obterComplexidade());
        assertEquals(scoreEsperado, resultado.obterScore());
    }
}
