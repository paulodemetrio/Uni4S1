public class AtividadeIdade {
    public static void main(String[] args) throws Exception {
        int idade = 19;
        if (idade >= 18) {
            System.out.print("Adulto");
        } else {
            if (idade >= 6) {
                System.out.print("Adolescente");
            } else {
                System.out.print("Infantil");
            }
        }
    }
}
