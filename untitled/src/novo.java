public class novo {

    public static void main(String[] args) {

        int anoDeLacamento = 2002;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.0;
        String tipoPlano ="Plus";

        if (anoDeLacamento >= 2022){
            System.out.println("lancamentos que estão curtindo");
        }
        else {
            System.out.println("filme bom");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("Plus")){
            System.out.println("filme liberado");
        }
        else System.out.println("pague para ver");

    }
}