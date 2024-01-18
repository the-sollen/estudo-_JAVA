//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("lalalala!");

        System.out.println("Filme: O Grande Gatsby");

        int anoDeLancamento = 2023;
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        boolean incluiNoPlano = true;
        double notaDoFilme = 9;

        double media = 9 + 8.5 + 9.5 / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                O Grande Gatsby
                filme de drama com galã dos anos 90
                muito bom               
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}