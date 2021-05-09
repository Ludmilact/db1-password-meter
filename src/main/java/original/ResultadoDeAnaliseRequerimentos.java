package original;

public class ResultadoDeAnaliseRequerimentos extends ResultadoDeAnalise{

    private int contagem;
    private int bonus;
    private TipoEstado estado;
    
    public ResultadoDeAnaliseRequerimentos(String senha) {
        super(senha);
        calcularResultado(senha);
        calcularEstado();
    }

    private void calcularEstado() {

        if (contagem ==4 && senha.length() >=8)
            estado = TipoEstado.SUFICIENTE;
        else if (contagem >4 && senha.length() >=8)
            estado = TipoEstado.EXCEPCIONAL;
        else
            estado = TipoEstado.FALHA;
    }

    private void calcularRequerimentos(String senha){
        int contagem = 0;

        if (AnalisaRequisitos.obterQuantidadeDeLetrasMinusculas(senha) > 0)
            contagem += 1;
        if (AnalisaRequisitos.obterQuantidadeDeLetrasMaisculas(senha) > 0)
            contagem += 1;
        if (AnalisaRequisitos.obterQuantidadeDeNumeros(senha) > 0)
            contagem += 1;
        if (AnalisaRequisitos.obterQuantidadeDeSimbolos(senha) > 0)
            contagem += 1;
        this.contagem = contagem;
    }

    private void calcularResultado(String senha) {
        //+(n*2)
        int multiplicador = 2;
        calcularRequerimentos(senha);

        if (senha.length() >= 8){
            contagem +=1;
            if (contagem >= 4){

                bonus = contagem * multiplicador;
            }
        } else
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
