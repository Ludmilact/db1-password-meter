package analise;

public class VerificadorDeForcaDeSenha {

    String senha;
    String resultadoComplexidade;
    int resultadoScore;

    public VerificadorDeForcaDeSenha(String senha) {
        this.senha = senha;
        verificar();
    }

    public void verificar(){
        var resultadoCaracteresMaiusculos = new ResultadoDeAnaliseCaracteresMaiusculos(senha);
        var resultadoCaracteresMaiusculosConsecutivos = new ResultadoDeAnaliseCaracteresMaiusculosConsecutivos(senha);
        var resultadoCaracteresMinusculosConsecutivos = new ResultadoDeAnaliseCaracteresMinusculasConsecutivas(senha);
        var resultadoCaracteresMinusculos = new ResultadoDeAnaliseCaracteresMinusculos(senha);
        var resultadoCaracteresRepetidos = new ResultadoDeAnaliseCaracteresRepetidos(senha);
        var resultadoNumeroDeCaracteres = new ResultadoDeAnaliseNumeroCaracteres(senha);
        var resultadoNumeros = new ResultadoDeAnaliseNumeros(senha);
        var resultadoNumerosConsecutivos = new ResultadoDeAnaliseNumerosConsecutivos(senha);
        var resultadoRequerimentos = new ResultadoDeAnaliseRequerimentos(senha);
        var resultadoSequenciaDeLetras = new ResultadoDeAnaliseSequenciaDeLetras(senha);
        var resultadoSequenciaDeNumeros = new ResultadoDeAnaliseSequenciaDeNumeros(senha);
        var resultadoSequenciaDeSimbolos = new ResultadoDeAnaliseSequenciaDeSimbolos(senha);
        var resultadoSimbolos = new ResultadoDeAnaliseSimbolos(senha);
        var resultadoSimbolosENumeros = new ResultadoDeAnaliseSimbolosENumeros(senha);
        var resultadoSomenteLetras = new ResultadoDeAnaliseSomenteLetras(senha);
        var resultadoSomenteNumeros = new ResultadoDeAnaliseSomenteNumeros(senha);

        var score = new Score();

        score.adicionarResultado(resultadoCaracteresMaiusculos);
        score.adicionarResultado(resultadoCaracteresMaiusculosConsecutivos);
        score.adicionarResultado(resultadoCaracteresMinusculosConsecutivos);
        score.adicionarResultado(resultadoCaracteresMinusculos);
        score.adicionarResultado(resultadoCaracteresRepetidos);
        score.adicionarResultado(resultadoNumeroDeCaracteres);
        score.adicionarResultado(resultadoNumeros);
        score.adicionarResultado(resultadoNumerosConsecutivos);
        score.adicionarResultado(resultadoRequerimentos);
        score.adicionarResultado(resultadoSequenciaDeLetras);
        score.adicionarResultado(resultadoSequenciaDeNumeros);
        score.adicionarResultado(resultadoSequenciaDeSimbolos);
        score.adicionarResultado(resultadoSimbolos);
        score.adicionarResultado(resultadoSimbolosENumeros);
        score.adicionarResultado(resultadoSomenteLetras);
        score.adicionarResultado(resultadoSomenteNumeros);

        resultadoScore = score.calcularScore();

        var complexidade = new Complexidade(resultadoScore);
        resultadoComplexidade = complexidade.calcularComplexidade();
    }

    String obterComplexidade(){
        return resultadoComplexidade;
    }

    int obterScore(){
        return resultadoScore;
    }
}