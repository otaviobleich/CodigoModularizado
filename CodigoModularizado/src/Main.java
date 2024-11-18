class Saudacao {
    public static void main(String[] args) {
        int hora = 23; 
        String mensagem = obterSaudacao(hora);

        System.out.println(mensagem);
    }

    
    public static String obterSaudacao(int hora) {
        if (hora >= 6 && hora < 12) {
            return "Bom dia!";
        } else if (hora >= 12 && hora < 18) {
            return "Boa tarde!";
        } else {
            return "Boa noite!";
        }
    }
}
