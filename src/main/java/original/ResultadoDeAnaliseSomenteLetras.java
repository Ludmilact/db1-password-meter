package original;

public class ResultadoDeAnaliseSomenteLetras extends ResultadoDeAnalise {

    private int contagem;
    private int bonus;
    private TipoEstado estado;

    public ResultadoDeAnaliseSomenteLetras(String senha) {
        super(senha);
        calcularResultado(senha);
        calcularEstado();
    }

    private void calcularResultado(String senha) {
        int espacos = AnalisaRequisitos.obterQuantidadeDeEspacos(senha);
        int letrasEEspacos = espacos + AnalisaRequisitos.obterQuantidadeDeLetras(senha);

        if (senha.length() != espacos && senha.length() == letrasEEspacos)
            bonus = letrasEEspacos;
        else
            bonus = 0;

        contagem = bonus;
    }

    private void calcularEstado() {
        if(contagem > 0)
            estado = TipoEstado.ALERTA;
        else
            estado = TipoEstado.SUFICIENTE;
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
        return  TipoOperacao.DECREMENTO;
    }
}
