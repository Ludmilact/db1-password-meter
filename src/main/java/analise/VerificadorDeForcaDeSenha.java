package analise;

public class VerificadorDeForcaDeSenha { //classe principal
    int forcaDaSenha;
    String senha;

    public VerificadorDeForcaDeSenha(String senha) {
        this.senha = senha;
    }

    void verificar(){
        var resultadoContagemDeCaracteres = new ResultadoDeAnaliseNumeroCaracteres(senha);
        forcaDaSenha = resultadoContagemDeCaracteres.obterBonus();
    }

    String obterComplexidade(){
        return "";
    }
}
