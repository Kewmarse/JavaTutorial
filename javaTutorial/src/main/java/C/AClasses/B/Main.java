package C.AClasses.B;

public class Main {
    public static void main(String[] args) {

        Telefon tel=new Telefon();

        System.out.println(tel.nom);
        System.out.println(tel.model);
        System.out.println(tel.prix);

        tel.applerEncours(781878586);
        tel.acceptAppel();



    }
}
