package B;

public class NPremierNom {

    public static boolean PremierNom(int num){
        boolean resultat=true;
        for(int i=2;i<=num;i++) {
            if (num % i == 0) {
                System.out.println(i+" c'est un premier nombre");

            } else {
                System.out.println(i+" ce n'est pas un premier nombre");
            }
        }
        return resultat;

    }

    public static void main(String[] args) {
        System.out.println(PremierNom(4));

    }
}
