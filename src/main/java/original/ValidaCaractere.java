package original;

public class ValidaCaractere {
    public boolean isMaisculo(char caractere){
        return (caractere >= 'A' && caractere <= 'Z');
    }

    public boolean isMinusculo(char caractere){
        return (caractere >= 'a' && caractere <= 'z'); }

    public boolean isNumero(char caractere){
        return (caractere >= '0' && caractere <= '9');
    }

    public boolean isEspaco(char caractere){
        return (caractere == ' ');
    }

    public boolean isSimbolo(char caractere){
        return !(this.isMaisculo(caractere) || this.isMaisculo(caractere) ||
                this.isNumero(caractere) || this.isEspaco(caractere));
    }
}

