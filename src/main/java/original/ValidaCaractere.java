package original;

public class ValidaCaractere {
    public static boolean isMaisculo(char caractere){
        return (caractere >= 'A' && caractere <= 'Z');
    }

    public static boolean isMinusculo(char caractere){
        return (caractere >= 'a' && caractere <= 'z');
    }

    public static boolean isNumero(char caractere){
        return (caractere >= '0' && caractere <= '9');
    }

    public static boolean isEspaco(char caractere){
        return (caractere == ' ');
    }

    public static boolean isSimbolo(char caractere){
        return !(isMaisculo(caractere) || isMinusculo(caractere) ||
                isNumero(caractere) || isEspaco(caractere));
    }
}

