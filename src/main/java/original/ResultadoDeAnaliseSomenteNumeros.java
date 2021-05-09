package original;

public class ResultadoDeAnaliseSomenteNumeros extends ResultadoDeAnalise{

    private int contagem;
    private int bonus;
    private TipoEstado estado;

    public ResultadoDeAnaliseSomenteNumeros(String senha) {
        super(senha);
        calcularResultado(senha);
        calcularEstado();
    }

    private void calcularEstado() {
        if(contagem > 0)
            estado = TipoEstado.ALERTA;
        else
            estado = TipoEstado.SUFICIENTE;
    }

    private void calcularResultado(String senha) {
        int quantidadeDeEspacos = AnalisaRequisitos.obterQuantidadeDeEspacos(senha);
        int quantidadeDeNumerosEEspacos = AnalisaRequisitos.obterQuantidadeDeNumeros(senha) +
                quantidadeDeEspacos;

        if (senha.length() == quantidadeDeEspacos)
            contagem = 0;
        else if (senha.length() == quantidadeDeNumerosEEspacos)
            contagem = quantidadeDeNumerosEEspacos;
        else
            contagem = 0;

        bonus = contagem;
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
        return TipoOperacao.DECREMENTO;
    }
}
