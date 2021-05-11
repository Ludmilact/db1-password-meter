package analise;

public class Complexidade {

    int score;

    public Complexidade(int score) {
        this.score = score;
    }

    public String calcularComplexidade() {
        String complexidade;

        if (score < 20) {
            complexidade = "Muito fraca";
        } else if (score < 40) {
            complexidade = "Fraca";
        } else if (score < 60) {
            complexidade = "Boa";
        } else if (score < 80) {
            complexidade = "Forte";
        } else {
            complexidade = "Muito forte";
        }
        return complexidade;
    }
}
