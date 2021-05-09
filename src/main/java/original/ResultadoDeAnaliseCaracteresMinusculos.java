package original;

public class ResultadoDeAnaliseCaracteresMinusculos extends ResultadoDeAnalise {
    private int bonus;
    private int contagem;
    private TipoEstado estado;

    public ResultadoDeAnaliseCaracteresMinusculos(String senha) {
        super(senha);
        calcularResultado(senha);
        calcularEstado();
    }

    private void calcularEstado() {
        if (contagem < 1)
            estado = TipoEstado.FALHA;
        else if (contagem == 1)
            estado = TipoEstado.SUFICIENTE;
        else
            estado = TipoEstado.EXCEPCIONAL;
    }


    private int obterNumeroDeLetrasMinusculas(String senha) {
        int minusculas = 0;

        for (int i = 0; i < senha.length(); i++){
            char letra = senha.charAt(i);
            if (letra >= 'a' && letra <= 'z')
                minusculas++;
        }
        return minusculas;
    }

    private void calcularResultado(String senha){
        //(len-n) * 2
        contagem = obterNumeroDeLetrasMinusculas(senha);
        if (contagem > 0)
            bonus = (senha.length() - contagem) * 2;
        else
            bonus = 0;
    }

    @Override
    int obterBonus() {
        return bonus;
    }

    @Override
    TipoEstado obterEstado() {
        return estado;
    }

    @Override
    int obterContagem() {
        return contagem;
    }

    @Override
    TipoOperacao obterTipoOperacao() {
        return TipoOperacao.INCREMENTO;
    }
}
