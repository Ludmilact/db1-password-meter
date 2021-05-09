package original;

public class AnalisaRequisitos {

    public static int obterQuantidadeDeLetrasMaisculas(String senha) {
        int maiusculas = 0;

        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);
            if (ValidaCaractere.isMaisculo(caractere))
                maiusculas++;
        }
        return maiusculas;
    }

    public static int obterQuantidadeDeLetrasMinusculas(String senha) {
        int minusculas = 0;

        for (int i = 0; i < senha.length(); i++){
            char caractere = senha.charAt(i);
            if (ValidaCaractere.isMinusculo(caractere))
                minusculas++;
        }
        return minusculas;
    }

    public static int obterQuantidadeDeSimbolos(String senha) {
        int count = 0;
        for (int i = 0; i < senha.length(); i++){
            char caractere = senha.charAt(i);
            if (ValidaCaractere.isSimbolo(caractere))
                count++;
        }
        return count;
    }

    public static int obterQuantidadeDeNumeros(String senha) {
        int count = 0;
        for (int i = 0; i < senha.length(); i++){
            if (Character.isDigit(senha.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int obterQuantidadeDeSimbolosNoMeio(String senha) {
        int count = 0;
        for (int i = 1; i < senha.length() - 1; i++) {
            char caractere = senha.charAt(i);

            if (ValidaCaractere.isSimbolo(caractere))
                count++;
        }
        return count;
    }

    public static int obterQuantidadeDeNumerosNoMeio(String senha){
        int count = 0;
        for (int i = 1; i < senha.length()-1; i++){
            if (Character.isDigit(senha.charAt(i)))
                count++;
        }
        return count;
    }
}
