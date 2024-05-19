package B;

public class PString {


    public static void main(String[] args) {

        String nom="rahmani";
        String prenom="kewmarse ";

        System.out.println(nom.length());
        System.out.println(nom.toUpperCase());
        System.out.println(nom.toLowerCase());

        System.out.println(nom.concat(" "));
        System.out.println(prenom.length());
        System.out.println(prenom.concat(nom));

        System.out.println(nom.contains("ra"));
        System.out.println(nom.substring(0,3));
        System.out.println(nom.replace("rahmani","akbari"));

        String phrase="Bonjour et bienvenue ";
        String [] mot=phrase.split(" ");
        System.out.println(mot[0]);

    }



}
