package original;

public class ResultadoDeAnaliseNumeros extends ResultadoDeAnalise {
    //atributos da classe
    private int contagem;
    private int bonus;
    private TipoEstado estado;

    public ResultadoDeAnaliseNumeros(String senha) {
        super(senha);
        calcularResultado(senha);
        calcularEstado();
    }

    private void calcularEstado(){
        if (contagem > 1)
            estado = TipoEstado.EXCEPCIONAL;
        else if (contagem == 1)
            estado = TipoEstado.SUFICIENTE;
        else
            estado = TipoEstado.FALHA;
    }

    private void calcularResultado(String senha){
        //(n*4)
        int multiplicador = 4;
        contagem = AnalisaRequisitos.obterQuantidadeDeNumeros(senha);

        if (contagem == senha.length())
            bonus = 0;
        else
            bonus = contagem * multiplicador;
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
