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

    public int contarNumeros(String senha){
        int count = 0;
        for (int i = 0; i < senha.length(); i++){
            if (Character.isDigit(senha.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    private void calcularResultado(String senha){
        //(n*4)
        int multiplicador = 4;
        contagem = contarNumeros(senha);
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
