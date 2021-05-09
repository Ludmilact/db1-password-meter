package original;

public abstract class ResultadoDeAnalise {
    //atributos
    protected String senha;

    //construtor
    public ResultadoDeAnalise(String senha){
        this.senha = senha;
    }

    //metodos
    abstract int obterBonus();
    abstract TipoEstado obterEstado();
    abstract int obterContagem();
    abstract TipoOperacao obterTipoOperacao();
}
